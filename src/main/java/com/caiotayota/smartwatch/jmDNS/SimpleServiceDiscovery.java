package com.caiotayota.smartwatch.jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class SimpleServiceDiscovery {

    private int port;
    private String host;

    private static class MyServiceListener implements ServiceListener{

        private int port;
        private String host;
        private ServiceInfo serviceInfo;

        public void serviceAdded(ServiceEvent event) {
            // TODO Auto-generated method stub
            System.out.println("\nService Added " + event.getInfo());
        }

        public void serviceRemoved(ServiceEvent event) {
            // TODO Auto-generated method stub
            System.out.println("Service Removed " + event.getInfo());
        }

        public void serviceResolved(ServiceEvent event) {
            // TODO Auto-generated method stub
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

        int port = 0;
        ServiceInfo serviceInfo = null;

        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            MyServiceListener msl = new MyServiceListener();
            jmdns.addServiceListener(service_type, msl);

            Thread.sleep(10000);

            serviceInfo = msl.getServiceInfo();
            port = msl.getPort();
            System.out.println("This is the port retrieved from jmDNS: " + port);

            jmdns.close();

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        return serviceInfo;
    }
}
