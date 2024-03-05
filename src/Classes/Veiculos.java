package Classes;

public class Veiculos extends MostrarDados{

    private int id_veiculo;
    private String chassi_veiculo;
    private int id_modelo;
    private int id_cor;
    private int id_ano_fabricacao;
    private int id_ano_modelo;
    private int id_combustivel;
    private int id_cambio;
    private String status_veiculo;
    private float preco_veiculo;

    public Veiculos() {
    }

    public Veiculos(int id_veiculo, String status_veiculo) {
        this.id_veiculo = id_veiculo;
        this.status_veiculo = status_veiculo;
    }

    

    public Veiculos(int id_veiculo, String chassi_veiculo, int id_modelo, int id_cor, int id_ano_fabricacao, int id_ano_modelo, int id_combustivel, int id_cambio, String status_veiculo, float preco_veiculo) {
        this.id_veiculo = id_veiculo;
        this.chassi_veiculo = chassi_veiculo;
        this.id_modelo = id_modelo;
        this.id_cor = id_cor;
        this.id_ano_fabricacao = id_ano_fabricacao;
        this.id_ano_modelo = id_ano_modelo;
        this.id_combustivel = id_combustivel;
        this.id_cambio = id_cambio;
        this.status_veiculo = status_veiculo;
        this.preco_veiculo = preco_veiculo;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public String getChassi_veiculo() {
        return chassi_veiculo;
    }

    public void setChassi_veiculo(String chassi_veiculo) {
        this.chassi_veiculo = chassi_veiculo;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public int getId_cor() {
        return id_cor;
    }

    public void setId_cor(int id_cor) {
        this.id_cor = id_cor;
    }

    public int getId_ano_fabricacao() {
        return id_ano_fabricacao;
    }

    public void setId_ano_fabricacao(int id_ano_fabricacao) {
        this.id_ano_fabricacao = id_ano_fabricacao;
    }

    public int getId_ano_modelo() {
        return id_ano_modelo;
    }

    public void setId_ano_modelo(int id_ano_modelo) {
        this.id_ano_modelo = id_ano_modelo;
    }

    public int getId_combustivel() {
        return id_combustivel;
    }

    public void setId_combustivel(int id_combustivel) {
        this.id_combustivel = id_combustivel;
    }

    public int getId_cambio() {
        return id_cambio;
    }

    public void setId_cambio(int id_cambio) {
        this.id_cambio = id_cambio;
    }

    public String getStatus_veiculo() {
        return status_veiculo;
    }

    public void setStatus_veiculo(String status_veiculo) {
        this.status_veiculo = status_veiculo;
    }

    public float getPreco_veiculo() {
        return preco_veiculo;
    }

    public void setPreco_veiculo(float preco_veiculo) {
        this.preco_veiculo = preco_veiculo;
    }

    @Override
    public String mostrarDados() {
        return super.mostrarDados(); 
    }

    
}
