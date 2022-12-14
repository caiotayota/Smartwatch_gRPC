package com.caiotayota.smartwatch.switchLights;

import com.caiotayota.smartwatch.jmDNS.SimpleServiceDiscovery;

import com.caiotayota.smartwatch.switchLights.SwitchLightsServiceGrpc.SwitchLightsServiceBlockingStub;
import com.caiotayota.smartwatch.switchLights.SwitchLightsServiceGrpc.SwitchLightsServiceStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.logging.Logger;

public class SwitchLightsClient {
    private static Logger logger = Logger.getLogger(com.caiotayota.smartwatch.musicPlayer.MusicPlayerClient.class.getName());
    private static SwitchLightsServiceBlockingStub blockingStub;
    private static SwitchLightsServiceStub asyncStub;
    private static boolean isLightOn = false;
    static SwitchLightsClient switchLightsClient = new SwitchLightsClient();

    public static void main(String[] args) {


        String service_type = "_switch-lights._tcp.local.";
        SimpleServiceDiscovery.run(service_type);

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50054)
                .usePlaintext()
                .build();

        blockingStub = SwitchLightsServiceGrpc.newBlockingStub(channel);
        asyncStub = SwitchLightsServiceGrpc.newStub(channel);

        switchLight();
//        channel.shutdown();
    }

    public static void switchLight() {
        boolean random = Math.round(Math.random()) != 0;


        SwitchLightRequest switchLightRequest = SwitchLightRequest.newBuilder().setLight(!isLightOn).build();
        SwitchLightResponse response = blockingStub.switchLight(switchLightRequest);
        isLightOn = !isLightOn;

        System.out.println(response.getSwitchLightMessage());

    }
}
