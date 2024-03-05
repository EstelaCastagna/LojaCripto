package Classes;

public class Cambios {

    private int id_cambio;
    private String tipo_cambio;

    public Cambios() {
    }

    public Cambios(int id_cambio, String tipo_cambio) {
        this.id_cambio = id_cambio;
        this.tipo_cambio = tipo_cambio;
    }

    public int getId_cambio() {
        return id_cambio;
    }

    public void setId_cambio(int id_cambio) {
        this.id_cambio = id_cambio;
    }

    public String getTipo_cambio() {
        return tipo_cambio;
    }

    public void setTipo_cambio(String tipo_cambio) {
        this.tipo_cambio = tipo_cambio;
    }

}
