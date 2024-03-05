package DatabaseConnection;

import Classes.AnoFabricacao;
import Classes.AnoModelo;
import Classes.Cambios;
import Classes.CaracteristicasModelo;
import Classes.Clientes;
import Classes.Combustiveis;
import Classes.CompraVeiculo;
import Classes.Cores;
import Classes.Marcas;
import Classes.Modelos;
import Classes.Perfis;
import Classes.PessoaFisica;
import Classes.PessoaJuridica;
import Classes.Usuarios;
import Classes.Veiculos;
import ConstrutoresSelects.ConstEstoque;
import ConstrutoresSelects.ConstMarcasAlf;
import ConstrutoresSelects.ConstModelosAlf;
import ConstrutoresSelects.ConstVeicMarca;
import ConstrutoresSelects.ConstVeicModel;
import ConstrutoresSelects.ConstVenda;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    //Colocar o nome do banco de dados que você criou
    private static final String URL = "jdbc:mysql://localhost:3306/lojaVeiculosC";
    //Colocar o usuario que loga no MySQL Workbench
    private static final String USER = "root";
    //Colocar a senha que loga no MySQL Workbench
    private static final String PASSWORD = "";

    //Método que faz a conexão com o banco de dados
    public static Connection GetConnection() {
        try {
            //Classe importada para usar o banco, sempre será usado no JAVA
            System.out.println("Funcionou");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Erro de conexão");
            throw new RuntimeException(e);
        } finally {

        }
    }

    //PERFIL
    public void createPerfis(Perfis perfil) {
        String query = "INSERT INTO perfil (tipo_perfil, nome_perfil, cpf_perfil, rg_perfil, telefone_perfil) VALUES (?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, perfil.getTipo_perfil());
            stmt.setString(2, perfil.getNome_perfil());
            stmt.setString(3, perfil.getCpf_perfil());
            stmt.setString(4, perfil.getRg_perfil());
            stmt.setString(5, perfil.getTelefone_perfil());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Perfis> readAllPerfis() {
        ArrayList<Perfis> perfis = new ArrayList<>();
        String query = "SELECT * FROM perfil";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                perfis.add(new Perfis(rs.getInt("id_perfil"), rs.getString("tipo_perfil"), rs.getString("nome_perfil"), rs.getString("cpf_perfil"), rs.getString("rg_perfil"), rs.getString("telefone_perfil")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return perfis;
    }

    public ArrayList<Perfis> readAllPerfisUsers() {
        ArrayList<Perfis> perfisUsers = new ArrayList<>();
        String query = "SELECT * FROM perfil INNER JOIN usuarios ON perfil.id_perfil = usuarios.id_perfil";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                perfisUsers.add(new Perfis(rs.getInt("id_perfil"), rs.getString("tipo_perfil"), rs.getString("nome_perfil"), rs.getString("cpf_perfil"), rs.getString("rg_perfil"), rs.getString("telefone_perfil")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return perfisUsers;
    }

    public void updatePerfis(Perfis perfil, int id) {
        String query = "UPDATE perfil SET tipo_perfil = ?, nome_perfil = ?, cpf_perfil = ?, rg_perfil = ?, telefone_perfil = ? WHERE id_perfil = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, perfil.getTipo_perfil());
            stmt.setString(2, perfil.getNome_perfil());
            stmt.setString(3, perfil.getCpf_perfil());
            stmt.setString(4, perfil.getRg_perfil());
            stmt.setString(5, perfil.getTelefone_perfil());
            stmt.setInt(6, perfil.getId_perfil());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePerfis(int id_perfil) {
    String deleteUsuariosQuery = "DELETE FROM usuarios WHERE id_perfil = ?";
    String deletePerfilQuery = "DELETE FROM perfil WHERE id_perfil = ?";

    try (Connection conn = GetConnection(); 
         PreparedStatement stmtUsuarios = conn.prepareStatement(deleteUsuariosQuery);
         PreparedStatement stmtPerfil = conn.prepareStatement(deletePerfilQuery)) {

        conn.setAutoCommit(false);

        
        stmtUsuarios.setInt(1, id_perfil);
        stmtUsuarios.execute();

        
        stmtPerfil.setInt(1, id_perfil);
        stmtPerfil.execute();

        conn.commit();

     } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}

    //USUARIOS
  
        public void createUsuarios(Usuarios usuario) {
    String senha = usuario.getSenha_usuario();
    String query = "INSERT INTO usuarios (id_perfil, login_usuario, senha_usuario) VALUES (?, ?, ?)";
    
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));

        StringBuilder sb = new StringBuilder();
        for (byte b : messageDigest) {
            sb.append(String.format("%02X", 0xFF & b));
        }
        String senhaHex = sb.toString();

        try (Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, usuario.getId_perfil());
            stmt.setString(2, usuario.getLogin_usuario());
            stmt.setString(3, senhaHex);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
        Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    public ArrayList<Usuarios> readAllUsuarios() {
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                usuarios.add(new Usuarios(rs.getInt("id_usuario"), rs.getInt("id_perfil"), rs.getString("login_usuario"), rs.getString("senha_usuario")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuarios;
    }

    public ArrayList<Usuarios> readLogin() {
        ArrayList<Usuarios> login = new ArrayList<>();
        String query = "select u.id_usuario, u.login_usuario, u.senha_usuario, u.id_perfil,p.tipo_perfil, p.nome_perfil\n"
                + "from usuarios as u inner join perfil as p on p.id_perfil=u.id_perfil";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                login.add(new Usuarios(rs.getInt("id_usuario"), rs.getString("login_usuario"), rs.getString("senha_usuario"), rs.getInt("id_perfil"), rs.getString("tipo_perfil"), rs.getString("nome_perfil")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return login;
    }

    public void updateUsuarios(Usuarios usuario, int id) {
        String query = "UPDATE usuarios SET login_usuario = ?, senha_usuario = ? WHERE id_usuario = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, usuario.getLogin_usuario());
            stmt.setString(2, usuario.getSenha_usuario());
            stmt.setInt(3, usuario.getId_usuario());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteUsuarios(int id_usuario) {
        String query = "DELETE  perfil, usuarios FROM usuarios INNER JOIN perfil ON perfil.id_perfil = usuarios.id_perfil WHERE perfil.id_perfil = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_usuario);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //MARCAS
    public void createMarcas(Marcas marca) {
        String query = "INSERT INTO marcas (nome_marca) VALUES (?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, marca.getNome_marca());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Marcas> readAllMarcas() {
        ArrayList<Marcas> marcas = new ArrayList<>();
        String query = "SELECT * FROM marcas";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                marcas.add(new Marcas(rs.getInt("id_marca"), rs.getString("nome_marca")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return marcas;
    }

    public ArrayList<ConstMarcasAlf> readMarcasAlf() {
        ArrayList<ConstMarcasAlf> marcasAlf = new ArrayList<>();
        String query = "SELECT marcas.id_marca, marcas.nome_marca, modelos.nome_modelo, modelos.versao_modelo,\n"
                + "veiculos.status_veiculo from marcas inner join modelos on marcas.id_marca = modelos.id_marca\n"
                + "inner join veiculos on modelos.id_modelo = veiculos.id_modelo order by marcas.nome_marca, modelos.nome_modelo;";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                marcasAlf.add(new ConstMarcasAlf(rs.getInt("id_marca"), rs.getString("nome_marca"), rs.getString("nome_modelo"), rs.getString("versao_modelo"), rs.getString("status_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return marcasAlf;
    }

    public void updateMarcas(Marcas marca, int id) {
        String query = "UPDATE marcas SET nome_marca = ? WHERE id_marca = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, marca.getNome_marca());
            stmt.setInt(2, marca.getId_marca());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteMarcas(int id_marca) {
        String query = "DELETE FROM marcas WHERE id_marca = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_marca);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //CARACTERISTICAS_MODELO
    public void createCaracModelo(CaracteristicasModelo caracModelo) {
        String query = "INSERT INTO caracteristicas_modelo (especie_caracteristica_modelo, carroceria_caracteristica_modelo, motor_caracteristica_modelo, potencia_caracteristica_modelo, lotacao_caracteristica_modelo) VALUES (?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, caracModelo.getEspecie_caracteristica_modelo());
            stmt.setString(2, caracModelo.getCarroceria_caracteristica_modelo());
            stmt.setString(3, caracModelo.getMotor_caracteristica_modelo());
            stmt.setString(4, caracModelo.getPotencia_caracteristica_modelo());
            stmt.setString(5, caracModelo.getLotacao_caracteristica_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<CaracteristicasModelo> readAllCaracModelo() {
        ArrayList<CaracteristicasModelo> caracModelo = new ArrayList<>();
        String query = "SELECT * FROM caracteristicas_modelo";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                caracModelo.add(new CaracteristicasModelo(rs.getInt("id_caracteristica_modelo"), rs.getString("especie_caracteristica_modelo"), rs.getString("carroceria_caracteristica_modelo"), rs.getString("motor_caracteristica_modelo"), rs.getString("potencia_caracteristica_modelo"), rs.getString("lotacao_caracteristica_modelo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return caracModelo;
    }

    public void updateCaracModelo(CaracteristicasModelo caracModelo, int id) {
        String query = "UPDATE caracteristica_modelo SET especie_caracteristica_modelo = ?, carroceria_caracteristica_modelo = ?, motor_caracteristica_modelo = ?, potencia_caracteristica_modelo = ?, lotacao_caracteristica_modelo = ? WHERE id_caracteristica_modelo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, caracModelo.getEspecie_caracteristica_modelo());
            stmt.setString(2, caracModelo.getCarroceria_caracteristica_modelo());
            stmt.setString(3, caracModelo.getMotor_caracteristica_modelo());
            stmt.setString(4, caracModelo.getPotencia_caracteristica_modelo());
            stmt.setString(5, caracModelo.getLotacao_caracteristica_modelo());
            stmt.setInt(6, caracModelo.getId_caracteristica_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCaracModelo(int id_caracteristica_modelo) {
        String query = "DELETE FROM caracteristicas_modelo WHERE id_caracteristica_modelo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_caracteristica_modelo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //MODELOS
    public void createModelos(Modelos modelo) {
        String query = "INSERT INTO modelos (id_marca, id_caracteristica_modelo, nome_modelo, tipo_modelo, versao_modelo) VALUES (?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, modelo.getId_marca());
            stmt.setInt(2, modelo.getId_caracteristica_modelo());
            stmt.setString(3, modelo.getNome_modelo());
            stmt.setString(4, modelo.getTipo_modelo());
            stmt.setString(5, modelo.getVersao_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Modelos> readAllModelos() {

        ArrayList<Modelos> modelos = new ArrayList<>();
        String query = "SELECT * FROM modelos";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                modelos.add(new Modelos(rs.getInt("id_modelo"), rs.getInt("id_marca"), rs.getInt("id_caracteristica_modelo"), rs.getString("nome_modelo"), rs.getString("tipo_modelo"), rs.getString("versao_modelo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return modelos;
    }

    public ArrayList<ConstModelosAlf> readModelosAlf() {

        ArrayList<ConstModelosAlf> modelosAlf = new ArrayList<>();
        String query = "select modelos.id_modelo, marcas.nome_marca, modelos.nome_modelo,modelos.versao_modelo,\n"
                + "veiculos.status_veiculo from marcas inner join modelos on marcas.id_marca = modelos.id_marca\n"
                + "inner join veiculos on modelos.id_modelo = veiculos.id_modelo order by modelos.nome_modelo";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                modelosAlf.add(new ConstModelosAlf(rs.getInt("id_modelo"), rs.getString("nome_marca"), rs.getString("nome_modelo"), rs.getString("versao_modelo"), rs.getString("status_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return modelosAlf;
    }

    public ArrayList<ConstModelosAlf> readModelosDisp() {

        ArrayList<ConstModelosAlf> modelosDisp = new ArrayList<>();
        String query = "select modelos.id_modelo, marcas.nome_marca, modelos.nome_modelo,modelos.versao_modelo,veiculos.status_veiculo\n"
                + "from marcas inner join modelos on marcas.id_marca = modelos.id_marca\n"
                + "inner join veiculos on modelos.id_modelo = veiculos.id_modelo where veiculos.status_veiculo = \"Disponível\"\n"
                + "order by modelos.nome_modelo";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                modelosDisp.add(new ConstModelosAlf(rs.getInt("id_modelo"), rs.getString("nome_marca"), rs.getString("nome_modelo"), rs.getString("versao_modelo"), rs.getString("status_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return modelosDisp;
    }

    public ArrayList<ConstModelosAlf> readModelosVend() {

        ArrayList<ConstModelosAlf> modelosVend = new ArrayList<>();
        String query = "select modelos.id_modelo, marcas.nome_marca, modelos.nome_modelo,modelos.versao_modelo,veiculos.status_veiculo\n"
                + "from marcas inner join modelos on marcas.id_marca = modelos.id_marca\n"
                + "inner join veiculos on modelos.id_modelo = veiculos.id_modelo where veiculos.status_veiculo = \"Vendido\"\n"
                + "order by modelos.nome_modelo";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                modelosVend.add(new ConstModelosAlf(rs.getInt("id_modelo"), rs.getString("nome_marca"), rs.getString("nome_modelo"), rs.getString("versao_modelo"), rs.getString("status_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return modelosVend;
    }

    public ArrayList<ConstModelosAlf> readModelosMan() {

        ArrayList<ConstModelosAlf> modelosMan = new ArrayList<>();
        String query = "select modelos.id_modelo, marcas.nome_marca, modelos.nome_modelo,modelos.versao_modelo,veiculos.status_veiculo\n"
                + "from marcas inner join modelos on marcas.id_marca = modelos.id_marca\n"
                + "inner join veiculos on modelos.id_modelo = veiculos.id_modelo where veiculos.status_veiculo = \"Em manutenção\"\n"
                + "order by modelos.nome_modelo";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                modelosMan.add(new ConstModelosAlf(rs.getInt("id_modelo"), rs.getString("nome_marca"), rs.getString("nome_modelo"), rs.getString("versao_modelo"), rs.getString("status_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return modelosMan;
    }

    public void updateModelos(Modelos modelo, int id) {
        String query = "UPDATE modelos SET nome_modelo = ?, tipo_modelo = ?, versao_modelo = ? WHERE id_modelo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, modelo.getNome_modelo());
            stmt.setString(2, modelo.getTipo_modelo());
            stmt.setString(3, modelo.getVersao_modelo());
            stmt.setInt(4, modelo.getId_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteModelos(int id_modelo) {
        String query = "DELETE FROM modelos WHERE id_modelo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_modelo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //CORES
    public void createCores(Cores cor) {
        String query = "INSERT INTO cores (nome_cor) VALUES (?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cor.getNome_cor());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Cores> readAllCores() {
        ArrayList<Cores> cores = new ArrayList<>();
        String query = "SELECT * FROM cores";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                cores.add(new Cores(rs.getInt("id_cor"), rs.getString("nome_cor")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cores;
    }

    public void updateCores(Cores cor, int id) {
        String query = "UPDATE cores SET nome_cor = ? WHERE id_cor = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cor.getNome_cor());
            stmt.setInt(2, cor.getId_cor());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCores(int id_cor) {
        String query = "DELETE FROM cores WHERE id_cor = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_cor);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //ANO_FABRICACAO
    public void createAnoFabricacao(AnoFabricacao ano_fabricacao) {
        String query = "INSERT INTO ano_fabricacao (ano_fabricacao) VALUES (?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, ano_fabricacao.getAno_fabricacao());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<AnoFabricacao> readAllAnoFabricacao() {
        ArrayList<AnoFabricacao> ano_fabricacao = new ArrayList<>();
        String query = "SELECT * FROM ano_fabricacao";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ano_fabricacao.add(new AnoFabricacao(rs.getInt("id_ano_fabricacao"), rs.getInt("ano_fabricacao")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ano_fabricacao;
    }

    public void updateAnoFabricacao(AnoFabricacao ano_fabricacao, int id) {
        String query = "UPDATE ano_fabricacao SET ano_fabricacao = ? WHERE id_ano_fabricacao = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, ano_fabricacao.getAno_fabricacao());
            stmt.setInt(2, ano_fabricacao.getId_ano_fabricacao());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAnoFabricacao(int id_ano_fabricacao) {
        String query = "DELETE FROM ano_fabricacao WHERE id_ano_fabricacao = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_ano_fabricacao);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //ANO_MODELO
    public void createAnoModelo(AnoModelo ano_modelo) {
        String query = "INSERT INTO ano_modelo (ano_modelo) VALUES (?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, ano_modelo.getAno_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<AnoModelo> readAllAnoModelo() {
        ArrayList<AnoModelo> ano_modelo = new ArrayList<>();
        String query = "SELECT * FROM ano_modelo";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ano_modelo.add(new AnoModelo(rs.getInt("id_ano_modelo"), rs.getInt("ano_modelo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ano_modelo;
    }

    public void updateAnoModelo(AnoModelo ano_modelo, int id) {
        String query = "UPDATE ano_modelo SET ano_modelo = ? WHERE id_ano_modelo= ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, ano_modelo.getAno_modelo());
            stmt.setInt(2, ano_modelo.getId_ano_modelo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAnoModelo(int id_ano_modelo) {
        String query = "DELETE FROM ano_modelo WHERE id_ano_modelo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_ano_modelo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //COMBUSTIVEIS
    public void createCombustiveis(Combustiveis combustiveis) {
        String query = "INSERT INTO combustiveis (tipo_combustivel) VALUES (?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, combustiveis.getTipo_combustivel());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Combustiveis> readAllCombustiveis() {
        ArrayList<Combustiveis> combustiveis = new ArrayList<>();
        String query = "SELECT * FROM combustiveis";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                combustiveis.add(new Combustiveis(rs.getInt("id_combustivel"), rs.getString("tipo_combustivel")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return combustiveis;
    }

    public void updateCombustiveis(Combustiveis combustiveis, int id) {
        String query = "UPDATE combustiveis SET tipo_combustivel = ? WHERE id_combustivel = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, combustiveis.getTipo_combustivel());
            stmt.setInt(2, combustiveis.getId_combustivel());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCombustiveis(int id_combustivel) {
        String query = "DELETE FROM combustiveis WHERE id_combustivel = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_combustivel);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //CAMBIOS
    public void createCambios(Cambios cambios) {
        String query = "INSERT INTO cambios (tipo_cambio) VALUES (?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cambios.getTipo_cambio());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Cambios> readAllCambios() {
        ArrayList<Cambios> cambios = new ArrayList<>();
        String query = "SELECT * FROM cambios";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                cambios.add(new Cambios(rs.getInt("id_cambio"), rs.getString("tipo_cambio")));
            }
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }

        return cambios;
    }

    public void updateCambios(Cambios cambios, int id) {

        String query = "UPDATE cambios SET tipo_cambio = ? WHERE id_cambio = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cambios.getTipo_cambio());
            stmt.setInt(2, cambios.getId_cambio());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCambios(int id_cambio) {
        String query = "DELETE FROM cambios WHERE id_cambio = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_cambio);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //VEICULOS
    public void createVeiculos(Veiculos veiculos) {
        String query = "INSERT INTO veiculos (chassi_veiculo, id_modelo, id_cor, id_ano_fabricacao, id_ano_modelo, id_combustivel, id_cambio, status_veiculo, preco_veiculo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, veiculos.getChassi_veiculo());
            stmt.setInt(2, veiculos.getId_modelo());
            stmt.setInt(3, veiculos.getId_cor());
            stmt.setInt(4, veiculos.getId_ano_fabricacao());
            stmt.setInt(5, veiculos.getId_ano_modelo());
            stmt.setInt(6, veiculos.getId_combustivel());
            stmt.setInt(7, veiculos.getId_cambio());
            stmt.setString(8, veiculos.getStatus_veiculo());
            stmt.setFloat(9, veiculos.getPreco_veiculo());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Veiculos> readAllVeiculos() {

        ArrayList<Veiculos> veiculos = new ArrayList<>();

        String query = "SELECT * FROM veiculos";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                veiculos.add(new Veiculos(rs.getInt("id_veiculo"), rs.getString("chassi_veiculo"), rs.getInt("id_modelo"), rs.getInt("id_cor"), rs.getInt("id_ano_fabricacao"), rs.getInt("id_ano_modelo"), rs.getInt("id_combustivel"), rs.getInt("id_cambio"), rs.getString("status_veiculo"), rs.getFloat("preco_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return veiculos;
    }

    public ArrayList<ConstVeicModel> readVeicModel() {

        ArrayList<ConstVeicModel> veicModel = new ArrayList<>();

        String query = "select v.id_veiculo, v.chassi_veiculo, m.id_modelo,m.nome_modelo, c.id_cor, c.nome_cor, m.versao_modelo,v.id_ano_fabricacao, v.id_ano_modelo,\n"
                + "v.id_combustivel, v.id_cambio, v.status_veiculo, v.preco_veiculo\n"
                + "from veiculos as v inner join modelos as m on v.id_modelo = m.id_modelo\n"
                + "inner join cores as c on c.id_cor = v.id_cor";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                veicModel.add(new ConstVeicModel(rs.getInt("id_veiculo"), rs.getString("chassi_veiculo"), rs.getInt("id_modelo"), rs.getString("nome_modelo"), rs.getInt("id_cor"), rs.getString("nome_cor"), rs.getString("versao_modelo"),
                        rs.getInt("id_ano_fabricacao"), rs.getInt("id_ano_modelo"), rs.getInt("id_combustivel"), rs.getInt("id_cambio"), rs.getString("status_veiculo"), rs.getFloat("preco_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return veicModel;
    }

    public ArrayList<ConstVeicModel> readVeicModelDisp() {

        ArrayList<ConstVeicModel> veicModel = new ArrayList<>();

        String query = "select v.id_veiculo, v.chassi_veiculo, m.id_modelo,m.nome_modelo, c.id_cor, c.nome_cor, m.versao_modelo,v.id_ano_fabricacao, v.id_ano_modelo,\n"
                + "v.id_combustivel, v.id_cambio, v.status_veiculo, v.preco_veiculo\n"
                + "from veiculos as v inner join modelos as m on v.id_modelo = m.id_modelo\n"
                + "inner join cores as c on c.id_cor = v.id_cor where v.status_veiculo = \"Disponível\"";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                veicModel.add(new ConstVeicModel(rs.getInt("id_veiculo"), rs.getString("chassi_veiculo"), rs.getInt("id_modelo"), rs.getString("nome_modelo"), rs.getInt("id_cor"), rs.getString("nome_cor"), rs.getString("versao_modelo"),
                        rs.getInt("id_ano_fabricacao"), rs.getInt("id_ano_modelo"), rs.getInt("id_combustivel"), rs.getInt("id_cambio"), rs.getString("status_veiculo"), rs.getFloat("preco_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return veicModel;
    }

    public ArrayList<ConstVeicMarca> readVeicMarca() {

        ArrayList<ConstVeicMarca> veicMarca = new ArrayList<>();

        String query = "select v.id_veiculo, v.chassi_veiculo,m.nome_modelo, mr.nome_marca, c.nome_cor, v.status_veiculo\n"
                + "from veiculos as v inner join modelos as m on v.id_modelo = m.id_modelo\n"
                + "inner join cores as c on c.id_cor = v.id_cor inner join marcas as mr on m.id_marca = mr.id_marca";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                veicMarca.add(new ConstVeicMarca(rs.getInt("id_veiculo"), rs.getString("chassi_veiculo"), rs.getString("nome_modelo"), rs.getString("nome_marca"), rs.getString("nome_cor"), rs.getString("status_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return veicMarca;
    }

    public ArrayList<ConstVeicMarca> readCatalogo() {

        ArrayList<ConstVeicMarca> catalogo = new ArrayList<>();

        String query = "select v.id_veiculo, v.chassi_veiculo,m.nome_modelo,m.versao_modelo, mr.nome_marca, c.nome_cor, v.status_veiculo\n"
                + "from veiculos as v inner join modelos as m on v.id_modelo = m.id_modelo\n"
                + "inner join cores as c on c.id_cor = v.id_cor inner join marcas as mr on m.id_marca = mr.id_marca";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                catalogo.add(new ConstVeicMarca(rs.getInt("id_veiculo"), rs.getString("chassi_veiculo"), rs.getString("nome_marca"), rs.getString("nome_modelo"), rs.getString("versao_modelo"), rs.getString("nome_cor"), rs.getString("status_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return catalogo;
    }

    public void updateVeiculos(Veiculos veiculos, int id) {
        String query = "UPDATE veiculos SET chassi_veiculo = ?, id_modelo = ?, id_cor = ?, id_ano_fabricacao = ?, id_ano_modelo = ?, id_combustivel = ?, id_cambio = ?, status_veiculo = ?, preco_veiculo = ? WHERE id_veiculo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, veiculos.getChassi_veiculo());
            stmt.setInt(2, veiculos.getId_modelo());
            stmt.setInt(3, veiculos.getId_cor());
            stmt.setInt(4, veiculos.getId_ano_fabricacao());
            stmt.setInt(5, veiculos.getId_ano_modelo());
            stmt.setInt(6, veiculos.getId_combustivel());
            stmt.setInt(7, veiculos.getId_cambio());
            stmt.setString(8, veiculos.getStatus_veiculo());
            stmt.setFloat(9, veiculos.getPreco_veiculo());
            stmt.setInt(10, veiculos.getId_veiculo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateStatusVeiculos(Veiculos veiculos, int id) {
        String query = "UPDATE veiculos SET status_veiculo = ? WHERE id_veiculo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, veiculos.getStatus_veiculo());
            stmt.setInt(2, veiculos.getId_veiculo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteVeiculos(int id_veiculo) {
        String query = "DELETE FROM veiculos WHERE id_veiculo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_veiculo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //CLIENTES
    public void createClientes(Clientes clientes) {
        String query = "INSERT INTO clientes (cep_cliente, telefone_cliente, logradouro_cliente, numero_casa_cliente, bairro_cliente, cidade_cliente, estado_cliente, pais_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, clientes.getCep_cliente());
            stmt.setString(2, clientes.getTelefone_cliente());
            stmt.setString(3, clientes.getLogradouro_cliente());
            stmt.setString(4, clientes.getNumero_casa_cliente());
            stmt.setString(5, clientes.getBairro_cliente());
            stmt.setString(6, clientes.getCidade_cliente());
            stmt.setString(7, clientes.getEstado_cliente());
            stmt.setString(8, clientes.getPais_cliente());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Clientes> readAllClientes() {

        ArrayList<Clientes> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clientes.add(new Clientes(rs.getInt("id_cliente"), rs.getString("cep_cliente"), rs.getString("telefone_cliente"), rs.getString("logradouro_cliente"), rs.getString("numero_casa_cliente"), rs.getString("bairro_cliente"), rs.getString("cidade_cliente"), rs.getString("estado_cliente"), rs.getString("pais_cliente")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public ArrayList<Clientes> readAllClientesF() {

        ArrayList<Clientes> clientesF = new ArrayList<>();
        String query = "SELECT * FROM clientes INNER JOIN pessoa_fisica ON clientes.id_cliente = pessoa_fisica.id_cliente";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clientesF.add(new Clientes(rs.getInt("id_cliente"), rs.getString("cep_cliente"), rs.getString("telefone_cliente"), rs.getString("logradouro_cliente"), rs.getString("numero_casa_cliente"), rs.getString("bairro_cliente"), rs.getString("cidade_cliente"), rs.getString("estado_cliente"), rs.getString("pais_cliente")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientesF;
    }

    public ArrayList<Clientes> readAllClientesPJ() {

        ArrayList<Clientes> clientesJ = new ArrayList<>();
        String query = "SELECT * FROM clientes INNER JOIN pessoa_juridica ON clientes.id_cliente = pessoa_juridica.id_cliente";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clientesJ.add(new Clientes(rs.getInt("id_cliente"), rs.getString("cep_cliente"), rs.getString("telefone_cliente"), rs.getString("logradouro_cliente"), rs.getString("numero_casa_cliente"), rs.getString("bairro_cliente"), rs.getString("cidade_cliente"), rs.getString("estado_cliente"), rs.getString("pais_cliente")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientesJ;
    }

    public ArrayList<Clientes> readTelCEPClientesPJ() {

        ArrayList<Clientes> telefonePJ = new ArrayList<>();
        String query = "SELECT clientes.telefone_cliente, clientes.cep_cliente FROM clientes INNER JOIN pessoa_juridica ON clientes.id_cliente = pessoa_juridica.id_cliente";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                telefonePJ.add(new Clientes(rs.getString("telefone_cliente"), rs.getString("cep_cliente")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return telefonePJ;
    }

    public ArrayList<Clientes> readTelCEPClientesPF() {

        ArrayList<Clientes> telefonePF = new ArrayList<>();
        String query = "SELECT clientes.telefone_cliente, clientes.cep_cliente FROM clientes INNER JOIN pessoa_fisica ON clientes.id_cliente = pessoa_fisica.id_cliente";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                telefonePF.add(new Clientes(rs.getString("telefone_cliente"), rs.getString("cep_cliente")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return telefonePF;
    }

    public void updateClientes(Clientes clientes, int id) {
        String query = "UPDATE clientes SET cep_cliente = ?, telefone_cliente = ?, logradouro_cliente = ?, numero_casa_cliente = ?, bairro_cliente = ?, cidade_cliente = ?, estado_cliente = ?, pais_cliente = ? WHERE id_cliente = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, clientes.getCep_cliente());
            stmt.setString(2, clientes.getTelefone_cliente());
            stmt.setString(3, clientes.getLogradouro_cliente());
            stmt.setString(4, clientes.getNumero_casa_cliente());
            stmt.setString(5, clientes.getBairro_cliente());
            stmt.setString(6, clientes.getCidade_cliente());
            stmt.setString(7, clientes.getEstado_cliente());
            stmt.setString(8, clientes.getPais_cliente());
            stmt.setInt(9, clientes.getId_cliente());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteClientes(int id_cliente) {
        String query = "DELETE FROM clientes WHERE id_cliente = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_cliente);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //PESSOA_FISICA
    public void createPessoaFisica(PessoaFisica pessoa_fisica) {
        String query = "INSERT INTO pessoa_fisica (id_cliente, nome_pessoa_fisica, sobrenome_pessoa_fisica, cpf_pessoa_fisica, rg_pessoa_fisica, data_nascimento_pessoa_fisica) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, pessoa_fisica.getId_cliente());
            stmt.setString(2, pessoa_fisica.getNome_pessoa_fisica());
            stmt.setString(3, pessoa_fisica.getSobrenome_pessoa_fisica());
            stmt.setString(4, pessoa_fisica.getCpf_pessoa_fisica());
            stmt.setString(5, pessoa_fisica.getRg_pessoa_fisica());
            stmt.setString(6, pessoa_fisica.getData_nascimento_pessoa_fisica());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<PessoaFisica> readAllPessoaFisica() {
        ArrayList<PessoaFisica> pessoa_fisica = new ArrayList<>();
        String query = "SELECT * FROM pessoa_fisica";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                pessoa_fisica.add(new PessoaFisica(rs.getInt("id_pessoa_fisica"), rs.getInt("id_cliente"), rs.getString("nome_pessoa_fisica"), rs.getString("sobrenome_pessoa_fisica"), rs.getString("cpf_pessoa_fisica"), rs.getString("rg_pessoa_fisica"), rs.getString("data_nascimento_pessoa_fisica")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pessoa_fisica;
    }

    public ArrayList<PessoaFisica> readAllPFCli(String cpf) {
        ArrayList<PessoaFisica> pfCli = new ArrayList<>();
        String query = "select pessoa_fisica.*, clientes.* from pessoa_fisica\n"
                + "inner join clientes on clientes.id_cliente = pessoa_fisica.id_cliente\n"
                + "where pessoa_fisica.cpf_pessoa_fisica = ?";
        try (
                Connection conn = GetConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                pfCli.add(new PessoaFisica(rs.getInt("id_pessoa_fisica"), rs.getInt("id_cliente"), rs.getString("nome_pessoa_fisica"), rs.getString("sobrenome_pessoa_fisica"), rs.getString("cpf_pessoa_fisica"), rs.getString("rg_pessoa_fisica"), rs.getString("data_nascimento_pessoa_fisica"),
                        rs.getInt("id_cliente"), rs.getString("cep_cliente"), rs.getString("telefone_cliente"), rs.getString("logradouro_cliente"), rs.getString("numero_casa_cliente"), rs.getString("bairro_cliente"), rs.getString("cidade_cliente"), rs.getString("estado_cliente"), rs.getString("pais_cliente")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pfCli;
    }

    public void updatePessoaFisica(PessoaFisica pessoa_fisica, int id) {
        String query = "UPDATE pessoa_fisica SET nome_pessoa_fisica = ?, sobrenome_pessoa_fisica = ?, cpf_pessoa_fisica = ?, rg_pessoa_fisica = ?, data_nascimento_pessoa_fisica = ? WHERE id_pessoa_fisica = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pessoa_fisica.getNome_pessoa_fisica());
            stmt.setString(2, pessoa_fisica.getSobrenome_pessoa_fisica());
            stmt.setString(3, pessoa_fisica.getCpf_pessoa_fisica());
            stmt.setString(4, pessoa_fisica.getRg_pessoa_fisica());
            stmt.setString(5, pessoa_fisica.getData_nascimento_pessoa_fisica());
            stmt.setInt(6, pessoa_fisica.getId_pessoa_fisica());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePessoaFisica(int id_pessoa_fisica) {
        String query = "DELETE pessoa_fisica, clientes FROM pessoa_fisica INNER JOIN clientes ON clientes.id_cliente = pessoa_fisica.id_cliente WHERE pessoa_fisica.id_pessoa_fisica = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_pessoa_fisica);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //PESSOA_JURIDICA
    public void createPessoaJuridica(PessoaJuridica pessoa_juridica) {
        String query = "INSERT INTO pessoa_juridica (id_cliente, nome_fantasia_pessoa_juridica, razao_social_pessoa_juridica, cnpj_pessoa_juridica, inscricao_estadual_pessoa_juridica, contrato_social_pessoa_juridica) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, pessoa_juridica.getId_cliente());
            stmt.setString(2, pessoa_juridica.getNome_fantasia_pessoa_juridica());
            stmt.setString(3, pessoa_juridica.getRazao_social_pessoa_juridica());
            stmt.setString(4, pessoa_juridica.getCnpj_pessoa_juridica());
            stmt.setString(5, pessoa_juridica.getInscricao_estadual_pessoa_juridica());
            stmt.setString(6, pessoa_juridica.getContrato_social_pessoa_juridica());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<PessoaJuridica> readAllPessoaJuridica() {
        ArrayList<PessoaJuridica> pessoa_juridica = new ArrayList<>();
        String query = "SELECT * FROM pessoa_juridica";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                pessoa_juridica.add(new PessoaJuridica(rs.getInt("id_pessoa_juridica"), rs.getInt("id_cliente"), rs.getString("nome_fantasia_pessoa_juridica"), rs.getString("razao_social_pessoa_juridica"), rs.getString("cnpj_pessoa_juridica"), rs.getString("inscricao_estadual_pessoa_juridica"), rs.getString("contrato_social_pessoa_juridica")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pessoa_juridica;
    }

    public ArrayList<PessoaJuridica> readAllPJCli(String cnpj) {
        ArrayList<PessoaJuridica> pjCli = new ArrayList<>();
        String query = "select pessoa_juridica.*, clientes.* from pessoa_juridica\n"
                + "inner join clientes on clientes.id_cliente = pessoa_juridica.id_cliente\n"
                + "where pessoa_juridica.cnpj_pessoa_juridica = ?";
        try (
                Connection conn = GetConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cnpj);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                pjCli.add(new PessoaJuridica(rs.getInt("id_pessoa_juridica"), rs.getInt("id_cliente"), rs.getString("nome_fantasia_pessoa_juridica"), rs.getString("razao_social_pessoa_juridica"), rs.getString("cnpj_pessoa_juridica"), rs.getString("inscricao_estadual_pessoa_juridica"), rs.getString("contrato_social_pessoa_juridica"),
                        rs.getInt("id_cliente"), rs.getString("cep_cliente"), rs.getString("telefone_cliente"), rs.getString("logradouro_cliente"), rs.getString("numero_casa_cliente"), rs.getString("bairro_cliente"), rs.getString("cidade_cliente"), rs.getString("estado_cliente"), rs.getString("pais_cliente")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pjCli;
    }

    public void updatePessoaJuridica(PessoaJuridica pessoa_juridica, int id) {
        String query = "UPDATE pessoa_juridica SET nome_fantasia_pessoa_juridica = ?, razao_social_pessoa_juridica = ?, cnpj_pessoa_juridica = ?, inscricao_estadual_pessoa_juridica = ?, inscricao_estadual_pessoa_juridica = ? WHERE id_pessoa_juridica = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pessoa_juridica.getNome_fantasia_pessoa_juridica());
            stmt.setString(2, pessoa_juridica.getRazao_social_pessoa_juridica());
            stmt.setString(3, pessoa_juridica.getCnpj_pessoa_juridica());
            stmt.setString(4, pessoa_juridica.getInscricao_estadual_pessoa_juridica());
            stmt.setString(5, pessoa_juridica.getContrato_social_pessoa_juridica());
            stmt.setInt(6, pessoa_juridica.getId_pessoa_juridica());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePessoaJuridica(int id_pessoa_juridica) {
        String query = "DELETE pessoa_juridica, clientes FROM pessoa_juridica INNER JOIN clientes ON clientes.id_cliente = pessoa_juridica.id_cliente WHERE pessoa_juridica.id_pessoa_juridica = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_pessoa_juridica);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //COMPRA_VEICULO
    public void createCompraVeiculo(CompraVeiculo compra_veiculo) {
        String query = "INSERT INTO compra_veiculo (id_cliente, id_veiculo, id_usuario, renavam_compra_veiculo, crlv_compra_veiculo, nota_fiscal_compra_veiculo) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, compra_veiculo.getId_cliente());
            stmt.setInt(2, compra_veiculo.getId_veiculo());
            stmt.setInt(3, compra_veiculo.getId_usuario());
            stmt.setString(4, compra_veiculo.getRenavam_compra_veiculo());
            stmt.setString(5, compra_veiculo.getCrlv_compra_veiculo());
            stmt.setString(6, compra_veiculo.getNota_fiscal_compra_veiculo());

            stmt.execute();
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }

    public ArrayList<CompraVeiculo> readAllCompraVeiculo() {

        ArrayList<CompraVeiculo> compra_veiculo = new ArrayList<>();

        String query = "SELECT * FROM compra_veiculo";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                compra_veiculo.add(new CompraVeiculo(rs.getInt("id_compra_veiculo"), rs.getInt("id_cliente"), rs.getInt("id_veiculo"), rs.getInt("id_usuario"), rs.getString("renavam_compra_veiculo"), rs.getString("crlv_compra_veiculo"), rs.getString("nota_fiscal_compra_veiculo")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return compra_veiculo;
    }

    public ArrayList<ConstVenda> readAllVenda() {

        ArrayList<ConstVenda> constVenda = new ArrayList<>();

        String query = "select v.id_veiculo, m.nome_modelo, c.id_cliente, p.nome_perfil\n"
                + "from compra_veiculo as cp inner join veiculos as v on cp.id_veiculo = v.id_veiculo\n"
                + "inner join modelos as m on v.id_modelo = m.id_modelo inner join clientes as c on cp.id_cliente = c.id_cliente\n"
                + "inner join usuarios as u on u.id_usuario = cp.id_usuario inner join perfil as p on p.id_perfil = u.id_perfil";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                constVenda.add(new ConstVenda(rs.getInt("id_veiculo"), rs.getString("nome_modelo"), rs.getInt("id_cliente"), rs.getString("nome_perfil")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return constVenda;
    }

    public ArrayList<ConstEstoque> readEstoque() {

        ArrayList<ConstEstoque> constEstoque = new ArrayList<>();

        String query = "select m.id_modelo, mr.nome_marca, m.nome_modelo, m.versao_modelo, COUNT(*) as quantidade\n"
                + "FROM modelos as m INNER JOIN marcas as mr ON m.id_marca = mr.id_marca\n"
                + "inner join veiculos as v on m.id_modelo = v.id_modelo where v.status_veiculo = \"Disponível\"\n"
                + "GROUP BY m.id_modelo, mr.nome_marca, m.nome_modelo, m.versao_modelo ORDER BY m.nome_modelo";

        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                constEstoque.add(new ConstEstoque(rs.getInt("id_modelo"), rs.getString("nome_marca"), rs.getString("nome_modelo"), rs.getString("versao_modelo"), rs.getInt("quantidade")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return constEstoque;
    }

    public void updateCompraVeiculo(CompraVeiculo compra_veiculo, int id) {

        String query = "UPDATE compra_veiculo SET renavam_compra_veiculo = ?, crlv_compra_veiculo = ?, nota_fiscal_compra_veiculo = ? WHERE id_compra_veiculo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, compra_veiculo.getRenavam_compra_veiculo());
            stmt.setString(2, compra_veiculo.getCrlv_compra_veiculo());
            stmt.setString(3, compra_veiculo.getNota_fiscal_compra_veiculo());
            stmt.setInt(4, compra_veiculo.getId_compra_veiculo());

            stmt.execute();
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }

    public void deleteCompraVeiculo(int id_compra_veiculo) {
        String query = "DELETE FROM compra_veiculo WHERE id_compra_veiculo = ?";
        try (
                Connection conn = GetConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id_compra_veiculo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
