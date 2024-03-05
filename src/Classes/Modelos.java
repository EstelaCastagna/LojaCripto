package Classes;

public class Modelos extends MostrarDados{

    private int id_modelo;
    private int id_marca;
    private int id_caracteristica_modelo;
    private String nome_modelo;
    private String tipo_modelo;
    private String versao_modelo;

    public Modelos() {
    }

    public Modelos(int id_modelo, int id_marca, int id_caracteristica_modelo, String nome_modelo, String tipo_modelo, String versao_modelo) {
        this.id_modelo = id_modelo;
        this.id_marca = id_marca;
        this.id_caracteristica_modelo = id_caracteristica_modelo;
        this.nome_modelo = nome_modelo;
        this.tipo_modelo = tipo_modelo;
        this.versao_modelo = versao_modelo;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getId_caracteristica_modelo() {
        return id_caracteristica_modelo;
    }

    public void setId_caracteristica_modelo(int id_caracteristica_modelo) {
        this.id_caracteristica_modelo = id_caracteristica_modelo;
    }

    public String getNome_modelo() {
        return nome_modelo;
    }

    public void setNome_modelo(String nome_modelo) {
        this.nome_modelo = nome_modelo;
    }

    public String getTipo_modelo() {
        return tipo_modelo;
    }

    public void setTipo_modelo(String tipo_modelo) {
        this.tipo_modelo = tipo_modelo;
    }

    public String getVersao_modelo() {
        return versao_modelo;
    }

    public void setVersao_modelo(String versao_modelo) {
        this.versao_modelo = versao_modelo;
    }

    @Override
    public String mostrarDados() {
        return super.mostrarDados();  }

    
}
