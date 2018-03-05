/*
 * Gunti database project
 */





import javax.swing.JOptionPane;


public class StudentRegistration extends javax.swing.JFrame {

    /** Creates new form StudentRegistration */
    String name,email, password,country,state, phone;
    public StudentRegistration() {
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Student Registration Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 340, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Name        : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 80, 100, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Email         :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 120, 90, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 150, 90, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Sex            :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 190, 100, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("State         :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 220, 100, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Country     :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 250, 90, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 350, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 350, 100, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Phone No  :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 290, 90, 30);

        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(210, 190, 60, 23);

        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(280, 190, 70, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 70, 150, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 110, 150, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(200, 150, 150, 30);

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--select--", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Malayalam", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(200, 220, 100, 21);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "India", "USA", "China", "Pakistan", "Irac" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(200, 260, 100, 21);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 290, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            int x = 0;
            name = jTextField1.getText();
            email = jTextField2.getText();
            char[] s3 = jPasswordField1.getPassword();
            password = new String(s3);
            country = jComboBox2.getName();
            state = jComboBox1.getName();
            phone = jTextField3.getText();
            validate_name(name);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jComboBox1.setName("");
            jComboBox2.setName("");
            jPasswordField1.setText("");


    }//GEN-LAST:event_jButton2ActionPerformed
    //Name Field Validation
    public void validate_name(String name){
		if (name.equals("")){
			JOptionPane.showMessageDialog(jButton1,"Please enter your name.");
			jTextField1.requestFocusInWindow();
		}else{
			name = name.toUpperCase().trim();
			char[] v_name = name.toCharArray();
			for(int i = 0; i < name.length(); i++){
				char x = name.charAt(i);
				if(Character.isDigit(x) || x == '/' || x == '*' || x == '+'|| x== '-' || x=='%' || x == '\n'){
					JOptionPane.showMessageDialog(jButton1,"In Name Field enter alphabet only.");
					jTextField1.requestFocusInWindow();
					i++;
				}
				else{
					validate_email(email);
					break;
				}
			}
		}
	}
	//Email-Id Field Validation
	public void validate_email(String email){
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		Boolean b = email.matches(EMAIL_REGEX);

		if (b){
			validate_password(password);
		}else{
			JOptionPane.showMessageDialog(jButton1,"Enter valid Email-ID.");
			jTextField2.requestFocusInWindow();
		}
	}
	//Password Field Validation
	public void validate_password(String password){
		if (password.equals("")){
			JOptionPane.showMessageDialog(jButton1,"Please enter your Password.");
			jPasswordField1.requestFocusInWindow();
		}else{
			validate_phone(phone);
		}
	}
	//Password Field Validation
	public void validate_country(String country){
		if (country.equals("")){
			JOptionPane.showMessageDialog(jButton1,"Please enter your Country Name.");
			jComboBox2.requestFocusInWindow();
		}else{
			validate_country(country);
		}
	}
	//State Field Validation
	public void validate_state(String state){
		if (state.equals("")){
			JOptionPane.showMessageDialog(jButton1,"Please enter your State Name.");
			jComboBox1.requestFocusInWindow();
		}else{
			
		}
	}
	//phone number Field Validation
	public void validate_phone(String phone){
		if (phone.equals("")){
			JOptionPane.showMessageDialog(jButton1,"Please enter your Phone Number.");
			jTextField3.requestFocusInWindow();
		}
		else{
			int l = phone.length();
			System.out.println(l);
			if(l<10){
				JOptionPane.showMessageDialog(jButton1,"Phone Number is not correct.");
				jTextField3.requestFocusInWindow();
			}else{validate_state(state);}
		}
	}





    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentRegistration sr = new StudentRegistration();
                sr.setVisible(true);
                sr.setTitle("Registration Form");
                sr.setSize(600, 500);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
