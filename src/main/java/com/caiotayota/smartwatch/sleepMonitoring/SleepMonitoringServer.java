package com.caiotayota.smartwatch.sleepMonitoring;

import com.caiotayota.smartwatch.jmDNS.SimpleServiceRegistration;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class SleepMonitoringServer extends SleepMonitoringServiceGrpc.SleepMonitoringServiceImplBase {

    private static final Logger logger = Logger.getLogger(SleepMonitoringServer.class.getName());
    public static String response;

    public static void main(String[] args) {
        SleepMonitoringServer sleepMonitoringServer = new SleepMonitoringServer();

        String service_type = "_sleep-monitoring._tcp.local.";
        String service_name = "SleepMonitoringServer";
        int port = 50051;
        String service_description = "Tracks body movements when sleeping";

        SimpleServiceRegistration ssr = new SimpleServiceRegistration();
        ssr.run(service_type, service_name, port, service_description);

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(sleepMonitoringServer)
                    .build()
                    .start();

            logger.info("Sleep Monitoring: Server started, listening on port " + port);
            System.out.println("Receiving movement requests...");

            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("Server started, listening on " + port);
    }

    @Override
    public StreamObserver<MovementRequest> trackMovement(StreamObserver<MovementsResponse> responseObserver) {
        return new StreamObserver<MovementRequest>() {

            int totalMovements = 0;

            @Override
            public void onNext(MovementRequest value) {
                if (value.getMovement()) {
                    totalMovements++;
                    System.out.println("Movement request received: movement detected by sensor!");
                }
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {

                String sleepQuality =
                        totalMovements < 15 ? "Excellent" :
                        totalMovements < 30 ? "Good" :
                        totalMovements < 45 ? "Regular" :
                        totalMovements < 60 ? "Bad" : "Very Bad";

                String time = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm")));
                String responseMessage = String.format(
                        "\n========= Sleep report on %s ==========" +
                        "\nSleep quality: %s" +
                        "\nTotal of body movements during sleeping: %d" +
                        "\n=====================================================\n",
                        time, sleepQuality, totalMovements);

                response = responseMessage;

                MovementsResponse response = MovementsResponse
                        .newBuilder()
                        .setTotalMovementsMessage(responseMessage)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}
