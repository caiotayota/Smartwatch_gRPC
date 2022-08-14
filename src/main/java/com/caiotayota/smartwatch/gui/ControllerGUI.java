package com.caiotayota.smartwatch.gui;

import com.caiotayota.smartwatch.musicPlayer.MusicPlayerClient;
import com.caiotayota.smartwatch.musicPlayer.MusicPlayerServer;
import com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringClient;
import com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringServer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerGUI implements ActionListener {

    private JTextField entry1, reply1;
    private JTextArea reply2;
    private JTextField entry3, reply3;
    private JTextField entry4, reply4;


    private JPanel getService1JPanel() throws InterruptedException {

//        Thread musicPlayerServerThread = new Thread() {
//
//            @Override
//            public void run() {
//                MusicPlayerServer.run();
//
//            }
//        };

//        musicPlayerServerThread.start();


//        Thread.sleep(5000);

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);


        JLabel label = new JLabel("Enter the music or artist separated by coma");
        JLabel label2 = new JLabel("(E.g.: Bob Marley, Guns and Roses, Peter Tosh, Tupac)");
        panel.add(label);
        panel.add(label2);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        entry1 = new JTextField("",10);

        panel.add(entry1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton button = new JButton("Play Music");
        button.addActionListener(this);

        panel.add(button);


        reply1 = new JTextField("",10);
        reply1.setEditable(false);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(reply1);

        panel.setLayout(boxlayout);

        return panel;

    }

    private JPanel getService2JPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        JButton button = new JButton("Start tracking");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        reply2 = new JTextArea("",10,50);
        reply2.setEditable(false);

        panel.add(reply2);
        panel.setLayout(boxlayout);

        return panel;

    }
//
//    private JPanel getService3JPanel() {
//
//        JPanel panel = new JPanel();
//
//        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
//
//        JLabel label = new JLabel("Enter value")	;
//        panel.add(label);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//        entry3 = new JTextField("",10);
//        panel.add(entry3);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//
//        JButton button = new JButton("Invoke Service 3");
//        button.addActionListener(this);
//        panel.add(button);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//
//        reply3 = new JTextField("", 10);
//        reply3 .setEditable(false);
//        panel.add(reply3 );
//
//        panel.setLayout(boxlayout);
//
//        return panel;
//
//    }
//
//    private JPanel getService4JPanel() {
//
//        JPanel panel = new JPanel();
//
//        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
//
//        JLabel label = new JLabel("Enter value")	;
//        panel.add(label);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//        entry4 = new JTextField("",10);
//        panel.add(entry4);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//
//        JButton button = new JButton("Invoke Service 4");
//        button.addActionListener(this);
//        panel.add(button);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//
//        reply4 = new JTextField("", 10);
//        reply4 .setEditable(false);
//        panel.add(reply4 );
//
//        panel.setLayout(boxlayout);
//
//        return panel;
//
//    }
    public static void main(String[] args) throws InterruptedException {

        ControllerGUI gui = new ControllerGUI();

        gui.build();
    }

    private void build() throws InterruptedException {

        JFrame frame = new JFrame("Smartwatch Service Controller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
        panel1.add(getService1JPanel());

        JTabbedPane tp1 = new JTabbedPane();
        tp1.setBounds(50, 50, 200, 200);
        tp1.add("Music Player", panel1);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
        panel2.add(getService2JPanel());

        JTabbedPane tp2 = new JTabbedPane();
        tp1.setBounds(50, 50, 200, 200);
        tp1.add("Sleep Monitoring", panel2);

//        JPanel panel3 = new JPanel();
//        panel3.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
//        panel3.add(getService1JPanel());
//
//        JTabbedPane tp3 = new JTabbedPane();
//        tp1.setBounds(50, 50, 200, 200);
//        tp1.add("Switch Lights", panel3);
//
//        JPanel panel4 = new JPanel();
//        panel4.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
//        panel4.add(getService1JPanel());
//
//        JTabbedPane tp4 = new JTabbedPane();
//        tp1.setBounds(50, 50, 200, 200);
//        tp1.add("Voice Chat", panel4);

        frame.setSize(300, 300);



        // Set the window to be visible as the default to be false
        frame.add(tp1);
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        String label = button.getActionCommand();

        if (label.equals("Play Music")) {
            System.out.println("... Connecting to the Music Server ...");

            try {

                Thread musicPlayerServerThread = new Thread() {
                    @Override
                    public void run() {
                        MusicPlayerServer.main(new String[]{});
                    }
                };

                Thread musicPlayerClientThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            reply1.setText("Playing playlist...");
                            MusicPlayerClient.main(new String[]{entry1.getText()});
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                };

                musicPlayerServerThread.start();
                Thread.sleep(8000);
                musicPlayerClientThread.start();


            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        } else if (label.equals("Start tracking")) {
            System.out.println("... Connecting to the Sleeping Monitoring Server ...");

            try {

                Thread sleepMonitoringServerThread = new Thread() {
                    @Override
                    public void run() {
                        SleepMonitoringServer.main(new String[]{});
                    }
                };

                Thread sleepMonitoringClientThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            SleepMonitoringClient.main(new String[]{});
                            reply2.setText(SleepMonitoringServer.response);
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                };

                sleepMonitoringServerThread.start();
                Thread.sleep(8000);
                sleepMonitoringClientThread.start();


            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }


        }

    }

}
