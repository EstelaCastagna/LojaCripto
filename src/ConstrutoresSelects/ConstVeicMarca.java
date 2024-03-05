package ConstrutoresSelects;


public class ConstVeicMarca {
    

        private int id_veiculo;
        private String chassi_veiculo;
        private String nome_marca;
        private String nome_modelo;
        private String versao_modelo;
        private String nome_cor;
        private String status_veiculo;

    public ConstVeicMarca(int id_veiculo, String chassi_veiculo, String nome_modelo, String nome_marca, String nome_cor, String status_veiculo) {
        this.id_veiculo = id_veiculo;
        this.chassi_veiculo = chassi_veiculo;
        this.nome_modelo = nome_modelo;
        this.nome_marca = nome_marca;
        this.nome_cor = nome_cor;
        this.status_veiculo = status_veiculo;
    }

    public ConstVeicMarca(int id_veiculo, String chassi_veiculo, String nome_marca, String nome_modelo, String versao_modelo, String nome_cor, String status_veiculo) {
        this.id_veiculo = id_veiculo;
        this.chassi_veiculo = chassi_veiculo;
        this.nome_marca = nome_marca;
        this.nome_modelo = nome_modelo;
        this.versao_modelo = versao_modelo;
        this.nome_cor = nome_cor;
        this.status_veiculo = status_veiculo;
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

    public String getNome_cor() {
        return nome_cor;
    }

    public void setNome_cor(String nome_cor) {
        this.nome_cor = nome_cor;
    }

    public String getStatus_veiculo() {
        return status_veiculo;
    }

    public void setStatus_veiculo(String status_veiculo) {
        this.status_veiculo = status_veiculo;
    }
    
    
}
