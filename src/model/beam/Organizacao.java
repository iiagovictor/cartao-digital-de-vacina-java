package model.beam;

public class Organizacao {

    private int id;
    private String situacao;
    private String razao_social;
    private String cnpj;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String tipo_de_estabelecimento;
    private String telefone;

    public Organizacao() {

    }

    public Organizacao(String situacao, String razao_social, String cnpj, String cep, String logradouro, String numero, String complemento, String bairro, String cidade, String uf, String tipo_de_estabelecimento, String telefone) {
        this.situacao = situacao;
        this.razao_social = razao_social;
        this.cnpj = cnpj;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.tipo_de_estabelecimento = tipo_de_estabelecimento;
        this.telefone = telefone;
    }

    public Organizacao(int id, String situacao, String razao_social, String tipo_de_estabelecimento, String telefone, String cep, String logradouro, String numero, String complemento, String bairro, String cidade, String uf, String cnpj) {
        this.id = id;
        this.situacao = situacao;
        this.razao_social = razao_social;
        this.cnpj = cnpj;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.tipo_de_estabelecimento = tipo_de_estabelecimento;
        this.telefone = telefone;
    }

    public Organizacao(int id, String situacao, String telefone, String cep, String logradouro, String numero, String complemento, String bairro, String cidade, String uf) {
        this.id = id;
        this.situacao = situacao;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone = telefone;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCEP() {
        return cep;
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTipo_de_estabelecimento() {
        return tipo_de_estabelecimento;
    }

    public void setTipo_de_estabelecimento(String tipo_de_estabelecimento) {
        this.tipo_de_estabelecimento = tipo_de_estabelecimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
