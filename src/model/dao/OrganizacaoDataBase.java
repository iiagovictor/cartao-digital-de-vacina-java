package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Organizacao;
import model.beam.Usuario;
import telas.CriarOrganização;

public class OrganizacaoDataBase {

    private Connection con = null;

    public OrganizacaoDataBase() {
        con = ConnectionFactory.getConnection();
    }

    public void create(Organizacao valorDigitado) throws SQLException {
        Connection test = ConnectionFactory.getConnection();
        PreparedStatement stat = null;

        try {
            stat = test.prepareStatement("INSERT INTO organizacao (situacao, razao_social, cnpj, tipo_de_estabelecimento, telefone, cep, logradouro, numero, complemento, bairro, cidade, uf) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?, ?)");
            stat.setString(1, valorDigitado.getSituacao());
            stat.setString(2, valorDigitado.getRazao_social());
            stat.setString(3, valorDigitado.getCnpj());
            stat.setString(4, valorDigitado.getTipo_de_estabelecimento());
            stat.setString(5, valorDigitado.getTelefone());
            stat.setString(6, valorDigitado.getCEP());
            stat.setString(7, valorDigitado.getLogradouro());
            stat.setString(8, valorDigitado.getNumero());
            stat.setString(9, valorDigitado.getComplemento());
            stat.setString(10, valorDigitado.getBairro());
            stat.setString(11, valorDigitado.getCidade());
            stat.setString(12, valorDigitado.getUf());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar organizaçao.");
            Logger.getLogger(OrganizacaoDataBase.class.getName()).log(Level.SEVERE, null, ex);
            new CriarOrganização().setVisible(true);
        } finally {
            ConnectionFactory.closeConnection(test, stat);
        }

    }
}

