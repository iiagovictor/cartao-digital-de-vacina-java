package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Registro;

public class RegistroDAO {
    
    public void create(Registro r) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO registro (ID_usuario_final, ID_aplicador, ID_vacina, data, hora, dose)VALUES(?,(select ID from aplicador where upper(nome) like upper(?)),(select ID from vacina where upper(nome) like upper(?)),?,?,?)");
            stat.setInt(1, r.getUsuario());
            stat.setString(2, r.getAplicador());
            stat.setString(3, r.getVacina());
            java.sql.Date data = new java.sql.Date((r.getData().getTime()));
            stat.setDate(4, data);
            LocalTime yourTime = LocalTime.parse(r.getHora());
            java.sql.Time time = new java.sql.Time(yourTime.getHour());
            stat.setTime(5, time);
            stat.setString(6, r.getDose());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
                    
    }
    
}
