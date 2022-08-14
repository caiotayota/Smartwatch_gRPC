package com.caiotayota.smartwatch.jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class SimpleServiceDiscovery {

    private static class MyServiceListener implements ServiceListener {

        private int port;
        private ServiceInfo serviceInfo;

        public void serviceAdded(ServiceEvent event) {
            System.out.println("\nService Added " + event.getInfo() + "\n");
        }

        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service Removed " + event.getInfo());
        }

        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service Resolved " + event.getInfo());

            ServiceInfo serviceInfo = event.getInfo();
            this.setServiceInfo(serviceInfo);
            System.out.println("host: " + serviceInfo.getHostAddresses()[0]);
            System.out.println("port: " + serviceInfo.getPort());
            this.setPort(serviceInfo.getPort());
            System.out.println("type: " + serviceInfo.getType());
            System.out.println("name: " + serviceInfo.getName());
            System.out.println("computer name: " + serviceInfo.getServer());
            System.out.println("desc/properties: " + serviceInfo.getNiceTextString());
            System.out.println();
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public ServiceInfo getServiceInfo() {
            return serviceInfo;
        }

        public void setServiceInfo(ServiceInfo serviceInfo) {
            this.serviceInfo = serviceInfo;
        }

    }

    public static ServiceInfo run(String service_type) {
        ServiceInfo serviceInfo = null;

        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            MyServiceListener msl = new MyServiceListener();
            jmdns.addServiceListener(service_type, msl);

            Thread.sleep(500);

            serviceInfo = msl.getServiceInfo();

            jmdns.close();

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        return serviceInfo;
    }
}
