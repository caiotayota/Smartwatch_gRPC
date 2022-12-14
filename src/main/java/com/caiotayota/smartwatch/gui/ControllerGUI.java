package com.caiotayota.smartwatch.gui;

import com.caiotayota.smartwatch.musicPlayer.MusicPlayerClient;
import com.caiotayota.smartwatch.musicPlayer.MusicPlayerServer;
import com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringClient;
import com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringServer;
import com.caiotayota.smartwatch.switchLights.SwitchLightsClient;
import com.caiotayota.smartwatch.switchLights.SwitchLightsServer;
import com.caiotayota.smartwatch.voiceMessage.VoiceMessageClient;
import com.caiotayota.smartwatch.voiceMessage.VoiceMessageServer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControllerGUI implements ActionListener {

    private JTextField entry1, reply1;
    private JTextArea reply2;
    private JTextField reply3;

    private boolean isMusicPlayerServerOn = false;
    private boolean isSleepingMonitoringServerOn = false;
    private boolean isSwitchLightsServerOn = false;
    private boolean isVoiceMessageServerOn = false;

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

        entry1 = new JTextField("", 10);

        panel.add(entry1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton button = new JButton("Play Music");
        button.addActionListener(this);

        panel.add(button);


        reply1 = new JTextField("", 10);
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

        reply2 = new JTextArea("", 10, 50);
        reply2.setEditable(false);

        panel.add(reply2);
        panel.setLayout(boxlayout);

        return panel;

    }

    private JPanel getService3JPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        JLabel label = new JLabel("Switch Light:");
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));


        JButton button1 = new JButton("Living Room");
        button1.setMinimumSize(new Dimension(300, 50));
        button1.addActionListener(this);
        panel.add(button1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton button2 = new JButton("Kitchen");
        button2.setMinimumSize(new Dimension(300, 50));
        button2.addActionListener(this);
        panel.add(button2);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton button3 = new JButton("Bedroom 1");
        button3.setMinimumSize(new Dimension(300, 50));
        button3.addActionListener(this);
        panel.add(button3);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton button4 = new JButton("Outside");
        button4.setPreferredSize(new Dimension(300, 50));
        button4.addActionListener(this);
        panel.add(button4);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        reply3 = new JTextField("", 10);
        reply3.setEditable(false);
        panel.add(reply3);

        panel.setLayout(boxlayout);

        return panel;

    }

    private JPanel getService4JPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        JLabel label = new JLabel("Hold the button to record and send a voice message:");
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton button = new JButton("Send Voice Message");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        panel.setLayout(boxlayout);

        return panel;

    }

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

        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
        panel3.add(getService3JPanel());

        JTabbedPane tp3 = new JTabbedPane();
        tp1.setBounds(50, 50, 200, 200);
        tp1.add("Switch Lights", panel3);

        JPanel panel4 = new JPanel();
        panel4.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
        panel4.add(getService4JPanel());

        JTabbedPane tp4 = new JTabbedPane();
        tp1.setBounds(50, 50, 200, 200);
        tp1.add("Voice Chat", panel4);

        frame.setSize(300, 300);


        // Set the window to be visible as the default to be false
        frame.add(tp1);
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String label = button.getActionCommand();

        if (label.equals("Play Music")) {

            if (!isMusicPlayerServerOn) {
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

                isMusicPlayerServerOn = true;
            } else {
                MusicPlayerClient.playMusic(entry1.getText());
            }

        } else if (label.equals("Start tracking")) {

            if (!isSleepingMonitoringServerOn) {
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
                isSleepingMonitoringServerOn = true;
            } else {
                SleepMonitoringClient.trackMovement();
                reply2.setText(SleepMonitoringServer.response);

            }


        } else if (label.equals("Living Room")) {

            if (!isSwitchLightsServerOn) {
                try {
                    Thread switchLightsServerThread = new Thread() {
                        @Override
                        public void run() {
                            SwitchLightsServer.main(new String[]{});
                        }
                    };
                    switchLightsServerThread.start();
                    isSwitchLightsServerOn = true;
                    Thread switchLightsClientThread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                SwitchLightsClient.main(new String[]{});
                                reply3.setText(SwitchLightsServer.response);
                            } catch (Exception ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    };
                    switchLightsClientThread.start();


                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } else {

                SwitchLightsClient.switchLight();
                reply3.setText(SwitchLightsServer.response);

            }

        } else if (label.equals("Kitchen")) {

            if (!isSwitchLightsServerOn) {
                try {
                    Thread switchLightsServerThread = new Thread() {
                        @Override
                        public void run() {
                            SwitchLightsServer.main(new String[]{});
                        }
                    };
                    switchLightsServerThread.start();
                    isSwitchLightsServerOn = true;
                    Thread switchLightsClientThread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                SwitchLightsClient.main(new String[]{});
                                reply3.setText(SwitchLightsServer.response);
                            } catch (Exception ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    };
                    switchLightsClientThread.start();


                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } else {

                SwitchLightsClient.switchLight();
                reply3.setText(SwitchLightsServer.response);

            }

        } else if (label.equals("Bedroom 1")) {

            if (!isSwitchLightsServerOn) {
                try {
                    Thread switchLightsServerThread = new Thread() {
                        @Override
                        public void run() {
                            SwitchLightsServer.main(new String[]{});
                        }
                    };
                    switchLightsServerThread.start();
                    isSwitchLightsServerOn = true;
                    Thread switchLightsClientThread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                SwitchLightsClient.main(new String[]{});
                                reply3.setText(SwitchLightsServer.response);
                            } catch (Exception ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    };
                    switchLightsClientThread.start();


                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } else {

                SwitchLightsClient.switchLight();
                reply3.setText(SwitchLightsServer.response);

            }


        } else if (label.equals("Outside")) {

            if (!isSwitchLightsServerOn) {
                try {
                    Thread switchLightsServerThread = new Thread() {
                        @Override
                        public void run() {
                            SwitchLightsServer.main(new String[]{});
                        }
                    };
                    switchLightsServerThread.start();
                    isSwitchLightsServerOn = true;
                    Thread switchLightsClientThread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                SwitchLightsClient.main(new String[]{});
                                reply3.setText(SwitchLightsServer.response);
                            } catch (Exception ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    };
                    switchLightsClientThread.start();


                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } else {

                SwitchLightsClient.switchLight();
                reply3.setText(SwitchLightsServer.response);

            }
        } else if (label.equals("Send Voice Message")) {

            if (!isVoiceMessageServerOn) {
                try {
                    Thread voiceMessageServerThread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                VoiceMessageServer.main(new String[]{});
                            } catch (IOException | InterruptedException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    };
                    voiceMessageServerThread.start();
                    isVoiceMessageServerOn = true;

                    Thread voiceMessageClientThread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                VoiceMessageClient.main(new String[]{});

                            } catch (Exception ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    };
                    voiceMessageClientThread.start();

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } else {

                VoiceMessageClient.sendVoiceMessage();

            }
        }
    }
}
