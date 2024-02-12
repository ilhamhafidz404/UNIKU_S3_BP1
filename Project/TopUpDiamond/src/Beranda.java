
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        
public class Beranda extends javax.swing.JFrame {
    Connect connect;
    
    Statement st;
    ResultSet rs;
    
    String LoginEmail;
    
    String OpsiPilihDiamond="";
    int idr = 0;

    public Beranda() {
        connect = new Connect();
        
        initComponents();
    }
    
    public Beranda(String email) {
        LoginEmail = email;
        connect = new Connect();
        
        initComponents();
        getDataTransaksi();
    }
    
    void reset(){
        textFieldEmail.setText("");
        textFieldUserID.setText("");
    }

    
    void getDataTransaksi(){
        Object header[]= {"User ID", "Server", "Diamond", "Harga", "Status"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tabelDataTransaksi.setModel(data);
        
        String sqlGetUserByEmail = "SELECT * FROM accounts WHERE email='" + LoginEmail +"'";
        int account_id=0;
        
        try{
            st= connect.con.createStatement();
            rs= st.executeQuery(sqlGetUserByEmail);
            
            while(rs.next()){
                account_id= rs.getInt(1);
            }
            
            try{
                String sqlGetTransaction = "SELECT * FROM transactions WHERE account_id=" +account_id;
                st= connect.con.createStatement();
                rs= st.executeQuery(sqlGetTransaction);
            
                while(rs.next()){
                    String col1= rs.getString(2);
                    String col2= rs.getString(3);
                    String col3= rs.getString(4);
                    String col4= "Rp " + rs.getString(5) + ".000";
                    String col5= rs.getString(8);

                    String k[]= {col1, col2, col3, col4, col5};
                    data.addRow(k);
                }
                
            }  catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        reset();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioDiamond = new javax.swing.ButtonGroup();
        labelTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tabPane = new javax.swing.JTabbedPane();
        panelTopUp = new javax.swing.JPanel();
        radioButton100DM = new javax.swing.JRadioButton();
        radioButton160DM = new javax.swing.JRadioButton();
        radioButton210DM = new javax.swing.JRadioButton();
        radioButton280DM = new javax.swing.JRadioButton();
        radioButton1075DM = new javax.swing.JRadioButton();
        buttonBatal = new javax.swing.JButton();
        buttonBeli = new javax.swing.JButton();
        radioButton5DM = new javax.swing.JRadioButton();
        radioButton80DM = new javax.swing.JRadioButton();
        radioButton50DM = new javax.swing.JRadioButton();
        textFieldUserID = new javax.swing.JTextField();
        comboxBoxServer = new javax.swing.JComboBox<>();
        labelUserId = new javax.swing.JLabel();
        labelServer = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        panelDataTransaksi = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataTransaksi = new javax.swing.JTable();
        panelProfile = new javax.swing.JPanel();
        buttonLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle.setText("TOP UP DIAMOND FREE FIRE");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerFF.jpg"))); // NOI18N
        jLabel2.setText("BANNER FF");

        radioDiamond.add(radioButton100DM);
        radioButton100DM.setText("100 (Rp 14.000)");
        radioButton100DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton100DMActionPerformed(evt);
            }
        });

