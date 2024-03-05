package Classes;

public class Perfis extends MostrarDados {

    private int id_perfil;
    private String tipo_perfil;
    private String nome_perfil;
    private String cpf_perfil;
    private String rg_perfil;
    private String telefone_perfil;

    public Perfis() {
    }

    public Perfis(int id_perfil, String tipo_perfil, String nome_perfil, String cpf_perfil, String rg_perfil, String telefone_perfil) {
        this.id_perfil = id_perfil;
        this.tipo_perfil = tipo_perfil;
        this.nome_perfil = nome_perfil;
        this.cpf_perfil = cpf_perfil;
        this.rg_perfil = rg_perfil;
        this.telefone_perfil = telefone_perfil;
    }

    public Perfis(int id_perfil, String tipo_perfil, String nome_perfil) {
        this.id_perfil = id_perfil;
        this.tipo_perfil = tipo_perfil;
        this.nome_perfil = nome_perfil;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getTipo_perfil() {
        return tipo_perfil;
    }

    public void setTipo_perfil(String tipo_perfil) {
        this.tipo_perfil = tipo_perfil;
    }

    public String getNome_perfil() {
        return nome_perfil;
    }

    public void setNome_perfil(String nome_perfil) {
        this.nome_perfil = nome_perfil;
    }

    public String getCpf_perfil() {
        return cpf_perfil;
    }

    public void setCpf_perfil(String cpf_perfil) {
        this.cpf_perfil = cpf_perfil;
    }

    public String getRg_perfil() {
        return rg_perfil;
    }

    public void setRg_perfil(String rg_perfil) {
        this.rg_perfil = rg_perfil;
    }

    public String getTelefone_perfil() {
        return telefone_perfil;
    }

    public void setTelefone_perfil(String telefone_perfil) {
        this.telefone_perfil = telefone_perfil;
    }

    @Override
    public String mostrarDados() {

        return "ID: " + getId_perfil() + " | Nome: " + getNome_perfil() + " | CPF: " + getCpf_perfil();

    }

}
