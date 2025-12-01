package model;

import controller.UsuarioController;
import enuns.GRUPO;
import enuns.PERFIL;

public class Usuario {
    private int id;
    private String login;
    private String senha;
    private String nomeCompleto;
    private GRUPO grupo;
    private PERFIL perfil;

    // Constructors
    public Usuario() {
    }

    public Usuario(int id, String login, String senha, String nomeCompleto, GRUPO grupo, PERFIL perfil) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.grupo = grupo;
        this.perfil = perfil;
    }

    // getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public GRUPO getGrupo() {
        return grupo;
    }

    public void setGrupo(GRUPO grupo) {
        this.grupo = grupo;
    }

    public PERFIL getPerfil() {
        return perfil;
    }

    public void setPerfil(PERFIL perfil) {
        this.perfil = perfil;
    }

    // Modificação realizada para evitar a exibição da senha do usuário
    @Override
    public String toString() {
        return "Não é possível usar este método para exibir os dados do usuário. Para isto use o método usuarioToString do controlador!";
    }

}