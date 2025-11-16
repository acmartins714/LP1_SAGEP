package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }


    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public void atualizarUsuarioLogin(String login, String novoLogin) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equalsIgnoreCase(login)) {
                usuario.setLogin(novoLogin);
                System.out.println("Login do usuário atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Usuario não foi encontrado.");
    }

    public void atualizarUsuarioSenha(String login, String senhaAtual, String novaSenha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equalsIgnoreCase(login)) {
                usuario.setSenha(novaSenha);
                System.out.println("Senha do usuário atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Usuario não foi encontrado.");
    }

    public void deletarUsuarioLogin(String login) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getLogin().equalsIgnoreCase(login)) {
                usuarios.remove(i);
                System.out.println("Usuário excluído com sucesso!");
                return;
            }
            System.out.println("ERRO: Usuário não encontrado!");
        }
    }

}
