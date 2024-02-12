import javax.swing.JOptionPane;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class BP_TugasDataMatkulDanDataNilai_IlhamHafidz extends javax.swing.JFrame {
    
    Statement st;
    ResultSet rs;
    koneksi koneksi;
    
    public BP_TugasDataMatkulDanDataNilai_IlhamHafidz() {
        initComponents();
        
        koneksi= new koneksi();
        
        getMatkul();
        getNilai();
        getDataNilaiMahasiswa();
    }
    
    private void getMatkul(){
        Object header[]= {"Nama Mata Kuliah", "Dosen Pengampu", "SKS"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tableDataMatkul.setModel(data);
        
        String sql= "SELECT * FROM mk";
        
        try{
            st= koneksi.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                String col1= rs.getString(2);
                String col2= rs.getString(3);
                String col3= rs.getString(4);
                
                String k[]= {col1, col2, col3};
                data.addRow(k);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void insertMatkul(){
        try {
            st= koneksi.con.createStatement();
            String sql= "INSERT INTO mk (`nama`, `dosen_pengampu`, `sks`) VALUES('"+
                textFieldNamaMatkul.getText() + "', '" + 
                textFieldDosenPengampu.getText() + "', '" + 
                textFieldSKS.getText() + "')";

            st.execute(sql);
            
            getMatkul();
            reset();
            
            JOptionPane.showMessageDialog(null, "Data matakuliah berhasil ditambahkan!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void editMatkul(){
        try {

            String sql= 
                "UPDATE mk SET "
                + "nama='" + textFieldNamaMatkul.getText() + "', "
                + "dosen_pengampu= '" + textFieldDosenPengampu.getText() + "', "
                + "sks= '" + textFieldSKS.getText() + "' "
                + "WHERE nama='" + textFieldNamaMatkul.getText() + "'";

            st.executeUpdate(sql);
            
            reset();
            getMatkul();
            
            JOptionPane.showMessageDialog(null, "Data matakuliah berhasil di update");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void deleteMatkul(){
        try{
            st= koneksi.con.createStatement();
            String sql = "DELETE FROM mk WHERE nama= '" + textFieldNamaMatkul.getText() + "'";

            st.executeUpdate(sql);

            reset();
            getMatkul();
            
            JOptionPane.showMessageDialog(null, "Data matakuliah berhasil dihapus");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getNilai(){
        Object header[]= {"ID", "Range", "Nilai"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tableDataNilai.setModel(data);
        
        String sql= "SELECT * FROM nilai";
        
        try{
            st= koneksi.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                String col1= rs.getString(1);
                String col2= rs.getString(2) + " - " + rs.getString(3);
                String col3= rs.getString(4);
                
                String k[]= {col1, col2, col3};
                data.addRow(k);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void insertNilai(){
        try {
            st= koneksi.con.createStatement();
            String sql= "INSERT INTO nilai (`lebih_dari`, `kurang_dari`, `nilai`) VALUES('"+
                textFieldLebihDari.getText() + "', '" + 
                textFieldKurangDari.getText() + "', '" + 
                textFieldNilai.getText() + "')";

            st.execute(sql);
            
            getNilai();
            reset();
            
            JOptionPane.showMessageDialog(null, "Data nilai berhasil ditambahkan!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void editNilai(){
        try {

            String sql= 
                "UPDATE nilai SET "
                + "lebih_dari='" + textFieldLebihDari.getText() + "', "
                + "kurang_dari= '" + textFieldKurangDari.getText() + "', "
                + "nilai= '" + textFieldNilai.getText() + "' "
                + "WHERE id='" + textFieldIdNilai.getText() + "'";

            st.executeUpdate(sql);
            
            getNilai();
            reset();
            
            JOptionPane.showMessageDialog(null, "Data nilai berhasil di update");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void deleteNilai(){
        try{
            st= koneksi.con.createStatement();
            String sql = "DELETE FROM nilai WHERE id= '" + textFieldIdNilai.getText() + "'";

            st.executeUpdate(sql);

            reset();
            getNilai();
            
            JOptionPane.showMessageDialog(null, "Data nilai berhasil dihapus");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getDataNilaiMahasiswa(){
        Object header[]= {"NIM", "Nama", "Jenis Kelamin", "Prodi", "Kelas", "Nilai"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tableDataNilaiMahasiswa.setModel(data);
        
        String sql= "SELECT * FROM mhs_nilai JOIN mhs ON mhs_nilai.id_mhs=mhs.id JOIN nilai ON mhs_nilai.id_nilai=nilai.id";
        
        try{
            st= koneksi.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                String col1= rs.getString("nim");
                String col2= rs.getString("nama");
                String col3= rs.getString("jk");
                String col4= rs.getString("prodi");
                String col5= rs.getString("kelas");
                String col6= rs.getString("nilai");
                
                data.addRow(new Object[]{col1, col2, col3, col4, col5, col6});
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void reset(){
        textFieldNamaMatkul.setText("");
        textFieldDosenPengampu.setText("");
        textFieldSKS.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelTitleMatkul = new javax.swing.JLabel();
        textFieldNamaMatkul = new javax.swing.JTextField();
        textFieldDosenPengampu = new javax.swing.JTextField();
        Separator2 = new javax.swing.JSeparator();
        Separator1 = new javax.swing.JSeparator();
        labelMatkul = new javax.swing.JLabel();
        labelDosenPengampu = new javax.swing.JLabel();
        textFieldSKS = new javax.swing.JTextField();
        labelSKS = new javax.swing.JLabel();
        buttonTambah = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDataMatkul = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        labelTitleNilai = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelLebihDari = new javax.swing.JLabel();
        labelKurangDari = new javax.swing.JLabel();
        labelNilai = new javax.swing.JLabel();
        labelIdNilai = new javax.swing.JLabel();
        textFieldIdNilai = new javax.swing.JTextField();
        textFieldLebihDari = new javax.swing.JTextField();
        textFieldKurangDari = new javax.swing.JTextField();
        textFieldNilai = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        buttonTambahNilai = new javax.swing.JButton();
        buttonEditNilai = new javax.swing.JButton();
        buttonHapusNilai = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDataNilai = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableDataNilaiMahasiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitleMatkul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitleMatkul.setText("DATA MATAKULIAH");

        labelMatkul.setText("Nama MataKuliah");

        labelDosenPengampu.setText("Dosen Pengampu");

        labelSKS.setText("SKS");

        buttonTambah.setText("Tambah");
        buttonTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTambahMouseClicked(evt);
            }
        });

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

        tableDataMatkul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableDataMatkul);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(Separator1)
                    .addComponent(Separator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonHapus)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldNamaMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldDosenPengampu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDosenPengampu, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSKS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldSKS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTitleMatkul)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitleMatkul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatkul)
                    .addComponent(labelDosenPengampu)
                    .addComponent(labelSKS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDosenPengampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNamaMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah)
                    .addComponent(buttonEdit)
                    .addComponent(buttonHapus))
                .addGap(12, 12, 12)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Mata Kuliah", jPanel1);

        labelTitleNilai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitleNilai.setText("DATA NILAI");

        labelLebihDari.setText("Lebih Dari");

        labelKurangDari.setText("Kurang Dari");

        labelNilai.setText("Nilai");

        labelIdNilai.setText("ID");

        buttonTambahNilai.setText("Tambah");
        buttonTambahNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTambahNilaiMouseClicked(evt);
            }
        });

        buttonEditNilai.setText("Edit");
        buttonEditNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditNilaiMouseClicked(evt);
            }
        });

        buttonHapusNilai.setText("Hapus");
        buttonHapusNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHapusNilaiMouseClicked(evt);
            }
        });
        buttonHapusNilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonHapusNilaiKeyPressed(evt);
            }
        });

        tableDataNilai.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableDataNilai);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(labelTitleNilai))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldIdNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(labelIdNilai, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldLebihDari, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLebihDari, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldKurangDari, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelKurangDari, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(buttonTambahNilai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEditNilai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonHapusNilai))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelTitleNilai)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLebihDari)
                    .addComponent(labelKurangDari)
                    .addComponent(labelNilai)
                    .addComponent(labelIdNilai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldIdNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldLebihDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldKurangDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambahNilai)
                    .addComponent(buttonEditNilai)
                    .addComponent(buttonHapusNilai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Nilai", jPanel2);

        tableDataNilaiMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tableDataNilaiMahasiswa);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Downloads\\ilham.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Nilai Mahasiswa", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTambahMouseClicked
        insertMatkul();
    }//GEN-LAST:event_buttonTambahMouseClicked

    private void buttonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditMouseClicked
        editMatkul();
    }//GEN-LAST:event_buttonEditMouseClicked

    private void buttonHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHapusMouseClicked
        deleteMatkul();
    }//GEN-LAST:event_buttonHapusMouseClicked

    private void buttonTambahNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTambahNilaiMouseClicked
        insertNilai();
    }//GEN-LAST:event_buttonTambahNilaiMouseClicked

    private void buttonEditNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditNilaiMouseClicked
        editNilai();
    }//GEN-LAST:event_buttonEditNilaiMouseClicked

    private void buttonHapusNilaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonHapusNilaiKeyPressed
