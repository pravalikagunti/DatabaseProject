/*
 * Gunti database project
 */
package guntiproject;
 
import java.sql.*;
import javax.swing.JOptionPane;


public class AddInStock extends javax.swing.JFrame {
     
    public AddInStock() {
        initComponents();
        view();
    }
public void view(){
try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st= con.createStatement();
                   jComboBox1.removeAllItems();
                   ResultSet rs=st.executeQuery("select * from STOCKNAME");
                    jComboBox1.addItem("select");
                   while(rs.next())
                   {
                       
                   String mm=rs.getString(1)+"-"+rs.getString(2);
                   jComboBox1.addItem(mm);
                   
                   } 
                   

                   


}catch(Exception e){e.printStackTrace();}

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("ADD INSTOCK");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 50, 250, 48);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Stock Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 140, 110, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(229, 190, 100, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(370, 190, 170, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("Description");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 290, 100, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setText("Labour Cost");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 370, 110, 25);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(370, 370, 170, 20);

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 520, 110, 33);

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 520, 100, 33);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(370, 140, 170, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 280, 166, 70);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2.setText("COST PER ITEM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 230, 150, 25);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(370, 230, 170, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(370, 410, 170, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel6.setText("STOCK COST");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 410, 130, 25);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(370, 460, 170, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel8.setText("DATE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 460, 50, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   boolean f1=false,f2=false,f3=false,f4=false,f5=false,f6=false,f7=false;
        String stocktype=jComboBox1.getName();
String items=jTextField3.getText();
String costperitem=jTextField1.getText();
String desc=jTextArea1.getText();
String labourcost=jTextField6.getText();
String scost=jTextField2.getText();


        
        //String name=jTextField1.getText();
       
       if(Validation.isEmpty(items))
           JOptionPane.showMessageDialog(rootPane, "Items should not be Empty");
       else{
       if(Validation.isDigit(items))
           f2=true;
       else
           JOptionPane.showMessageDialog(rootPane, "Should be Digit");
       }
       if(f2){
       if(Validation.isEmpty(costperitem))
           JOptionPane.showMessageDialog(rootPane, "cost per item should not be Empty");
       else{
       if(Validation.isDigit(costperitem))
           f3=true;
       else
           JOptionPane.showMessageDialog(rootPane, "Should be Digit");
       }
       if(f3){
        if(Validation.isEmpty(desc))
           JOptionPane.showMessageDialog(rootPane, "Description should not be Empty");
       else           
           f4=true;
         if(Validation.isEmpty(labourcost))
           JOptionPane.showMessageDialog(rootPane, "Labour cost should not be Empty");
       else{
             
         }
       if(Validation.isDigit(labourcost))
           f5=true;
       else
           JOptionPane.showMessageDialog(rootPane, "Should be Digit");
       }
              if(Validation.isEmpty(scost))
           JOptionPane.showMessageDialog(rootPane, "stock cost should not be Empty");
       else{
              
       
       
        if(jDateChooser1.getDate()==null)
       {
           JOptionPane.showMessageDialog(rootPane, "date should be selected");
       }
        else {
           f7=true;
        }
       
        
        try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramamurthi","ramamurthi");
                   Statement st= con.createStatement();
                   String Sts=jComboBox1.getSelectedItem().toString();
                   String ii[]=Sts.split("-");
                   java.util.Date dd=jDateChooser1.getDate();
                   java.sql.Date d1= new java.sql.Date(dd.getTime());
                   
                   PreparedStatement ps=con.prepareStatement("insert into instock values(?,?,?,?,?,?,?,?)");
                    ps.setString(1,ii[0]);
                    ps.setString(2,ii[1]);
                    ps.setInt(3,Integer.parseInt(jTextField3.getText()));
                    ps.setInt(4,Integer.parseInt(jTextField1.getText()));
                    ps.setString(5,jTextArea1.getText());
                    ps.setInt(6,Integer.parseInt(jTextField6.getText()));
                    ps.setInt(7,Integer.parseInt(jTextField2.getText()));
                    ps.setDate(8,d1);
                    
                     ps.executeUpdate();
                     
                      PreparedStatement ps1=con.prepareStatement("insert into stock values(?,?,?,?,?,?,?,?)");
                    ps1.setString(1,ii[0]);
                    ps1.setString(2,ii[1]);
                    ps1.setInt(3,Integer.parseInt(jTextField3.getText()));
                    ps1.setInt(4,Integer.parseInt(jTextField1.getText())); 
                    ps1.setString(5,jTextArea1.getText());
                    ps1.setInt(6,Integer.parseInt(jTextField6.getText()));
                    ps1.setInt(7,Integer.parseInt(jTextField2.getText()));
                    ps1.setDate(8,d1);
                    
                     ps1.executeUpdate();
                     
                     JOptionPane.showMessageDialog(rootPane, "successfull done.");
                     jTextField1.setText("");


}
        catch(Exception e)
        {
            e.printStackTrace();
        }}

       
        
        
        
        
              }             
        
    }//GEN-LAST:event_jButton1ActionPerformed

        private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

            
        try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ramamurthi","ramamurthi");
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("select count(*) from stock");
            rs.next();
            int i1=rs.getInt(1)+1;
            String eid="STOCK"+i1;
            
             // jTextField1.setText();
           
            
            
            
        }catch(Exception e)
        {e.printStackTrace();
        }    
            
            
            
            
            // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

   
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddInStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AddInStock s=new AddInStock();
                s.setSize(2000,2000);
                s.setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
