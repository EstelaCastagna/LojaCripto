package ConstrutoresSelects;


public class ConstVenda {
    
    private int id_veiculo;
    private String nome_modelo;
    private int id_cliente;
    private String nome_perfil;

    public ConstVenda() {
    }

    public ConstVenda(int id_veiculo, String nome_modelo, int id_cliente, String nome_perfil) {
        this.id_veiculo = id_veiculo;
        this.nome_modelo = nome_modelo;
        this.id_cliente = id_cliente;
        this.nome_perfil = nome_perfil;
    }

    public String getNome_perfil() {
        return nome_perfil;
    }

    public void setNome_perfil(String nome_perfil) {
        this.nome_perfil = nome_perfil;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public String getNome_modelo() {
        return nome_modelo;
    }

    public void setNome_modelo(String nome_modelo) {
        this.nome_modelo = nome_modelo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
}
