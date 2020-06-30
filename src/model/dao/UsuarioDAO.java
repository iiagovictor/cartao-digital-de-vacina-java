package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Usuario;

public class UsuarioDAO {
    
    public void create(Usuario u) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO usuario_final (nome, email, senha, data_de_nascimento, celular, mae, pai, logradouro, numero, complemento, bairro, cidade, UF, notificacao_email, notificacao_sms, notificacao_push, cpf)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stat.setString(1, u.getNome());
            stat.setString(2, u.getEmail());
            stat.setString(3, u.getSenha());
            java.sql.Date data = new java.sql.Date((u.getData_nacimento().getTime()));
            stat.setDate(4, data);
            stat.setString(5, u.getCelular());
            stat.setString(6, u.getMae());
            stat.setString(7, u.getPai());
            stat.setString(8, u.getLogradouro());
            stat.setInt(9, u.getNumero());
            stat.setString(10, u.getComplemento());
            stat.setString(11, u.getBairro());
            stat.setString(12, u.getCidade());
            stat.setString(13, u.getUF());
            stat.setBoolean(14, true);
            stat.setBoolean(15, true);
            stat.setBoolean(16, true);
            stat.setString(17, u.getCPF());
            
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário.");
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
                    
    }
    
    
    public void edit(Usuario u) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("UPDATE usuario_final SET  logradouro=?, numero=?, bairro=?, cidade=?, uf=?, celular=? where id = ?");
            stat.setString(1, u.getLogradouro());
            stat.setInt(2, u.getNumero());
            stat.setString(3, u.getBairro());
            stat.setString(4, u.getCidade());
            stat.setString(5, u.getUF());
            stat.setString(6, u.getCelular());
            stat.setInt(7, u.getId());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
                    
    }
    
}
