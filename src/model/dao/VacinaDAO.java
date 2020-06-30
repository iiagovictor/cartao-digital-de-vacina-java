package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Vacina;

public class VacinaDAO {
    
    public void create(Vacina v) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO vacina (nome,quantidade_estoque,descricao,n_lote)VALUES(?,?,?,?)");
            stat.setString(1, v.getNome());
            stat.setInt(2, v.getQtd_estoque());
            stat.setString(3, v.getDescricao());
            stat.setInt(4, v.getLote());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vacina registrada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar vacina!");
            Logger.getLogger(VacinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
                    
    }
    
}
