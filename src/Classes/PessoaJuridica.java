package Classes;

public class PessoaJuridica extends Clientes{

    private int id_pessoa_juridica;
    private int id_clientej;
    private String nome_fantasia_pessoa_juridica;
    private String razao_social_pessoa_juridica;
    private String cnpj_pessoa_juridica;
    private String inscricao_estadual_pessoa_juridica;
    private String contrato_social_pessoa_juridica;

    public PessoaJuridica() {
       
    }

    public PessoaJuridica(int id_pessoa_juridica, int id_clientej, String nome_fantasia_pessoa_juridica, String razao_social_pessoa_juridica, String cnpj_pessoa_juridica, String inscricao_estadual_pessoa_juridica, String contrato_social_pessoa_juridica, int id_cliente, String cep_cliente, String telefone_cliente, String logradouro_cliente, String numero_casa_cliente, String bairro_cliente, String cidade_cliente, String estado_cliente, String pais_cliente) {
        super(id_cliente, cep_cliente, telefone_cliente, logradouro_cliente, numero_casa_cliente, bairro_cliente, cidade_cliente, estado_cliente, pais_cliente);
        this.id_pessoa_juridica = id_pessoa_juridica;
        this.id_clientej = id_clientej;
        this.nome_fantasia_pessoa_juridica = nome_fantasia_pessoa_juridica;
        this.razao_social_pessoa_juridica = razao_social_pessoa_juridica;
        this.cnpj_pessoa_juridica = cnpj_pessoa_juridica;
        this.inscricao_estadual_pessoa_juridica = inscricao_estadual_pessoa_juridica;
        this.contrato_social_pessoa_juridica = contrato_social_pessoa_juridica;
    }
    
    

    public PessoaJuridica(int id_pessoa_juridica, int id_clientej, String nome_fantasia_pessoa_juridica, String razao_social_pessoa_juridica, String cnpj_pessoa_juridica, String inscricao_estadual_pessoa_juridica, String contrato_social_pessoa_juridica) {
        this.id_pessoa_juridica = id_pessoa_juridica;
        this.id_clientej = id_clientej;
        this.nome_fantasia_pessoa_juridica = nome_fantasia_pessoa_juridica;
        this.razao_social_pessoa_juridica = razao_social_pessoa_juridica;
        this.cnpj_pessoa_juridica = cnpj_pessoa_juridica;
        this.inscricao_estadual_pessoa_juridica = inscricao_estadual_pessoa_juridica;
        this.contrato_social_pessoa_juridica = contrato_social_pessoa_juridica;
    }

   

    public int getId_pessoa_juridica() {
        return id_pessoa_juridica;
    }

    public void setId_pessoa_juridica(int id_pessoa_juridica) {
        this.id_pessoa_juridica = id_pessoa_juridica;
    }

    public int getId_cliente() {
        return id_clientej;
    }

    public void setId_cliente(int id_cliente) {
        this.id_clientej = id_cliente;
    }

    public String getNome_fantasia_pessoa_juridica() {
        return nome_fantasia_pessoa_juridica;
    }

    public void setNome_fantasia_pessoa_juridica(String nome_fantasia_pessoa_juridica) {
        this.nome_fantasia_pessoa_juridica = nome_fantasia_pessoa_juridica;
    }

    public String getRazao_social_pessoa_juridica() {
        return razao_social_pessoa_juridica;
    }

    public void setRazao_social_pessoa_juridica(String razao_social_pessoa_juridica) {
        this.razao_social_pessoa_juridica = razao_social_pessoa_juridica;
    }

    public String getCnpj_pessoa_juridica() {
        return cnpj_pessoa_juridica;
    }

    public void setCnpj_pessoa_juridica(String cnpj_pessoa_juridica) {
        this.cnpj_pessoa_juridica = cnpj_pessoa_juridica;
    }

    public String getInscricao_estadual_pessoa_juridica() {
        return inscricao_estadual_pessoa_juridica;
    }

    public void setInscricao_estadual_pessoa_juridica(String inscricao_estadual_pessoa_juridica) {
        this.inscricao_estadual_pessoa_juridica = inscricao_estadual_pessoa_juridica;
    }

    public String getContrato_social_pessoa_juridica() {
        return contrato_social_pessoa_juridica;
    }

    public void setContrato_social_pessoa_juridica(String contrato_social_pessoa_juridica) {
        this.contrato_social_pessoa_juridica = contrato_social_pessoa_juridica;
    }

    public String mostrarDados (){
        
        return"ID:"+getId_pessoa_juridica()+" | "+"Nome Fantasia: "+getNome_fantasia_pessoa_juridica()+" | CNPJ: "+getCnpj_pessoa_juridica()+" | ID Endereço: "+getId_cliente()+"\n";
    }
}
    

