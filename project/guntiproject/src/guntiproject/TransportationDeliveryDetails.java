/*
 * Gunti database project
 */
package guntiproject;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class TransportationDeliveryDetails extends javax.swing.JFrame {
    private Component jButton1;

    /**
     * Creates new form TransportationDeliveryDetails
     */
    public TransportationDeliveryDetails() {
        initComponents();
        this.setSize(700, 700);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jTextField1.setText("TRANSPORTATION DETAILS");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 100, 375, 38);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setText("Vehicle Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 180, 150, 24);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(380, 180, 130, 20);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Vehicle Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 240, 160, 24);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(380, 240, 130, 20);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 310, 160, 24);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(380, 310, 130, 20);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setText("Destination");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 370, 140, 24);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setText("Name of Material");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 430, 180, 24);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(380, 430, 130, 20);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setText("Items Sold");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 490, 110, 24);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(380, 490, 130, 20);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setText("Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 600, 80, 24);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(380, 540, 130, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 350, 166, 70);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(390, 600, 130, 20);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel8.setText("Price");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 540, 80, 24);

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 650, 65, 23);

        jLabel9.setText("CUSTOMER PHONE NUMBER");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 280, 150, 14);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(380, 280, 130, 20);

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 50, 120, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
 // TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
                String vname= jTextField2.getText();
                String vno= jTextField3.getText();
                 String cno=jTextField8.getText();
              String cname=    jTextField4.getText();
               String dest=  jTextArea1.getText();
                  String nm= jTextField5.getText();
                  String is= jTextField6.getText();
                 String pr= jTextField7.getText();
                                
                 java.util.Date D= jDateChooser1.getDate();
                 java.sql.Date d= new java.sql.Date (D.getTime());
        
        
        
  Connection con=connectio.cone();
  
  try
  {
        PreparedStatement ps=con.prepareStatement("insert into TRANDELDDT values(?,?,?,?,?,?,?,?,?) ");
        ps.setString(1, jTextField2.getText());
        ps.setString(2, jTextField3.getText());
        ps.setString(3, jTextField8.getText());
        ps.setString(4, jTextField4.getText());
        ps.setString(5, jTextArea1.getText());
        ps.setString(6, jTextField5.getText());
        ps.setString(7, jTextField6.getText());
        ps.setString(8, jTextField7.getText());
        ps.setDate(9, d);    
       int i=ps.executeUpdate();
     if(i>0){
     
     JOptionPane.showMessageDialog(rootPane, "Inserted Suceeesfiully");
     }
  }      catch(Exception e){
  e.printStackTrace();
  }
        
        
        
        
        
        
        
        
        // TODO add your handling code here:zz
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost

        
          String mb=jTextField8.getText();

  Connection con=connectio.cone();
  
  try
  {
        PreparedStatement ps=con.prepareStatement("select CUS_NAME from CUSTOMER_DETAILS where  CUS_NUM=? ");
        ps.setString(1, mb);
    
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
           
        jTextField4.setText(rs.getString(1));
        
        }
     
      
        
      
  }
  catch(Exception e)
  {
  e.printStackTrace();
  
  }

        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        transportationhome.main(null);
        this.dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
        } catch (Exception ex) {
            
        } 
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                
            new TransportationDeliveryDetails().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
