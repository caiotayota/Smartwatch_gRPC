package com.caiotayota.smartwatch.sleepMonitoring;

import java.util.Random;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import io.grpc.stub.StreamObserver;

public class SleepMonitoringClient {
    private static final Logger logger = Logger.getLogger(SleepMonitoringClient.class.getName());
    private static SleepMonitoringServiceGrpc.SleepMonitoringServiceBlockingStub blockingStub;
    private static SleepMonitoringServiceGrpc.SleepMonitoringServiceStub asyncStub;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        blockingStub = SleepMonitoringServiceGrpc.newBlockingStub(channel);
        asyncStub = SleepMonitoringServiceGrpc.newStub(channel);

        trackMovement();
//        trackHeartBeat();
        channel.shutdown();
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
                    System.out.println("Body movement detected!");
                    if (continuousMovement >= 5) { // If detected 5 body movement in a row, is presumed that the person is awake
                        isAwake = true;
                    }
                } else {
                    continuousMovement = 0;
                }
            }

            requestStreamObserver.onCompleted();
            Thread.sleep(new Random().nextInt(1000) + 500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void trackHeartBeat () {
//
//        logger.info("Sensor activated: Tracking Heart beats...");
//
//        StreamObserver<HeartRateResponse> responseStreamObserver = new StreamObserver<HeartRateResponse>() {
//            @Override
//            public void onNext(HeartRateResponse heartRateResponse) {
//                heartRateResponse.getHeartRate();
//                System.out.println("Heart Rate: " + heartRateResponse.getHeartRate());
//            }
//
//            @Override
//            public void onError(Throwable throwable) {
//
//            }
//
//            @Override
//            public void onCompleted() {
//
//            }
//
//        };
//
//        StreamObserver<HeartRateRequest> requestStreamObserver = asyncStub.trackHeartRate(responseStreamObserver);
//        double a = Math.random()*(3 + 1);
//        try {
//            requestStreamObserver.onNext(HeartRateRequest.newBuilder().setHeartBeatPerSecond(a).build());
//            requestStreamObserver.onCompleted();
//            Thread.sleep(new Random().nextInt(1000) + 500);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}
