/*
 *Gunti database project
 */
package guntiproject;

import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DailyProduction extends javax.swing.JFrame {

    /**
     * Creates new form DailyProduction
     */
    public DailyProduction() {
        initComponents();
        this.setSize(700, 700);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("DAILY PRODUCTION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 20, 380, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel2.setText("Product Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 120, 149, 32);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel5.setText("Product Size");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 260, 140, 32);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(480, 280, 120, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel6.setText("Product Class");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 220, 153, 32);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(480, 230, 120, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel7.setText("Number of Items");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 330, 240, 32);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(480, 330, 120, 30);

        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 460, 107, 41);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "PIPES", "BRICKS", "COLLARS", "FLOWER POTS", "CEMENT MESHES" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(480, 120, 120, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "PLAIN ENDED PIPES", "NON PRESSURE PIPES", "PRESSURE PIPES", "RUBBER RINGS" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(482, 180, 120, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel3.setText("Pipe Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 170, 109, 32);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 460, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jComboBox1.setSelectedItem("select");
        jComboBox2.setSelectedItem("select");
        jComboBox4.setSelectedItem("select");
        jComboBox3.setSelectedItem("select");
        jTextField1.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
try{
        String prodtype = jComboBox1.getSelectedItem().toString();
        if (prodtype.equals("SELECT")) {
            //JOptionPane.showMessageDialog(rootPane, "please select product type");
        } else   {    
            
            jComboBox2.removeAllItems();
            jComboBox2.addItem("select");
             Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st= con.createStatement();
                   ResultSet rs=st.executeQuery("select unique(PIPE_TYPE)  from PRODUCT_DETAILS where PROD_TYPE='"+prodtype+"' ");
                   while(rs.next()){
                  jComboBox2.addItem(rs.getString(1));
                   }
            
        }
}catch(Exception e){
e.printStackTrace();}

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged

        try{
        String prodtype = jComboBox1.getSelectedItem().toString();
        String pitype = jComboBox2.getSelectedItem().toString();
        if (pitype.equals("select")) {
           // JOptionPane.showMessageDialog(rootPane, "please select pipe type");
        }   {    
            
            jComboBox3.removeAllItems();
            jComboBox3.addItem("select");
             Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st= con.createStatement();
                   ResultSet rs=st.executeQuery("select unique(PROD_CLASS)  from PRODUCT_DETAILS where PROD_TYPE='"+prodtype+"' and PIPE_TYPE='"+pitype+"'  ");
                   while(rs.next()){
                  jComboBox3.addItem(rs.getString(1));
                   }
            
        }
}catch(Exception e){
e.printStackTrace();}

        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged

          try{
        String prodtype = jComboBox1.getSelectedItem().toString();
        String pitype = jComboBox2.getSelectedItem().toString();
        String pclass = jComboBox3.getSelectedItem().toString();
        if (pitype.equals("select")) {
           // JOptionPane.showMessageDialog(rootPane, "please select class type");
        }   {    
            
            jComboBox4.removeAllItems();
            jComboBox4.addItem("select");
             Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st= con.createStatement();
                   ResultSet rs=st.executeQuery("select PROD_SIZE  from PRODUCT_DETAILS where PROD_TYPE='"+prodtype+"' and PIPE_TYPE='"+pitype+"' and PROD_CLASS='"+pclass+"'  ");
                   while(rs.next()){
                  jComboBox4.addItem(rs.getString(1));
                   }
            
        }
}catch(Exception e){
e.printStackTrace();}

        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.out.println("pp");
        
         System.out.println("tt");
        boolean f1=false,f2=false,f3=false,f4=false,f5=false,f6=false;
        String pType=(String)jComboBox1.getSelectedItem();
        String pipType=(String)jComboBox2.getSelectedItem();
        String pClass=(String)jComboBox3.getSelectedItem();
        
        String pSize=(String)jComboBox4.getSelectedItem();
        String nItem=jTextField1.getText();
           
        if(Validation.isSelect(pType))
            JOptionPane.showMessageDialog(rootPane, "Product Type should not be Empty");
        else
            f1=true;
        
        if(Validation.isSelect(pipType))
            JOptionPane.showMessageDialog(rootPane, "Pipe Type should not be Empty");
        else
            f2=true;
        
        if(Validation.isSelect(pSize))
            JOptionPane.showMessageDialog(rootPane, "Product size should not be Empty");
        else
            f4=true;
        
        if(Validation.isSelect(pClass))
            JOptionPane.showMessageDialog(rootPane, "Product class should not be Empty");
        else
            f3=true;
        
        if(Validation.isEmpty(nItem))
            JOptionPane.showMessageDialog(rootPane, "Item should not be Empty");
        else
            if(Validation.isDigit(nItem))
                f5=true;
        else
                JOptionPane.showMessageDialog(rootPane, "Enter only Digit");
         try{
             java.util.Date d1= new java.util.Date();
 
        java.sql.Date d3= new java.sql.Date(d1.getTime());  
         System.out.println("ptype :"+pType+" pipe: "+pipType+" size:"+pSize+" class:"+pClass+" items"+jTextField1.getText());
         
                  Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st= con.createStatement();
                    PreparedStatement ps1=con.prepareStatement("select * from PRODUCT_DETAILS where PROD_TYPE=? and PIPE_TYPE= ? and  PROD_SIZE=?  and PROD_CLASS=? ");   
                    ps1.setString(1, pType);
                    ps1.setString(2, pipType);
                    ps1.setInt(3, Integer.parseInt(pSize));
                    ps1.setString(4, pClass); 
                   ResultSet rs1=ps1.executeQuery();
                   rs1.next();
                   String Pid= rs1.getString(1); 
              
                   PreparedStatement ps=con.prepareStatement("insert into DAILYPRODUCTION values (?,?,?,?,?,?,?)");   
                    ps.setString(1, Pid);
                    ps.setString(2, pType);
                    ps.setString(3, pipType);
                    ps.setInt(4, Integer.parseInt(pSize));
                    ps.setString(5, pClass); 
                   ps.setInt(6, Integer.parseInt(jTextField1.getText()));
                    ps.setDate(7, d3);
                   
                   
                   
                   
                     int i=0;
                                           System.out.println("t2");
                           int j= ps.executeUpdate();
                                           System.out.println("t3");
                 if(j!= 0)
                 {
                                     System.out.println("t4");
                     JOptionPane.showMessageDialog(rootPane, "added success...");
                     
                     
                 }
                   
                   
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ItemStateChanged

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
            java.util.logging.Logger.getLogger(DailyProduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailyProduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailyProduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailyProduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new DailyProduction().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
