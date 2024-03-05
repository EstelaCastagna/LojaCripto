package ConstrutoresSelects;

public class ConstEstoque {

    private int id_modelo;
    private String nome_marca;
    private String nome_modelo;
    private String versao_modelo;
    private int quantidade;

    public ConstEstoque() {
    }

    public ConstEstoque(int id_modelo, String nome_marca, String nome_modelo, String versao_modelo, int quantidade) {
        this.id_modelo = id_modelo;
        this.nome_marca = nome_marca;
        this.nome_modelo = nome_modelo;
        this.versao_modelo = versao_modelo;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getNome_marca() {
        return nome_marca;
    }

    public void setNome_marca(String nome_marca) {
        this.nome_marca = nome_marca;
    }

    public String getNome_modelo() {
        return nome_modelo;
    }

    public void setNome_modelo(String nome_modelo) {
        this.nome_modelo = nome_modelo;
    }

    public String getVersao_modelo() {
        return versao_modelo;
    }

    public void setVersao_modelo(String versao_modelo) {
        this.versao_modelo = versao_modelo;
    }
    
    

}
