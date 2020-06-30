package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telas.Login;
import telas.Menu;
import telas.TelaAdmin;

public class LoginDAO {

    public void create(String email, String senha) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            stat = con.prepareStatement("SELECT * FROM aplicador WHERE email like ?");
            stat.setString(1, email);

            rs = stat.executeQuery();
            rs.first();

            if (rs.getString("senha").equals(senha)) {
                if (rs.getBoolean("admin")) {
                    JOptionPane.showMessageDialog(null, rs.getString("nome") + " logado com sucesso!");
                    new TelaAdmin().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, rs.getString("nome") + " logado com sucesso!");
                    new Menu().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta! Tente novamente.");
                new Login().setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cadastro não localizado! Tente novamente.");
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            new Login().setVisible(true);
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }

    }

}
