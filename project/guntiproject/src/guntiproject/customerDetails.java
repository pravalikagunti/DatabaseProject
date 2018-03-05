/*
 * Gunti database project
 */
package guntiproject;

import java.sql.*;
import javax.swing.JOptionPane;


public class customerDetails extends javax.swing.JFrame {

    private String curamt;

    /**
     * Creates new form customerDetails
     */
    public customerDetails() {
        this.setVisible(true);
        this.setSize(2000, 2000);
        initComponents();
        view();

    }

    public void view() {
        int i = 0;
        jComboBox5.removeAllItems();
        for (i = 1; i <= 35; i++) {
            jComboBox5.addItem("" + i);

        }





    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("Customer Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 330, 31);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 100, 140, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Contact Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 60, 150, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setText("Email Id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 140, 70, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 440, 90, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel8.setText("Discount");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 490, 100, 25);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(310, 100, 170, 30);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(310, 60, 170, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(310, 140, 170, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(310, 440, 170, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jRadioButton1.setText("Cash");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(310, 530, 70, 33);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jRadioButton2.setText("Cheque");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(400, 530, 100, 33);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel10.setText("Total Amount");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 570, 120, 25);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(320, 570, 120, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel11.setText("Status");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(100, 610, 60, 30);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jRadioButton3.setText("Paid");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(310, 600, 70, 33);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jRadioButton4.setText("Due");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(390, 600, 60, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 650, 93, 33);

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 650, 90, 33);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel12.setText("Address");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(100, 190, 80, 32);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 180, 166, 80);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel13.setText("Product Type");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(100, 260, 111, 25);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel14.setText("Pipe Type");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(100, 310, 82, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("Product Size");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 400, 104, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setText("Product Class");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 360, 112, 25);

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
        jComboBox1.setBounds(310, 270, 120, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "PLAIN ENDED PIPES", "NON PRESSURE PIPES", "PRESSURE PIPES", "RUBBER RINGS" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(310, 310, 120, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(310, 350, 120, 30);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        jComboBox4.setBounds(310, 390, 120, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel15.setText("Mode");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(100, 530, 50, 25);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(310, 490, 170, 30);

        jLabel9.setText("Bill No:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(540, 60, 40, 30);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(580, 60, 100, 30);

        jButton3.setText("Bill ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(480, 650, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean f1 = false, f2 = false, f3 = false, f4 = false, f5 = false, f6 = false, f7 = false, f8 = false;
        String name = jTextField1.getText();
        String mobile = jTextField2.getText();
        String emailid = jTextField3.getText();
        String address = jTextArea1.getText();
        String item = jTextField4.getText();
        String cash = jRadioButton1.getActionCommand();
        String cheque = jRadioButton2.getActionCommand();
        String totamt = jTextField6.getText();
        String paid = jRadioButton3.getActionCommand();
        String due = jRadioButton4.getActionCommand();
        String gender = jRadioButton1.getActionCommand();
        boolean b1=false;
       /* if(Validation.isEmpty(mobile))
            JOptionPane.showMessageDialog(rootPane, " should not be empty!!");
        else{
            if(Validation.isDigit(mobile)&&mobile.length()==10)
                b1=true;
            else
                JOptionPane.showMessageDialog(rootPane, "Mobile should be Digit Only!!");
        }*/
        if(Validation.isEmpty(name))
            JOptionPane.showMessageDialog(rootPane, "Name should not be empty!!");
        else{
            if(Validation.isLetter(name))
                b1=true;
            else
                JOptionPane.showMessageDialog(rootPane, "Name should be Letter Only!!");
        }
       
         if(Validation.isEmpty(emailid))
            JOptionPane.showMessageDialog(rootPane, "E-mail should not be empty!!");
        else{
            if(Validation.isEmail(emailid))
                b1=true;
            else
                JOptionPane.showMessageDialog(rootPane, "Mail is not correct!!");
        }
          if(Validation.isEmpty(address))
            JOptionPane.showMessageDialog(rootPane, "Address should not be empty!!");
          else
              b1=true;
        
          
         

        String pType = (String) jComboBox1.getSelectedItem();
        String pipType = (String) jComboBox2.getSelectedItem();
        String pClass = (String) jComboBox3.getSelectedItem();

        String pSize = (String) jComboBox4.getSelectedItem();
        String discount = (String) jComboBox5.getSelectedItem();
        String nItem = jTextField1.getText();

        if (Validation.isSelect(pType)) {
            JOptionPane.showMessageDialog(rootPane, "Product Type should not be Empty");
        } else {
            f1 = true;
        }

        if (Validation.isSelect(pipType)) {
            JOptionPane.showMessageDialog(rootPane, "Pipe Type should not be Empty");
        } else {
            f2 = true;
        }

        if (Validation.isSelect(pSize)) {
            JOptionPane.showMessageDialog(rootPane, "Product size should not be Empty");
        } else {
            f4 = true;
        }

        if (Validation.isSelect(pClass)) {
            JOptionPane.showMessageDialog(rootPane, "Product class should not be Empty");
        } else {
            f3 = true;
        }

         if(Validation.isEmpty(item))
            JOptionPane.showMessageDialog(rootPane, "quantity should not be empty!!");
        else{
            if(Validation.isDigit(item))
                b1=true;
            else
                JOptionPane.showMessageDialog(rootPane, "quantity should be Digit Only!!");
        }
           if(Validation.isEmpty(totamt))
            JOptionPane.showMessageDialog(rootPane, "Total amount should not be empty!!");
        else{
            if(Validation.isDigit(totamt))
                b1=true;
            else
                JOptionPane.showMessageDialog(rootPane, "Total amount should be Digit Only!!");
        }
        
        if(f1&& f2&&f3&& f4&& b1){

        try {
            java.util.Date d1 = new java.util.Date();
            java.sql.Date d3 = new java.sql.Date(d1.getTime());
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ramamurthi", "ramamurthi");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from CUSTOMER_DETAILS");
            rs.next();
            int i = rs.getInt(1) + 1;
            String i1 = "" + i;
            PreparedStatement ps = con.prepareStatement("insert into CUSTOMER_DETAILS values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, i1);
            ps.setString(2, name);
            ps.setString(3, mobile);
            ps.setString(4, emailid);
            ps.setString(5, address);
            ps.setString(6, pType);
            ps.setString(7, pipType);
            ps.setInt(8, Integer.parseInt(pSize));
            ps.setString(9, pClass);
            ps.setInt(10, Integer.parseInt(item));
            ps.setString(11, jRadioButton1.isSelected() ? jRadioButton1.getText() : jRadioButton2.getText());
            ps.setString(12, curamt);
            ps.setString(12, totamt);
            ps.setString(13, jRadioButton3.isSelected() ? jRadioButton3.getText() : jRadioButton4.getText());
            ps.setDate(14, d3);
            ps.setString(15, discount);
            ps.setString(16, jLabel16.getText());

            int i12 = ps.executeUpdate();
            if (i12 > 0) {
                JOptionPane.showMessageDialog(rootPane, "SUCESSFULLY DONE");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            String prodtype = jComboBox1.getSelectedItem().toString();
            if (prodtype.equals("SELECT")) {
                //JOptionPane.showMessageDialog(rootPane, "please select product type");
            } else {

                jComboBox2.removeAllItems();
                jComboBox2.addItem("select");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ramamurthi", "ramamurthi");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select unique(PIPE_TYPE)  from PRODUCT_DETAILS where PROD_TYPE='" + prodtype + "' ");
                while (rs.next()) {
                    jComboBox2.addItem(rs.getString(1));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged

        try {
            String prodtype = jComboBox1.getSelectedItem().toString();
            String pitype = jComboBox2.getSelectedItem().toString();
            if (pitype.equals("select")) {
                // JOptionPane.showMessageDialog(rootPane, "please select pipe type");
            }
            {

                jComboBox3.removeAllItems();
                jComboBox3.addItem("select");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ramamurthi", "ramamurthi");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select unique(PROD_CLASS)  from PRODUCT_DETAILS where PROD_TYPE='" + prodtype + "' and PIPE_TYPE='" + pitype + "'  ");
                while (rs.next()) {
                    jComboBox3.addItem(rs.getString(1));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }




        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged

        try {
            String prodtype = jComboBox1.getSelectedItem().toString();
            String pitype = jComboBox2.getSelectedItem().toString();
            String pclass = jComboBox3.getSelectedItem().toString();
            if (pitype.equals("select")) {
                // JOptionPane.showMessageDialog(rootPane, "please select class type");
            }
            {

                jComboBox4.removeAllItems();
                jComboBox4.addItem("select");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ramamurthi", "ramamurthi");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select PROD_SIZE  from PRODUCT_DETAILS where PROD_TYPE='" + prodtype + "' and PIPE_TYPE='" + pitype + "' and PROD_CLASS='" + pclass + "'  ");
                while (rs.next()) {
                    jComboBox4.addItem(rs.getString(1));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }






        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
//String cn= jTextField1.getText();

        String cp = jTextField2.getText();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ramamurthi", "ramamurthi");

            PreparedStatement ps = con.prepareStatement("select * from CUSTOMER_DETAILS where  CUS_NUM=?");
            //ps.setString(1, cn);
            ps.setString(1, cp);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                 jLabel16.setText(""+rs.getString(16)); //bill: 
                jTextField1.setText("" + rs.getString(2));
                jTextField3.setText("" + rs.getString(4));
                JOptionPane.showMessageDialog(rootPane, "user already exists");
            } else {

                PreparedStatement ps1 = con.prepareStatement("select count(*) from CUSTOMER_DETAILS ");
                ResultSet rs1 = ps1.executeQuery();
                rs1.next();

                // jLabel9.setText("BillNo:"); //bill: 

                jLabel16.setText("RAM" + (rs1.getInt(1) + 1));
                JOptionPane.showMessageDialog(rootPane, " new user ");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusLost

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
//  String prodtype = jComboBox1.getSelectedItem().toString();
//            String pitype = jComboBox2.getSelectedItem().toString();
//            String pclass = jComboBox3.getSelectedItem().toString();
//            String size = jComboBox4.getSelectedItem().toString();
//          int ii= Integer.parseInt(jTextField4.getText());
//          int i2= Integer.parseInt(jComboBox5.getSelectedItem().toString());
//          
//        //
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String ss[] = {jLabel16.getText()};

        Bill.main(ss);
        this.setVisible(false);



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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(customerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                customerDetails cs = new customerDetails();
                cs.setSize(2000, 2000);
                cs.setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
