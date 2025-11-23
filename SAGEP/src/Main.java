import controller.*;
import enuns.GRUPO;
import enuns.PERFIL;
import enuns.TIPOENDERECO;
import model.*;

import java.time.LocalDate;
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


        // Testando os metodos dos controllers
        System.out.println(uc.usuarioToString(usuario1));
        //System.out.println(uc.realizarLogin(usuario1, "admin", "admin"));
        System.out.println(usuario1);

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
                               String.format("%-20s", ((usuarioLista.getGrupo()).getId() + " - " + (usuarioLista.getGrupo()).getDescricao())) + " " +
                               String.format("%-20s", ((usuarioLista.getPerfil()).getId() + " - " + (usuarioLista.getPerfil()).getDescricao())));
        }

        // Criação e Listagem das Dioceses
        DioceseController dc = new DioceseController();
        EnderecoController ec = new EnderecoController();

        Endereco enderecoDiocese = new Endereco(1, "Praça Dom Adauto", "s/n", "Palácio do Carmo", "Centro", "João Pessoa", "PB", "58010670","Abrangência da Diocese: Capital e 35 Municipios", TIPOENDERECO.COMERCIAL);
        ec.cadastrarEndereco(enderecoDiocese);
        Diocese diocese = new Diocese(1, "09140351001497", "Arquidiocese de João Pessoa", "Dom Manoel Delson Pedreira da Cruz", "Arcebispo", enderecoDiocese, "(83) 3133-1000", "curia@arquidiocesepb.org.br", "https://arquidiocesepb.org.br/", "Arquidiocese da Paraíba");
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

        // Criação e Lsitagem das pastorais
        Endereco epp = new Endereco(2, "Rua Adália Suassuna Barreto", "s/n", "", "Pedro Gondim", "João Pessoa", "PB", "58033430","", TIPOENDERECO.COMERCIAL);
        Pessoa ppPai = new Pessoa(1, "A Gaiao","47491462468",LocalDate.of(1965, 8, 28),"12345678","João Pessoa","PB",epp,true,paroquia,true,"(83) 9999-9999","chico@maria.com.br");
        Pessoa ppMae = new Pessoa(2, "M. N. Gaião","47491462468",LocalDate.of(1965, 8, 28),"12345678","João Pessoa","PB",epp,true,paroquia,true,"(83) 9999-9999","chico@maria.com.br");
        Pessoa ppFilho = new Pessoa(3, "Walkiria Gaião","47491462468",LocalDate.of(1965, 8, 28),"12345678","João Pessoa","PB",epp,true,paroquia,true,"(83) 9999-9999","chico@maria.com.br");
        ppFilho.setPai(ppPai);
        ppFilho.setMae(ppMae);

        // Lsiatndo dados de uma Pessoa
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println(" Cadastro Pessoal");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Identificador: " + String.format("%2d", ppFilho.getId()));
        System.out.println("Nome: " + ppFilho.getNome());
        System.out.println("e-mail: " + ppFilho.getEmail());
        System.out.println("Telefone: " + ppFilho.getTelefone());
        System.out.println("Filiação: ");
        System.out.println(" - Pai: " + ppFilho.getPai().getNome());
        System.out.println("   - telefone: " + ppFilho.getPai().getTelefone());
        System.out.println("   - e-mail: " + ppFilho.getPai().getEmail());
        System.out.println(" - Mãe: " + ppFilho.getMae().getNome());
        System.out.println("   - telefone: " + ppFilho.getMae().getTelefone());
        System.out.println("   - e-mail: " + ppFilho.getMae().getEmail());
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        Pastoral pastoral1 = new Pastoral(1, "Pastoral da Catequese", ppFilho, "secretaria@igreja.org.br", "(83) 88888-8888");
        PastoralController pastorais = new PastoralController();
        pastorais.cadastrarpastoral(pastoral1);

        List<Pastoral> lstPastoral = new ArrayList<>(pastorais.listarPastorais());
        Iterator<Pastoral> lstPastoralIter = lstPastoral.iterator();
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println(" Relação das Pastorais");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        while (lstPastoralIter.hasNext()) {
            Pastoral pastoralLista = lstPastoralIter.next();
            System.out.println("Identificador: " + String.format("%2d", pastoralLista.getId()));
            System.out.println("Nome: " + pastoralLista.getNome());
            System.out.println("e-mail: " + pastoralLista.getEmail());
            System.out.println("Telefone: " + pastoralLista.getTelefone());
            System.out.println("Responsável: " + pastoralLista.getResponsavel().getNome());
            System.out.println(" - Nome: " + pastoralLista.getResponsavel().getNome());
            System.out.println(" - Pai: " + pastoralLista.getResponsavel().getPai().getNome());
            System.out.println(" - Mãe: " + pastoralLista.getResponsavel().getMae().getNome());
            System.out.println(" - telefone: " + pastoralLista.getResponsavel().getTelefone());
            System.out.println(" - e-mail: " + pastoralLista.getResponsavel().getEmail());
        }

        Endereco endDizimista = new Endereco(2, "Rua Adália Suassuna Barreto", "s/n", "", "Pedro Gondim", "João Pessoa", "PB", "58033430","", TIPOENDERECO.COMERCIAL);
        Pessoa pdPai = new Pessoa(1, "A Gaiao","47491462468",LocalDate.of(1965, 8, 28),"12345678","João Pessoa","PB",endDizimista,true,paroquia,true,"(83) 9999-9999","chico@maria.com.br");
        Pessoa pdMae = new Pessoa(2, "M. N. Gaião","47491462468",LocalDate.of(1965, 8, 28),"12345678","João Pessoa","PB",endDizimista,true,paroquia,true,"(83) 9999-9999","chico@maria.com.br");
        Dizimista dizimista = new Dizimista(1, "Walkiria Gaião","47491462468",LocalDate.of(1965, 8, 28),"12345678","João Pessoa","PB",endDizimista,true,paroquia,true,"(83) 9999-9999","chico@maria.com.br", true, 125.50);
        dizimista.setPai(ppPai);
        dizimista.setMae(ppMae);

        dizimista.geraRecibo(dizimista);
    }
}
