package com.caiotayota.smartwatch.sleepMonitoring;

import com.caiotayota.smartwatch.jmDNS.SimpleServiceDiscovery;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.logging.Logger;

public class SleepMonitoringClient {
    private static final Logger logger = Logger.getLogger(SleepMonitoringClient.class.getName());
    private static SleepMonitoringServiceGrpc.SleepMonitoringServiceBlockingStub blockingStub;
    private static SleepMonitoringServiceGrpc.SleepMonitoringServiceStub asyncStub;
    static SleepMonitoringClient sleepMonitoringClient = new SleepMonitoringClient();

    public static void main(String[] args) {

        String service_type = "_sleep-monitoring._tcp.local.";
        SimpleServiceDiscovery.run(service_type);


        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        blockingStub = SleepMonitoringServiceGrpc.newBlockingStub(channel);
        asyncStub = SleepMonitoringServiceGrpc.newStub(channel);

        trackMovement();
//        channel.shutdown();
    }

    public static void trackMovement() {

        logger.info("Sensor activated: Tracking body movements...");
        System.out.println("Tracking and sending movements to the server.");

        StreamObserver<MovementsResponse> responseStreamObserver = new StreamObserver<MovementsResponse>() {
            @Override
            public void onNext(MovementsResponse value) {
                System.out.println(value.getTotalMovementsMessage());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                //System.out.println("Sleep Monitoring completed!");
            }
        };

        StreamObserver<MovementRequest> requestStreamObserver = asyncStub.trackMovement(responseStreamObserver);

        try {
            boolean isAwake = false;
            int continuousMovement = 0;

            while (!isAwake) {
                boolean hasMoved = Math.round(Math.random()) != 0; // Random values simulating sensor data

                if (hasMoved) {
                    requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(true).build());
                    continuousMovement++;
                    System.out.println("Body movement detected! Sending to the server");
                    if (continuousMovement >= 5) { // If detected 5 body movement in a row, is presumed that the person is awake
                        isAwake = true;
                    }
                } else {
                    continuousMovement = 0;
                }
            }

            requestStreamObserver.onCompleted();
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
