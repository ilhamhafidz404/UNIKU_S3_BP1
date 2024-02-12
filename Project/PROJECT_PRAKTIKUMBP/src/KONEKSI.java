

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class KONEKSI {
     Connection con;
    public KONEKSI() {
        String id, pass, driver, url;
        id = "root";
        pass = "";
        driver="com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/db_hotel";

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, id, pass);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal, Error: " + e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        KONEKSI K = new KONEKSI();
    }
   
}

