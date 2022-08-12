package com.caiotayota.smartwatch.musicPlayer;

import com.caiotayota.smartwatch.jmDNS.SimpleServiceRegistration;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

public class MusicPlayerServer extends MusicPlayerServiceGrpc.MusicPlayerServiceImplBase {

    private static final Logger logger = Logger.getLogger(MusicPlayerServer.class.getName());

    public static void main(String[] args) {
        MusicPlayerServer musicPlayerServer = new MusicPlayerServer();

        String service_type = "_music-player._tcp.local.";
        String service_name = "MusicPlayerServer";
        int port = 50052;
        String service_description = "Music streaming";

        SimpleServiceRegistration ssr = new SimpleServiceRegistration();
        ssr.run(service_type, service_name, port, service_description);

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(musicPlayerServer)
                    .build()
                    .start();

            logger.info("Connected! Listening on port:" + port);

            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("Server started, listening on " + port);

    }

    @Override
    public void playMusic(MusicRequest musicRequest, StreamObserver<MusicResponse> responseStreamObserver) {
        System.out.println("Receiving music request...");

        String[] musicList = musicRequest.getRequest().split(",");

        System.out.println(musicRequest);

        for (String m : musicList) {
            responseStreamObserver.onNext(MusicResponse.newBuilder().setMusicResponse("Playing: " + m.trim()).build());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseStreamObserver.onCompleted();
    }

}

