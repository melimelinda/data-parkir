package tb_parkir;

import java.sql.*;

public class koneksi {

    public Connection conn;
    public Statement st;
    public ResultSet rs;

    public void koneksi() {
        konek("localhost", "tb_parkir", "root", "");
    }
    
    public void konek(String server, String db, String user, String passwd) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC tidak barhasil Load");
            e.printStackTrace();
            return;
        }
        
        conn = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://" + server + ":3306/" + db, user, passwd);
        } catch (SQLException e) {
            System.out.println("Tidak bisa koneksi ke database");
            e.printStackTrace();
            return;
        }
        notif();
    }
    
    public void notif() {
        if (conn != null) {
            System.out.println("Berhasil Koneksi!");
        } else {
            System.out.println("Koneksi Gagal........ !");
        }
        koneksi2 ko = new koneksi2();
        ko.notif();
    }
}
