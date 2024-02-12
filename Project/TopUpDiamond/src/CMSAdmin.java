
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class CMSAdmin extends javax.swing.JFrame {
    Statement st;
    ResultSet rs;
    Connect connect;

    public CMSAdmin() {
        connect = new Connect();
        
        initComponents();
        
        try {
           st = connect.con.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM accounts WHERE role='user' ORDER BY id DESC");

           while (rs.next()) {
            comboBoxFilterTransaksi.addItem(rs.getString(2));
           }
        }  catch (SQLException e) { 
            e.printStackTrace();
        }
        
        getDataTransaksi();
        getDataUser();
    }
    
    private void getDataTransaksi(){
        Object header[]= {"ID", "User ID", "Server", "Total Diamond", "Total Bayar", "Nama Pembeli", "Email", "Status"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tabelDataTransaksi.setModel(data);
        
        String sql= "SELECT * FROM transactions INNER JOIN accounts ON transactions.account_id = accounts.id";
        
        try{
            st= connect.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                String col1= rs.getString(2);
                String col2= rs.getString(3);
                String col3= rs.getString(4);
                String col4= "Rp " + rs.getString(5) + ".000";
                String col5= rs.getString("nama");
                String col6= rs.getString("email");
                String col7= rs.getString("status");
                String col8= rs.getString(1);
                
                String k[]= {col8, col1, col2, col3, col4, col5, col6, col7};
                data.addRow(k);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getDataUser(){
        Object header[]= {"ID", "Nama", "Username", "Email", "Password"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tabelDataUser.setModel(data);
        
        String sql= "SELECT * FROM accounts";
        
        try{
            st= connect.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                String col1= rs.getString(1);
                String col2= rs.getString(2);
                String col3= rs.getString(3);
                String col4= rs.getString(4);
                String col5= rs.getString(5);
                
                String k[]= {col1, col2, col3, col4, col5};
                data.addRow(k);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        labelTitleDataUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelDataUser = new javax.swing.JTable();
        buttonCetakUser = new javax.swing.JButton();
        textFieldSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        labelSearch = new javax.swing.JLabel();
        radioButtonOrderID = new javax.swing.JRadioButton();
        radioButtonOrderNama = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        labelTitleDataTransaksi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataTransaksi = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        labelIdTransaksi = new javax.swing.JLabel();
        textFieldTransaksi = new javax.swing.JTextField();
        labelStatus = new javax.swing.JLabel();
        comboBoxStatus = new javax.swing.JComboBox<>();
        buttonEdit = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        buttnCetakTransaksi = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        comboBoxFilterTransaksi = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        buttonLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitleDataUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitleDataUser.setText("DATA USER");

        tabelDataUser.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelDataUser);

        buttonCetakUser.setText("CETAK");
        buttonCetakUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCetakUserActionPerformed(evt);
            }
        });

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        labelSearch.setText("Search");

        radioButtonOrderID.setSelected(true);
        radioButtonOrderID.setText("Urutkan ID");
        radioButtonOrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonOrderIDActionPerformed(evt);
            }
        });

        radioButtonOrderNama.setText("Urutkan Nama");
        radioButtonOrderNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonOrderNamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCetakUser)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(234, 234, 234)
                            .addComponent(labelTitleDataUser))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(buttonSearch))
                                        .addComponent(labelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radioButtonOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioButtonOrderNama)))))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jSeparator4)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelTitleDataUser)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearch)
                    .addComponent(radioButtonOrderID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch)
                    .addComponent(radioButtonOrderNama))
                .addGap(10, 10, 10)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCetakUser)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Data User", jPanel2);

        labelTitleDataTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitleDataTransaksi.setText("DATA TRANSAKSI");

        tabelDataTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelDataTransaksi);

        labelIdTransaksi.setText("ID Transaksi");

        labelStatus.setText("Opsi Status");

        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "proses", "berhasil", "gagal" }));

        buttonEdit.setText("EDIT");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttnCetakTransaksi.setText("CETAK");
        buttnCetakTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnCetakTransaksiActionPerformed(evt);
            }
        });

        buttonDelete.setText("DELETE");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        comboBoxFilterTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFilterTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(labelTitleDataTransaksi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttnCetakTransaksi)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelIdTransaksi)
                                .addComponent(textFieldTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelStatus)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonEdit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonDelete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxFilterTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitleDataTransaksi)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete)
                    .addComponent(buttonEdit)
                    .addComponent(comboBoxFilterTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(buttnCetakTransaksi)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Transaksi", jPanel1);

        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(buttonLogout)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(buttonLogout)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profile", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        try {
            String sql= 
                "UPDATE transactions SET "
                + "status='" + comboBoxStatus.getSelectedItem()+ "' "
                + "WHERE id='" + textFieldTransaksi.getText() + "'";

            st.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Data Transaksi berhasil di update");
            
            getDataTransaksi();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        this.dispose();
        new Auth().setVisible(true);
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonCetakUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCetakUserActionPerformed
        try{
            String reportPath = "src/ireport/ReportDataUser.jasper";
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, null, connect.con);

            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonCetakUserActionPerformed

    private void buttnCetakTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnCetakTransaksiActionPerformed
        try{
            String reportPath = "src/ireport/ReportDataTransaksi.jasper";
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, null, connect.con);

            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttnCetakTransaksiActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int confirmDelete = 
                JOptionPane.showConfirmDialog(
                    null, 
                    "Apakah Yakin Ingin Menghapusnya?", 
                    "Konfirmasi Hapus", 
                    JOptionPane.YES_NO_OPTION
                );
        if(confirmDelete == 0){
            try{
                st= connect.con.createStatement();
                String sql = "DELETE FROM transactions WHERE id= '" + textFieldTransaksi.getText() + "'";

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Data transaksi berhasil dihapus");
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        } else{
            JOptionPane.showMessageDialog(
                null, 
                "Data transaksi batal dihapus", 
                "Batal Hapus", 
                JOptionPane.WARNING_MESSAGE
            );
        }
        
        
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        Object header[]= {"ID", "Nama", "Username", "Email", "Password"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tabelDataUser.setModel(data);
        
        String sql= "SELECT * FROM accounts WHERE nama LIKE '%" + textFieldSearch.getText() + "%'";
        
        try{
            st= connect.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                String col1= rs.getString(1);
                String col2= rs.getString(2);
                String col3= rs.getString(3);
                String col4= rs.getString(4);
                String col5= rs.getString(5);
                
                String k[]= {col1, col2, col3, col4, col5};
                data.addRow(k);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void comboBoxFilterTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFilterTransaksiActionPerformed
        int userId= 0;
 
        String sql= "SELECT * FROM accounts WHERE nama='" + comboBoxFilterTransaksi.getSelectedItem()+"'";
        
        try{
            st= connect.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                int id= rs.getInt(1);
                userId = id;
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        Object header[]= {"User ID", "Nama Pembeli", "Total Diamond", "Total Bayar"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tabelDataTransaksi.setModel(data);
        
        String sqlTransaction= "SELECT * FROM transactions INNER JOIN accounts ON transactions.account_id = accounts.id WHERE user_id=" + userId;
        
        int total= 0;
        
        try{
            st= connect.con.createStatement();
            rs= st.executeQuery(sqlTransaction);
            
            while(rs.next()){
                String col1= rs.getString(2);
                String col2= rs.getString("nama");
                String col3= rs.getString(4);
                String col4= "Rp " + rs.getString(5) + ".000";
                
                total += rs.getInt(5);
                
                String k[]= {col1, col2, col3, col4};
                data.addRow(k);
            }
            String k[]= {"Jumlah Penghasilan", "", "", "Rp " + Integer.toString(total) + ".000"};
            data.addRow(k);
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_comboBoxFilterTransaksiActionPerformed

    private void radioButtonOrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonOrderIDActionPerformed
        Object header[]= {"ID", "Nama", "Username", "Email", "Password"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tabelDataUser.setModel(data);
        
        String sql= "SELECT * FROM accounts ORDER BY id ASC";
        
        try{
            st= connect.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                String col1= rs.getString(1);
                String col2= rs.getString(2);
                String col3= rs.getString(3);
                String col4= rs.getString(4);
                String col5= rs.getString(5);
                
                String k[]= {col1, col2, col3, col4, col5};
                data.addRow(k);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        radioButtonOrderNama.setSelected(false);
    }//GEN-LAST:event_radioButtonOrderIDActionPerformed

    private void radioButtonOrderNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonOrderNamaActionPerformed
        Object header[]= {"ID", "Nama", "Username", "Email", "Password"};
        DefaultTableModel data= new DefaultTableModel(null, header);
        tabelDataUser.setModel(data);
        
        String sql= "SELECT * FROM accounts ORDER BY nama ASC";
        
        try{
            st= connect.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                String col1= rs.getString(1);
                String col2= rs.getString(2);
                String col3= rs.getString(3);
                String col4= rs.getString(4);
                String col5= rs.getString(5);
                
                String k[]= {col1, col2, col3, col4, col5};
                data.addRow(k);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        radioButtonOrderID.setSelected(false);
    }//GEN-LAST:event_radioButtonOrderNamaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CMSAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttnCetakTransaksi;
    private javax.swing.JButton buttonCetakUser;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JComboBox<String> comboBoxFilterTransaksi;
    private javax.swing.JComboBox<String> comboBoxStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelIdTransaksi;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTitleDataTransaksi;
    private javax.swing.JLabel labelTitleDataUser;
    private javax.swing.JRadioButton radioButtonOrderID;
    private javax.swing.JRadioButton radioButtonOrderNama;
    private javax.swing.JTable tabelDataTransaksi;
    private javax.swing.JTable tabelDataUser;
    private javax.swing.JTextField textFieldSearch;
    private javax.swing.JTextField textFieldTransaksi;
    // End of variables declaration//GEN-END:variables
}
