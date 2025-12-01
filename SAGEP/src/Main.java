import controller.*;
import enuns.GRUPO;
import enuns.PERFIL;
import enuns.TIPOENDERECO;
import enuns.TIPOEVENTO;
import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // Criação dos usuários do sistema
        UsuarioController usuarioController = new UsuarioController();
        Usuario usuario1 = new Usuario(1, "admin", "admin", "Alexandre C. Martins", GRUPO.ADMIN, PERFIL.ADMIN);
        usuarioController.cadastrarUsuario(usuario1);
        Usuario usuario2 = new Usuario(2, "alexandre", "12345678", "Alexandre Martins", GRUPO.RUA, PERFIL.USUARIO);
        usuarioController.cadastrarUsuario(usuario2);
        List<Usuario> ListaUsuarios = new ArrayList<>(usuarioController.listarUsuarios());


        // Testando os metodos dos controllers para login de usuários
        System.out.println(usuarioController.usuarioToString(usuario1));
        System.out.println(usuarioController.realizarLogin(usuario1, "admin", "admin"));
        System.out.println(usuario1);


        // Criação do endereço da Diocese
        EnderecoController enderecoDioceseController = new EnderecoController(); // Controller responsavel pelos
        Endereco enderecoDiocese = new Endereco(1, "Praça Dom Adauto", "s/n", "Palácio do Carmo", "Centro", "João Pessoa", "PB", "58010670","Abrangência da Diocese: Capital e 35 Municipios", TIPOENDERECO.COMERCIAL);
        enderecoDioceseController.cadastrarEndereco(enderecoDiocese);


        // Criação da Diocese
        DioceseController dioceseController = new DioceseController();
        Diocese diocese = new Diocese(1, "09140351001497", "Arquidiocese de João Pessoa", "Dom Manoel Delson Pedreira da Cruz", "Arcebispo", enderecoDiocese, "(83) 3133-1000", "curia@arquidiocesepb.org.br", "https://arquidiocesepb.org.br/", "Arquidiocese da Paraíba");
        dioceseController.cadastrarDiocese(diocese);


        // Criacao do endereço da Paroquia
        EnderecoController enderecoParoquiaController = new EnderecoController();
        Endereco enderecoParoquia = new Endereco(2, "Rua Adália Suassuna Barreto", "s/n", "", "Pedro Gondim", "João Pessoa", "PB", "58033430","", TIPOENDERECO.COMERCIAL);
        enderecoParoquiaController.cadastrarEndereco(enderecoParoquia);


        // Criação da Paróquia
        ParoquiaController paroquiaController = new ParoquiaController();
        Paroquia paroquia = new Paroquia(1, "09140351008661", "Paróquia Sant'Anna e São Joaquim", "Pe. Marcio José", "Padre", enderecoParoquia, "(83) 3224-5466", "secretaria@paroquiasasj.org.br", "https://paroquiasasj.org.br", diocese);
        paroquiaController.cadastrarParoquia(paroquia);


        // Criação dos eventos para o mural
        EventoController eventoController = new EventoController();

        Evento evento1 = new Evento(1,  // Id
                TIPOEVENTO.SACRAMENTO, // Tipo do Evento
                "Batismo - 1º Semestre - 2025",  // Nome do Evento
                LocalDate.of(2025, 6, 30), // Data de Inicio
                LocalDate.of(2025, 6, 30), // Data Final
                "Paróquia Sant/'Anna e São Joaquim", // Local do evento
                2, // Númro máximo de inscritos no evento (Controle de inscrição)
                70.00); // Valor da taxa de inscrição
        Evento evento2 = new Evento(2,  // Id
                TIPOEVENTO.SACRAMENTO, // Tipo do Evento
                "Batismo - 2º Semestre - 2025",  // Nome do Evento
                LocalDate.of(2025, 12, 20), // Data de Inicio
                LocalDate.of(2025, 12, 20), // Data Final
                "Paróquia Sant/'Anna e São Joaquim", // Local do evento
                2, // Númro máximo de inscritos no evento (Controle de inscrição)
                70.00); // Valor da taxa de inscrição

        eventoController.cadastrarEvento(evento1);
        eventoController.cadastrarEvento(evento2);


        // Criação das pessoas
        Endereco enderecoPai = new Endereco(
                1, // id
                "Avenida Sete de Setembro", // rua
                "1500", // Némero
                "Bloco C", // Complemento
                "Graça", // Bairro
                "Salvador", // Cidade
                "BA", // UF
                "40130000", // CEP
                "Contato preferencial por e-mail", // Observação
                TIPOENDERECO.COMERCIAL); // Tipo do endereço

        Pessoa pessoaPai = new Pessoa(
                101, // Id
                "Ricardo Alves Pereira", // nome
                "98765432109", // C.P.F.
                LocalDate.of(1985, 11, 28), // Data de Nascimento
                "654321/1995-1", // Número da Certidão de Nascimento
                "Salvador", // Cidade de Nascimento (Naturalidade)
                "BA", // UF do local de nascimento
                enderecoPai, // endereco
                false, // Pais Casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "71998765432", // Telefone
                "ricardo.pereira@empresa.com.br"); // e-mail

        Endereco enderecoMae = new Endereco(
                2, // id
                "Rua das Acácias", // rua
                "45", // Némero
                "Apartamento 101", // Complemento
                "Centro", // Bairro
                "Curitiba", // Cidade
                "PR", // UF
                "80010000", // CEP
                "Próximo ao parque", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        Pessoa pessoaMae = new Pessoa(
                102, // Id
                "Ana Luiza Souza Melo", // nome
                "12345678901", // C.P.F.
                LocalDate.of(1990, 5, 10), // Data de Nascimento
                "123456/2000-9", // Número da Certidão de Nascimento
                "Curitiba", // Cidade de Nascimento (Naturalidade)
                "PR", // UF do local de nascimento
                enderecoMae, // endereco
                true, // Pais Casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                true, // Casamento Cívil
                "41987654321", // Telefone
                "ana.luiza.melo@email.com"); // e-mail

        Endereco enderecoFilho = new Endereco(
                3, // id
                "Travessa da Felicidade", // rua
                "22", // Némero
                "Casa 2", // Complemento
                "Flores", // Bairro
                "Manaus", // Cidade
                "AM", // UF
                "69058000", // CEP
                "Não ligar após 20h", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        Pessoa pessoaFilho = new Pessoa(
                103, // Id
                "Carolina Gomes Santos", // nome
                "45612378944", // C.P.F.
                LocalDate.of(2000, 01, 15), // Data de Nascimento
                "789012/2010-5", // Número da Certidão de Nascimento
                "Manaus", // Cidade de Nascimento (Naturalidade)
                "AM", // UF do local de nascimento
                enderecoFilho, // endereco
                true, // Pais Casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "92976543210", // Telefone
                "carolina.gomes@teste.org"); // e-mail

        pessoaFilho.setPai(pessoaPai); // Ajustando os dados do pai (uso de atributo recursivo Pessoa - Pai)
        pessoaFilho.setMae(pessoaMae); // Ajustando os dados da mãe (uso de atributo recursivo Pessoa - Mãe)

        // Adicionando as pessoas a lista
        PessoaController pessoaController = new PessoaController();
        pessoaController.cadastrarPessoa(pessoaPai);
        pessoaController.cadastrarPessoa(pessoaMae);
        pessoaController.cadastrarPessoa(pessoaFilho);


        // Criação das pastorais
        Endereco enderecoPastoral = new Endereco(4, "Rua Adália Suassuna Barreto", "s/n", "", "Pedro Gondim", "João Pessoa", "PB", "58033430","", TIPOENDERECO.COMERCIAL);

        Pastoral pastoral1 = new Pastoral(
                1, // identificador
                "Pastoral do Batismo", //  Nome da Pastoral
                pessoaFilho, // Pessoa responsável pela pastoral
                "secretaria@igreja.org.br", // e-mail da pastoral
                "(83) 88888-8888"); // Telefone da pastoral

        Pastoral pastoral2 = new Pastoral(
                2, // Identificador
                "Pastoral da Catequese", // Nome da Pastoral
                pessoaPai, // Pessoa Responsável pela Pastoral
                "secretaria@igreja.org.br", // e-mail da pastoral
                "(83) 88888-8888"); // Telefone da Pastoral

        Pastoral pastoral3 = new Pastoral(
                3, // Identificador
                "Pastoral do Dizimo", // Nome da Pastoral
                pessoaMae, // Pessoa Responsável pela Pastoral
                "secretaria@igreja.org.br", // e-mail da Pastoral
                "(83) 88888-8888"); // Telefone da Pastoral

        // Associando as Pastorais a sua Lista
        PastoralController pastoralController = new PastoralController();
        pastoralController.cadastrarpastoral(pastoral1);
        pastoralController.cadastrarpastoral(pastoral2);
        pastoralController.cadastrarpastoral(pastoral3);


        // Criando dos Dizimistas
        Dizimista dizimista = new Dizimista(
                1, // Identificador do Dizimista
                pessoaFilho.getNome(), // Nome do dizimista
                pessoaFilho.getCpf(), // C.P.F. do Dizimista
                pessoaFilho.getDataNascimento(), // Data de Nascimento
                pessoaFilho.getNumeroCertNasc(), // Número da Certidão de Nascimento
                pessoaFilho.getCidadeNasc(), // Cidade de Nascimento
                pessoaFilho.getUfNasc(), // UF Cidade Natal do Dizimista
                pessoaFilho.getEndereco(), // Endereço do Dizimista
                pessoaFilho.getPaisCasadosIgreja(), // Pais Casados na Igreja
                pessoaFilho.getParoquiaCasamento(), // Paróquia onde foi realizado o casamento
                pessoaFilho.getPaisCasamentoCivil(), // Casamento cívil"
                pessoaFilho.getTelefone(), // Telefone do dizimista
                pessoaFilho.getEmail(), // e-mail do dizimista
                true, // Contribuição Permanente
                125.50); // Valor da contribuição

        dizimista.setPai(pessoaPai);
        dizimista.setMae(pessoaMae);

        // Inçlusão dos dizimistas na lista
        DizimistaController dizimistaController = new DizimistaController();
        dizimistaController.cadastrarDizimista(dizimista);

        // dizimista.geraRecibo(dizimista);

        // Opções de menu

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int opcao;

        do {

            opcao = 0;

            System.out.println("\nSelecione o que Deseja fazer:");
            System.out.println("------------------------------------------------------");
            System.out.println(" 1 - Exibir Dados da Diocese");
            System.out.println(" 2 - Exibir Dados da Paróquia");
            System.out.println(" 3 - Exibir Mural de Eventos");
            System.out.println(" 4 - Exibir Dados das Pessoas da Comunidade");
            System.out.println(" 5 - Exibir Dados das Pastorias");
            System.out.println(" 6 - Exibir Dados das Dizimistas");
            System.out.println(" 7 - Relação dos Batizandos (falta)");
            System.out.println(" 8 - Exibir ficha de inscrição do Batizando (falta)");
            System.out.println(" 9 - Listar fila de espera por vagas excedidas (falta)");
            System.out.println("10 - Relação dos Usuários da Aplicação");
            System.out.println("11 - Sair");
            System.out.println("------------------------------------------------------");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            if (opcao > 10) {
                System.out.println("Você digitou uma opção inválida. Redigite!");
            } else {

                if (opcao > 0) {

                    switch (opcao) {
                        case 1: // Listar dados da diocese
                            dioceseController.diocesesRelacao();
                            break;
                        case 2: // Listar Paróquias
                            paroquiaController.paroquiasRelacao();
                            break;
                        case 3: // Mural de Eventos
                            eventoController.eventosRelacao();
                            break;
                        case 4: // Exibir dados das Pessoas da Comunidade
                            pessoaController.pessoaRelacao();
                            break;
                        case 5: // Exibir dados das Pastorais
                            pastoralController.pastoraisRelacao();
                            break;
                        case 6: // Exibir dados das Pastorais
                            dizimistaController.dizimistasRelacao();
                            break;
                        case 10: // Relação de Usuários da Aplicação
                            usuarioController.usuariosRelacao();
                            break;
                    }

                }

            }

        } while (opcao != 11);

    }
}
