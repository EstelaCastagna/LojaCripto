package Classes;

public class Usuarios extends Perfis {

    private int id_usuario;
    private int id_perfil;
    private String login_usuario;
    private String senha_usuario;

    public Usuarios() {
    }

    public Usuarios(int id_usuario, int id_perfil, String login_usuario, String senha_usuario) {
        this.id_usuario = id_usuario;
        this.id_perfil = id_perfil;
        this.login_usuario = login_usuario;
        this.senha_usuario = senha_usuario;
    }

    public Usuarios(int id_usuario, String login_usuario, String senha_usuario, int id_perfil, String tipo_perfil, String nome_perfil) {
        super(id_perfil, tipo_perfil, nome_perfil);
        this.id_usuario = id_usuario;
        this.login_usuario = login_usuario;
        this.senha_usuario = senha_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getLogin_usuario() {
        return login_usuario;
    }

    public void setLogin_usuario(String login_usuario) {
        this.login_usuario = login_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    @Override
    public void setNome_perfil(String nome_perfil) {
        super.setNome_perfil(nome_perfil); 
    }

    @Override
    public String getNome_perfil() {
        return super.getNome_perfil(); 
    }

    @Override
    public void setTipo_perfil(String tipo_perfil) {
        super.setTipo_perfil(tipo_perfil); 
    }

    @Override
    public String getTipo_perfil() {
        return super.getTipo_perfil(); 
    }
    
    

}
