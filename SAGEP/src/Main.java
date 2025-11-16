import controller.UsuarioController;
import enuns.GRUPO;
import enuns.PERFIL;
import model.Usuario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criação E listagem dos usuários
        UsuarioController uc = new UsuarioController();

        Usuario usuario1 = new Usuario(1, "admin", "admin", "Alexandre C. Martins", GRUPO.ADMIN, PERFIL.ADMIN);
        uc.cadastrarUsuario(usuario1);
        Usuario usuario2 = new Usuario(2, "alexandre", "12345678", "Alexandre Martins", GRUPO.RUA, PERFIL.USUARIO);
        uc.cadastrarUsuario(usuario2);

        List<Usuario> minhaLista = new ArrayList<>(uc.listarUsuarios());
        Iterator<Usuario> iter = minhaLista.iterator();
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
                               String.format("%-20s", (((GRUPO)usuarioLista.getGrupo()).getId() + " - " + ((GRUPO)usuarioLista.getGrupo()).getDescricao())) + " " +
                               String.format("%-20s", (((PERFIL)usuarioLista.getPerfil()).getId() + " - " + ((PERFIL)usuarioLista.getPerfil()).getDescricao())));
        }

    }
}
