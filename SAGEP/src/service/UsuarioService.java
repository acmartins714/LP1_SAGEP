package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    //Metods
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

    public boolean realizarLogin(Usuario usuario, String login, String senha) {
        return ((usuario.getLogin().equals(login)) && (usuario.getSenha().equals(senha)));
    }

    public String usuarioToString(Usuario usuario) {
        return
                "model.Usuario{" +
                        "id=" + usuario.getId() +
                        ", login=" + usuario.getLogin() +
                        ", senha=*****" +
                        ", Nome Completo=" + usuario.getNomeCompleto() +
                        ", grupo=" + usuario.getGrupo().getDescricao() +
                        ", perfil=" + usuario.getPerfil().getDescricao() +
                        '}';
    }

    public void usuariosRelacao() {

        //List<Usuario> ListaUsuarios = new ArrayList<>(uc.listarUsuarios());
        Iterator<Usuario> iter = usuarios.iterator();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println(" Usuários da Aplicação");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Id Login           Nome Completo                            Grupo                Perfil");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        while (iter.hasNext()) {
            Usuario usuarioLista = iter.next();
            System.out.println(String.format("%2d", usuarioLista.getId())  + " " +
                    String.format("%-15s", usuarioLista.getLogin()) + " " +
                    String.format("%-40s", usuarioLista.getNomeCompleto()) + " " +
                    String.format("%-20s", ((usuarioLista.getGrupo()).getId() + " - " + (usuarioLista.getGrupo()).getDescricao())) + " " +
                    String.format("%-20s", ((usuarioLista.getPerfil()).getId() + " - " + (usuarioLista.getPerfil()).getDescricao())));
        }

    }



}
