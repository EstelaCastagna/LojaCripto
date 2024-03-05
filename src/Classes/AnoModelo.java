/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author escastagna
 */
public class AnoModelo {
    

    private int id_ano_modelo;
    private int ano_modelo;

    public AnoModelo() {
    }

    public AnoModelo(int id_ano_modelo, int ano_modelo) {
        this.id_ano_modelo = id_ano_modelo;
        this.ano_modelo = ano_modelo;
    }

    public int getId_ano_modelo() {
        return id_ano_modelo;
    }

    public void setId_ano_modelo(int id_ano_modelo) {
        this.id_ano_modelo = id_ano_modelo;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

}