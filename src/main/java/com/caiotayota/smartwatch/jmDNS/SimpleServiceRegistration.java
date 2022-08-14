package com.caiotayota.smartwatch.jmDNS;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class SimpleServiceRegistration {

    public void run(String service_type, String service_name, int port, String service_description) {

        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, port, service_description);
            jmdns.registerService(serviceInfo);
            System.out.printf("... Registering service with type: \"%s\" and name: \"%s\" on port: \"%d\" ...", service_type, service_name, port);

            Thread.sleep(500); // sleep for 2 seconds
            System.out.println("\n* Service Registered *");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

