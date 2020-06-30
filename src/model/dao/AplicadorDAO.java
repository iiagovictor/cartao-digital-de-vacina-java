
package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Aplicador;
import model.beam.Organizacao;
import telas.EditarAplicador;
import telas.EditarOrganização;

public class AplicadorDAO {
    
    public void create(Aplicador valorDigitado) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO aplicador (cpf, nome, crm_crf, telefone, celular, data_de_nascimento, admin, email, senha)VALUES(?,?,?,?,?,?,?,?,?)");
            stat.setString(1, valorDigitado.getCpf());
            stat.setString(2, valorDigitado.getNome());
            stat.setString(3, valorDigitado.getCrm_crf());
            stat.setString(4, valorDigitado.getTelefone());
            stat.setString(5, valorDigitado.getCelular());
            java.sql.Date data = new java.sql.Date((valorDigitado.getData_de_nascimento().getTime()));
            stat.setDate(6, data);
            stat.setBoolean(7, valorDigitado.getAdmin());
            stat.setString(8, valorDigitado.getEmail());
            stat.setString(9, valorDigitado.getSenha());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar aplicador.");
            Logger.getLogger(AplicadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
                    
    }
    
    public void buscar(String cpf) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;

        try {
            stat = con.prepareStatement("SELECT * FROM aplicador WHERE cpf like ?");
            stat.setString(1, cpf);

            resultado = stat.executeQuery();
            resultado.first();

            JOptionPane.showMessageDialog(null, resultado.getString("nome") + " localizado com sucesso!");
            Aplicador aplicador = new Aplicador(resultado.getInt("id"), resultado.getString("nome"), resultado.getString("crm_crf"), resultado.getString("telefone"), resultado.getString("celular"), resultado.getDate("data_de_nascimento"), resultado.getBoolean("admin"), resultado.getString("email"), resultado.getString("senha"), resultado.getString("cpf"));
            new EditarAplicador(aplicador, resultado.getInt("id")).setVisible(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aplicador não localizado!");
            Logger.getLogger(BuscarOrganizacaoDataBase.class.getName()).log(Level.SEVERE, null, ex);
            new EditarAplicador().setVisible(true);
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }

    }
    
    
    public void edit(Aplicador valorDigitado) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("UPDATE aplicador SET  email=?, senha=?, telefone=?, celular=? where id = ?");
            stat.setString(1, valorDigitado.getEmail());
            stat.setString(2, valorDigitado.getSenha());
            stat.setString(3, valorDigitado.getTelefone());
            stat.setString(4, valorDigitado.getCelular());
            stat.setInt(5, valorDigitado.getId());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            Logger.getLogger(AplicadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
    }
    
    public void delete(Aplicador valorDigitado) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("DELETE FROM aplicador WHERE cpf = ?");
            stat.setString(1, valorDigitado.getCpf());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            Logger.getLogger(AplicadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
                    
    }
    
}
