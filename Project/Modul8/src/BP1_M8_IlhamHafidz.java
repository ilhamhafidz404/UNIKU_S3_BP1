import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

public class BP1_M8_IlhamHafidz extends javax.swing.JFrame {
    
    Statement st;
    ResultSet rs;
    koneksi koneksi;

    public BP1_M8_IlhamHafidz() {
        koneksi= new koneksi();
        initComponents();
        
        load_data();
    }
    
    private void load_data(){
        Object header[]= {"NIM", "Nama", "Jenis Kelamin", "Prodi", "Alamat", "Kelas", "Angkatan", "No.HP"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tableDataMahasiswa.setModel(data);
        
        String sql= "SELECT * FROM mhs";
        
        try{
            st= koneksi.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                String k1= rs.getString(1);
                String k2= rs.getString(2);
                String k3= rs.getString(3);
                String k4= rs.getString(4);
                String k5= rs.getString(5);
                String k6= rs.getString(6);
                String k7= rs.getString(7);
                String k8= rs.getString(8);
                
                String k[]= {k1, k2, k3, k4, k5, k6, k7, k8};
                data.addRow(k);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void input_data(){
        try {
            String jk= "";
            if(radioButtonPerempuan.isSelected()){
                jk= radioButtonPerempuan.getText();
            } else{
                jk= radioButtonLakiLaki.getText();
            }
            
            String sql= "INSERT INTO mhs VALUES('"+
                    textFieldNIM.getText() + "', '" + 
                    textFieldNama.getText() + "', '" + 
                    jk + "', '" + 
                    comboBoxProdi.getSelectedItem() + "', '" + 
                    textAreaAlamat.getText() + "', '" +
                    textFieldKelas.getText() +"', '" +
                    textFieldAngkatan.getText() + "', '" +
                    textFieldHP.getText() + "')";
            
            st.execute(sql);
            load_data();
            
            JOptionPane.showMessageDialog(null, "Data Mahasiswa Berhasil Diinput");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void reset(){
        textFieldNIM.setText("");
        textFieldNama.setText("");
        comboBoxProdi.setSelectedItem("TI");
        textAreaAlamat.setText("");
        textFieldKelas.setText("");
        textFieldAngkatan.setText("");
        textFieldHP.setText("");
    }
    
    private void check(){
        String nim= textFieldNIM.getText();
        String nama= textFieldNama.getText();
        String kelas= textFieldKelas.getText();
        String angkatan= textFieldAngkatan.getText();
        String hp= textFieldHP.getText();
        String alamat = textAreaAlamat.getText();
        
        if(
            nim.equals("") || 
            nama.equals("") || 
            kelas.equals("") || 
            angkatan.equals("") || 
            hp.equals("") ||
            alamat.equals("")
        ){
            JOptionPane.showMessageDialog(
                null, 
                "Harap isi semua inputan", 
                "Tambah Data Gagal", 
                JOptionPane.ERROR_MESSAGE
            );
        } else{
            input_data();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelSubtitle = new javax.swing.JLabel();
        labelNIM = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelJenisKelamin = new javax.swing.JLabel();
        labelProdi = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        textFieldNIM = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaAlamat = new javax.swing.JTextArea();
        comboBoxProdi = new javax.swing.JComboBox<>();
        radioButtonLakiLaki = new javax.swing.JRadioButton();
        radioButtonPerempuan = new javax.swing.JRadioButton();
        buttonSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDataMahasiswa = new javax.swing.JTable();
        labelKelas = new javax.swing.JLabel();
        textFieldKelas = new javax.swing.JTextField();
        labelAngkatan = new javax.swing.JLabel();
        textFieldAngkatan = new javax.swing.JTextField();
        labelNoHP = new javax.swing.JLabel();
        textFieldHP = new javax.swing.JTextField();
        buttonEdit = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setText("DATA MAHASISWA");

        labelSubtitle.setText("FORM INPUT DATA");

        labelNIM.setText("NIM");

        labelNama.setText("Nama");

        labelJenisKelamin.setText("Jenis Kelamin");

        labelProdi.setText("Prodi");

        labelAlamat.setText("Alamat");

        textAreaAlamat.setColumns(20);
        textAreaAlamat.setRows(5);
        textAreaAlamat.setPreferredSize(new java.awt.Dimension(60, 84));
        jScrollPane1.setViewportView(textAreaAlamat);

        comboBoxProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TI", "SI", "DKV", "MI", "TS", " " }));

        radioButtonLakiLaki.setText("L");

        radioButtonPerempuan.setText("P");

        buttonSimpan.setText("Simpan");
        buttonSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSimpanMouseClicked(evt);
            }
        });

        jLabel1.setText("DATA MAHASISWA");

        tableDataMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableDataMahasiswa);

        labelKelas.setText("Kelas");

        labelAngkatan.setText("Angkatan");

        labelNoHP.setText("No HP");

        buttonEdit.setText("Edit");
        buttonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditMouseClicked(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHapusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(labelSubtitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelJenisKelamin)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelAlamat)))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAngkatan))
                                .addGap(71, 71, 71)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButtonLakiLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldNama)
                            .addComponent(textFieldNIM)
                            .addComponent(jScrollPane1)
                            .addComponent(comboBoxProdi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonHapus))
                            .addComponent(textFieldKelas)
                            .addComponent(textFieldAngkatan)
                            .addComponent(textFieldHP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSubtitle)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNIM)
                            .addComponent(textFieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNama)
                            .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJenisKelamin)
                            .addComponent(radioButtonLakiLaki)
                            .addComponent(radioButtonPerempuan))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelProdi)
                            .addComponent(comboBoxProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAlamat)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelKelas))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAngkatan)
                    .addComponent(textFieldAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoHP)
                    .addComponent(textFieldHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSimpan)
                    .addComponent(buttonEdit)
                    .addComponent(buttonHapus))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSimpanMouseClicked
        int confirmSelected= JOptionPane.showConfirmDialog(
                null,
                "Apakah Yakin Data Mahasiswa akan ditambahkan?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
            );
        
        if(confirmSelected == 0){
            check();
        }
        
        reset();
    }//GEN-LAST:event_buttonSimpanMouseClicked

    private void buttonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditMouseClicked
         int confirmSelected= JOptionPane.showConfirmDialog(
                null,
                "Apakah Yakin Data Mahasiswa dengan NIM " + textFieldNIM.getText() + " akan diedit?",
                "Konfirmasi Edit",
                JOptionPane.YES_NO_OPTION
            );
        
        if(confirmSelected == 0){
            try {
                String jk= "";
                if(radioButtonPerempuan.isSelected()){
                    jk= radioButtonPerempuan.getText();
                } else{
                    jk= radioButtonLakiLaki.getText();
                }

                String sql_edit= 
                        "UPDATE mhs SET "
                        + "nim='" + textFieldNIM.getText() + "', "
                        + "nama= '" + textFieldNama.getText() + "', "
                        + "jk= '" + jk + "', "
                        + "prodi= '" + comboBoxProdi.getSelectedItem() + "', "
                        + "alamat= '" + textAreaAlamat.getText() + "' , "
                        + "kelas= '" + textFieldKelas.getText() + "' , "
                        + "angkatan= '" + textFieldAngkatan.getText() + "' , "
                        + "hp= '" + textFieldHP.getText() + "' "
                        + "WHERE nim='" + textFieldNIM.getText() + "'";

                st.executeUpdate(sql_edit);
                JOptionPane.showMessageDialog(null, "Data mahasiswa berhasil di update");
                
                reset();
                load_data();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Edit dibatalkan");
        }
    }//GEN-LAST:event_buttonEditMouseClicked

    private void buttonHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHapusMouseClicked
        int confirmDelete= JOptionPane.showConfirmDialog(
                null,
                "Apakah Yakin Data Mahasiswa dengan NIM " + textFieldNIM.getText() + " akan dihapus?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION
            );
        
        if(confirmDelete == 0){
            try{
                st= koneksi.con.createStatement();
                String sql_delete = "DELETE FROM mhs WHERE nim= '" + textFieldNIM.getText() + "'";
                
                st.executeUpdate(sql_delete);
                
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                
                reset();
                load_data();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Hapus dibatalkan");
        }
    }//GEN-LAST:event_buttonHapusMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BP1_M8_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BP1_M8_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BP1_M8_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BP1_M8_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BP1_M8_IlhamHafidz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JComboBox<String> comboBoxProdi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelAngkatan;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelKelas;
    private javax.swing.JLabel labelNIM;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoHP;
    private javax.swing.JLabel labelProdi;
    private javax.swing.JLabel labelSubtitle;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JRadioButton radioButtonLakiLaki;
    private javax.swing.JRadioButton radioButtonPerempuan;
    private javax.swing.JTable tableDataMahasiswa;
    private javax.swing.JTextArea textAreaAlamat;
    private javax.swing.JTextField textFieldAngkatan;
    private javax.swing.JTextField textFieldHP;
    private javax.swing.JTextField textFieldKelas;
    private javax.swing.JTextField textFieldNIM;
    private javax.swing.JTextField textFieldNama;
    // End of variables declaration//GEN-END:variables
}
