package Classes;

public class CompraVeiculo {

    private int id_compra_veiculo;
    private int id_cliente;
    private int id_veiculo;
    private int id_usuario;
    private String renavam_compra_veiculo;
    private String crlv_compra_veiculo;
    private String nota_fiscal_compra_veiculo;

    public CompraVeiculo() {
    }

    public CompraVeiculo(int id_compra_veiculo, int id_cliente, int id_veiculo, int id_usuario, String renavam_compra_veiculo, String crlv_compra_veiculo, String nota_fiscal_compra_veiculo) {
        this.id_compra_veiculo = id_compra_veiculo;
        this.id_cliente = id_cliente;
        this.id_veiculo = id_veiculo;
        this.id_usuario = id_usuario;
        this.renavam_compra_veiculo = renavam_compra_veiculo;
        this.crlv_compra_veiculo = crlv_compra_veiculo;
        this.nota_fiscal_compra_veiculo = nota_fiscal_compra_veiculo;
    }

    public int getId_compra_veiculo() {
        return id_compra_veiculo;
    }

    public void setId_compra_veiculo(int id_compra_veiculo) {
        this.id_compra_veiculo = id_compra_veiculo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getRenavam_compra_veiculo() {
        return renavam_compra_veiculo;
    }

    public void setRenavam_compra_veiculo(String renavam_compra_veiculo) {
        this.renavam_compra_veiculo = renavam_compra_veiculo;
    }

    public String getCrlv_compra_veiculo() {
        return crlv_compra_veiculo;
    }

    public void setCrlv_compra_veiculo(String crlv_compra_veiculo) {
        this.crlv_compra_veiculo = crlv_compra_veiculo;
    }

    public String getNota_fiscal_compra_veiculo() {
        return nota_fiscal_compra_veiculo;
    }

    public void setNota_fiscal_compra_veiculo(String nota_fiscal_compra_veiculo) {
        this.nota_fiscal_compra_veiculo = nota_fiscal_compra_veiculo;
    }

}
