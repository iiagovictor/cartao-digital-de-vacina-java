package model.beam;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String celular;
    private String mae;
    private String pai;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String CPF;
    private Date data_nacimento;
    private String UF;

    public Usuario(String UF, Date data_nacimento, String nome, String email, String senha, String celular, String mae, String pai, String logradouro, int numero, String complemento, String bairro, String cidade, String CPF) {
        this.UF = UF;
        this.data_nacimento = data_nacimento;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CPF = CPF;
        this.senha = senha;
        this.mae = mae;
        this.pai = pai;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public Usuario(int id, String nome, String celular, String logradouro, int numero, String bairro, String cidade, String CPF) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CPF = CPF;

    }

    public Usuario(int id, String celular, String logradouro, int numero, String bairro, String cidade, String uf) {
        this.id = id;
        this.celular = celular;
        this.logradouro = logradouro;
        if (numero < 0) {
            this.numero = 0;
        } else {
            this.numero = numero;
        }
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = uf;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_nacimento() {
        return data_nacimento;
    }

    public void setData_nacimento(Date data_nacimento) {
        this.data_nacimento = data_nacimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0) {
            this.numero = 0;
        } else {
            this.numero = numero;
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCPF() {
        return CPF;
    }
}
