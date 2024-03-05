package Classes;

public class Cores {

    private int id_cor;
    private String nome_cor;

    public Cores() {
    }

    public Cores(int id_cor, String nome_cor) {
        this.id_cor = id_cor;
        this.nome_cor = nome_cor;
    }

    public int getId_cor() {
        return id_cor;
    }

    public void setId_cor(int id_cor) {
        this.id_cor = id_cor;
    }

    public String getNome_cor() {
        return nome_cor;
    }

    public void setNome_cor(String nome_cor) {
        this.nome_cor = nome_cor;
    }

}
