package com.caiotayota.smartwatch.musicPlayer;

import com.caiotayota.smartwatch.jmDNS.SimpleServiceDiscovery;
import com.caiotayota.smartwatch.musicPlayer.MusicPlayerServiceGrpc.MusicPlayerServiceBlockingStub;
import com.caiotayota.smartwatch.musicPlayer.MusicPlayerServiceGrpc.MusicPlayerServiceStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Iterator;
import java.util.logging.Logger;

public class MusicPlayerClient {

    private static Logger logger = Logger.getLogger(MusicPlayerClient.class.getName());

    private static MusicPlayerServiceBlockingStub blockingStub;
    private static MusicPlayerServiceStub asyncStub;

    public static void main(String[] args) throws Exception {

        MusicPlayerClient musicPlayerClient = new MusicPlayerClient();

        String service_type = "_music-player._tcp.local.";
        SimpleServiceDiscovery.run(service_type);

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        blockingStub = MusicPlayerServiceGrpc.newBlockingStub(channel);
        asyncStub = MusicPlayerServiceGrpc.newStub(channel);

        playMusic(args[0]);
        channel.shutdown();
    }

    public static void playMusic(String request) {
        MusicRequest musicRequest = MusicRequest.newBuilder().setRequest(request).build();

        try {
            Iterator<MusicResponse> responses = blockingStub.playMusic(musicRequest);

            while(responses.hasNext()) {
                MusicResponse temp = responses.next();
                System.out.println(temp.getMusicResponse());
            }
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }
}
