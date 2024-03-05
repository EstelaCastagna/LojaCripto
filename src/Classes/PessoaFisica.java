package Classes;

public class PessoaFisica extends Clientes{

    private int id_pessoa_fisica;
    private int id_clientef;
    private String nome_pessoa_fisica;
    private String sobrenome_pessoa_fisica;
    private String cpf_pessoa_fisica;
    private String rg_pessoa_fisica;
    private String data_nascimento_pessoa_fisica;

    public PessoaFisica() {
    }
    
    public PessoaFisica(int id_pessoa_fisica, int id_clientef, String nome_pessoa_fisica, String sobrenome_pessoa_fisica, String cpf_pessoa_fisica, String rg_pessoa_fisica, String data_nascimento_pessoa_fisica, int id_cliente, String cep_cliente, String telefone_cliente, String logradouro_cliente, String numero_casa_cliente, String bairro_cliente, String cidade_cliente, String estado_cliente, String pais_cliente) {
        super(id_cliente, cep_cliente, telefone_cliente, logradouro_cliente, numero_casa_cliente, bairro_cliente, cidade_cliente, estado_cliente, pais_cliente);
        this.id_pessoa_fisica = id_pessoa_fisica;
        this.id_clientef = id_clientef;
        this.nome_pessoa_fisica = nome_pessoa_fisica;
        this.sobrenome_pessoa_fisica = sobrenome_pessoa_fisica;
        this.cpf_pessoa_fisica = cpf_pessoa_fisica;
        this.rg_pessoa_fisica = rg_pessoa_fisica;
        this.data_nascimento_pessoa_fisica = data_nascimento_pessoa_fisica;
    }

    
    
    public PessoaFisica(int id_pessoa_fisica, int id_clientef, String nome_pessoa_fisica, String sobrenome_pessoa_fisica, String cpf_pessoa_fisica, String rg_pessoa_fisica, String data_nascimento_pessoa_fisica) {
        this.id_pessoa_fisica = id_pessoa_fisica;
        this.id_clientef = id_clientef;
        this.nome_pessoa_fisica = nome_pessoa_fisica;
        this.sobrenome_pessoa_fisica = sobrenome_pessoa_fisica;
        this.cpf_pessoa_fisica = cpf_pessoa_fisica;
        this.rg_pessoa_fisica = rg_pessoa_fisica;
        this.data_nascimento_pessoa_fisica = data_nascimento_pessoa_fisica;
    }

    
    public int getId_pessoa_fisica() {
        return id_pessoa_fisica;
    }

    public void setId_pessoa_fisica(int id_pessoa_fisica) {
        this.id_pessoa_fisica = id_pessoa_fisica;
    }

    public int getId_clientef() {
        return id_clientef;
    }

    public void setId_clientef(int id_clientef) {
        this.id_clientef = id_clientef;
    }

    public String getNome_pessoa_fisica() {
        return nome_pessoa_fisica;
    }

    public void setNome_pessoa_fisica(String nome_pessoa_fisica) {
        this.nome_pessoa_fisica = nome_pessoa_fisica;
    }

    public String getSobrenome_pessoa_fisica() {
        return sobrenome_pessoa_fisica;
    }

    public void setSobrenome_pessoa_fisica(String sobrenome_pessoa_fisica) {
        this.sobrenome_pessoa_fisica = sobrenome_pessoa_fisica;
    }

    public String getCpf_pessoa_fisica() {
        return cpf_pessoa_fisica;
    }

    public void setCpf_pessoa_fisica(String cpf_pessoa_fisica) {
        this.cpf_pessoa_fisica = cpf_pessoa_fisica;
    }

    public String getRg_pessoa_fisica() {
        return rg_pessoa_fisica;
    }

    public void setRg_pessoa_fisica(String rg_pessoa_fisica) {
        this.rg_pessoa_fisica = rg_pessoa_fisica;
    }

    public String getData_nascimento_pessoa_fisica() {
        return data_nascimento_pessoa_fisica;
    }

    public void setData_nascimento_pessoa_fisica(String data_nascimento_pessoa_fisica) {
        this.data_nascimento_pessoa_fisica = data_nascimento_pessoa_fisica;
    }

    public String mostrarDados (){
        
        return"ID:"+getId_pessoa_fisica()+" | "+"Nome: "+getNome_pessoa_fisica()+" "+getSobrenome_pessoa_fisica()+" | CPF: "+getCpf_pessoa_fisica()+"\n";
    }

}
