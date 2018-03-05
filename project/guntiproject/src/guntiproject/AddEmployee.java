/*
 *Gunti database project
 */
package guntiproject;

import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
         
        initComponents();
this.setVisible(true);
                this.setSize(800, 800);



    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 140, 70, 24);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(510, 130, 170, 30);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Mobile");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 180, 80, 24);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(510, 180, 170, 30);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("Job in");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 220, 70, 24);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 270, 90, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 270, 170, 70);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setText("Salary");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 400, 80, 24);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setText("Aadhaar No.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 440, 130, 24);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(510, 440, 180, 30);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel8.setText("EMPLOYEE FORM");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 40, 340, 60);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(520, 360, 60, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(620, 360, 93, 23);

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 560, 110, 33);

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 560, 110, 33);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(510, 220, 170, 40);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(510, 400, 170, 30);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 360, 80, 24);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Joining Date");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 500, 180, 29);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(500, 490, 210, 40);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(740, 40, 59, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  boolean f1=false,f2=false,f3=true,f4=false,f5=false,f6=false;
        String name = jTextField1.getText();
        String mobile = jTextField2.getText();
        String jobin = (String) jComboBox1.getSelectedItem();
        String address = jTextArea1.getText();
         String gender;
        String aadhaarno = jTextField6.getText();
        String salary=jTextField3.getText();
String date=jDateChooser1.getDate().toString();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "please enter employee name");
        } else {
            for (int i = 0; i < name.length(); i++) {
                char x = name.charAt(i);
                if (Character.isLetter(x)) {
                    f1 = true;
                } else {
                    JOptionPane.showMessageDialog(jTextField1, "enter only alphabets");
                    f1 = false;
                    break;
                }
            }
        }
        System.out.println("f1"+f1);

        if(f1){
         if (salary.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "please enter salary ");
        } else {
                        for (int i = 0; i < salary.length(); i++) {
                char x = salary.charAt(i);
                if (Character.isDigit(x)) {
                    f2 = true;
                } else {
                    JOptionPane.showMessageDialog(jTextField1, "enter only Numbers");
                    f2 = false;
                    break;
                }

        }
         }
         if(f2){
        
        if (mobile.equals("")||mobile.length()!=10) {
            JOptionPane.showMessageDialog(rootPane, "please enter Mobile number");
        } else {
            for (int i = 0; i < mobile.length(); i++) {
                char x = mobile.charAt(i);
                if (Character.isDigit(x)) {
                    f3 = true;
                } else {
                    JOptionPane.showMessageDialog(jTextField1, "enter only numbers ");
                    f3 = false;
                    break;
                }
            }
        }
        if(f4){
  if (jobin.equals("")) {
           f3=false;
            JOptionPane.showMessageDialog(rootPane, "please enter Jobin");
        } 
          if(jButton1.isSelected())
          { 
              f4=true;
           gender = jRadioButton1.getText();
          }
          else{
              if(jButton2.isSelected())
          {
               f4=true;
              gender = jRadioButton2.getText();
          }
              f4=false;
           
          }
          if(f4){

 if (aadhaarno.equals("")||aadhaarno.length()!=12) {
            JOptionPane.showMessageDialog(rootPane, "please enter AAdhar cord");
        } else {
            for (int i = 0; i < aadhaarno.length(); i++) {
                char x = aadhaarno.charAt(i);
                if (Character.isDigit(x)) {
                    f5 = true;
                } else {
                    JOptionPane.showMessageDialog(jTextField1, "enter only numbers");
                    f5 = false;
                    break;
                }
            }
        }
 if(f5){

 if(date.equals(""))
 {
      f6=false;
            JOptionPane.showMessageDialog(rootPane, "please select date");
        
 }
 else
 {
     f6=true;
 }
         }}}}}
         System.out.println("t");
           if(f1&&f2&&f3&&f5&&f6)
           {
              try{
                  System.out.println("t1");
                  Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st= con.createStatement();
                   ResultSet rs=st.executeQuery("select count(*) from EMPLOYEE ");
                   rs.next();int iid=rs.getInt(1)+1;
                   String eid= "EMP"+iid;
                   java.util.Date d1= jDateChooser1.getDate();
 
        java.sql.Date d3= new java.sql.Date(d1.getTime()); 
                    PreparedStatement ps=con.prepareStatement("insert into EMPLOYEE values (?,?,?,?,?,?,?,?,?)");
                           ps.setString(1, eid);
                           ps.setString(2, name);
                           ps.setString(3, mobile);
                           ps.setString(4, jobin);
                           ps.setString(5, address);
                           ps.setString(6,jRadioButton1.isSelected()?jRadioButton1.getText():jRadioButton2.getText());
                           ps.setString(7, salary);
                           ps.setString(8, aadhaarno);
                           ps.setDate(9, d3);
                           int i=0;
                                           System.out.println("t2");
                           int j= ps.executeUpdate();
                                           System.out.println("t3");
                 if(j!= 0)
                 {
                                     System.out.println("t4");
                     JOptionPane.showMessageDialog(rootPane, "added success...");
                     
                     
                 }
                  
                  
                  
              }catch(Exception e)
              { e.printStackTrace(); }
               
               
           
           
           }
           else
           {
           
           
           }
         



        //String name=jTextField1.getText();



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");

        jTextArea1.setText("");
        jTextField6.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        
        ownerhome.main(null);
        this.dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

   
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
               new AddEmployee().setVisible(true);
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
