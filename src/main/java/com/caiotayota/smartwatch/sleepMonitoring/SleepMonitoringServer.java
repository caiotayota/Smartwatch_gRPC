package com.caiotayota.smartwatch.sleepMonitoring;

import com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringServiceGrpc.SleepMonitoringServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

public class SleepMonitoringServer extends SleepMonitoringServiceImplBase{

    private static final Logger logger = Logger.getLogger(SleepMonitoringServer.class.getName());

    public static void main(String[] args) {

        SleepMonitoringServer sleepMonitoringServer = new SleepMonitoringServer();

        int port = 50051;
        String service_type = "_grpc._tcp.local.";
        String service_name = "GrpcServer";
        SimpleServiceRegistration ssr = new SimpleServiceRegistration();
        ssr.run(port, service_type, service_name);

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(sleepMonitoringServer)
                    .build()
                    .start();
            System.out.println("Sleep Monitoring Server started");

            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("Server started, listening on " + port);
    }

    @Override
    public StreamObserver<MovementRequest> trackMovement(StreamObserver<TotalMovementsResponse> responseObserver) {
        return new StreamObserver<MovementRequest>() {

            int totalMovements = 0;

            @Override
            public void onNext(MovementRequest value) {
               // boolean moving = Math.round(Math.random()) == 0 ? false : true; // Random values simulating sensor data

                if (value.getMovement()) {
                    totalMovements++;
                    System.out.println("Movement detected by sensor");
                }

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                String responseMessage = "Total of movements during sleep: " + totalMovements;
                TotalMovementsResponse response = TotalMovementsResponse.newBuilder().setTotalMovements(responseMessage).build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

}
