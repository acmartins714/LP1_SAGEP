import controller.DioceseController;
import controller.EnderecoController;
import controller.ParoquiaController;
import controller.UsuarioController;
import enuns.GRUPO;
import enuns.PERFIL;
import enuns.TIPOENDERECO;
import model.Diocese;
import model.Endereco;
import model.Paroquia;
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

        // Criação e Listagem das Dioceses
        DioceseController dc = new DioceseController();
        EnderecoController ec = new EnderecoController();

        Endereco enderecoDiocese = new Endereco(1, "Praça Dom Adauto", "s/n", "Palácio do Carmo", "Centro", "João Pessoa", "PB", "58010670","Abrangência da Diocese: Capital e 35 Municipios", TIPOENDERECO.COMERCIAL);
        ec.cadastrarEndereco(enderecoDiocese);
        Diocese diocese = new Diocese(1, "09140351001497", "Arquidiocese da Paraíba", "Dom Manoel Delson Pedreira da Cruz", "Arcebispo", enderecoDiocese, "(83) 3133-1000", "curia@arquidiocesepb.org.br", "https://arquidiocesepb.org.br/");
        dc.cadastrarDiocese(diocese);

        List<Diocese> ld = new ArrayList<>(dc.listarDiocese());
        Iterator<Diocese> ldIter = ld.iterator();
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println(" Diocese de João Pessoa");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        while (ldIter.hasNext()) {
            Diocese dioceseLista = ldIter.next();
            System.out.println("Identificador: " + String.format("%2d", dioceseLista.getId()));
            System.out.println("C.N.P.J.: " + String.format("%s.%s.%s/%s-%s",  dioceseLista.getCnpj().substring(0,2),dioceseLista.getCnpj().substring(2,5),dioceseLista.getCnpj().substring(5,8),dioceseLista.getCnpj().substring(8,12),dioceseLista.getCnpj().substring(12,14)));
            System.out.println("Nome: " + dioceseLista.getNome());
            System.out.println("Responsável: " + dioceseLista.getResponsavel());
            System.out.println("Título: " + dioceseLista.getTitulo());
            System.out.println("Tipo do Endereço: " + dioceseLista.getEndereco().getTipoEndereco().getId() + "-" + dioceseLista.getEndereco().getTipoEndereco().getDescricao());
            System.out.println("Endereço: " + dioceseLista.getEndereco().getRua() + ", " + dioceseLista.getEndereco().getNumero());
            System.out.println("Complemento: " + dioceseLista.getEndereco().getComplemento());
            System.out.println("Bairro: " + dioceseLista.getEndereco().getBairro());
            System.out.println("Cidade: " + dioceseLista.getEndereco().getCidade() + "-" + dioceseLista.getEndereco().getUf());
            System.out.println("C.E.P.: " + String.format("%s-%s", dioceseLista.getEndereco().getCep().substring(0,5), dioceseLista.getEndereco().getCep().substring(5,8)));
            System.out.println("Observações: " + dioceseLista.getEndereco().getObservacao());
            System.out.println("Telefone: " + dioceseLista.getTelefone());
            System.out.println("e-mail: " + dioceseLista.getEmail());
            System.out.println("site: " + dioceseLista.getSite());
        }
        // Criação e Listagem das Paroquias
        ParoquiaController pc = new ParoquiaController();
        EnderecoController epc = new EnderecoController();

        Endereco enderecoParoquia = new Endereco(2, "Rua Adália Suassuna Barreto", "s/n", "", "Pedro Gondim", "João Pessoa", "PB", "58033430","", TIPOENDERECO.COMERCIAL);
        epc.cadastrarEndereco(enderecoParoquia);
        Paroquia paroquia = new Paroquia(1, "09140351008661", "Paróquia Sant'Anna e São Joaquim", "Pe. Marcio José", "Padre", enderecoParoquia, "(83) 3224-5466", "secretaria@paroquiasasj.org.br", "https://paroquiasasj.org.br", diocese);
        pc.cadastrarParoquia(paroquia);

        List<Paroquia> lp = new ArrayList<>(pc.listarParoqia());
        Iterator<Paroquia> lpIter = lp.iterator();
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println(" Relação de Paroquias");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        while (lpIter.hasNext()) {
            Paroquia paroquiaLista = lpIter.next();
            System.out.println("Identificador: " + String.format("%2d", paroquia.getId()));
            System.out.println("C.N.P.J.: " + String.format("%s.%s.%s/%s-%s",  paroquiaLista.getCnpj().substring(0,2),paroquiaLista.getCnpj().substring(2,5),paroquiaLista.getCnpj().substring(5,8),paroquiaLista.getCnpj().substring(8,12),paroquiaLista.getCnpj().substring(12,14)));
            System.out.println("Nome: " + paroquiaLista.getNome());
            System.out.println("Responsável: " + paroquiaLista.getResponsavel());
            System.out.println("Título: " + paroquiaLista.getTitulo());
            System.out.println("Tipo do Endereço: " + paroquiaLista.getEndereco().getTipoEndereco().getId() + "-" + paroquiaLista.getEndereco().getTipoEndereco().getDescricao());
            System.out.println("Endereço: " + paroquiaLista.getEndereco().getRua() + ", " + paroquiaLista.getEndereco().getNumero());
            System.out.println("Complemento: " + paroquiaLista.getEndereco().getComplemento());
            System.out.println("Bairro: " + paroquiaLista.getEndereco().getBairro());
            System.out.println("Cidade: " + paroquiaLista.getEndereco().getCidade() + "-" + paroquiaLista.getEndereco().getUf());
            System.out.println("C.E.P.: " + String.format("%s-%s", paroquiaLista.getEndereco().getCep().substring(0,5), paroquiaLista.getEndereco().getCep().substring(5,8)));
            System.out.println("Observações: " + paroquiaLista.getEndereco().getObservacao());
            System.out.println("Telefone: " + paroquiaLista.getTelefone());
            System.out.println("e-mail: " + paroquiaLista.getEmail());
            System.out.println("site: " + paroquiaLista.getSite());
            System.out.println("Diocese: " + paroquiaLista.getDiocese().getNome());

        }

    }
}
