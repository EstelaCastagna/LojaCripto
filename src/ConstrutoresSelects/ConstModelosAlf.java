package ConstrutoresSelects;

import Classes.Marcas;
import Classes.Modelos;
import Classes.Veiculos;

public class ConstModelosAlf {

    private int id_modelo;
    private String nome_marca;
    private String nome_modelo;
    private String versao_modelo;
    private String status_veiculo;

    public ConstModelosAlf(int id_modelo, String nome_marca, String nome_modelo, String versao_modelo, String status_veiculo) {
        this.id_modelo = id_modelo;
        this.nome_marca = nome_marca;
        this.nome_modelo = nome_modelo;
        this.versao_modelo = versao_modelo;
        this.status_veiculo = status_veiculo;
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

    public String getStatus_veiculo() {
        return status_veiculo;
    }

    public void setStatus_veiculo(String status_veiculo) {
        this.status_veiculo = status_veiculo;
    }

   

}