//        deleteNilai();
    }//GEN-LAST:event_buttonHapusNilaiKeyPressed

    private void buttonHapusNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHapusNilaiMouseClicked
        deleteNilai();
    }//GEN-LAST:event_buttonHapusNilaiMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BP_TugasDataMatkulDanDataNilai_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BP_TugasDataMatkulDanDataNilai_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BP_TugasDataMatkulDanDataNilai_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BP_TugasDataMatkulDanDataNilai_IlhamHafidz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BP_TugasDataMatkulDanDataNilai_IlhamHafidz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonEditNilai;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonHapusNilai;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonTambahNilai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelDosenPengampu;
    private javax.swing.JLabel labelIdNilai;
    private javax.swing.JLabel labelKurangDari;
    private javax.swing.JLabel labelLebihDari;
    private javax.swing.JLabel labelMatkul;
    private javax.swing.JLabel labelNilai;
    private javax.swing.JLabel labelSKS;
    private javax.swing.JLabel labelTitleMatkul;
    private javax.swing.JLabel labelTitleNilai;
    private javax.swing.JTable tableDataMatkul;
    private javax.swing.JTable tableDataNilai;
    private javax.swing.JTable tableDataNilaiMahasiswa;
    private javax.swing.JTextField textFieldDosenPengampu;
    private javax.swing.JTextField textFieldIdNilai;
    private javax.swing.JTextField textFieldKurangDari;
    private javax.swing.JTextField textFieldLebihDari;
    private javax.swing.JTextField textFieldNamaMatkul;
    private javax.swing.JTextField textFieldNilai;
    private javax.swing.JTextField textFieldSKS;
    // End of variables declaration//GEN-END:variables
}
