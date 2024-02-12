
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class HalamanAdmin extends javax.swing.JFrame {

    Statement st;
    ResultSet rs;
    Koneksi Koneksi;
    
    public HalamanAdmin() {
        initComponents();
        
        Koneksi = new Koneksi();
        
        getDataRequest();
        getDataTransaksi();
        getDataMUA();
        
        try {
           st = Koneksi.con.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM mua");

           while (rs.next()) {
            comboBoxMUA.addItem(rs.getString(2));
           }
        }  catch (SQLException e) { 
            e.printStackTrace();
        }
    }
    
    private void getDataMUA(){
        Object header[]={"ID", "Nama","Username","Password","Telepon", "Alamat"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tableDataMUA.setModel(data);
        
        DefaultTableModel data2=new DefaultTableModel(null,header);
        tableDataMUAUpdate.setModel(data2);
        
        String sql="SELECT  * FROM mua ORDER BY id DESC";
        try
        {
            st=Koneksi.con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                String col1=rs.getString(1);
                String col2=rs.getString(2);
                String col3=rs.getString(3);
                String col4=rs.getString(4);
                String col5=rs.getString(5);
                String col6=rs.getString(6);
     
                String k[]={col1, col2, col3, col4, col5, col6};
                data.addRow(k);
                
                String k2[]={col1, col2, col3, col4, col5, col6};
                data2.addRow(k2);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private void getDataRequest(){
        Object header[]={"ID", "Nama","Acara","Tanggal","Alamat"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tableRequestBooking.setModel(data);
        String sql="SELECT  * FROM request";
        try
        {
            st=Koneksi.con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                String col1=rs.getString(1);
                String col2=rs.getString(2);
                String col3=rs.getString(3);
                String col4=rs.getString(4);
                String col5=rs.getString(5);
     
                String k[]={col1, col2, col3, col4, col5};
                data.addRow(k);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private void getDataTransaksi(){
        Object header[]={"ID", "Nama","Acara","Tanggal","Alamat", "MUA"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tableTransaksi.setModel(data);
        
        String sql="SELECT  * FROM transaksi";
        try
        {
            st=Koneksi.con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                String id=rs.getString(1);
                String col1=rs.getString(2);
                String col2=rs.getString(3);
                String col3=rs.getString(4);
                String col4=rs.getString(5);
                String col5=rs.getString(6);
     
                String k[]={id, col2, col3, col4, col5, col1};
                data.addRow(k);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        bgPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRequestBooking = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        textFieldRequestId = new javax.swing.JTextField();
        comboBoxMUA = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        submitRequestTransaksi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTransaksi = new javax.swing.JTable();
        buttonCetakDataTransaksi = new javax.swing.JButton();
        labelIdTransaksi = new javax.swing.JLabel();
        textFieldHapusTransaksi = new javax.swing.JTextField();
        buttonHapusTransaksi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableDataMUA = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        textFieldSeach = new javax.swing.JTextField();
        buttonSearchMUA = new javax.swing.JButton();
        buttonCetakDataMUA = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        buttonResetMUA = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textFieldNamaMUA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldUsernameMUA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldPasswordMUA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textFieldTelpMUA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaAlamatMUA = new javax.swing.JTextArea();
        SimpanDataMUA = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        textFieldNamaMUAEdit = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textFieldUsernameMUAEdit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textFieldPasswordMUAEdit = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textFieldTelpMUAEdit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textAreaAlamatMUAEdit = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableDataMUAUpdate = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        textFieldIdMUA = new javax.swing.JTextField();
        buttonUpdateMUA = new javax.swing.JButton();
        buttonDeleteMUA = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        buttonLogout = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 152, 121));

        bgPanel.setBackground(new java.awt.Color(245, 152, 121));

        jTabbedPane1.setBackground(new java.awt.Color(224, 111, 121));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(245, 152, 121));

        tableRequestBooking.setBackground(new java.awt.Color(224, 111, 121));
        tableRequestBooking.setForeground(new java.awt.Color(255, 255, 255));
        tableRequestBooking.setModel(new javax.swing.table.DefaultTableModel(
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
        tableRequestBooking.setGridColor(new java.awt.Color(254, 172, 176));
        tableRequestBooking.setSelectionBackground(new java.awt.Color(254, 172, 176));
        jScrollPane1.setViewportView(tableRequestBooking);

        jLabel1.setText("ID Request");

        jLabel2.setText("MUA");

        submitRequestTransaksi.setText("Submit");
        submitRequestTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRequestTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldRequestId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboBoxMUA, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(submitRequestTransaksi)))
                        .addGap(0, 208, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldRequestId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitRequestTransaksi))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Request Booking", jPanel1);

        jPanel2.setBackground(new java.awt.Color(245, 152, 121));

        tableTransaksi.setBackground(new java.awt.Color(224, 111, 121));
        tableTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        tableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableTransaksi);

        buttonCetakDataTransaksi.setText("Cetak Data Transaksi");
        buttonCetakDataTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCetakDataTransaksiActionPerformed(evt);
            }
        });

        labelIdTransaksi.setText("ID Transaksi");

        buttonHapusTransaksi.setText("Hapus");
        buttonHapusTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelIdTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldHapusTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonHapusTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCetakDataTransaksi)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCetakDataTransaksi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelIdTransaksi)
                        .addComponent(textFieldHapusTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonHapusTransaksi)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Transaksi", jPanel2);

        jPanel3.setBackground(new java.awt.Color(245, 152, 121));

        jTabbedPane2.setBackground(new java.awt.Color(255, 51, 51));

        jPanel5.setBackground(new java.awt.Color(245, 152, 121));

        tableDataMUA.setBackground(new java.awt.Color(224, 111, 121));
        tableDataMUA.setForeground(new java.awt.Color(255, 255, 255));
        tableDataMUA.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tableDataMUA);

        jLabel8.setText("Search");

        textFieldSeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSeachActionPerformed(evt);
            }
        });

        buttonSearchMUA.setText("Search");
        buttonSearchMUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchMUAActionPerformed(evt);
            }
        });

        buttonCetakDataMUA.setText("Cetak Data MUA");
        buttonCetakDataMUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCetakDataMUAActionPerformed(evt);
            }
        });

        buttonResetMUA.setText("Reset");
        buttonResetMUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetMUAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSearchMUA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonResetMUA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCetakDataMUA)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textFieldSeach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearchMUA)
                    .addComponent(buttonCetakDataMUA)
                    .addComponent(buttonResetMUA))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Data MUA", jPanel5);

        jPanel6.setBackground(new java.awt.Color(245, 152, 121));

        jLabel3.setText("Nama");

        jLabel4.setText("Username");

        textFieldUsernameMUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsernameMUAActionPerformed(evt);
            }
        });

        jLabel5.setText("Password");

        jLabel6.setText("No. Telepon");

        jLabel7.setText("Alamat");

        textAreaAlamatMUA.setColumns(20);
        textAreaAlamatMUA.setRows(5);
        jScrollPane3.setViewportView(textAreaAlamatMUA);

        SimpanDataMUA.setText("Simpan");
        SimpanDataMUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanDataMUAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SimpanDataMUA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldNamaMUA, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldUsernameMUA, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldTelpMUA, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(textFieldPasswordMUA))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNamaMUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelpMUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldUsernameMUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPasswordMUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(SimpanDataMUA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tambah Data MUA", jPanel6);

        jPanel9.setBackground(new java.awt.Color(245, 152, 121));

        jLabel11.setText("Nama");

        jLabel12.setText("Username");

        jLabel13.setText("Password");

        jLabel14.setText("No. Telepon");

        jLabel15.setText("Alamat");

        textAreaAlamatMUAEdit.setColumns(20);
        textAreaAlamatMUAEdit.setRows(5);
        jScrollPane5.setViewportView(textAreaAlamatMUAEdit);

        tableDataMUAUpdate.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tableDataMUAUpdate);

        jLabel10.setText("ID");

        buttonUpdateMUA.setText("UPDATE");
        buttonUpdateMUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateMUAActionPerformed(evt);
            }
        });

        buttonDeleteMUA.setText("DELETE");
        buttonDeleteMUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteMUAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(buttonDeleteMUA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonUpdateMUA))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5)
                            .addComponent(textFieldNamaMUAEdit)
                            .addComponent(textFieldUsernameMUAEdit)
                            .addComponent(textFieldPasswordMUAEdit)
                            .addComponent(textFieldTelpMUAEdit)
                            .addComponent(textFieldIdMUA))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(textFieldIdMUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(textFieldNamaMUAEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(textFieldUsernameMUAEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPasswordMUAEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldTelpMUAEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUpdateMUA)
                    .addComponent(buttonDeleteMUA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Update dan Hapus Data MUA", jPanel9);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 676, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manajemen MUA", jPanel3);

        jPanel8.setBackground(new java.awt.Color(245, 152, 121));

        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Logout", jPanel8);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void reset(){
        textFieldNamaMUA.setText("");
        textFieldUsernameMUA.setText("");
        textFieldPasswordMUA.setText("");
        textFieldTelpMUA.setText("");
        textAreaAlamatMUA.setText("");
        textFieldNamaMUAEdit.setText("");
        textFieldUsernameMUAEdit.setText("");
        textFieldPasswordMUAEdit.setText("");
        textFieldTelpMUAEdit.setText("");
        textAreaAlamatMUAEdit.setText(""); 
        textFieldIdMUA.setText("");
    }
    
    
    private void submitRequestTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRequestTransaksiActionPerformed
        String nama= "", acara= "", tanggal= "", alamat= "";
        
        try{
            String sql = "SELECT * FROM request WHERE id="+textFieldRequestId.getText();

            st= Koneksi.con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next())
            {
                nama= rs.getString(2);
                acara= rs.getString(3);
                tanggal= rs.getString(4);
                alamat= rs.getString(5);
            }
                
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            String sql = "INSERT INTO transaksi (`mua`, `nama`, `acara`, `tanggal`, `alamat`) VALUES('"
                +comboBoxMUA.getSelectedItem()
                +"', '" + nama
                + "' , '" + acara
                + "', '" + tanggal
                + "', '" + alamat
                + "')";

            st=Koneksi.con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Transaksi Berhasil");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            st= Koneksi.con.createStatement();
            String sql = "DELETE FROM request WHERE id= '" + textFieldRequestId.getText() + "'";

            st.executeUpdate(sql);

            
            getDataRequest();
            getDataTransaksi();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_submitRequestTransaksiActionPerformed

    private void SimpanDataMUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanDataMUAActionPerformed
         try{
            String sql = "INSERT INTO mua (nama, username, password, telp,alamat) VALUES('"
                + textFieldNamaMUA.getText()
                + "' , '" + textFieldUsernameMUA.getText() 
                + "', '" + textFieldPasswordMUA.getText() 
                + "', '" + textFieldTelpMUA.getText() 
                + "', '" + textAreaAlamatMUA.getText() 
                + "')";

            st=Koneksi.con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Data MUA Berhasil Ditambahkan");
            
            getDataMUA();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
         reset();
    }//GEN-LAST:event_SimpanDataMUAActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
       new Auth().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void textFieldSeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSeachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSeachActionPerformed

    private void buttonCetakDataMUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCetakDataMUAActionPerformed
        try{
            String reportPath = "src/ireport/DataMUA.jasper";
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, null, Koneksi.con);

            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonCetakDataMUAActionPerformed

    private void textFieldUsernameMUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsernameMUAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsernameMUAActionPerformed

    private void buttonHapusTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusTransaksiActionPerformed
        int confirmDelete = 
                JOptionPane.showConfirmDialog(
                    null, 
                    "Apakah Yakin Ingin Menghapusnya?", 
                    "Konfirmasi Hapus", 
                    JOptionPane.YES_NO_OPTION
                );
        if(confirmDelete == 0){
            try{
                st= Koneksi.con.createStatement();
                String sql = "DELETE FROM transaksi WHERE id= '" + textFieldHapusTransaksi.getText() + "'";

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Data transaksi berhasil dihapus");
                
                getDataMUA();
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
    }//GEN-LAST:event_buttonHapusTransaksiActionPerformed

    private void buttonDeleteMUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteMUAActionPerformed
        int confirmDelete = 
                JOptionPane.showConfirmDialog(
                    null, 
                    "Apakah Yakin Ingin Menghapusnya?", 
                    "Konfirmasi Hapus", 
                    JOptionPane.YES_NO_OPTION
                );
        if(confirmDelete == 0){
            try{
                st= Koneksi.con.createStatement();
                String sql = "DELETE FROM mua WHERE id= '" + textFieldIdMUA.getText() + "'";

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Data MUA berhasil dihapus");
                getDataMUA();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        } else{
            JOptionPane.showMessageDialog(
                null, 
                "Data MUA batal dihapus", 
                "Batal Hapus", 
                JOptionPane.WARNING_MESSAGE
            );
        }
        reset();
    }//GEN-LAST:event_buttonDeleteMUAActionPerformed

    private void buttonUpdateMUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateMUAActionPerformed
        int confirmUpdate = 
                JOptionPane.showConfirmDialog(
                    null, 
                    "Apakah Yakin Ingin Mengeditnya?", 
                    "Konfirmasi Edit", 
                    JOptionPane.YES_NO_OPTION
                );
        
        if(confirmUpdate == 0){
            try {
                String sql= 
                    "UPDATE mua SET "
                    + "nama='" + textFieldNamaMUAEdit.getText()+ "', "
                    + "username='" + textFieldUsernameMUAEdit.getText()+ "', " 
                    + "password='" + textFieldPasswordMUAEdit.getText()+ "', " 
                    + "telp='" + textFieldTelpMUAEdit.getText()+ "', " 
                    + "alamat='" + textAreaAlamatMUAEdit.getText()+ "' "    
                    + "WHERE id='" + textFieldIdMUA.getText() + "'";

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Data MUA berhasil di update");

                getDataMUA();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        } else{
            JOptionPane.showMessageDialog(
                null, 
                "Data MUA batal diedit", 
                "Batal Edit", 
                JOptionPane.WARNING_MESSAGE
            );
        }
        reset();
    }//GEN-LAST:event_buttonUpdateMUAActionPerformed

    private void buttonSearchMUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchMUAActionPerformed
        Object header[]={"ID", "Nama","Username","Password","Telepon", "Alamat"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tableDataMUA.setModel(data);
        
        DefaultTableModel data2=new DefaultTableModel(null,header);
        tableDataMUAUpdate.setModel(data2);
        
        String sql="SELECT  * FROM mua WHERE nama LIKE '%" + textFieldSeach.getText() + "%' ORDER BY id DESC ";
        try
        {
            st=Koneksi.con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                String col1=rs.getString(1);
                String col2=rs.getString(2);
                String col3=rs.getString(3);
                String col4=rs.getString(4);
                String col5=rs.getString(5);
                String col6=rs.getString(6);
     
                String k[]={col1, col2, col3, col4, col5, col6};
                data.addRow(k);
                
                String k2[]={col1, col2, col3, col4, col5, col6};
                data2.addRow(k2);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_buttonSearchMUAActionPerformed

    private void buttonResetMUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetMUAActionPerformed
        getDataMUA();
    }//GEN-LAST:event_buttonResetMUAActionPerformed

    private void buttonCetakDataTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCetakDataTransaksiActionPerformed
        try{
            String reportPath = "src/ireport/Data_ Transaksi.jasper";
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, null, Koneksi.con);

            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonCetakDataTransaksiActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SimpanDataMUA;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton buttonCetakDataMUA;
    private javax.swing.JButton buttonCetakDataTransaksi;
    private javax.swing.JButton buttonDeleteMUA;
    private javax.swing.JButton buttonHapusTransaksi;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonResetMUA;
    private javax.swing.JButton buttonSearchMUA;
    private javax.swing.JButton buttonUpdateMUA;
    private javax.swing.JComboBox<String> comboBoxMUA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel labelIdTransaksi;
    private javax.swing.JButton submitRequestTransaksi;
    private javax.swing.JTable tableDataMUA;
    private javax.swing.JTable tableDataMUAUpdate;
    private javax.swing.JTable tableRequestBooking;
    private javax.swing.JTable tableTransaksi;
    private javax.swing.JTextArea textAreaAlamatMUA;
    private javax.swing.JTextArea textAreaAlamatMUAEdit;
    private javax.swing.JTextField textFieldHapusTransaksi;
    private javax.swing.JTextField textFieldIdMUA;
    private javax.swing.JTextField textFieldNamaMUA;
    private javax.swing.JTextField textFieldNamaMUAEdit;
    private javax.swing.JTextField textFieldPasswordMUA;
    private javax.swing.JTextField textFieldPasswordMUAEdit;
    private javax.swing.JTextField textFieldRequestId;
    private javax.swing.JTextField textFieldSeach;
    private javax.swing.JTextField textFieldTelpMUA;
    private javax.swing.JTextField textFieldTelpMUAEdit;
    private javax.swing.JTextField textFieldUsernameMUA;
    private javax.swing.JTextField textFieldUsernameMUAEdit;
    // End of variables declaration//GEN-END:variables
}
