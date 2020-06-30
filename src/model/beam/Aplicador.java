package model.beam;

import java.util.Date;

public class Aplicador {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String celular;
    private String crm_crf;
    private String cpf;
    private Date data_de_nascimento;
    private boolean admin;

    public Aplicador(int id, String cpf, String nome, String crm_crf, String telefone, String celular, Date data_de_nascimento, boolean admin, String email, String senha) {
        this.id = id;
        this.data_de_nascimento = data_de_nascimento;
        this.admin = admin;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.cpf = cpf;
        this.senha = senha;
        this.crm_crf = crm_crf;
    }

    public Aplicador(String cpf, String nome, String crm_crf, String telefone, String celular, Date data_de_nascimento, boolean admin, String email, String senha) {
        this.data_de_nascimento = data_de_nascimento;
        this.nome = nome;
        this.email = email;
        this.admin = admin;
        this.telefone = telefone;
        this.celular = celular;
        this.cpf = cpf;
        this.senha = senha;
        this.crm_crf = crm_crf;
    }

    public Aplicador(String cpf, String telefone, String celular, String email, String senha) {
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.senha = senha;
    }

    public Aplicador(int id, String telefone, String celular, String email, String senha) {
        this.id = id;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.senha = senha;
    }

    public Aplicador(int id, String nome, String crm_crf, String telefone, String celular, Date data_de_nascimento, Boolean admin, String email, String senha, String cpf) {
        this.id = id;
        this.nome = nome;
        this.crm_crf = crm_crf;
        this.telefone = telefone;
        this.celular = celular;
        this.data_de_nascimento = data_de_nascimento;
        this.admin = admin;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;

    }

    public Aplicador(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm_crf() {
        return crm_crf;
    }

    public void setCrm_crf(String crm_crf) {
        this.crm_crf = crm_crf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_nascimento(Date data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
