package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Lote;

public class LoteDAO {
    
    public void create(Lote r) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO lote_vacina (numero_lote, data_fabricacao, data_validade, fabricante)VALUES(?,?,?,?)");
            stat.setInt(1, r.getNumero());
            java.sql.Date data1 = new java.sql.Date((r.getDataFabricacao().getTime()));
            stat.setDate(2, data1);
            java.sql.Date data2 = new java.sql.Date((r.getDataValidade().getTime()));
            stat.setDate(3, data2);
            stat.setString(4, r.getFabricante());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lote registrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar o lote!");
            Logger.getLogger(LoteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
                    
    }
    
}
