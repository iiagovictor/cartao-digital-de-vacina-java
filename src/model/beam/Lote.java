package model.beam;

import java.util.Date;

public class Lote {

    private int numero;
    private Date dataFabricacao;
    private Date dataValidade;
    private String fabricante;

    public Lote(int numero, Date dataFabricacao, Date dataValidade, String fabricante) {
        if (numero < 0) {
            this.numero = 0;
        } else {
            this.numero = numero;
        }
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.fabricante = fabricante;
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

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
