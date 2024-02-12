import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Auth extends javax.swing.JFrame {
    
    Statement st;
    ResultSet rs;
    Koneksi Koneksi;
    
    public Auth() {
        Koneksi = new Koneksi();
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        textFieldPassword = new javax.swing.JPasswordField();
        buttonLoginSubmit = new javax.swing.JButton();
        buttonBatalLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelLoginLevel = new javax.swing.JLabel();
        comboBoxLoginLevel = new javax.swing.JComboBox<>();
        panelRegister = new javax.swing.JPanel();
        labelUsernameRegistrasi = new javax.swing.JLabel();
        textFieldRegisterUsername = new javax.swing.JTextField();
        labelPasswordRegistrasi = new javax.swing.JLabel();
        labelNamaRegistrasi = new javax.swing.JLabel();
        textFieldRegisterNama = new javax.swing.JTextField();
        textFieldRegisterPassword = new javax.swing.JPasswordField();
        labelKonfirmasiRegistrasi = new javax.swing.JLabel();
        textFieldRegisterKonfirmasi = new javax.swing.JPasswordField();
        buttonBatal = new javax.swing.JButton();
        buttonRegistrasi = new javax.swing.JButton();
        labelRegisterImg = new javax.swing.JLabel();
        labelTitleRegistrasi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        labelUsername.setText("Username");

        jLabel3.setText("Password");

        buttonLoginSubmit.setText("Login");
        buttonLoginSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginSubmitActionPerformed(evt);
            }
        });

        buttonBatalLogin.setText("Batal");
        buttonBatalLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("LOGIN");

        labelLoginLevel.setText("Level");

        comboBoxLoginLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "MUA", "Pelanggan" }));

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelLoginLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(buttonLoginSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonBatalLogin))
                            .addComponent(textFieldUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxLoginLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(88, 88, 88))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLoginLevel)
                    .addComponent(comboBoxLoginLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLoginSubmit)
                    .addComponent(buttonBatalLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        tabPane.addTab("Login", panelLogin);

        labelUsernameRegistrasi.setText("Username");

        labelPasswordRegistrasi.setText("Password");

        labelNamaRegistrasi.setText("Nama");

        labelKonfirmasiRegistrasi.setText("Konfirmasi");

        buttonBatal.setText("Batal");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        buttonRegistrasi.setText("Registrasi");
        buttonRegistrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegistrasiMouseClicked(evt);
            }
        });
        buttonRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrasiActionPerformed(evt);
            }
        });

        labelRegisterImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
        labelRegisterImg.setText("jLabel4");

        labelTitleRegistrasi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitleRegistrasi.setText("REGISTRASI");

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addComponent(labelPasswordRegistrasi)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldRegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addComponent(labelKonfirmasiRegistrasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegisterLayout.createSequentialGroup()
                                .addComponent(buttonRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldRegisterKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsernameRegistrasi)
                            .addComponent(labelNamaRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldRegisterNama)
                            .addComponent(textFieldRegisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRegisterLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(labelTitleRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(labelRegisterImg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelRegisterImg, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelTitleRegistrasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsernameRegistrasi)
                    .addComponent(textFieldRegisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaRegistrasi)
                    .addComponent(textFieldRegisterNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPasswordRegistrasi)
                    .addComponent(textFieldRegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKonfirmasiRegistrasi)
                    .addComponent(textFieldRegisterKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistrasi)
                    .addComponent(buttonBatal))
                .addGap(34, 34, 34))
        );

        tabPane.addTab("Register", panelRegister);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void reset(){
        textFieldUsername.setText("");
        textFieldPassword.setText("");
        textFieldRegisterUsername.setText("");
        textFieldRegisterNama.setText("");
        textFieldRegisterPassword.setText("");
        textFieldRegisterKonfirmasi.setText("");
    }
    
    
    
    private void buttonLoginSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginSubmitActionPerformed
        String sql= "";
        
        if(comboBoxLoginLevel.getSelectedItem().equals("Admin")){
            sql = 
                "SELECT * FROM admin WHERE username='"
                + textFieldUsername.getText() +"' "
                + "AND password ='"
                + textFieldPassword.getText() + "'"; 
        } else if(comboBoxLoginLevel.getSelectedItem().equals("MUA")){
            sql = 
                "SELECT * FROM mua WHERE username='"
                + textFieldUsername.getText() +"' "
                + "AND password ='"
                + textFieldPassword.getText() + "'"; 
        } else{
            sql = 
                "SELECT * FROM pelanggan WHERE username='"
                + textFieldUsername.getText() +"' "
                + "AND password ='"
                + textFieldPassword.getText() + "'"; 
        }
      
        try {
            st= Koneksi.con.createStatement();
            rs= st.executeQuery(sql);
            
            if(rs.next()){
                
                String nama= rs.getString(2);
                
                System.out.println(nama);
                if(comboBoxLoginLevel.getSelectedItem().equals("Admin")){
                    new HalamanAdmin().setVisible(true);
                    this.dispose();
                } else if(comboBoxLoginLevel.getSelectedItem().equals("MUA")){
                    new HalamanMUA(nama).setVisible(true);
                    this.dispose();
                } else{
                    new HalamanPelanggan().setVisible(true);
                    this.dispose();
                }
                JOptionPane.showMessageDialog(null, "LOGIN Berhasil Sebagai " + comboBoxLoginLevel.getSelectedItem());
            } else{
                JOptionPane.showMessageDialog(null, "Username atau Password salah!");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonLoginSubmitActionPerformed

    private void buttonRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrasiActionPerformed
        if(textFieldRegisterKonfirmasi.getText().equals(textFieldRegisterPassword.getText())){
            try{
                String sql = "INSERT INTO pelanggan (`nama`, `username`, `password`) VALUES('"
                    +textFieldRegisterNama.getText()
                    +"','"+textFieldRegisterUsername.getText()
                    +"','"+textFieldRegisterPassword.getText()
                    +"')";

                st=Koneksi.con.createStatement();
                st.execute(sql);
                JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        } else{
            JOptionPane.showMessageDialog(null,
                    "Password dan Konfirmasi Password tidak sesuai", 
                    "Gagal Registrasi", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_buttonRegistrasiActionPerformed

    private void buttonRegistrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegistrasiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegistrasiMouseClicked

    private void buttonBatalLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalLoginActionPerformed
        reset();
    }//GEN-LAST:event_buttonBatalLoginActionPerformed

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        reset();
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
    private javax.swing.JButton buttonBatalLogin;
    private javax.swing.JButton buttonLoginSubmit;
    private javax.swing.JButton buttonRegistrasi;
    private javax.swing.JComboBox<String> comboBoxLoginLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelKonfirmasiRegistrasi;
    private javax.swing.JLabel labelLoginLevel;
    private javax.swing.JLabel labelNamaRegistrasi;
    private javax.swing.JLabel labelPasswordRegistrasi;
    private javax.swing.JLabel labelRegisterImg;
    private javax.swing.JLabel labelTitleRegistrasi;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelUsernameRegistrasi;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JPasswordField textFieldPassword;
    private javax.swing.JPasswordField textFieldRegisterKonfirmasi;
    private javax.swing.JTextField textFieldRegisterNama;
    private javax.swing.JPasswordField textFieldRegisterPassword;
    private javax.swing.JTextField textFieldRegisterUsername;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
