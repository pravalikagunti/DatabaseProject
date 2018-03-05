/*
 * Gunti database project
 */
package guntiproject;

import javax.swing.JOptionPane;


public class transportation1 extends javax.swing.JFrame {

    /**
     * Creates new form transportation1
     */
    public transportation1() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transportation");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 30, 231, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 90, 120, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vehicle Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 140, 76, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(490, 200, 60, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Destination");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 250, 90, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 300, 90, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Items ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(500, 350, 50, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Labour Charges");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(500, 400, 100, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 540, 80, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 540, 90, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(680, 80, 139, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(680, 130, 139, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(680, 190, 139, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(680, 240, 139, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(680, 290, 139, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(680, 340, 139, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(680, 390, 139, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Amount");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(500, 460, 60, 17);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(680, 450, 139, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Praneeth\\Desktop\\gunti\\roads-2.jpg")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-370, 0, 2240, 1110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:/
        
        //getting data
        String cName=jTextField1.getText();
        String vType=jTextField2.getText();
        String number=jTextField3.getText();
        String desti=jTextField4.getText();
        String pName=jComboBox1.getName();
        String items=jTextField5.getText();
        String lCharges=jTextField6.getText();
        String amount =jTextField7.getText();
        //validation of cName
        int l=cName.length();
          if(cName.equals(""))
         {
                    JOptionPane.showMessageDialog(jButton1,"Customer Name should not be empty ");
                  
         }
         else{
         for(int i=0;i<l;i++)
         {
                            char c= cName.charAt(i);    
              if(Character.isLetter(c))
              {
              
              
              }
              else
              {
                    JOptionPane.showMessageDialog(jButton1,"please Enter VALID Name ");          
                     break;
              }       
              
         } 
         }
          
          //validation of vType
        int le=vType.length();
          if(vType.equals(""))
         {
                    JOptionPane.showMessageDialog(jButton1,"Vehicle Name should not be empty ");
                  
         }
         else{
         for(int i=0;i<le;i++)
         {
                            char c= vType.charAt(i);
              if(Character.isLetter(c))
              {
              
              
              }
              else
              {
                    JOptionPane.showMessageDialog(jButton1,"please Enter VALID Name ");          
                     break;
              }       
              
         } 
         }
           //validation of number
        int ln=number.length();
          if(number.equals(""))
         {
                    JOptionPane.showMessageDialog(jButton1,"Number should not be empty ");
                  
         }
         else{
         for(int i=0;i<ln;i++)
         {
                            char c= number.charAt(i);
              if(Character.isLetter(c)||Character.isDigit(c))
              {
              
              
              }
              else
              {
                    JOptionPane.showMessageDialog(jButton1,"please Enter VALID number ");          
                     break;
              }       
              
         } 
         }
           //validation of destination
        int ld=desti.length();
          if(desti.equals(""))
         {
                    JOptionPane.showMessageDialog(jButton1,"destination should not be empty ");
                  
         }
         else{
         for(int i=0;i<ld;i++)
         {
                            char c= desti.charAt(i);
              if(Character.isLetter(c))
              {
              
              
              }
              else
              {
                    JOptionPane.showMessageDialog(jButton1,"please Enter VALID destination ");          
                     break;
              }       
              
         } 
         }
           //validation of pName
        int lp=pName.length();
          if(pName.equals(""))
         {
                    JOptionPane.showMessageDialog(jButton1,"product should not be selected ");
                  
         }
         else{
         for(int i=0;i<lp;i++)
         {
                            char c= pName.charAt(i);
              if(Character.isLetter(c))
              {
              
              
              }
              else
              {
                    JOptionPane.showMessageDialog(jButton1,"select valid product ");          
                     break;
              }       
              
         } 
         }
           //validation of items
        int li=items.length();
          if(items.equals(""))
         {
                    JOptionPane.showMessageDialog(jButton1,"Items should not be empty ");
                  
         }
         else{
         for(int i=0;i<li;i++)
         {
                            char c= items.charAt(i);
              if(Character.isDigit(c))
              {
              
              
              }
              else
              {
                    JOptionPane.showMessageDialog(jButton1,"please Enter number of Items ");          
                     break;
              }       
              
         } 
         }
         //validation of lCharges
        int ll=lCharges.length();
          if(lCharges.equals(""))
         {
                    JOptionPane.showMessageDialog(jButton1,"Charges should not be empty ");
                  
         }
         else{
         for(int i=0;i<ll;i++)
         {
                            char c= lCharges.charAt(i);
              if(Character.isDigit(c))
              {
              
              
              }
              else
              {
                    JOptionPane.showMessageDialog(jButton1,"please Enter VALID charges  ");          
                     break;
              }       
              
         } 
         }
           //validation of amount
        int la=amount.length();
          if(amount.equals(""))
         {
                    JOptionPane.showMessageDialog(jButton1,"Amount should not be empty ");
                  
         }
         else{
         for(int i=0;i<la;i++)
         {
                            char c= amount.charAt(i);
              if(Character.isDigit(c))
              {
              
              
              }
              else
              {
                    JOptionPane.showMessageDialog(jButton1,"please Enter VALID AMOUNT ");          
                     break;
              }       
              
         } 
         }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

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
            java.util.logging.Logger.getLogger(transportation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transportation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transportation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transportation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new transportation1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
