package tb_parkir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi2 extends koneksi {

    Connection con;
    Statement stm;

    public void config() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tb_parkir", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal " + e.getMessage());
        }
    }

    @Override
    public void notif() {
        System.out.println("Keterangan");
        System.out.println("Driver berhasil di Load");

    }
}
