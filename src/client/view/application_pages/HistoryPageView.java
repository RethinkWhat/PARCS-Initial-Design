package client.view.application_pages;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;


public class HistoryPageView extends javax.swing.JFrame {
    // declare variables to store X and Y coordinates values.
    int positionX = 0;
    int positionY = 0;
    private JPanel[] pages;
    private int currentPageIndex;
    public HistoryPageView() {

        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        pages = new JPanel[]{page1, page2, page3,page4,page5,page6,page7,page8,page9,page10};
        currentPageIndex = 0;

        JButton [] btns = {exitBtn,homeBtn,ticketBtn};
        for (JButton btn : btns){
            btn.setBackground(new Color(76,102,99));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(225,225,225));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(76,102,99));

                }

            });
        }

    }
    private void nextPage() {
        if (currentPageIndex < pages.length - 1) {
            pages[currentPageIndex].setVisible(false); // Hide current page
            currentPageIndex++; // Move to the next page
            pages[currentPageIndex].setVisible(true); // Show next page
        }
    }

    // Method to switch to the previous page
    private void previousPage() {
        if (currentPageIndex > 0) {
            pages[currentPageIndex].setVisible(false); // Hide current page
            currentPageIndex--; // Move to the previous page
            pages[currentPageIndex].setVisible(true); // Show previous page
        }
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        parcsLogo = new javax.swing.JLabel();
        ticketText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        ticketBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        page1 = new javax.swing.JPanel();
        dateTicket = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        parkingArea = new javax.swing.JLabel();
        parkingType = new javax.swing.JLabel();
        vehicle = new javax.swing.JLabel();
        parkingSpot = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();
        duration = new javax.swing.JLabel();
        parkingAreaInfo = new javax.swing.JLabel();
        parkingTypeInfo = new javax.swing.JLabel();
        vehicleInfo = new javax.swing.JLabel();
        parkingSpotInfo = new javax.swing.JLabel();
        hoursInfo = new javax.swing.JLabel();
        durationInfo = new javax.swing.JLabel();
        page2 = new javax.swing.JPanel();
        dateTicket1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        parkingArea1 = new javax.swing.JLabel();
        parkingType1 = new javax.swing.JLabel();
        vehicle1 = new javax.swing.JLabel();
        parkingSpot1 = new javax.swing.JLabel();
        hours1 = new javax.swing.JLabel();
        duration1 = new javax.swing.JLabel();
        parkingAreaInfo1 = new javax.swing.JLabel();
        parkingTypeInfo1 = new javax.swing.JLabel();
        vehicleInfo1 = new javax.swing.JLabel();
        parkingSpotInfo1 = new javax.swing.JLabel();
        hoursInfo1 = new javax.swing.JLabel();
        durationInfo1 = new javax.swing.JLabel();
        page3 = new javax.swing.JPanel();
        dateTicket2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        parkingArea2 = new javax.swing.JLabel();
        parkingType2 = new javax.swing.JLabel();
        vehicle2 = new javax.swing.JLabel();
        parkingSpot2 = new javax.swing.JLabel();
        hours2 = new javax.swing.JLabel();
        duration2 = new javax.swing.JLabel();
        parkingAreaInfo2 = new javax.swing.JLabel();
        parkingTypeInfo2 = new javax.swing.JLabel();
        vehicleInfo2 = new javax.swing.JLabel();
        parkingSpotInfo2 = new javax.swing.JLabel();
        hoursInfo2 = new javax.swing.JLabel();
        durationInfo2 = new javax.swing.JLabel();
        page4 = new javax.swing.JPanel();
        dateTicket3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        parkingArea3 = new javax.swing.JLabel();
        parkingType3 = new javax.swing.JLabel();
        vehicle3 = new javax.swing.JLabel();
        parkingSpot3 = new javax.swing.JLabel();
        hours3 = new javax.swing.JLabel();
        duration3 = new javax.swing.JLabel();
        parkingAreaInfo3 = new javax.swing.JLabel();
        parkingTypeInfo3 = new javax.swing.JLabel();
        vehicleInfo3 = new javax.swing.JLabel();
        parkingSpotInfo3 = new javax.swing.JLabel();
        hoursInfo3 = new javax.swing.JLabel();
        durationInfo3 = new javax.swing.JLabel();
        page5 = new javax.swing.JPanel();
        dateTicket4 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        parkingArea4 = new javax.swing.JLabel();
        parkingType4 = new javax.swing.JLabel();
        vehicle4 = new javax.swing.JLabel();
        parkingSpot4 = new javax.swing.JLabel();
        hours4 = new javax.swing.JLabel();
        duration4 = new javax.swing.JLabel();
        parkingAreaInfo4 = new javax.swing.JLabel();
        parkingTypeInfo4 = new javax.swing.JLabel();
        vehicleInfo4 = new javax.swing.JLabel();
        parkingSpotInfo4 = new javax.swing.JLabel();
        hoursInfo4 = new javax.swing.JLabel();
        durationInfo4 = new javax.swing.JLabel();
        page6 = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        parkingArea5 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        parkingType5 = new javax.swing.JLabel();
        duration5 = new javax.swing.JLabel();
        vehicle5 = new javax.swing.JLabel();
        durationInfo5 = new javax.swing.JLabel();
        vehicleInfo5 = new javax.swing.JLabel();
        dateTicket5 = new javax.swing.JLabel();
        parkingSpotInfo5 = new javax.swing.JLabel();
        parkingTypeInfo5 = new javax.swing.JLabel();
        hoursInfo5 = new javax.swing.JLabel();
        hours5 = new javax.swing.JLabel();
        parkingAreaInfo5 = new javax.swing.JLabel();
        parkingSpot5 = new javax.swing.JLabel();
        page7 = new javax.swing.JPanel();
        parkingType6 = new javax.swing.JLabel();
        parkingSpotInfo6 = new javax.swing.JLabel();
        hours6 = new javax.swing.JLabel();
        parkingSpot6 = new javax.swing.JLabel();
        parkingArea6 = new javax.swing.JLabel();
        vehicle6 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        duration6 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        hoursInfo6 = new javax.swing.JLabel();
        parkingAreaInfo6 = new javax.swing.JLabel();
        parkingTypeInfo6 = new javax.swing.JLabel();
        vehicleInfo6 = new javax.swing.JLabel();
        dateTicket6 = new javax.swing.JLabel();
        durationInfo6 = new javax.swing.JLabel();
        page8 = new javax.swing.JPanel();
        hours7 = new javax.swing.JLabel();
        parkingSpot7 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        durationInfo7 = new javax.swing.JLabel();
        vehicle7 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        parkingAreaInfo7 = new javax.swing.JLabel();
        parkingSpotInfo7 = new javax.swing.JLabel();
        parkingArea7 = new javax.swing.JLabel();
        dateTicket7 = new javax.swing.JLabel();
        hoursInfo7 = new javax.swing.JLabel();
        vehicleInfo7 = new javax.swing.JLabel();
        duration7 = new javax.swing.JLabel();
        parkingType7 = new javax.swing.JLabel();
        parkingTypeInfo7 = new javax.swing.JLabel();
        page9 = new javax.swing.JPanel();
        hours8 = new javax.swing.JLabel();
        parkingSpot8 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        durationInfo8 = new javax.swing.JLabel();
        vehicle8 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        parkingAreaInfo8 = new javax.swing.JLabel();
        parkingSpotInfo8 = new javax.swing.JLabel();
        parkingArea8 = new javax.swing.JLabel();
        dateTicket8 = new javax.swing.JLabel();
        hoursInfo8 = new javax.swing.JLabel();
        vehicleInfo8 = new javax.swing.JLabel();
        duration8 = new javax.swing.JLabel();
        parkingType8 = new javax.swing.JLabel();
        parkingTypeInfo8 = new javax.swing.JLabel();
        page10 = new javax.swing.JPanel();
        hours9 = new javax.swing.JLabel();
        parkingSpot9 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        durationInfo9 = new javax.swing.JLabel();
        vehicle9 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        parkingAreaInfo9 = new javax.swing.JLabel();
        parkingSpotInfo9 = new javax.swing.JLabel();
        parkingArea9 = new javax.swing.JLabel();
        dateTicket9 = new javax.swing.JLabel();
        hoursInfo9 = new javax.swing.JLabel();
        vehicleInfo9 = new javax.swing.JLabel();
        duration9 = new javax.swing.JLabel();
        parkingType9 = new javax.swing.JLabel();
        parkingTypeInfo9 = new javax.swing.JLabel();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(128, 207, 169));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        ImageIcon parcs = new ImageIcon("res/drawable/icons/parcs-logo-small.png");
        Image scaledParcs = parcs.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
        parcs = new ImageIcon(scaledParcs);
        parcsLogo.setIcon(parcs);

        ticketText.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        ticketText.setForeground(new java.awt.Color(255, 255, 255));
        ticketText.setText("HistoryPageView");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(parcsLogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ticketText)
                                .addContainerGap(895, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(parcsLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ticketText)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(76, 102, 99));

        ImageIcon home = new ImageIcon("res/drawable/icons/home-white-outline.png");
        Image scaledHome = home.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
        home = new ImageIcon(scaledHome);
        homeBtn.setBackground(new java.awt.Color(76, 102, 99));
        homeBtn.setIcon(home);
        homeBtn.setBorder(null);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        ImageIcon ticket = new ImageIcon("res/drawable/icons/ticket-white-outline.png");
        Image scaledTicket = ticket.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
        ticket = new ImageIcon(scaledTicket);
        ticketBtn.setBackground(new java.awt.Color(76, 102, 99));
        ticketBtn.setIcon(ticket); // NOI18N
        ticketBtn.setBorder(null);
        ticketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketBtnActionPerformed(evt);
            }
        });

        ImageIcon exit = new ImageIcon("res/drawable/icons/exit-white-outline.png");
        Image scaledExit = exit.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
        exit = new ImageIcon(scaledExit);
        exitBtn.setBackground(new java.awt.Color(76, 102, 99));
        exitBtn.setIcon(exit); // NOI18N
        exitBtn.setBorder(null);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(ticketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(homeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ticketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jLayeredPane1.setForeground(new java.awt.Color(153, 153, 153));
        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        page1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        dateTicket.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket.setText("December 12 2023");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        parkingArea.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea.setText("Parking Area");

        parkingType.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType.setText("Parking Type");

        vehicle.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle.setText("Vehicle");

        parkingSpot.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot.setText("Parking Spot");

        hours.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours.setText("Hours");

        duration.setText("Duration");

        parkingAreaInfo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo.setText("Info");

        parkingTypeInfo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo.setText("Info");

        vehicleInfo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo.setText("Info");

        parkingSpotInfo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo.setText("Info");

        hoursInfo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo.setText("Info");

        durationInfo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo.setText("Info");

        javax.swing.GroupLayout page1Layout = new javax.swing.GroupLayout(page1);
        page1.setLayout(page1Layout);
        page1Layout.setHorizontalGroup(
                page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page1Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket)
                                .addContainerGap(414, Short.MAX_VALUE))
                        .addGroup(page1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page1Layout.createSequentialGroup()
                                                .addComponent(hours)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(hoursInfo))
                                        .addGroup(page1Layout.createSequentialGroup()
                                                .addComponent(parkingSpot)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(parkingSpotInfo))
                                        .addGroup(page1Layout.createSequentialGroup()
                                                .addComponent(duration)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo))
                                        .addGroup(page1Layout.createSequentialGroup()
                                                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(parkingArea)
                                                        .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(vehicle)
                                                                .addComponent(parkingType)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingAreaInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page1Layout.setVerticalGroup(
                page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea)
                                        .addComponent(parkingAreaInfo))
                                .addGap(23, 23, 23)
                                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType)
                                        .addComponent(parkingTypeInfo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle)
                                        .addComponent(vehicleInfo))
                                .addGap(26, 26, 26)
                                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot)
                                        .addComponent(parkingSpotInfo))
                                .addGap(25, 25, 25)
                                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours)
                                        .addComponent(hoursInfo))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration)
                                        .addComponent(durationInfo))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page1);

        page2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        dateTicket1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket1.setText("February 17 2024");

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        parkingArea1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea1.setText("Parking Area");

        parkingType1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType1.setText("Parking Type");

        vehicle1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle1.setText("Vehicle");

        parkingSpot1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot1.setText("Parking Spot");

        hours1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours1.setText("Hours");

        duration1.setText("Duration");

        parkingAreaInfo1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo1.setText("Info");

        parkingTypeInfo1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo1.setText("Info");

        vehicleInfo1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo1.setText("Info");

        parkingSpotInfo1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo1.setText("Info");

        hoursInfo1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo1.setText("Info");

        durationInfo1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo1.setText("Info");

        javax.swing.GroupLayout page2Layout = new javax.swing.GroupLayout(page2);
        page2.setLayout(page2Layout);
        page2Layout.setHorizontalGroup(
                page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator4)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page2Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket1)
                                .addContainerGap(423, Short.MAX_VALUE))
                        .addGroup(page2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page2Layout.createSequentialGroup()
                                                .addComponent(hours1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(hoursInfo1))
                                        .addGroup(page2Layout.createSequentialGroup()
                                                .addComponent(parkingSpot1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(parkingSpotInfo1))
                                        .addGroup(page2Layout.createSequentialGroup()
                                                .addComponent(duration1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo1))
                                        .addGroup(page2Layout.createSequentialGroup()
                                                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicle1)
                                                        .addComponent(parkingType1)
                                                        .addComponent(parkingArea1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingAreaInfo1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page2Layout.setVerticalGroup(
                page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket1)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea1)
                                        .addComponent(parkingAreaInfo1))
                                .addGap(23, 23, 23)
                                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType1)
                                        .addComponent(parkingTypeInfo1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle1)
                                        .addComponent(vehicleInfo1))
                                .addGap(26, 26, 26)
                                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot1)
                                        .addComponent(parkingSpotInfo1))
                                .addGap(25, 25, 25)
                                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours1)
                                        .addComponent(hoursInfo1))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration1)
                                        .addComponent(durationInfo1))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page2);

        page3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        dateTicket2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket2.setText("June 17 2024");

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));

        parkingArea2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea2.setText("Parking Area");

        parkingType2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType2.setText("Parking Type");

        vehicle2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle2.setText("Vehicle");

        parkingSpot2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot2.setText("Parking Spot");

        hours2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours2.setText("Hours");

        duration2.setText("Duration");

        parkingAreaInfo2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo2.setText("Info");

        parkingTypeInfo2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo2.setText("Info");

        vehicleInfo2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo2.setText("Info");

        parkingSpotInfo2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo2.setText("Info");

        hoursInfo2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo2.setText("Info");

        durationInfo2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo2.setText("Info");

        javax.swing.GroupLayout page3Layout = new javax.swing.GroupLayout(page3);
        page3.setLayout(page3Layout);
        page3Layout.setHorizontalGroup(
                page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator6)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page3Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket2)
                                .addContainerGap(451, Short.MAX_VALUE))
                        .addGroup(page3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page3Layout.createSequentialGroup()
                                                .addComponent(hours2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(hoursInfo2))
                                        .addGroup(page3Layout.createSequentialGroup()
                                                .addComponent(parkingSpot2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(parkingSpotInfo2))
                                        .addGroup(page3Layout.createSequentialGroup()
                                                .addComponent(duration2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo2))
                                        .addGroup(page3Layout.createSequentialGroup()
                                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicle2)
                                                        .addComponent(parkingType2)
                                                        .addComponent(parkingArea2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingAreaInfo2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo2, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page3Layout.setVerticalGroup(
                page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket2)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea2)
                                        .addComponent(parkingAreaInfo2))
                                .addGap(23, 23, 23)
                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType2)
                                        .addComponent(parkingTypeInfo2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle2)
                                        .addComponent(vehicleInfo2))
                                .addGap(26, 26, 26)
                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot2)
                                        .addComponent(parkingSpotInfo2))
                                .addGap(25, 25, 25)
                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours2)
                                        .addComponent(hoursInfo2))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration2)
                                        .addComponent(durationInfo2))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page3);

        page4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        dateTicket3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket3.setText("July 17 2024");

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator8.setForeground(new java.awt.Color(102, 102, 102));

        parkingArea3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea3.setText("Parking Area");

        parkingType3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType3.setText("Parking Type");

        vehicle3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle3.setText("Vehicle");

        parkingSpot3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot3.setText("Parking Spot");

        hours3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours3.setText("Hours");

        duration3.setText("Duration");

        parkingAreaInfo3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo3.setText("Info");

        parkingTypeInfo3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo3.setText("Info");

        vehicleInfo3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo3.setText("Info");

        parkingSpotInfo3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo3.setText("Info");

        hoursInfo3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo3.setText("Info");

        durationInfo3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo3.setText("Info");

        javax.swing.GroupLayout page4Layout = new javax.swing.GroupLayout(page4);
        page4.setLayout(page4Layout);
        page4Layout.setHorizontalGroup(
                page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator8)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page4Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket3)
                                .addContainerGap(456, Short.MAX_VALUE))
                        .addGroup(page4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page4Layout.createSequentialGroup()
                                                .addComponent(duration3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo3))
                                        .addGroup(page4Layout.createSequentialGroup()
                                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicle3)
                                                        .addComponent(parkingType3)
                                                        .addComponent(parkingArea3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo3)
                                                        .addComponent(parkingAreaInfo3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(page4Layout.createSequentialGroup()
                                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hours3)
                                                        .addComponent(parkingSpot3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hoursInfo3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingSpotInfo3, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page4Layout.setVerticalGroup(
                page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket3)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea3)
                                        .addComponent(parkingAreaInfo3))
                                .addGap(23, 23, 23)
                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType3)
                                        .addComponent(parkingTypeInfo3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle3)
                                        .addComponent(vehicleInfo3))
                                .addGap(26, 26, 26)
                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot3)
                                        .addComponent(parkingSpotInfo3))
                                .addGap(25, 25, 25)
                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours3)
                                        .addComponent(hoursInfo3))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration3)
                                        .addComponent(durationInfo3))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page4);

        page5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        dateTicket4.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket4.setText("October 23 2024");

        jSeparator9.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator10.setForeground(new java.awt.Color(102, 102, 102));

        parkingArea4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea4.setText("Parking Area");

        parkingType4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType4.setText("Parking Type");

        vehicle4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle4.setText("Vehicle");

        parkingSpot4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot4.setText("Parking Spot");

        hours4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours4.setText("Hours");

        duration4.setText("Duration");

        parkingAreaInfo4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo4.setText("Info");

        parkingTypeInfo4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo4.setText("Info");

        vehicleInfo4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo4.setText("Info");

        parkingSpotInfo4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo4.setText("Info");

        hoursInfo4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo4.setText("Info");

        durationInfo4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo4.setText("Info");

        javax.swing.GroupLayout page5Layout = new javax.swing.GroupLayout(page5);
        page5.setLayout(page5Layout);
        page5Layout.setHorizontalGroup(
                page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator10)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page5Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket4)
                                .addContainerGap(426, Short.MAX_VALUE))
                        .addGroup(page5Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page5Layout.createSequentialGroup()
                                                .addComponent(duration4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo4))
                                        .addGroup(page5Layout.createSequentialGroup()
                                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicle4)
                                                        .addComponent(parkingType4)
                                                        .addComponent(parkingArea4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo4)
                                                        .addComponent(parkingAreaInfo4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(page5Layout.createSequentialGroup()
                                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hours4)
                                                        .addComponent(parkingSpot4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hoursInfo4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingSpotInfo4, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page5Layout.setVerticalGroup(
                page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket4)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea4)
                                        .addComponent(parkingAreaInfo4))
                                .addGap(23, 23, 23)
                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType4)
                                        .addComponent(parkingTypeInfo4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle4)
                                        .addComponent(vehicleInfo4))
                                .addGap(26, 26, 26)
                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot4)
                                        .addComponent(parkingSpotInfo4))
                                .addGap(25, 25, 25)
                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours4)
                                        .addComponent(hoursInfo4))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration4)
                                        .addComponent(durationInfo4))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page5);

        page6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jSeparator11.setForeground(new java.awt.Color(102, 102, 102));

        parkingArea5.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea5.setText("Parking Area");

        jSeparator12.setForeground(new java.awt.Color(102, 102, 102));

        parkingType5.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType5.setText("Parking Type");

        duration5.setText("Duration");

        vehicle5.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle5.setText("Vehicle");

        durationInfo5.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo5.setText("Info");

        vehicleInfo5.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo5.setText("Info");

        dateTicket5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket5.setText("March 5 2024");

        parkingSpotInfo5.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo5.setText("Info");

        parkingTypeInfo5.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo5.setText("Info");

        hoursInfo5.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo5.setText("Info");

        hours5.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours5.setText("Hours");

        parkingAreaInfo5.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo5.setText("Info");

        parkingSpot5.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot5.setText("Parking Spot");

        javax.swing.GroupLayout page6Layout = new javax.swing.GroupLayout(page6);
        page6.setLayout(page6Layout);
        page6Layout.setHorizontalGroup(
                page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator12)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page6Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket5)
                                .addContainerGap(447, Short.MAX_VALUE))
                        .addGroup(page6Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page6Layout.createSequentialGroup()
                                                .addComponent(duration5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo5))
                                        .addGroup(page6Layout.createSequentialGroup()
                                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicle5)
                                                        .addComponent(parkingType5)
                                                        .addComponent(parkingArea5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo5)
                                                        .addComponent(parkingAreaInfo5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo5, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(page6Layout.createSequentialGroup()
                                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hours5)
                                                        .addComponent(parkingSpot5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hoursInfo5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingSpotInfo5, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page6Layout.setVerticalGroup(
                page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page6Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket5)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea5)
                                        .addComponent(parkingAreaInfo5))
                                .addGap(23, 23, 23)
                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType5)
                                        .addComponent(parkingTypeInfo5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle5)
                                        .addComponent(vehicleInfo5))
                                .addGap(26, 26, 26)
                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot5)
                                        .addComponent(parkingSpotInfo5))
                                .addGap(25, 25, 25)
                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours5)
                                        .addComponent(hoursInfo5))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration5)
                                        .addComponent(durationInfo5))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page6);

        page7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        parkingType6.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType6.setText("Parking Type");

        parkingSpotInfo6.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo6.setText("Info");

        hours6.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours6.setText("Hours");

        parkingSpot6.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot6.setText("Parking Spot");

        parkingArea6.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea6.setText("Parking Area");

        vehicle6.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle6.setText("Vehicle");

        jSeparator13.setForeground(new java.awt.Color(102, 102, 102));

        duration6.setText("Duration");

        jSeparator14.setForeground(new java.awt.Color(102, 102, 102));

        hoursInfo6.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo6.setText("Info");

        parkingAreaInfo6.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo6.setText("Info");

        parkingTypeInfo6.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo6.setText("Info");

        vehicleInfo6.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo6.setText("Info");

        dateTicket6.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket6.setText("November 16 2024");

        durationInfo6.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo6.setText("Info");

        javax.swing.GroupLayout page7Layout = new javax.swing.GroupLayout(page7);
        page7.setLayout(page7Layout);
        page7Layout.setHorizontalGroup(
                page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator14)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page7Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket6)
                                .addContainerGap(413, Short.MAX_VALUE))
                        .addGroup(page7Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page7Layout.createSequentialGroup()
                                                .addComponent(duration6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo6))
                                        .addGroup(page7Layout.createSequentialGroup()
                                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicle6)
                                                        .addComponent(parkingType6)
                                                        .addComponent(parkingArea6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo6)
                                                        .addComponent(parkingAreaInfo6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo6, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(page7Layout.createSequentialGroup()
                                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hours6)
                                                        .addComponent(parkingSpot6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hoursInfo6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingSpotInfo6, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page7Layout.setVerticalGroup(
                page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page7Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket6)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea6)
                                        .addComponent(parkingAreaInfo6))
                                .addGap(23, 23, 23)
                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType6)
                                        .addComponent(parkingTypeInfo6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle6)
                                        .addComponent(vehicleInfo6))
                                .addGap(26, 26, 26)
                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot6)
                                        .addComponent(parkingSpotInfo6))
                                .addGap(25, 25, 25)
                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours6)
                                        .addComponent(hoursInfo6))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration6)
                                        .addComponent(durationInfo6))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page7);

        page8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        hours7.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours7.setText("Hours");

        parkingSpot7.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot7.setText("Parking Spot");

        jSeparator15.setForeground(new java.awt.Color(102, 102, 102));

        durationInfo7.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo7.setText("Info");

        vehicle7.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle7.setText("Vehicle");

        jSeparator16.setForeground(new java.awt.Color(102, 102, 102));

        parkingAreaInfo7.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo7.setText("Info");

        parkingSpotInfo7.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo7.setText("Info");

        parkingArea7.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea7.setText("Parking Area");

        dateTicket7.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket7.setText("July 23 2024");

        hoursInfo7.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo7.setText("Info");

        vehicleInfo7.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo7.setText("Info");

        duration7.setText("Duration");

        parkingType7.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType7.setText("Parking Type");

        parkingTypeInfo7.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo7.setText("Info");

        javax.swing.GroupLayout page8Layout = new javax.swing.GroupLayout(page8);
        page8.setLayout(page8Layout);
        page8Layout.setHorizontalGroup(
                page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator15)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page8Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket7)
                                .addContainerGap(453, Short.MAX_VALUE))
                        .addGroup(page8Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page8Layout.createSequentialGroup()
                                                .addComponent(duration7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo7))
                                        .addGroup(page8Layout.createSequentialGroup()
                                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicle7)
                                                        .addComponent(parkingType7)
                                                        .addComponent(parkingArea7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo7)
                                                        .addComponent(parkingAreaInfo7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo7, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(page8Layout.createSequentialGroup()
                                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hours7)
                                                        .addComponent(parkingSpot7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hoursInfo7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingSpotInfo7, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page8Layout.setVerticalGroup(
                page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page8Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket7)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea7)
                                        .addComponent(parkingAreaInfo7))
                                .addGap(23, 23, 23)
                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType7)
                                        .addComponent(parkingTypeInfo7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle7)
                                        .addComponent(vehicleInfo7))
                                .addGap(26, 26, 26)
                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot7)
                                        .addComponent(parkingSpotInfo7))
                                .addGap(25, 25, 25)
                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours7)
                                        .addComponent(hoursInfo7))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration7)
                                        .addComponent(durationInfo7))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page8);

        page9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        hours8.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours8.setText("Hours");

        parkingSpot8.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot8.setText("Parking Spot");

        jSeparator17.setForeground(new java.awt.Color(102, 102, 102));

        durationInfo8.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo8.setText("Info");

        vehicle8.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle8.setText("Vehicle");

        jSeparator18.setForeground(new java.awt.Color(102, 102, 102));

        parkingAreaInfo8.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo8.setText("Info");

        parkingSpotInfo8.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo8.setText("Info");

        parkingArea8.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea8.setText("Parking Area");

        dateTicket8.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket8.setText("June 9 2024");

        hoursInfo8.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo8.setText("Info");

        vehicleInfo8.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo8.setText("Info");

        duration8.setText("Duration");

        parkingType8.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType8.setText("Parking Type");

        parkingTypeInfo8.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo8.setText("Info");

        javax.swing.GroupLayout page9Layout = new javax.swing.GroupLayout(page9);
        page9.setLayout(page9Layout);
        page9Layout.setHorizontalGroup(
                page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator17)
                        .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page9Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket8)
                                .addContainerGap(457, Short.MAX_VALUE))
                        .addGroup(page9Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page9Layout.createSequentialGroup()
                                                .addComponent(duration8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo8))
                                        .addGroup(page9Layout.createSequentialGroup()
                                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicle8)
                                                        .addComponent(parkingType8)
                                                        .addComponent(parkingArea8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo8)
                                                        .addComponent(parkingAreaInfo8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo8, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(page9Layout.createSequentialGroup()
                                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hours8)
                                                        .addComponent(parkingSpot8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hoursInfo8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingSpotInfo8, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page9Layout.setVerticalGroup(
                page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page9Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket8)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea8)
                                        .addComponent(parkingAreaInfo8))
                                .addGap(23, 23, 23)
                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType8)
                                        .addComponent(parkingTypeInfo8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle8)
                                        .addComponent(vehicleInfo8))
                                .addGap(26, 26, 26)
                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot8)
                                        .addComponent(parkingSpotInfo8))
                                .addGap(25, 25, 25)
                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours8)
                                        .addComponent(hoursInfo8))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration8)
                                        .addComponent(durationInfo8))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page9);

        page10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        hours9.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        hours9.setText("Hours");

        parkingSpot9.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingSpot9.setText("Parking Spot");

        jSeparator19.setForeground(new java.awt.Color(102, 102, 102));

        durationInfo9.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        durationInfo9.setText("Info");

        vehicle9.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        vehicle9.setText("Vehicle");

        jSeparator20.setForeground(new java.awt.Color(102, 102, 102));

        parkingAreaInfo9.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingAreaInfo9.setText("Info");

        parkingSpotInfo9.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingSpotInfo9.setText("Info");

        parkingArea9.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingArea9.setText("Parking Area");

        dateTicket9.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        dateTicket9.setText("October 17 2024");

        hoursInfo9.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        hoursInfo9.setText("Info");

        vehicleInfo9.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        vehicleInfo9.setText("Info");

        duration9.setText("Duration");

        parkingType9.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        parkingType9.setText("Parking Type");

        parkingTypeInfo9.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        parkingTypeInfo9.setText("Info");

        javax.swing.GroupLayout page10Layout = new javax.swing.GroupLayout(page10);
        page10.setLayout(page10Layout);
        page10Layout.setHorizontalGroup(
                page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator19)
                        .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(page10Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(dateTicket9)
                                .addContainerGap(427, Short.MAX_VALUE))
                        .addGroup(page10Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(page10Layout.createSequentialGroup()
                                                .addComponent(duration9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationInfo9))
                                        .addGroup(page10Layout.createSequentialGroup()
                                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicle9)
                                                        .addComponent(parkingType9)
                                                        .addComponent(parkingArea9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vehicleInfo9)
                                                        .addComponent(parkingAreaInfo9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingTypeInfo9, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(page10Layout.createSequentialGroup()
                                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hours9)
                                                        .addComponent(parkingSpot9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(hoursInfo9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(parkingSpotInfo9, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(63, 63, 63))
        );
        page10Layout.setVerticalGroup(
                page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(page10Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dateTicket9)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingArea9)
                                        .addComponent(parkingAreaInfo9))
                                .addGap(23, 23, 23)
                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingType9)
                                        .addComponent(parkingTypeInfo9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vehicle9)
                                        .addComponent(vehicleInfo9))
                                .addGap(26, 26, 26)
                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parkingSpot9)
                                        .addComponent(parkingSpotInfo9))
                                .addGap(25, 25, 25)
                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hours9)
                                        .addComponent(hoursInfo9))
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(page10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(duration9)
                                        .addComponent(durationInfo9))
                                .addGap(74, 74, 74))
        );

        jLayeredPane1.add(page10);

        previousButton.setText("Previous");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(449, 449, 449)
                                                .addComponent(previousButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(previousButton)
                                                        .addComponent(nextButton))
                                                .addGap(30, 30, 30))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {
        // get x and y coordinates values
        positionX = evt.getX();
        positionY = evt.getY();
    }

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {
        // set JFrame animation
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ticketBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {

    }


    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {
        previousPage();

    }

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {
        nextPage();

    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HistoryPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryPageView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel dateTicket;
    private javax.swing.JLabel dateTicket1;
    private javax.swing.JLabel dateTicket2;
    private javax.swing.JLabel dateTicket3;
    private javax.swing.JLabel dateTicket4;
    private javax.swing.JLabel dateTicket5;
    private javax.swing.JLabel dateTicket6;
    private javax.swing.JLabel dateTicket7;
    private javax.swing.JLabel dateTicket8;
    private javax.swing.JLabel dateTicket9;
    private javax.swing.JLabel duration;
    private javax.swing.JLabel duration1;
    private javax.swing.JLabel duration2;
    private javax.swing.JLabel duration3;
    private javax.swing.JLabel duration4;
    private javax.swing.JLabel duration5;
    private javax.swing.JLabel duration6;
    private javax.swing.JLabel duration7;
    private javax.swing.JLabel duration8;
    private javax.swing.JLabel duration9;
    private javax.swing.JLabel durationInfo;
    private javax.swing.JLabel durationInfo1;
    private javax.swing.JLabel durationInfo2;
    private javax.swing.JLabel durationInfo3;
    private javax.swing.JLabel durationInfo4;
    private javax.swing.JLabel durationInfo5;
    private javax.swing.JLabel durationInfo6;
    private javax.swing.JLabel durationInfo7;
    private javax.swing.JLabel durationInfo8;
    private javax.swing.JLabel durationInfo9;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel hours;
    private javax.swing.JLabel hours1;
    private javax.swing.JLabel hours2;
    private javax.swing.JLabel hours3;
    private javax.swing.JLabel hours4;
    private javax.swing.JLabel hours5;
    private javax.swing.JLabel hours6;
    private javax.swing.JLabel hours7;
    private javax.swing.JLabel hours8;
    private javax.swing.JLabel hours9;
    private javax.swing.JLabel hoursInfo;
    private javax.swing.JLabel hoursInfo1;
    private javax.swing.JLabel hoursInfo2;
    private javax.swing.JLabel hoursInfo3;
    private javax.swing.JLabel hoursInfo4;
    private javax.swing.JLabel hoursInfo5;
    private javax.swing.JLabel hoursInfo6;
    private javax.swing.JLabel hoursInfo7;
    private javax.swing.JLabel hoursInfo8;
    private javax.swing.JLabel hoursInfo9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel page1;
    private javax.swing.JPanel page10;
    private javax.swing.JPanel page2;
    private javax.swing.JPanel page3;
    private javax.swing.JPanel page4;
    private javax.swing.JPanel page5;
    private javax.swing.JPanel page6;
    private javax.swing.JPanel page7;
    private javax.swing.JPanel page8;
    private javax.swing.JPanel page9;
    private javax.swing.JLabel parcsLogo;
    private javax.swing.JLabel parkingArea;
    private javax.swing.JLabel parkingArea1;
    private javax.swing.JLabel parkingArea2;
    private javax.swing.JLabel parkingArea3;
    private javax.swing.JLabel parkingArea4;
    private javax.swing.JLabel parkingArea5;
    private javax.swing.JLabel parkingArea6;
    private javax.swing.JLabel parkingArea7;
    private javax.swing.JLabel parkingArea8;
    private javax.swing.JLabel parkingArea9;
    private javax.swing.JLabel parkingAreaInfo;
    private javax.swing.JLabel parkingAreaInfo1;
    private javax.swing.JLabel parkingAreaInfo2;
    private javax.swing.JLabel parkingAreaInfo3;
    private javax.swing.JLabel parkingAreaInfo4;
    private javax.swing.JLabel parkingAreaInfo5;
    private javax.swing.JLabel parkingAreaInfo6;
    private javax.swing.JLabel parkingAreaInfo7;
    private javax.swing.JLabel parkingAreaInfo8;
    private javax.swing.JLabel parkingAreaInfo9;
    private javax.swing.JLabel parkingSpot;
    private javax.swing.JLabel parkingSpot1;
    private javax.swing.JLabel parkingSpot2;
    private javax.swing.JLabel parkingSpot3;
    private javax.swing.JLabel parkingSpot4;
    private javax.swing.JLabel parkingSpot5;
    private javax.swing.JLabel parkingSpot6;
    private javax.swing.JLabel parkingSpot7;
    private javax.swing.JLabel parkingSpot8;
    private javax.swing.JLabel parkingSpot9;
    private javax.swing.JLabel parkingSpotInfo;
    private javax.swing.JLabel parkingSpotInfo1;
    private javax.swing.JLabel parkingSpotInfo2;
    private javax.swing.JLabel parkingSpotInfo3;
    private javax.swing.JLabel parkingSpotInfo4;
    private javax.swing.JLabel parkingSpotInfo5;
    private javax.swing.JLabel parkingSpotInfo6;
    private javax.swing.JLabel parkingSpotInfo7;
    private javax.swing.JLabel parkingSpotInfo8;
    private javax.swing.JLabel parkingSpotInfo9;
    private javax.swing.JLabel parkingType;
    private javax.swing.JLabel parkingType1;
    private javax.swing.JLabel parkingType2;
    private javax.swing.JLabel parkingType3;
    private javax.swing.JLabel parkingType4;
    private javax.swing.JLabel parkingType5;
    private javax.swing.JLabel parkingType6;
    private javax.swing.JLabel parkingType7;
    private javax.swing.JLabel parkingType8;
    private javax.swing.JLabel parkingType9;
    private javax.swing.JLabel parkingTypeInfo;
    private javax.swing.JLabel parkingTypeInfo1;
    private javax.swing.JLabel parkingTypeInfo2;
    private javax.swing.JLabel parkingTypeInfo3;
    private javax.swing.JLabel parkingTypeInfo4;
    private javax.swing.JLabel parkingTypeInfo5;
    private javax.swing.JLabel parkingTypeInfo6;
    private javax.swing.JLabel parkingTypeInfo7;
    private javax.swing.JLabel parkingTypeInfo8;
    private javax.swing.JLabel parkingTypeInfo9;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton ticketBtn;
    private javax.swing.JLabel ticketText;
    private javax.swing.JLabel vehicle;
    private javax.swing.JLabel vehicle1;
    private javax.swing.JLabel vehicle2;
    private javax.swing.JLabel vehicle3;
    private javax.swing.JLabel vehicle4;
    private javax.swing.JLabel vehicle5;
    private javax.swing.JLabel vehicle6;
    private javax.swing.JLabel vehicle7;
    private javax.swing.JLabel vehicle8;
    private javax.swing.JLabel vehicle9;
    private javax.swing.JLabel vehicleInfo;
    private javax.swing.JLabel vehicleInfo1;
    private javax.swing.JLabel vehicleInfo2;
    private javax.swing.JLabel vehicleInfo3;
    private javax.swing.JLabel vehicleInfo4;
    private javax.swing.JLabel vehicleInfo5;
    private javax.swing.JLabel vehicleInfo6;
    private javax.swing.JLabel vehicleInfo7;
    private javax.swing.JLabel vehicleInfo8;
    private javax.swing.JLabel vehicleInfo9;
    // End of variables declaration
}