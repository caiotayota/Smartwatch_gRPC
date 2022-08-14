package com.caiotayota.smartwatch.switchLights;

import com.caiotayota.smartwatch.jmDNS.SimpleServiceRegistration;
import com.caiotayota.smartwatch.switchLights.SwitchLightsServiceGrpc.SwitchLightsServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

public class SwitchLightsServer extends SwitchLightsServiceImplBase {

    private static final Logger logger = Logger.getLogger(SwitchLightsServer.class.getName());
    public static String response;

    public static void main(String[] args) {
        SwitchLightsServer switchLightsServer = new SwitchLightsServer();

        String service_type = "_switch-lights._tcp.local.";
        String service_name = "SwitchLightsServer";
        int port = 50054;
        String service_description = "Switch on/off the lights";

        SimpleServiceRegistration ssr = new SimpleServiceRegistration();
        ssr.run(service_type, service_name, port, service_description);

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(switchLightsServer)
                    .build()
                    .start();

            logger.info("Server started, listening on port " + port);

            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void switchLight(SwitchLightRequest switchLightRequest, StreamObserver<SwitchLightResponse> responseObserver) {
        String message = switchLightRequest.getLight() ? "The light was turned on!" : "The light was turned off!";
        response = message;

        System.out.println(switchLightRequest.getLight() ? "Request to turn on the lights received from Client." : "Request to turn off the lights received from client");

        SwitchLightResponse switchLightResponse = SwitchLightResponse
                .newBuilder()
                .setSwitchLightMessage(message)
                .build();

        responseObserver.onNext(switchLightResponse);
        responseObserver.onCompleted();
        }
}