
package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Usuario;
import telas.Busca;
import telas.Vizualiza;

public class BuscaUsuarioDAO {
    
    public void buscaRegistro(Usuario user, int id) throws SQLException {
        ArrayList<String> lista = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null, statCont=null;
        ResultSet rs = null, rsCont=null;
        
        try {
            stat = con.prepareStatement("SELECT distinct v.nome as vacina, r.data, a.nome as aplicador, r.hora, v.descricao FROM  usuario_final u INNER JOIN Registro r ON r.ID_usuario_final = ? and u.id=? INNER JOIN Vacina v ON v.id = r.id_vacina INNER JOIN Aplicador a ON a.id = r.id_aplicador");
            stat.setInt(1, id);
            stat.setInt(2, id);
            
            rs = stat.executeQuery();
            
            
            statCont = con.prepareStatement("SELECT count(v.nome) as contador FROM  usuario_final  u INNER JOIN Registro r ON r.ID_usuario_final = ? and u.id=? INNER JOIN Vacina v ON v.id = r.id_vacina INNER JOIN Aplicador a ON a.id = r.id_aplicador");
            statCont.setInt(1, id);
            statCont.setInt(2, id);
            
            rsCont = statCont.executeQuery();
            
            rsCont.first();
            
            String[][] linhas = new String[rsCont.getInt("contador")][3];
            int i = 0;
            try {
                while (rs.next()) {
                    
                    linhas[i][0] = rs.getString("vacina");
                    
                    linhas[i][1] = rs.getString("data");
                    
                    linhas[i][2] = rs.getString("aplicador");
                    i++;
                }
            } catch (SQLException ex) {
                
            }
            
            new Vizualiza(user, linhas).setVisible(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cadastro não localizado!");
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
        
    }
    
    public void create(String cpf) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs = null;
        
        try {
            stat = con.prepareStatement("SELECT * FROM usuario_final WHERE CPF like ?");
            stat.setString(1, cpf);
            
            rs = stat.executeQuery();
            rs.first();
            
            JOptionPane.showMessageDialog(null, rs.getString("nome") + " localizado com sucesso!");
            
            Usuario user = new Usuario(rs.getInt("ID"), rs.getString("nome"), rs.getString("celular"), rs.getString("logradouro"), rs.getInt("numero"), rs.getString("bairro"), rs.getString("cidade"), cpf);
            buscaRegistro(user, rs.getInt("ID"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não localizado!");
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            new Busca().setVisible(true);
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
        
    }
    
}
