package com.caiotayota.smartwatch.voiceMessage;

import com.caiotayota.smartwatch.jmDNS.SimpleServiceRegistration;
import com.caiotayota.smartwatch.voiceMessage.VoiceMessageServiceGrpc.VoiceMessageServiceImplBase;

import com.google.protobuf.ByteString;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class VoiceMessageServer extends VoiceMessageServiceImplBase {

    private static final Logger logger = Logger.getLogger(VoiceMessageServer.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        VoiceMessageServer voiceMessageServer = new VoiceMessageServer();

        String service_type = "_voice-message._tcp.local.";
        String service_name = "VoiceMessageServer";
        int port = 50053;
        String service_description = "Send and Receive voice messages.";

        SimpleServiceRegistration ssr = new SimpleServiceRegistration();
        ssr.run(service_type, service_name, port, service_description);

        Server server = ServerBuilder.forPort(port)
                .addService(voiceMessageServer)
                .build()
                .start();

        logger.info("VoiceMessageServer: Server started, listening on " + port);

        server.awaitTermination();
    }

    @Override
    public StreamObserver<VoiceMessageRequest> sendVoiceMessage(StreamObserver<VoiceMessageResponse> responseObserver) {
        return new StreamObserver<VoiceMessageRequest>() {

            @Override
            public void onNext(VoiceMessageRequest voiceMessageRequest) {

                String messageRequestReceived = voiceMessageRequest.toString().replace("voiceMessageToSend:","Client:");

                String time = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm")));
                System.out.println("[" + time + "] " + messageRequestReceived);
               // System.out.print("* Voice Message Received! \uD83D\uDDF8 *");

                String secondMessage = "Hi Caio, nice to meet you! My name is Bruna.";
                ByteString replay = ByteString.copyFrom(secondMessage, StandardCharsets.UTF_8);
                VoiceMessageResponse reply = VoiceMessageResponse.newBuilder().addVoiceMessageReceived(replay).build();

                responseObserver.onNext(reply);
                time = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm")));
                System.out.println("[" + time + "] Server: " + secondMessage);
                System.out.println("* Voice Message Sent! \uD83D\uDDF8 *");
            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stubal

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }

        };
    }

}
