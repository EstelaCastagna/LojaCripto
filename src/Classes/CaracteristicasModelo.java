package Classes;

public class CaracteristicasModelo extends MostrarDados {

    private int id_caracteristica_modelo;
    private String especie_caracteristica_modelo;
    private String carroceria_caracteristica_modelo;
    private String motor_caracteristica_modelo;
    private String potencia_caracteristica_modelo;
    private String lotacao_caracteristica_modelo;

    public CaracteristicasModelo() {
    }

    public CaracteristicasModelo(int id_caracteristica_modelo, String especie_caracteristica_modelo, String carroceria_caracteristica_modelo, String motor_caracteristica_modelo, String potencia_caracteristica_modelo, String lotacao_caracteristica_modelo) {
        this.id_caracteristica_modelo = id_caracteristica_modelo;
        this.especie_caracteristica_modelo = especie_caracteristica_modelo;
        this.carroceria_caracteristica_modelo = carroceria_caracteristica_modelo;
        this.motor_caracteristica_modelo = motor_caracteristica_modelo;
        this.potencia_caracteristica_modelo = potencia_caracteristica_modelo;
        this.lotacao_caracteristica_modelo = lotacao_caracteristica_modelo;
    }

    public int getId_caracteristica_modelo() {
        return id_caracteristica_modelo;
    }

    public void setId_caracteristica_modelo(int id_caracteristica_modelo) {
        this.id_caracteristica_modelo = id_caracteristica_modelo;
    }

    public String getEspecie_caracteristica_modelo() {
        return especie_caracteristica_modelo;
    }

    public void setEspecie_caracteristica_modelo(String especie_caracteristica_modelo) {
        this.especie_caracteristica_modelo = especie_caracteristica_modelo;
    }

    public String getCarroceria_caracteristica_modelo() {
        return carroceria_caracteristica_modelo;
    }

    public void setCarroceria_caracteristica_modelo(String carroceria_caracteristica_modelo) {
        this.carroceria_caracteristica_modelo = carroceria_caracteristica_modelo;
    }

    public String getMotor_caracteristica_modelo() {
        return motor_caracteristica_modelo;
    }

    public void setMotor_caracteristica_modelo(String motor_caracteristica_modelo) {
        this.motor_caracteristica_modelo = motor_caracteristica_modelo;
    }

    public String getPotencia_caracteristica_modelo() {
        return potencia_caracteristica_modelo;
    }

    public void setPotencia_caracteristica_modelo(String potencia_caracteristica_modelo) {
        this.potencia_caracteristica_modelo = potencia_caracteristica_modelo;
    }

    public String getLotacao_caracteristica_modelo() {
        return lotacao_caracteristica_modelo;
    }

    public void setLotacao_caracteristica_modelo(String lotacao_caracteristica_modelo) {
        this.lotacao_caracteristica_modelo = lotacao_caracteristica_modelo;
    }

    @Override
    public String mostrarDados() {
        return super.mostrarDados(); 
    }

    
    
}
