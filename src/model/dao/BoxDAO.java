package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import telas.Registra;

public class BoxDAO {

    public void buscaRegistro(int id) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null, statAplicador=null;
        ResultSet rs = null, rsAplicador=null;

        try {
            stat = con.prepareStatement("select nome, id from Vacina");

            
            rs = stat.executeQuery();
            
            
            ArrayList<String> linhas = new ArrayList<>();;
            int i = 0;
            try {
                while (rs.next()) {
                    
                    linhas.add(rs.getString("nome"));
                    
                    i++;

                }
            } catch (SQLException ex) {
                
            }
            
            
            
            statAplicador = con.prepareStatement("select nome, id from Aplicador");

            
            rsAplicador = statAplicador.executeQuery();
            
            
            ArrayList<String> aplicadores = new ArrayList<>();;
            int j = 0;
            try {
                while (rsAplicador.next()) {
                    
                    aplicadores.add(rsAplicador.getString("nome"));
                    
                    j++;

                }
            } catch (SQLException ex) {
                
            }
            new Registra(id, linhas, aplicadores).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }

    }

}