        radioDiamond.add(radioButton160DM);
        radioButton160DM.setText("160 (22.000)");
        radioButton160DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton160DMActionPerformed(evt);
            }
        });

        radioDiamond.add(radioButton210DM);
        radioButton210DM.setText("210 (Rp 27.000)");
        radioButton210DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton210DMActionPerformed(evt);
            }
        });

        radioDiamond.add(radioButton280DM);
        radioButton280DM.setText("280 (Rp 36.000)");
        radioButton280DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton280DMActionPerformed(evt);
            }
        });

        radioDiamond.add(radioButton1075DM);
        radioButton1075DM.setText("1075 (Rp 135.000)");
        radioButton1075DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton1075DMActionPerformed(evt);
            }
        });

        buttonBatal.setText("BATAL");

        buttonBeli.setText("BELI");
        buttonBeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBeliMouseClicked(evt);
            }
        });

        radioDiamond.add(radioButton5DM);
        radioButton5DM.setText("5 (Rp 1.000)");
        radioButton5DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton5DMActionPerformed(evt);
            }
        });

        radioDiamond.add(radioButton80DM);
        radioButton80DM.setText("80 (Rp 11.000)");
        radioButton80DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton80DMActionPerformed(evt);
            }
        });

        radioDiamond.add(radioButton50DM);
        radioButton50DM.setText("50 (Rp 7.000)");
        radioButton50DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton50DMActionPerformed(evt);
            }
        });

        comboxBoxServer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asia", "Africa", "Eropa", "Amerika" }));

        labelUserId.setText("USER ID FREE FIRE");

        labelServer.setText("SERVER");

        jLabel1.setText("Email");

        javax.swing.GroupLayout panelTopUpLayout = new javax.swing.GroupLayout(panelTopUp);
        panelTopUp.setLayout(panelTopUpLayout);
        panelTopUpLayout.setHorizontalGroup(
            panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(panelTopUpLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelTopUpLayout.createSequentialGroup()
                                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioButton5DM, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioButton50DM, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(radioButton160DM, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioButton210DM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radioButton280DM))
                                    .addComponent(radioButton1075DM)))
                            .addGroup(panelTopUpLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(buttonBatal)
                                .addGap(18, 18, 18)
                                .addComponent(buttonBeli))
                            .addComponent(radioButton80DM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioButton100DM)
                            .addGroup(panelTopUpLayout.createSequentialGroup()
                                .addComponent(textFieldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelServer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboxBoxServer, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelUserId)
                            .addComponent(jLabel1))))
                .addContainerGap())
        );
        panelTopUpLayout.setVerticalGroup(
            panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopUpLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserId)
                    .addComponent(labelServer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxBoxServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton5DM)
                    .addComponent(radioButton160DM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton50DM)
                    .addComponent(radioButton210DM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton80DM)
                    .addComponent(radioButton280DM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton100DM)
                    .addComponent(radioButton1075DM))
                .addGap(29, 29, 29)
                .addGroup(panelTopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBeli)
                    .addComponent(buttonBatal))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabPane.addTab("TOP UP", panelTopUp);

        tabelDataTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SIlahkan Konfirmasi Terlebih Dahulu"
            }
        ));
        jScrollPane1.setViewportView(tabelDataTransaksi);

        javax.swing.GroupLayout panelDataTransaksiLayout = new javax.swing.GroupLayout(panelDataTransaksi);
        panelDataTransaksi.setLayout(panelDataTransaksiLayout);
        panelDataTransaksiLayout.setHorizontalGroup(
            panelDataTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataTransaksiLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDataTransaksiLayout.setVerticalGroup(
            panelDataTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        tabPane.addTab("DATA TRANSAKSI", panelDataTransaksi);

        buttonLogout.setText("LOGOUT");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProfileLayout = new javax.swing.GroupLayout(panelProfile);
        panelProfile.setLayout(panelProfileLayout);
        panelProfileLayout.setHorizontalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfileLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(buttonLogout)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        panelProfileLayout.setVerticalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfileLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(buttonLogout)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        tabPane.addTab("PROFILE", panelProfile);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioButton5DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton5DMActionPerformed
        OpsiPilihDiamond = "5";
        idr = 1;
    }//GEN-LAST:event_radioButton5DMActionPerformed

    private void buttonBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBeliMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah data anda sudah benar", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
        
        if(confirm == 0){
            
            String sqlGetUserId = "SELECT * FROM accounts WHERE email='" + textFieldEmail.getText() +"'";
            int account_id = 0;

            try{
                st= connect.con.createStatement();
                rs= st.executeQuery(sqlGetUserId);

                while(rs.next()){
                    account_id= rs.getInt(1);
                }
                
                String sql = "INSERT INTO transactions VALUES (NULL, '"
                   + textFieldUserID.getText() + "', '"
                   + comboxBoxServer.getSelectedItem() + "', '"
                   + OpsiPilihDiamond + "', "
                   + idr + ", NULL, "
                   + account_id + ", 'proses')";
            
                st.execute(sql);

                JOptionPane.showMessageDialog(null, "Topup Berhasil!");
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        } else{
            JOptionPane.showMessageDialog(null, "Topup Dibatalkan!");
        }
        
        getDataTransaksi();
    }//GEN-LAST:event_buttonBeliMouseClicked

    private void radioButton50DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton50DMActionPerformed
        OpsiPilihDiamond = "50";
        idr = 7;
    }//GEN-LAST:event_radioButton50DMActionPerformed

    private void radioButton80DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton80DMActionPerformed
        OpsiPilihDiamond = "80";
        idr = 11;
    }//GEN-LAST:event_radioButton80DMActionPerformed

    private void radioButton100DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton100DMActionPerformed
        OpsiPilihDiamond = "100";
        idr = 14;
    }//GEN-LAST:event_radioButton100DMActionPerformed

    private void radioButton160DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton160DMActionPerformed
        OpsiPilihDiamond = "160";
        idr = 22;
    }//GEN-LAST:event_radioButton160DMActionPerformed

    private void radioButton210DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton210DMActionPerformed
        OpsiPilihDiamond = "210";
        idr = 27;
    }//GEN-LAST:event_radioButton210DMActionPerformed

    private void radioButton280DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton280DMActionPerformed
        OpsiPilihDiamond = "280";
        idr = 36;
    }//GEN-LAST:event_radioButton280DMActionPerformed

    private void radioButton1075DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton1075DMActionPerformed
        OpsiPilihDiamond = "1075";
        idr = 135;
    }//GEN-LAST:event_radioButton1075DMActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        
        this.dispose();
        
        new Auth().setVisible(true);
    }//GEN-LAST:event_buttonLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonBeli;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JComboBox<String> comboxBoxServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelServer;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUserId;
    private javax.swing.JPanel panelDataTransaksi;
    private javax.swing.JPanel panelProfile;
    private javax.swing.JPanel panelTopUp;
    private javax.swing.JRadioButton radioButton100DM;
    private javax.swing.JRadioButton radioButton1075DM;
    private javax.swing.JRadioButton radioButton160DM;
    private javax.swing.JRadioButton radioButton210DM;
    private javax.swing.JRadioButton radioButton280DM;
    private javax.swing.JRadioButton radioButton50DM;
    private javax.swing.JRadioButton radioButton5DM;
    private javax.swing.JRadioButton radioButton80DM;
    private javax.swing.ButtonGroup radioDiamond;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tabelDataTransaksi;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldUserID;
    // End of variables declaration//GEN-END:variables
}
