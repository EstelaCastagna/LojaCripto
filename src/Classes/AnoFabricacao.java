package Classes;

public class AnoFabricacao {

    private int id_ano_fabricacao;
    private int ano_fabricacao;

    public AnoFabricacao() {
    }

    public AnoFabricacao(int id_ano_fabricacao, int ano_fabricacao) {
        this.id_ano_fabricacao = id_ano_fabricacao;
        this.ano_fabricacao = ano_fabricacao;
    }

    public int getId_ano_fabricacao() {
        return id_ano_fabricacao;
    }

    public void setId_ano_fabricacao(int id_ano_fabricacao) {
        this.id_ano_fabricacao = id_ano_fabricacao;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

}
