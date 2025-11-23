package controller;

import model.Usuario;
import service.UsuarioService;

import java.util.List;

public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService();

    public void cadastrarUsuario(Usuario usuario) {
        usuarioService.cadastrarUsuario(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    public void atualizarUsuarioLogin(String login, String novoLogin) {
        usuarioService.atualizarUsuarioLogin(login, novoLogin);
    }

    public void atualizarUsuarioSenha(String login, String senhaAtual, String novaSenha) {
        usuarioService.atualizarUsuarioSenha(login, senhaAtual, novaSenha);
    }

    public void deletarUsuario(String login) {
        usuarioService.deletarUsuarioLogin(login);
    }

    public boolean realizarLogin(Usuario usuario, String login, String senha) {
        return usuarioService.realizarLogin(usuario, login, senha);
    }

    public String usuarioToString(Usuario usuario) {
        return usuarioService.usuarioToString(usuario);
    }

}
