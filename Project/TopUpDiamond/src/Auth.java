import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Auth extends javax.swing.JFrame {
    Connect connect;
    
    Statement st;
    ResultSet rs;
    
    public Auth() {
        connect = new Connect();
        
        initComponents();
    }
    
    private void resetForm(){
        textFieldRegisterNamaLengkap.setText("");
        textFieldRegisterUsername.setText("");
        textFieldRegisterPassword.setText("");
        textFieldRegisterEmail.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabRegister = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        labelBannerLogin = new javax.swing.JLabel();
        labelTitleLogin = new javax.swing.JLabel();
        labelLoginUsername = new javax.swing.JLabel();
        textFieldLoginUsername = new javax.swing.JTextField();
        labelLoginPassword = new javax.swing.JLabel();
        textFieldLoginPassword = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        buttonLoginBatal = new javax.swing.JButton();
        panelRegister = new javax.swing.JPanel();
        labelBannerRegister = new javax.swing.JLabel();
        labelTitleRegister = new javax.swing.JLabel();
        labelNamaLengkap = new javax.swing.JLabel();
        textFieldRegisterNamaLengkap = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        textFieldRegisterUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldRegisterPassword = new javax.swing.JTextField();
        buttonBatal = new javax.swing.JButton();
        buttonDaftar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelRegisterEmail = new javax.swing.JLabel();
        textFieldRegisterEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBannerLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerLogin.png"))); // NOI18N
        labelBannerLogin.setText("Banner Login");
        jPanel2.add(labelBannerLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, -1));

        labelTitleLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitleLogin.setText("LOGIN ALOPE TOPUP FF");
        jPanel2.add(labelTitleLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        labelLoginUsername.setText("Username");
        jPanel2.add(labelLoginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));
        jPanel2.add(textFieldLoginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 206, -1));

        labelLoginPassword.setText("Password");
        jPanel2.add(labelLoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 71, -1));
        jPanel2.add(textFieldLoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 206, -1));

        buttonLogin.setText("LOGIN");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        jPanel2.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 129, -1));

        buttonLoginBatal.setText("BATAL");
        jPanel2.add(buttonLoginBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        tabRegister.addTab("LOGIN", jPanel2);

        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBannerRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerRegister.jpg"))); // NOI18N
        labelBannerRegister.setText("Banner Register");
        panelRegister.add(labelBannerRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 15, 409, 107));

        labelTitleRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitleRegister.setText("REGISTER ALOPE TOPUP FF");
        panelRegister.add(labelTitleRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 128, -1, -1));

        labelNamaLengkap.setText("Nama Lengkap");
        panelRegister.add(labelNamaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 181, -1, -1));
        panelRegister.add(textFieldRegisterNamaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 200, 177, -1));

        labelUsername.setText("Username");
        panelRegister.add(labelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 181, 76, -1));
        panelRegister.add(textFieldRegisterUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 200, 160, -1));

        jLabel4.setText("Password");
        panelRegister.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 240, 81, -1));
        panelRegister.add(textFieldRegisterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 262, 160, -1));

        buttonBatal.setText("BATAL");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });
        panelRegister.add(buttonBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 311, -1, -1));

        buttonDaftar.setText("DAFTAR");
        buttonDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDaftarActionPerformed(evt);
            }
        });
        panelRegister.add(buttonDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 311, -1, -1));
        panelRegister.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 159, 367, 10));

        labelRegisterEmail.setText("Email");
        panelRegister.add(labelRegisterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 240, 37, -1));
        panelRegister.add(textFieldRegisterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 262, 177, -1));

        tabRegister.addTab("REGISTER", panelRegister);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        String sql = 
                "SELECT * FROM accounts WHERE username='"
                + textFieldLoginUsername.getText() +"' "
                + "AND password ='"
                + textFieldLoginPassword.getText() + "'";
        try {
            st= connect.con.createStatement();
            rs= st.executeQuery(sql);
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "LOGIN Berhasil!");
                
                this.dispose();
                
                if(rs.getString("role").equals("admin")){
                    new CMSAdmin().setVisible(true);
                } else{
                    new Beranda(rs.getString(4)).setVisible(true);
                }
            } else{
                JOptionPane.showMessageDialog(null, "Username atau Password salah!");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDaftarActionPerformed
        int confirmRegistrasion =
        JOptionPane.showConfirmDialog(
            null,
            "Apakah data anda sudah benar?",
            "Konfirmasi Registrasi",
            JOptionPane.YES_NO_OPTION
        );

        if(confirmRegistrasion == 0){
            String sql= "INSERT INTO accounts VALUES(NULL, '"
            + textFieldRegisterNamaLengkap.getText() + "', '"
            + textFieldRegisterUsername.getText() + "', '"
            + textFieldRegisterEmail.getText() + "', '"
            + textFieldRegisterPassword.getText() + "', 'user')";

            try{
                st= connect.con.createStatement();
                st.execute(sql);

                JOptionPane.showMessageDialog(null, "Registrasi Berhasil, Silahkan Login!");
                resetForm();
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else{
            JOptionPane.showMessageDialog(
                null,
                "Registrasi Dibatalkan!",
                "BATAL",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_buttonDaftarActionPerformed

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        resetForm();
        JOptionPane.showMessageDialog(
            null,
            "Registrasi Dibatalkan!",
            "BATAL",
            JOptionPane.WARNING_MESSAGE
        );
    }//GEN-LAST:event_buttonBatalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonDaftar;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonLoginBatal;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBannerLogin;
    private javax.swing.JLabel labelBannerRegister;
    private javax.swing.JLabel labelLoginPassword;
    private javax.swing.JLabel labelLoginUsername;
    private javax.swing.JLabel labelNamaLengkap;
    private javax.swing.JLabel labelRegisterEmail;
    private javax.swing.JLabel labelTitleLogin;
    private javax.swing.JLabel labelTitleRegister;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JTabbedPane tabRegister;
    private javax.swing.JTextField textFieldLoginPassword;
    private javax.swing.JTextField textFieldLoginUsername;
    private javax.swing.JTextField textFieldRegisterEmail;
    private javax.swing.JTextField textFieldRegisterNamaLengkap;
    private javax.swing.JTextField textFieldRegisterPassword;
    private javax.swing.JTextField textFieldRegisterUsername;
    // End of variables declaration//GEN-END:variables
}
