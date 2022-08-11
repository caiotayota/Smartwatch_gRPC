package com.caiotayota.smartwatch.jmDNS;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class SimpleServiceRegistration {

    public void run(int port, String service_type, String service_name) {

        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            String service_desc = "test integration of jmDNS with gRPC";

            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, port, service_desc);
            jmdns.registerService(serviceInfo);

            System.out.printf("* Registering service with type: \"%s\" and name: \"%s\" on port: \"%d\" *", service_type, service_name, port);

            Thread.sleep(5000); // sleep for 5 seconds
            System.out.println("\n* Service Registered *");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}

