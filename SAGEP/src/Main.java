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

        // Criando do Cadastro dos Batizandos
        Endereco endereco04 = new Endereco(
                4, // id
                "Rua 24 de Outubro", // rua
                "789", // NÚmero
                "Sala 302", // Complemento
                "Moinhos de Vento", // Bairro
                "Porto Alegre", // Cidade
                "RS", // UF
                "90510000", // CEP
                "Contato apenas em horário comercial", // Observação
                TIPOENDERECO.COMERCIAL); // Tipo do endereço

        Pessoa pessoa04 = new Pessoa(
                104, // Identificador da Pessoa
                "João Miguel Ferreira Lima", // Nome da Pessoa
                "33322211100", // C.P.F.
                LocalDate.of(1975, 12, 1), // Data de Nascimento
                "333444/1985-7", // Número da Certidão de Nascimento
                "Porto Alegre", // Cidade de Nascimento
                "RS", // UF Nascimento
                endereco04, // Endereço
                true, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                true, // Casamento Cívil
                "51987123456", // Telefone
                "joao.lima@negocios.net"); // e-mail

        Endereco endereco05 = new Endereco(
                5, // id
                "Alameda das Acácias", // rua
                "1200", // NÚmero
                "Casa C", // Complemento
                "Cambuí", // Bairro
                "Campinas", // Cidade
                "SP", // UF
                "13025000", // CEP
                "Vizinho guarda chave reserva", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        Pessoa pessoa05 = new Pessoa(
                105, // Identificador da Pessoa
                "Gabriela Costa Nunes", // Nome da Pessoa
                "55566677788", // C.P.F.
                LocalDate.of(1998, 3, 20), // Data de Nascimento
                "555666/2008-2", // Número da Certidão de Nascimento
                "Campinas", // Cidade de Nascimento
                "SP", // UF Nascimento
                endereco05, // Endereço
                false, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "19998234567", // Telefone
                "gabriela.nunes@falso.com"); // e-mail

        Endereco enderecoBatizando01 = new Endereco(
                14, // id
                "Rua Augusta", // rua
                "800", // NÚmero
                "Apto 55", // Complemento
                "Consolação", // Bairro
                "São Paulo", // Cidade
                "SP", // UF
                "01305000", // CEP
                "Bebe no berçário. Cuidar com entregas", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        PessoaBatizando batizando01 = new PessoaBatizando(
                114, // Identificador da Pessoa
                "Enzo Gabriel da Cunha", // Nome da Pessoa
                "10120230340", // C.P.F.
                LocalDate.of(2024, 3, 25), // Data de Nascimento
                "101202/2024-1", // Número da Certidão de Nascimento
                "São Paulo", // Cidade de Nascimento
                "SP", // UF Nascimento
                enderecoBatizando01, // Endereço
                true, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                true, // Casamento Cívil
                "11987651111", // Telefone
                "pais.enzo@teste.com", // e-mail
                pessoa04, // Padrinho
                pessoa05); // Madrinha

        batizando01.setPai(pessoaPai);
        batizando01.setMae(pessoaMae);

        Endereco endereco06 = new Endereco(
                6, // id
                "Avenida Boa Viagem", // rua
                "400", // NÚmero
                "Apartamento 1501", // Complemento
                "Boa Viagem", // Bairro
                "Recife", // Cidade
                "PE", // UF
                "51011000", // CEP
                "Enviar correspondência para portaria", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        Pessoa pessoa06 = new Pessoa(
                106, // Identificador da Pessoa
                "Lucas Eduardo Rocha", // Nome da Pessoa
                "11100099988", // C.P.F.
                LocalDate.of(1982, 7, 5), // Data de Nascimento
                "111000/1992-5", // Número da Certidão de Nascimento
                "Recife", // Cidade de Nascimento
                "PE", // UF Nascimento
                endereco06, // Endereço
                true, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "81976345678", // Telefone
                "lucas.rocha@mail.pe"); // e-mail

        Endereco endereco07 = new Endereco(
                7, // id
                "Rua T-60", // rua
                "55", // NÚmero
                "Edifício Apolo", // Complemento
                "Setor Bueno", // Bairro
                "Goiânia", // Cidade
                "GO", // UF
                "74210000", // CEP
                "Estuda no período da tarde", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        Pessoa pessoa07 = new Pessoa(
                107, // Identificador da Pessoa
                "Bianca Teixeira Mendes", // Nome da Pessoa
                "22233344455", // C.P.F.
                LocalDate.of(2005, 9, 12), // Data de Nascimento
                "222333/2015-0", // Número da Certidão de Nascimento
                "Goiania", // Cidade de Nascimento
                "GO", // UF Nascimento
                endereco07, // Endereço
                false, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "62985456789", // Telefone
                "bianca.mendes@escola.org"); // e-mail

        Endereco enderecoBatizando02 = new Endereco(
                15, // id
                "Avenida Roberto Silveira", // rua
                "100", // NÚmero
                "Casa Principal", // Complemento
                "Icaraí", // Bairro
                "Niterói", // Cidade
                "RJ", // UF
                "24230000", // CEP
                "Não atender chamadas desconhecidas", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        PessoaBatizando batizando02 = new PessoaBatizando(
                115, // Identificador da Pessoa
                "Sophia Valentina Ramos", // Nome da Pessoa
                "50540430320", // C.P.F.
                LocalDate.of(2023, 1, 10), // Data de Nascimento
                "50540430320", // Número da Certidão de Nascimento
                "Niterói", // Cidade de Nascimento
                "RJ", // UF Nascimento
                enderecoBatizando02, // Endereço
                false, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "21998762222", // Telefone
                "sophia.familia@email.rj", // e-mail
                pessoa06, // Padrinho
                pessoa07); // Madrinha

        batizando02.setPai(pessoaPai);
        batizando02.setMae(pessoaMae);

        Endereco endereco08 = new Endereco(
                8, // id
                "Rua dos Tabajaras", // rua
                "10", // NÚmero
                "Galpão 5", // Complemento
                "Praia de Iracema", // Bairro
                "Fortaleza", // Cidade
                "CE", // UF
                "60060000", // CEP
                "Entrega somente de 9h às 17h", // Observação
                TIPOENDERECO.COMERCIAL); // Tipo do endereço

        Pessoa pessoa08 = new Pessoa(
                108, // Identificador da Pessoa
                "Felipe Castro Barbosa", // Nome da Pessoa
                "44455566677", // C.P.F.
                LocalDate.of(1965, 4, 18), // Data de Nascimento
                "444555/1975-4", // Número da Certidão de Nascimento
                "Fortaleza", // Cidade de Nascimento
                "CE", // UF Nascimento
                endereco08, // Endereço
                true, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                true, // Casamento Cívil
                "85997567890", // Telefone
                "felipe.barbosa@contato.ce"); // e-mail

        Endereco endereco09 = new Endereco(
                9, // id
                "Travessa Piedade", // rua
                "300", // NÚmero
                "Fundos", // Complemento
                "Nazaré", // Bairro
                "Belém", // Cidade
                "PA", // UF
                "66055000", // CEP
                "Cachorro bravo", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        Pessoa pessoa09 = new Pessoa(
                109, // Identificador da Pessoa
                "Amanda Ribeiro Soares", // Nome da Pessoa
                "66677788899", // C.P.F.
                LocalDate.of(1993, 10, 30), // Data de Nascimento
                "666777/2003-8", // Número da Certidão de Nascimento
                "Belém", // Cidade de Nascimento
                "PA", // UF Nascimento
                endereco09, // Endereço
                false, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                true, // Casamento Cívil
                "91988678901", // Telefone
                "amanda.soares@teste.belem.br"); // e-mail

        Endereco enderecoBatizando03 = new Endereco(
                16, // id
                "Rua Pium-i", // rua
                "150", // NÚmero
                "Bloco C - 2º andar", // Complemento
                "Sion", // Bairro
                "Belo Horizonte", // Cidade
                "MG", // UF
                "30310080", // CEP
                "Criança em período de adaptação", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        PessoaBatizando batizando03 = new PessoaBatizando(
                116, // Identificador da Pessoa
                "Arthur Bernardo Lima", // Nome da Pessoa
                "60670780890", // C.P.F.
                LocalDate.of(2025, 2, 14), // Data de Nascimento
                "606707/2025-3", // Número da Certidão de Nascimento
                "Belo Horizonte", // Cidade de Nascimento
                "MG", // UF Nascimento
                enderecoBatizando03, // Endereço
                true, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "31976543333", // Telefone
                "familia.arthur@ficticio.net", // e-mail
                pessoa08, // Padrinho
                pessoa09); // Madrinha

        batizando03.setPai(pessoaPai);
        batizando03.setMae(pessoaMae);

        Endereco endereco10 = new Endereco(
                10, // id
                "EQN 105/106", // rua
                "12", // NÚmero
                "Bloco D", // Complemento
                "Asa Norte", // Bairro
                "Brasília", // Cidade
                "DF", // UF
                "70735000", // CEP
                "Consultar zelador antes de subir", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        Pessoa pessoa10 = new Pessoa(
                110, // Identificador da Pessoa
                "Gustavo Dantas Alves", // Nome da Pessoa
                "77788899900", // C.P.F.
                LocalDate.of(1970, 2, 2), // Data de Nascimento
                "777888/1980-3", // Número da Certidão de Nascimento
                "Brasília", // Cidade de Nascimento
                "DF", // UF Nascimento
                endereco10, // Endereço
                true, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                true, // Casamento Cívil
                "61996789012", // Telefone
                "gustavo.dantas@dfmail.net"); // e-mail

        Endereco endereco11 = new Endereco(
                11, // id
                "Rodovia SC-401", // rua
                "500", // NÚmero
                "Sala Comercial", // Complemento
                "Saco Grande", // Bairro
                "Florianópolis", // Cidade
                "SC", // UF
                "88032005", // CEP
                "Pedido deve ser assinado pelo gerente", // Observação
                TIPOENDERECO.COMERCIAL); // Tipo do endereço

        Pessoa pessoa11 = new Pessoa(
                111, // Identificador da Pessoa
                "Vanessa Cruz Martins", // Nome da Pessoa
                "88899900011", // C.P.F.
                LocalDate.of(2001, 6, 25), // Data de Nascimento
                "888999/2011-6", // Número da Certidão de Nascimento
                "Florianópolis", // Cidade de Nascimento
                "SC", // UF Nascimento
                endereco11, // Endereço
                false, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "48995890123", // Telefone
                "vanessa.martins@empresa-sc.com"); // e-mail

        Endereco enderecoBatizando04 = new Endereco(
                17, // id
                "SGAS 915", // rua
                "20", // NÚmero
                "Bloco B", // Complemento
                "Asa Sul", // Bairro
                "Brasília", // Cidade
                "DF", // UF
                "70390150", // CEP
                "Retirar na portaria com a Sra. Lúcia", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        PessoaBatizando batizando04 = new PessoaBatizando(
                117, // Identificador da Pessoa
                "Helena Vitória Dias", // Nome da Pessoa
                "70780890900", // C.P.F.
                LocalDate.of(2022, 9, 1), // Data de Nascimento
                "707808/2022-7", // Número da Certidão de Nascimento
                "Brasília", // Cidade de Nascimento
                "DF", // UF Nascimento
                enderecoBatizando04, // Endereço
                false, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "61996784444", // Telefone
                "pais.helena@teste.org", // e-mail
                pessoa10, // Padrinho
                pessoa11); // Madrinha

        batizando04.setPai(pessoaPai);
        batizando04.setMae(pessoaMae);

        Endereco endereco12 = new Endereco(
                12, // id
                "Rua Ceará", // rua
                "2500", // NÚmero
                "Lote 10", // Complemento
                "Carandá Bosque", // Bairro
                "Florianópolis", // Cidade
                "MS", // UF
                "79031000", // CEP
                "Entregar na portaria lateral", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        Pessoa pessoa12 = new Pessoa(
                112, // Identificador da Pessoa
                "Thiago Menezes Nunes", // Nome da Pessoa
                "00011122233", // C.P.F.
                LocalDate.of(1997, 8, 14), // Data de Nascimento
                "000111/2007-1", // Número da Certidão de Nascimento
                "Campo Grande", // Cidade de Nascimento
                "MS", // UF Nascimento
                endereco12, // Endereço
                true, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                false, // Casamento Cívil
                "67984901234", // Telefone
                "thiago.nunes@ms.br"); // e-mail

        Endereco endereco13 = new Endereco(
                13, // id
                "Av. Hermes da Fonseca", // rua
                "1450", // NÚmero
                "Perto da padaria", // Complemento
                "Tirol", // Bairro
                "Natal", // Cidade
                "RN", // UF
                "59020000", // CEP
                "Cliente antigo", // Observação
                TIPOENDERECO.RESIDENCIAL); // Tipo do endereço

        Pessoa pessoa13 = new Pessoa(
                113, // Identificador da Pessoa
                "Patrícia Lima Dias", // Nome da Pessoa
                "99988877766", // C.P.F.
                LocalDate.of(1989, 1, 9), // Data de Nascimento
                "999888/1999-9", // Número da Certidão de Nascimento
                "Natal", // Cidade de Nascimento
                "RN", // UF Nascimento
                endereco13, // Endereço
                false, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                true, // Casamento Cívil
                "84991012345", // Telefone
                "patricia.dias@natalnet.net"); // e-mail

        Endereco enderecoBatizando05 = new Endereco(
                18, // id
                "Rua Chile", // rua
                "1751", // NÚmero
                "Loja 1", // Complemento
                "Rebouças", // Bairro
                "Curitiba", // Cidade
                "PR", // UF
                "80220180", // CEP
                "Endereço comercial dos pais", // Observação
                TIPOENDERECO.COMERCIAL); // Tipo do endereço

        PessoaBatizando batizando05 = new PessoaBatizando(
                118, // Identificador da Pessoa
                "Davi Lucas Pires", // Nome da Pessoa
                "80890900010", // C.P.F.
                LocalDate.of(2024, 11, 5), // Data de Nascimento
                "808909/2024-9", // Número da Certidão de Nascimento
                "Curitiba", // Cidade de Nascimento
                "PR", // UF Nascimento
                enderecoBatizando05, // Endereço
                true, // Pais casados na Igreja
                paroquia, // Paroquia onde foi realizado o casamento
                true, // Casamento Cívil
                "41985435555", // Telefone
                "davi.contato@negocio.com", // e-mail
                pessoa12, // Padrinho
                pessoa13); // Madrinha

        batizando05.setPai(pessoaPai);
        batizando05.setMae(pessoaMae);

        // Incluindo batizandos na lista
        PessoaBatizandoController pessoaBatizandoController = new PessoaBatizandoController();
        pessoaBatizandoController.cadastrarPessoaBatizando(batizando01);
        pessoaBatizandoController.cadastrarPessoaBatizando(batizando02);
        pessoaBatizandoController.cadastrarPessoaBatizando(batizando03);
        pessoaBatizandoController.cadastrarPessoaBatizando(batizando04);
        pessoaBatizandoController.cadastrarPessoaBatizando(batizando05);

        // Inscrevendo batizandos no evento de batizado
        EventoInscricaoBatismoController eventoInscricaoBatismoController = new EventoInscricaoBatismoController();
        EventoInscricaoBatismo eventoInscricaoBatismo01 = new EventoInscricaoBatismo(1, evento1, batizando01, true);
        EventoInscricaoBatismo eventoInscricaoBatismo02 = new EventoInscricaoBatismo(2, evento1, batizando02, true);
        EventoInscricaoBatismo eventoInscricaoBatismo03 = new EventoInscricaoBatismo(3, evento1, batizando03, true);
        EventoInscricaoBatismo eventoInscricaoBatismo04 = new EventoInscricaoBatismo(4, evento1, batizando04, true);
        EventoInscricaoBatismo eventoInscricaoBatismo05 = new EventoInscricaoBatismo(5, evento1, batizando05, true);
        eventoInscricaoBatismoController.cadastrarEventoInscricaoBatismo(eventoInscricaoBatismo01);
        eventoInscricaoBatismoController.cadastrarEventoInscricaoBatismo(eventoInscricaoBatismo02);
        eventoInscricaoBatismoController.cadastrarEventoInscricaoBatismo(eventoInscricaoBatismo03);
        eventoInscricaoBatismoController.cadastrarEventoInscricaoBatismo(eventoInscricaoBatismo04);
        eventoInscricaoBatismoController.cadastrarEventoInscricaoBatismo(eventoInscricaoBatismo05);

        // dizimista.geraRecibo(dizimista);
        // Metodo criado e será disponíbilizado em
        // implementação futura

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
            System.out.println(" 7 - Relação dos Batizandos");
            System.out.println(" 8 - Exibir ficha de inscrição do Batizando");
            System.out.println(" 9 - Listar fila de espera em Eventos");
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
                        case 7: // Exibir dados das Pastorais
                            eventoInscricaoBatismoController.eventoInscricaoBatismoRelacao();;
                            break;
                        case 8: // Exibir dados das Pastorais
                            eventoInscricaoBatismoController.fichaInscricaoBatismo();;
                            break;
                        case 9: // Exibir dados das Pastorais
                            eventoInscricaoBatismoController.filaReservaRelacao();
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
