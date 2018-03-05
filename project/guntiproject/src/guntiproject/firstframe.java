/*
 * Gunti database project
 */
package guntiproject;

import javax.swing.JOptionPane;
import  java.sql.*;

public class firstframe extends javax.swing.JFrame {

    /**
     * Creates new form firstframe
     */
    public firstframe() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        owner = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Account = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Stock = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField5 = new javax.swing.JPasswordField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Transportation = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField6 = new javax.swing.JPasswordField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ramamurthy");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setText("SRI SAI STEEL FURNITURE ");

        jButton1.setText("OWNER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ACCOUNTS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("STOCK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("TRANSPORTATION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        owner.setAlignmentX(200.0F);
        owner.setAlignmentY(200.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel2.setText("USER NAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel3.setText("PASSWORD");

        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton6.setText("SUBMIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton7.setText("RESET");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel10.setText("OWNER LOGIN");

        javax.swing.GroupLayout ownerLayout = new javax.swing.GroupLayout(owner);
        owner.setLayout(ownerLayout);
        ownerLayout.setHorizontalGroup(
            ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ownerLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel10)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ownerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ownerLayout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addGroup(ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ownerLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(105, 105, 105)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)
                        .addGroup(ownerLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jButton6)
                            .addGap(79, 79, 79)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        ownerLayout.setVerticalGroup(
            ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ownerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(72, 72, 72)
                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ownerLayout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addGroup(ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(ownerLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(32, 32, 32)
                    .addComponent(jLabel3)
                    .addGap(111, 111, 111)
                    .addGroup(ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton6)
                        .addComponent(jButton7))
                    .addGap(0, 43, Short.MAX_VALUE)))
        );

        Account.setAlignmentX(200.0F);
        Account.setAlignmentY(200.0F);

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel4.setText("USER NAME");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel5.setText("PASSWORD");

        jPasswordField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField4ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton8.setText("SUBMIT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton9.setText("RESET");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel11.setText("ACCOUNT LOGIN");

        javax.swing.GroupLayout AccountLayout = new javax.swing.GroupLayout(Account);
        Account.setLayout(AccountLayout);
        AccountLayout.setHorizontalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AccountLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(105, 105, 105)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AccountLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(105, 105, 105)
                                .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(AccountLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton8)
                        .addGap(79, 79, 79)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AccountLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel11)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        AccountLayout.setVerticalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(AccountLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        Stock.setAlignmentX(200.0F);
        Stock.setAlignmentY(200.0F);

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel6.setText("USER NAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel7.setText("PASSWORD");

        jPasswordField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField5ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton10.setText("SUBMIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton11.setText("RESET");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel12.setText("STOCK LOGIN");

        javax.swing.GroupLayout StockLayout = new javax.swing.GroupLayout(Stock);
        Stock.setLayout(StockLayout);
        StockLayout.setHorizontalGroup(
            StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel12)
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StockLayout.createSequentialGroup()
                    .addGap(0, 17, Short.MAX_VALUE)
                    .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StockLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(105, 105, 105)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(StockLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(105, 105, 105)
                            .addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(StockLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jButton10)
                            .addGap(79, 79, 79)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 18, Short.MAX_VALUE)))
        );
        StockLayout.setVerticalGroup(
            StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StockLayout.createSequentialGroup()
                    .addGap(0, 31, Short.MAX_VALUE)
                    .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(StockLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(28, 28, 28)
                    .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StockLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel7))
                        .addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(111, 111, 111)
                    .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton10)
                        .addComponent(jButton11))
                    .addGap(0, 32, Short.MAX_VALUE)))
        );

        Transportation.setAlignmentX(200.0F);
        Transportation.setAlignmentY(200.0F);

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel8.setText("USER NAME");

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel9.setText("PASSWORD");

        jPasswordField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField6ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton12.setText("SUBMIT");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton13.setText("RESET");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel13.setText("TRANSPORTATION LOGIN");

        javax.swing.GroupLayout TransportationLayout = new javax.swing.GroupLayout(Transportation);
        Transportation.setLayout(TransportationLayout);
        TransportationLayout.setHorizontalGroup(
            TransportationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransportationLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel13)
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(TransportationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TransportationLayout.createSequentialGroup()
                    .addGap(0, 17, Short.MAX_VALUE)
                    .addGroup(TransportationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransportationLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(105, 105, 105)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TransportationLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(105, 105, 105)
                            .addComponent(jPasswordField6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TransportationLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jButton12)
                            .addGap(79, 79, 79)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 18, Short.MAX_VALUE)))
        );
        TransportationLayout.setVerticalGroup(
            TransportationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransportationLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(TransportationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TransportationLayout.createSequentialGroup()
                    .addGap(0, 31, Short.MAX_VALUE)
                    .addGroup(TransportationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addGroup(TransportationLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(28, 28, 28)
                    .addGroup(TransportationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransportationLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel9))
                        .addComponent(jPasswordField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(111, 111, 111)
                    .addGroup(TransportationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton12)
                        .addComponent(jButton13))
                    .addGap(0, 32, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jButton2)
                        .addGap(83, 83, 83)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Transportation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(Transportation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 owner.setVisible(false);
        Account.setVisible(true);
        Stock.setVisible(false);
        Transportation.setVisible(false);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        owner.setVisible(true);
        Account.setVisible(false);
        Stock.setVisible(false);
        Transportation.setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    boolean f1= false,f2=false;
    String uname=jTextField1.getText();
            if(uname.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "please enter username");
            }
            else
            {
                for(int i=0;i<uname.length();i++)
                {
                    char x=uname.charAt(i);
if(Character.isLetter(x)){
    f1=true;
                    }
else
{
    JOptionPane.showMessageDialog(jTextField1,"enter only alphabets");
    f1=false;
    break;
}
                }}
            String pwd=jPasswordField3.getText();
            if(pwd.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "please enter password");
            }
            else
            {
                f2=true;
             }
if(f1&&f2){
                try
                {
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st=con.createStatement();
                   ResultSet rs=st.executeQuery("select * from logindetails where username='"+uname+"' and  PASSWORD='"+pwd+"' and type='OWNER'");
                          if(rs.next()){
ownerhome.main(null);
this.setVisible(false);
                          
                          
                          
                          }
                else
            {
                JOptionPane.showMessageDialog(rootPane, "please enter valid login credentials");
            }  
                }
            catch(Exception e)
            {
               e.printStackTrace();
            }
            
            
            
            }            
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
          
   
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 jTextField1.setText("");
 jPasswordField3.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPasswordField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 boolean f1= false,f2=false;
    String uname=jTextField2.getText();
            if(uname.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "please enter username");
            }
            else
            {
                for(int i=0;i<uname.length();i++)
                {
                    char x=uname.charAt(i);
if(Character.isLetter(x)){
    f1=true;
                    }
else
{
    JOptionPane.showMessageDialog(jTextField2,"enter only alphabets");
    f1=false;
    break;
}
                }}
            String pwd=jPasswordField4.getText();
            if(pwd.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "please enter password");
            }
            else
            {
                f2=true;
             }        
            if(f1&&f2){
                try
                {
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st=con.createStatement();
                   ResultSet rs=st.executeQuery("select * from logindetails where username='"+uname+"' and  PASSWORD='"+pwd+"' and type='ACCOUNTS'");
                          if(rs.next()){
accounthome.main(null);
this.setVisible(false);
                          
                          
                          
                          }
 else
            {
                JOptionPane.showMessageDialog(rootPane, "please enter valid login credentials");
            }                          }
            catch(Exception e)
            {
               e.printStackTrace();
            }
            
            
            
            }// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 jTextField2.setText("");
 jPasswordField4.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jPasswordField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
  boolean f1= false,f2=false;
    String uname=jTextField3.getText();
            if(uname.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "please enter username");
            }
            else
            {
                for(int i=0;i<uname.length();i++)
                {
                    char x=uname.charAt(i);
if(Character.isLetter(x)){
    f1=true;
                    }
else
{
    JOptionPane.showMessageDialog(jTextField3,"enter only alphabets");
    f1=false;
    break;
}
                }}
            String pwd=jPasswordField5.getText();
            if(pwd.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "please enter password");
            }
            else
            {
                f2=true;
             } 
            
            if(f1&&f2){
                try
                {
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st=con.createStatement();
                   ResultSet rs=st.executeQuery("select * from logindetails where username='"+uname+"' and  PASSWORD='"+pwd+"' and type='STOCK'");
                          if(rs.next()){
stockhome.main(null);
this.setVisible(false);
                          
                          
                          
                          }
 else
            {
                JOptionPane.showMessageDialog(rootPane, "please enter valid login credentials");
            }                          }
            catch(Exception e)
            {
               e.printStackTrace();
            }
            
            
            
            }
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      jTextField3.setText("");// TODO add your handling code here:
jPasswordField5.setText("");   // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jPasswordField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField6ActionPerformed
        
    }//GEN-LAST:event_jPasswordField6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         boolean f1= false,f2=false;
    String uname=jTextField4.getText();
            if(uname.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "please enter username");
            }
            else
            {
                for(int i=0;i<uname.length();i++)
                {
                    char x=uname.charAt(i);
if(Character.isLetter(x)){
    f1=true;
                    }
else
{
    JOptionPane.showMessageDialog(jTextField4,"enter only alphabets");
    f1=false;
    break;
}
                }}
            String pwd=jPasswordField6.getText();
            if(pwd.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "please enter password");
            }
            else
            {
                f2=true;
             }
            if(f1&&f2){
                try
                {
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st=con.createStatement();
                   ResultSet rs=st.executeQuery("select * from logindetails where username='"+uname+"' and  PASSWORD='"+pwd+"' and type='TRANSPORTATION'");
                          if(rs.next()){
transportationhome.main(null);
this.setVisible(false);
                          
                          
                          
                          }
                          else
            {
                JOptionPane.showMessageDialog(rootPane, "please enter valid login credentials");
            }
                           }
            catch(Exception e)
            {
               e.printStackTrace();
            }
            
            
            
            }// TODO add your handling code here:
            
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 jTextField4.setText(""); 
 jPasswordField6.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        
          owner.setVisible(false);
        Account.setVisible(false);
        Stock.setVisible(false);
        Transportation.setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 owner.setVisible(false);
        Account.setVisible(false);
        Stock.setVisible(true);
        Transportation.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 owner.setVisible(false);
        Account.setVisible(false);
        Stock.setVisible(false);
        Transportation.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(firstframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firstframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firstframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firstframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new firstframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Account;
    private javax.swing.JPanel Stock;
    private javax.swing.JPanel Transportation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JPasswordField jPasswordField6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel owner;
    // End of variables declaration//GEN-END:variables
}
