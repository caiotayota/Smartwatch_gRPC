package com.caiotayota.smartwatch.sleepMonitoring;

import java.util.Random;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import io.grpc.stub.StreamObserver;

public class SleepMonitoringClient {
    private static Logger logger = Logger.getLogger(SleepMonitoringClient.class.getName());
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

        channel.shutdown();


    }

    private static void trackMovement() {
        StreamObserver<TotalMovementsResponse> responseObserver = new StreamObserver<TotalMovementsResponse>() {
            @Override
            public void onNext(TotalMovementsResponse value) {
                System.out.println("Total of movements during sleep: " + value.getTotalMovements());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Sleep Monitoring completed!");
            }
        };

        StreamObserver<MovementRequest> requestStreamObserver = asyncStub.trackMovement(responseObserver);

        try {
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(true).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(true).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(true).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(true).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());
            requestStreamObserver.onNext(MovementRequest.newBuilder().setMovement(false).build());


            System.out.println("Tracking and sending movements");

            requestStreamObserver.onCompleted();

            Thread.sleep(new Random().nextInt(1000) + 500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
