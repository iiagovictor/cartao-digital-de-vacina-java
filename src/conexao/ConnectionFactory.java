package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

 

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/cdv", "root", "Vh-Nkjv-g66-QZGvBc.qD-6KqEyHx..4U@MKhRVhf-vBdgEvH*");
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexao : ", ex);
        }

    }

    public static void closeConnection(Connection con) throws SQLException {
        if (con != null) {
            con.close();
        }
    }

    public static void closeConnection(Connection con, PreparedStatement sat) throws SQLException {
        closeConnection(con);
        if (sat != null) {
            sat.close();
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement sat, ResultSet rs) throws SQLException {
        closeConnection(con, sat);
        if (rs != null) {
            rs.close();
        }
    }
}
