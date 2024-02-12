package Tugas;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Register extends javax.swing.JFrame {
    
    String jenisKelamin = "", 
            prodi ="Teknik Informatika (S1)",
            angkatan = "2023";
    ArrayList<String> hobi = new ArrayList<>();
    
    public Register() {
        initComponents();
    }
    
    void resetForm(){
        textFieldNama.setText("");
        textFieldNIM.setText("");
        textFieldKelas.setText("");
        textFieldDPA.setText("");
        textFieldSemester.setText("");
        textAreaAlamat.setText("");
        
        radioLakilaki.setSelected(false);
        radioPerempuan.setSelected(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelNIM = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        textFieldNIM = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        labelJenisKelamin = new javax.swing.JLabel();
        radioLakilaki = new javax.swing.JRadioButton();
        radioPerempuan = new javax.swing.JRadioButton();
        labelProdi = new javax.swing.JLabel();
        comboBoxProdi = new javax.swing.JComboBox<>();
        labelHobi = new javax.swing.JLabel();
        checkBoxNonton = new javax.swing.JCheckBox();
        checkBoxDengerinMusik = new javax.swing.JCheckBox();
        checkBoxOlahraga = new javax.swing.JCheckBox();
        checkBoxTraveling = new javax.swing.JCheckBox();
        labelAlamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaAlamat = new javax.swing.JTextArea();
        buttonRegister = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaOutput = new javax.swing.JTextArea();
        labelKelas = new javax.swing.JLabel();
        textFieldKelas = new javax.swing.JTextField();
        labelAngkatan = new javax.swing.JLabel();
        labelDPA = new javax.swing.JLabel();
        textFieldDPA = new javax.swing.JTextField();
        comboBoxAngkatan = new javax.swing.JComboBox<>();
        labelSemester = new javax.swing.JLabel();
        textFieldSemester = new javax.swing.JTextField();
        buttonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("FORM REGISTER");

        labelNIM.setText("NIM");

        labelNama.setText("NAMA");

        labelJenisKelamin.setText("JENIS KELAMIN");

        radioLakilaki.setText("Laki-laki");
        radioLakilaki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioLakilakiMouseClicked(evt);
            }
        });

        radioPerempuan.setText("Perempuan");
        radioPerempuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioPerempuanMouseClicked(evt);
            }
        });

        labelProdi.setText("PRODI");

        comboBoxProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika (S1)", "Sistem Informasi (S1)", "Desain Komunikasi Visual (S1)", "Manajemen Informatika (D3)", "Teknik Sipil (S1)" }));
        comboBoxProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProdiActionPerformed(evt);
            }
        });

        labelHobi.setText("HOBI");

        checkBoxNonton.setText("Nonton");
        checkBoxNonton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxNontonMouseClicked(evt);
            }
        });

        checkBoxDengerinMusik.setText("Dengerin Musik");
        checkBoxDengerinMusik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxDengerinMusikMouseClicked(evt);
            }
        });

        checkBoxOlahraga.setText("Olahraga");
        checkBoxOlahraga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxOlahragaMouseClicked(evt);
            }
        });

        checkBoxTraveling.setText("Traveling");
        checkBoxTraveling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxTravelingMouseClicked(evt);
            }
        });

        labelAlamat.setText("ALAMAT");

        textAreaAlamat.setColumns(15);
        textAreaAlamat.setRows(5);
        textAreaAlamat.setTabSize(5);
        jScrollPane1.setViewportView(textAreaAlamat);

        buttonRegister.setText("REGISTER");
        buttonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegisterMouseClicked(evt);
            }
        });

        textAreaOutput.setColumns(20);
        textAreaOutput.setRows(5);
        jScrollPane2.setViewportView(textAreaOutput);

        labelKelas.setText("KELAS");

        labelAngkatan.setText("ANGKATAN");

        labelDPA.setText("DPA");

        comboBoxAngkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));
        comboBoxAngkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAngkatanActionPerformed(evt);
            }
        });

        labelSemester.setText("SEMESTER");

        buttonKeluar.setText("Keluar");
        buttonKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonKeluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldNIM)
                                    .addComponent(textFieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelJenisKelamin)
                                    .addComponent(labelDPA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelHobi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAlamat)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelKelas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelProdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelSemester, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelAngkatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioLakilaki, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textFieldSemester, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxAngkatan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textFieldDPA, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textFieldKelas, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxProdi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(checkBoxNonton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(checkBoxOlahraga, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(checkBoxTraveling, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(checkBoxDengerinMusik))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(buttonRegister)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buttonKeluar))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNIM)
                    .addComponent(textFieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJenisKelamin)
                    .addComponent(radioLakilaki)
                    .addComponent(radioPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProdi)
                    .addComponent(comboBoxProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKelas)
                    .addComponent(textFieldKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAngkatan)
                    .addComponent(comboBoxAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDPA)
                    .addComponent(textFieldDPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSemester)
                    .addComponent(textFieldSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxNonton)
                    .addComponent(checkBoxDengerinMusik)
                    .addComponent(labelHobi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxTraveling)
                    .addComponent(checkBoxOlahraga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlamat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegister)
                    .addComponent(buttonKeluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdiActionPerformed
        prodi = comboBoxProdi.getSelectedItem().toString();
    }//GEN-LAST:event_comboBoxProdiActionPerformed

    private void comboBoxAngkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAngkatanActionPerformed
        angkatan = comboBoxAngkatan.getSelectedItem().toString();
    }//GEN-LAST:event_comboBoxAngkatanActionPerformed

    private void radioLakilakiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioLakilakiMouseClicked
        radioPerempuan.setSelected(false);
        jenisKelamin = "Laki-laki";
    }//GEN-LAST:event_radioLakilakiMouseClicked

    private void radioPerempuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioPerempuanMouseClicked
        radioLakilaki.setSelected(false);
        jenisKelamin = "Perempuan";
    }//GEN-LAST:event_radioPerempuanMouseClicked

    private void buttonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseClicked
        String valueTextFieldNama = textFieldNama.getText();
        String valueTextFieldNIM = textFieldNIM.getText();
        String valueTextFieldKelas = textFieldKelas.getText();
        String valueTextFieldDPA = textFieldDPA.getText();
        String valueTextFieldSemester = textFieldSemester.getText();
        String valueTextAreaAlamat = textAreaAlamat.getText();
        
        if(
            valueTextFieldNama.isEmpty() || 
            valueTextFieldNIM.isEmpty() || 
            valueTextFieldKelas.isEmpty() || 
            valueTextFieldDPA.isEmpty() || 
            valueTextFieldSemester.isEmpty() ||
            valueTextAreaAlamat.isEmpty() || 
            jenisKelamin.isEmpty() ||
            prodi.isEmpty() || 
            hobi.isEmpty()
        ){
            JOptionPane.showMessageDialog(
                null, 
                "Registrasi Gagal, Data harus Lengkap"
            );
            
            this.resetForm();
            
            dispose();
            Login login = new Login();
            login.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(
                null, 
                "Registrasi Berhasil"
            );
            
            textAreaOutput.setText(
                "Nama \t:" + valueTextFieldNama + "\n" +      
                "NIM \t:" + valueTextFieldNIM + "\n" +
                "Jenis Kelamin \t:" + jenisKelamin + "\n" +
                "Prodi \t:" + prodi + "\n" +
                "Kelas \t:" + valueTextFieldKelas + "\n" +
                "Angkatan \t:" + angkatan + "\n" +
                "DPA \t:" + valueTextFieldDPA + "\n" +
                "Semester \t:" + valueTextFieldSemester + "\n" +   
                "Hobi \t:" + hobi + "\n" +
                "Alamat \t:" + valueTextAreaAlamat + "\n"
            );
            
            dispose();
            DataNilai dataNilai = new DataNilai();
            dataNilai.setVisible(true);
        } 
    }//GEN-LAST:event_buttonRegisterMouseClicked

    private void checkBoxNontonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxNontonMouseClicked
        hobi.add("Nonton");
    }//GEN-LAST:event_checkBoxNontonMouseClicked

    private void checkBoxOlahragaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxOlahragaMouseClicked
        hobi.add("Olahraga");
    }//GEN-LAST:event_checkBoxOlahragaMouseClicked

    private void checkBoxDengerinMusikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxDengerinMusikMouseClicked
        hobi.add("Dengerin Musik");
    }//GEN-LAST:event_checkBoxDengerinMusikMouseClicked

    private void checkBoxTravelingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxTravelingMouseClicked
        hobi.add("Traveling");
    }//GEN-LAST:event_checkBoxTravelingMouseClicked

    private void buttonKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKeluarMouseClicked
        dispose();
    }//GEN-LAST:event_buttonKeluarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JCheckBox checkBoxDengerinMusik;
    private javax.swing.JCheckBox checkBoxNonton;
    private javax.swing.JCheckBox checkBoxOlahraga;
    private javax.swing.JCheckBox checkBoxTraveling;
    private javax.swing.JComboBox<String> comboBoxAngkatan;
    private javax.swing.JComboBox<String> comboBoxProdi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelAngkatan;
    private javax.swing.JLabel labelDPA;
    private javax.swing.JLabel labelHobi;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelKelas;
    private javax.swing.JLabel labelNIM;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelProdi;
    private javax.swing.JLabel labelSemester;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JRadioButton radioLakilaki;
    private javax.swing.JRadioButton radioPerempuan;
    private javax.swing.JTextArea textAreaAlamat;
    private javax.swing.JTextArea textAreaOutput;
    private javax.swing.JTextField textFieldDPA;
    private javax.swing.JTextField textFieldKelas;
    private javax.swing.JTextField textFieldNIM;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldSemester;
    // End of variables declaration//GEN-END:variables
}
