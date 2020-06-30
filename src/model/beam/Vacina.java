package model.beam;

public class Vacina {

    private String nome;
    private int qtd_estoque;
    private String descricao;
    private int lote;

    public Vacina(String nome, int qtd_estoque, String descricao, int lote) {
        this.nome = nome;
        if (qtd_estoque < 0) {
            this.qtd_estoque = 0;
        } else {
            this.qtd_estoque = qtd_estoque;
        }
        this.descricao = descricao;
        this.lote = lote;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        if (qtd_estoque < 0) {
            this.qtd_estoque = 0;
        } else {
            this.qtd_estoque = qtd_estoque;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

}
