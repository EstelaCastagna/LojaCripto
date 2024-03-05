package Classes;

public class Clientes {

    private int id_cliente;
    private String cep_cliente;
    private String telefone_cliente;
    private String logradouro_cliente;
    private String numero_casa_cliente;
    private String bairro_cliente;
    private String cidade_cliente;
    private String estado_cliente;
    private String pais_cliente;

    public Clientes() {
    }


    public Clientes(int id_cliente, String cep_cliente, String telefone_cliente, String logradouro_cliente, String numero_casa_cliente, String bairro_cliente, String cidade_cliente, String estado_cliente, String pais_cliente) {
        this.id_cliente = id_cliente;
        this.cep_cliente = cep_cliente;
        this.telefone_cliente = telefone_cliente;
        this.logradouro_cliente = logradouro_cliente;
        this.numero_casa_cliente = numero_casa_cliente;
        this.bairro_cliente = bairro_cliente;
        this.cidade_cliente = cidade_cliente;
        this.estado_cliente = estado_cliente;
        this.pais_cliente = pais_cliente;
    }

    public Clientes(String telefone_cliente, String cep_cliente) {
        this.telefone_cliente = telefone_cliente;
        this.cep_cliente = cep_cliente;
    }
   

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCep_cliente() {
        return cep_cliente;
    }

    public void setCep_cliente(String cep_cliente) {
        this.cep_cliente = cep_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public String getLogradouro_cliente() {
        return logradouro_cliente;
    }

    public void setLogradouro_cliente(String logradouro_cliente) {
        this.logradouro_cliente = logradouro_cliente;
    }

    public String getNumero_casa_cliente() {
        return numero_casa_cliente;
    }

    public void setNumero_casa_cliente(String numero_casa_cliente) {
        this.numero_casa_cliente = numero_casa_cliente;
    }

    public String getBairro_cliente() {
        return bairro_cliente;
    }

    public void setBairro_cliente(String bairro_cliente) {
        this.bairro_cliente = bairro_cliente;
    }

    public String getCidade_cliente() {
        return cidade_cliente;
    }

    public void setCidade_cliente(String cidade_cliente) {
        this.cidade_cliente = cidade_cliente;
    }

    public String getEstado_cliente() {
        return estado_cliente;
    }

    public void setEstado_cliente(String estado_cliente) {
        this.estado_cliente = estado_cliente;
    }

    public String getPais_cliente() {
        return pais_cliente;
    }

    public void setPais_cliente(String pais_cliente) {
        this.pais_cliente = pais_cliente;
    }

}
