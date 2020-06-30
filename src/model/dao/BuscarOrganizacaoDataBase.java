package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Organizacao;
import telas.Busca;
import telas.EditarOrganização;
import telas.TelaAdmin;

public class BuscarOrganizacaoDataBase {

    public void buscar(String cnpj) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;

        try {
            stat = con.prepareStatement("SELECT * FROM organizacao WHERE cnpj like ?");
            stat.setString(1, cnpj);

            resultado = stat.executeQuery();
            resultado.first();

            JOptionPane.showMessageDialog(null, resultado.getString("razao_social") + " localizado com sucesso!");
            Organizacao organizacao = new Organizacao(resultado.getInt("id"), resultado.getString("situacao"), resultado.getString("razao_social"), resultado.getString("tipo_de_estabelecimento"), resultado.getString("telefone"), resultado.getString("cep"), resultado.getString("logradouro"), resultado.getString("numero"), resultado.getString("complemento"), resultado.getString("bairro"), resultado.getString("cidade"), resultado.getString("uf"), resultado.getString("cnpj"));
            new EditarOrganização(organizacao, resultado.getInt("id")).setVisible(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Organização não localizada!");
            Logger.getLogger(BuscarOrganizacaoDataBase.class.getName()).log(Level.SEVERE, null, ex);
            new EditarOrganização().setVisible(true);
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }

    }

    public void edit(Organizacao valorDigitado) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("UPDATE organizacao SET  situacao=?, telefone=?, cep=?, logradouro=?, numero=?, complemento=?, bairro=?, cidade=?, uf=? where id = ?");
            stat.setString(1, valorDigitado.getSituacao());
            stat.setString(2, valorDigitado.getTelefone());
            stat.setString(3, valorDigitado.getCEP());
            stat.setString(4, valorDigitado.getLogradouro());
            stat.setString(5, valorDigitado.getNumero());
            stat.setString(6, valorDigitado.getComplemento());
            stat.setString(7, valorDigitado.getBairro());
            stat.setString(8, valorDigitado.getCidade());
            stat.setString(9, valorDigitado.getUf());
            stat.setInt(10, valorDigitado.getId());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }

}
