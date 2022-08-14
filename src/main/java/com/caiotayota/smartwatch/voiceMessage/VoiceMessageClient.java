package com.caiotayota.smartwatch.voiceMessage;

import com.caiotayota.smartwatch.jmDNS.SimpleServiceDiscovery;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class VoiceMessageClient {
    private static final Logger logger = Logger.getLogger(VoiceMessageClient.class.getName());
    private static VoiceMessageServiceGrpc.VoiceMessageServiceBlockingStub blockingStub;
    private static VoiceMessageServiceGrpc.VoiceMessageServiceStub asyncStub;
    static VoiceMessageClient voiceMessageClient = new VoiceMessageClient();

    public static void main(String[] args) throws Exception {

        String service_type = "_voice-message._tcp.local.";
        SimpleServiceDiscovery.run(service_type);

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50053)
                .usePlaintext()
                .build();

        blockingStub = VoiceMessageServiceGrpc.newBlockingStub(channel);
        asyncStub = VoiceMessageServiceGrpc.newStub(channel);

        sendVoiceMessage();

        // Closing the channel once message has been passed.
//        channel.shutdown();

    }


    public static void sendVoiceMessage() {

        // Handling the server stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
        StreamObserver<VoiceMessageResponse> responseObserver = new StreamObserver<VoiceMessageResponse>() {

            @Override
            public void onNext(VoiceMessageResponse voiceMessageResponse) {

                String secondMessage = voiceMessageResponse.toString();

                String time = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm")));
                System.out.println("[" + time + "] " + secondMessage.replace("voiceMessageReceived:", "Server:"));
                //System.out.println("* Voice Message received! \uD83D\uDDF8 *");

            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onCompleted() {
                // TODO Auto-generated method stub
                System.out.println("server completed");
            }



        };

        // Here, we are calling the Remote reverseStream method. Using onNext, client sends a stream of messages.
        StreamObserver<VoiceMessageRequest> requestObserver = asyncStub.sendVoiceMessage(responseObserver);

        try {

            String firstMessage = "Hi There, my Name is Caio!";

            ByteString messageToSend = ByteString.copyFrom(firstMessage, StandardCharsets.UTF_8);
            requestObserver.onNext(VoiceMessageRequest.newBuilder().setVoiceMessageToSend(messageToSend).build());

            String time = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm")));
            System.out.println("[" + time + "] Client: " + firstMessage);
            System.out.println("* Voice Message Sent! \uD83D\uDDF8 *\n");

            // Mark the end of requests
            requestObserver.onCompleted();


            // Sleep for a bit before sending the next one.
            Thread.sleep(1000);


        } catch (RuntimeException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

