import javax.swing.JOptionPane;
import java.util.ArrayList;

public class BP1_M4_PostTest3_IlhamHafidz extends javax.swing.JFrame {

    boolean sudahPilihJenisKelamin = false;
    boolean sudahPilihHobi = false;
    
    String jenisKelamin = "";
    ArrayList<String> hobi = new ArrayList<>();
    String prodi = "";
    
    public BP1_M4_PostTest3_IlhamHafidz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelNIM = new javax.swing.JLabel();
        textFieldNIM = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        textFieldNama = new javax.swing.JTextField();
        labelJenisKelamin = new javax.swing.JLabel();
        radioLakiLaki = new javax.swing.JRadioButton();
        radioPerempuan = new javax.swing.JRadioButton();
        labelProdi = new javax.swing.JLabel();
        comboBoxProdi = new javax.swing.JComboBox<>();
        labelHobi = new javax.swing.JLabel();
        checkBoxNonton = new javax.swing.JCheckBox();
        checkBoxOlahraga = new javax.swing.JCheckBox();
        checkBoxDengerMusik = new javax.swing.JCheckBox();
        checkBoxTraveling = new javax.swing.JCheckBox();
        labelAlamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaAlamat = new javax.swing.JTextArea();
        buttonRegister = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("FORM REGISTER");

        labelNIM.setText("NIM");

        labelNama.setText("NAMA");

        labelJenisKelamin.setText("JENIS KELAMIN");

        radioLakiLaki.setText("Laki-laki");
        radioLakiLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLakiLakiActionPerformed(evt);
            }
        });

        radioPerempuan.setText("Perempuan");
        radioPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPerempuanActionPerformed(evt);
            }
        });

        labelProdi.setText("PRODI");

        comboBoxProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika S1", "Sistem Informasi S1", "Desain Komunikasi Visual S1", "Manajemen Informatika D3", "Teknik Sipil S1" }));
        comboBoxProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProdiActionPerformed(evt);
            }
        });

        labelHobi.setText("HOBI");

        checkBoxNonton.setText("NONTON");
        checkBoxNonton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxNontonActionPerformed(evt);
            }
        });

        checkBoxOlahraga.setText("OLAHRAGA");
        checkBoxOlahraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxOlahragaActionPerformed(evt);
            }
        });

        checkBoxDengerMusik.setText("DENGERIN MUSIK");
        checkBoxDengerMusik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDengerMusikActionPerformed(evt);
            }
        });

        checkBoxTraveling.setText("TRAVELING");
        checkBoxTraveling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTravelingActionPerformed(evt);
            }
        });

        labelAlamat.setText("ALAMAT");

        textAreaAlamat.setColumns(20);
        textAreaAlamat.setRows(5);
        jScrollPane1.setViewportView(textAreaAlamat);

        buttonRegister.setText("REGISTER");
        buttonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegisterMouseClicked(evt);
            }
        });

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane2.setViewportView(outputTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelJenisKelamin)
                            .addComponent(labelProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHobi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRegister)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldNIM)
                                .addComponent(textFieldNama)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioLakiLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(comboBoxProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(checkBoxNonton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkBoxOlahraga, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(checkBoxDengerMusik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkBoxTraveling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNIM)
                    .addComponent(textFieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJenisKelamin)
                    .addComponent(radioLakiLaki)
                    .addComponent(radioPerempuan))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProdi)
                    .addComponent(comboBoxProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHobi)
                    .addComponent(checkBoxNonton)
                    .addComponent(checkBoxDengerMusik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxOlahraga)
                    .addComponent(checkBoxTraveling))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlamat)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonRegister)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdiActionPerformed
        prodi = comboBoxProdi.getSelectedItem().toString();
    }//GEN-LAST:event_comboBoxProdiActionPerformed

    private void checkBoxOlahragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxOlahragaActionPerformed
        sudahPilihHobi= true;
        hobi.add("Olahraga");
    }//GEN-LAST:event_checkBoxOlahragaActionPerformed

    private void buttonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseClicked
        String valueNIM = textFieldNIM.getText();
        String valueNama = textFieldNama.getText();
        String valueAlamat = textAreaAlamat.getText();
        
        if(
            valueNIM.isEmpty() || 
            valueNama.isEmpty() || 
            valueAlamat.isEmpty() || 
            !sudahPilihJenisKelamin || 
            !sudahPilihHobi
        ){
            JOptionPane.showMessageDialog(
                null, 
                "Registrasi Gagal, Data harus Lengkap"
            );
        } else{
            JOptionPane.showMessageDialog(
                null, 
                "Registrasi Berhasil"
            );
            
            outputTextArea.setText(
                "Nama \t:" +  valueNama + "\n" +
                "NIM  \t:" + valueNIM + "\n" +
                "Jenis Kelamin \t:" + jenisKelamin + "\n" +
                "Prodi \t:" + prodi + "\n" +
                "Hobi  \t:" + hobi + "\n" +
                "Alamat \t:" + valueAlamat
            );
        } 
    }//GEN-LAST:event_buttonRegisterMouseClicked

    private void radioLakiLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLakiLakiActionPerformed
        sudahPilihJenisKelamin = true;
        radioPerempuan.setSelected(false);
        jenisKelamin = "Laki-laki";
    }//GEN-LAST:event_radioLakiLakiActionPerformed

    private void radioPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPerempuanActionPerformed
        sudahPilihJenisKelamin = true;
        radioLakiLaki.setSelected(false);
        jenisKelamin = "Perempuan";
    }//GEN-LAST:event_radioPerempuanActionPerformed

    private void checkBoxNontonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxNontonActionPerformed
        sudahPilihHobi= true;
        hobi.add("Nonton");
    }//GEN-LAST:event_checkBoxNontonActionPerformed

    private void checkBoxDengerMusikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDengerMusikActionPerformed
        sudahPilihHobi= true;
        hobi.add("Dengerin Musik");
    }//GEN-LAST:event_checkBoxDengerMusikActionPerformed

    private void checkBoxTravelingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxTravelingActionPerformed
        sudahPilihHobi= true;
        hobi.add("Traveling");
    }//GEN-LAST:event_checkBoxTravelingActionPerformed

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
            java.util.logging.Logger.getLogger(BP1_M4_PostTest3_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BP1_M4_PostTest3_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BP1_M4_PostTest3_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BP1_M4_PostTest3_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BP1_M4_PostTest3_IlhamHafidz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegister;
    private javax.swing.JCheckBox checkBoxDengerMusik;
    private javax.swing.JCheckBox checkBoxNonton;
    private javax.swing.JCheckBox checkBoxOlahraga;
    private javax.swing.JCheckBox checkBoxTraveling;
    private javax.swing.JComboBox<String> comboBoxProdi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelHobi;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelNIM;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelProdi;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JRadioButton radioLakiLaki;
    private javax.swing.JRadioButton radioPerempuan;
    private javax.swing.JTextArea textAreaAlamat;
    private javax.swing.JTextField textFieldNIM;
    private javax.swing.JTextField textFieldNama;
    // End of variables declaration//GEN-END:variables
}
