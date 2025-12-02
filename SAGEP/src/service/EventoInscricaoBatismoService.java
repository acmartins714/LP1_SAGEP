package service;

import enuns.TIPOFILARESERVA;
import model.EventoFilaReserva;
import model.EventoInscricaoBatismo;
import model.PessoaBatizando;
import utils.NumeroPorExtenso;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EventoInscricaoBatismoService {

    private List<EventoFilaReserva> eventosInscricaoFilaReserva = new ArrayList<>();
    private List<EventoInscricaoBatismo> eventosInscricaoBatismo = new ArrayList<>();

    public void cadastrarEventoInscricaoBatismo(EventoInscricaoBatismo eventoInscricaoBatismo) {

        if (eventosInscricaoBatismo.size() < eventoInscricaoBatismo.getEvento().getNumeroMaximoInscricoes()) {
            eventosInscricaoBatismo.add(eventoInscricaoBatismo);
        } else {
            System.out.print("\nEvento atingiu o número máximo de inscrições! Deseja entrar para a fila de espera <S/N>? ");
            Scanner sc = new Scanner(System.in);
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("S")) {

                // Colocando o candidato ao batismo em fila de espera.
                System.out.print("Você vai ser colocado em file de espera!");

                EventoFilaReserva eventoFilaReserva = new EventoFilaReserva(eventoInscricaoBatismo.getId(),
                                                                           eventoInscricaoBatismo.getEvento(),
                                                                           eventoInscricaoBatismo.getBatizando(),
                                                                           LocalDate.now(),
                                                                           TIPOFILARESERVA.FILA,
                                                                           false);
                eventosInscricaoFilaReserva.add(eventoFilaReserva);
                //EventoFilaReservaController efr = new EventoFilaReservaController();
                //efr.cadastrarEventoFilaReserva(eventoFilaReserva);

                System.out.print("\nVocê foi colocado na fila de espera caso ocorra alguma desistência entraremos em contato!");

            } else {
                System.out.println("Inscrição cancelada!");
            }

        }
    }

    public List<EventoInscricaoBatismo> listarEventosInscricaoBatismo() {
        return eventosInscricaoBatismo;
    }

    //Metods
    public void atualizarEventoInscricaoBatismoBatizando(int id, PessoaBatizando novaPessoaBatizando) {
        for (EventoInscricaoBatismo eventosInscricaoBatismo : eventosInscricaoBatismo) {
            if (eventosInscricaoBatismo.getId() == id) {
                eventosInscricaoBatismo.setBatizando(novaPessoaBatizando);
                System.out.println("Batizando atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Inscrição em evento não foi encontrada.");
    }

    public void deletarEventoInscricaoBatismo(int id) {
        for (int i = 0; i < eventosInscricaoBatismo.size(); i++) {
            if (eventosInscricaoBatismo.get(i).getId() == id) {
                eventosInscricaoBatismo.remove(i);
                System.out.println("Inscrição em evento excluída com sucesso!");
                return;
            }
            System.out.println("ERRO: Inscrição em evento não encontrada!");
        }
    }

    public void batizandoInscricaoRelacao() {

        Iterator<EventoInscricaoBatismo> iter = eventosInscricaoBatismo.iterator();
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" Relação dos Inscritos para o Sacramento do Batismo");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Id Nome do Batizando              Nome pai                       Nome mãe                       Evento ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        while (iter.hasNext()) {
            EventoInscricaoBatismo eventoInscricaoBatismoLista = iter.next();
            System.out.println(String.format("%2d", eventoInscricaoBatismoLista.getId())  + " " +
                    String.format("%-30s", eventoInscricaoBatismoLista.getBatizando().getNome()) + " " +
                    String.format("%-30s", eventoInscricaoBatismoLista.getBatizando().getPai().getNome()) + " " +
                    String.format("%-30s", eventoInscricaoBatismoLista.getBatizando().getMae().getNome()) + " " +
                    String.format("%-30s", eventoInscricaoBatismoLista.getEvento().getNomeEvento()));
        }

    }

    public void filaReservaRelacao() {

        String telefone;
        Iterator<EventoFilaReserva> iter = eventosInscricaoFilaReserva.iterator();
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" Relação dos Batizandos em fila de espera");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Id Nome do Batizando              Nome pai                       Nome mãe                       Evento                         Telefone");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        while (iter.hasNext()) {

            EventoFilaReserva eventoFilaReservasLista = iter.next();
            telefone = eventoFilaReservasLista.getPessoa().getTelefone();

            System.out.println(String.format("%2d", eventoFilaReservasLista.getId())  + " " +
                    String.format("%-30s", eventoFilaReservasLista.getPessoa().getNome()) + " " +
                    String.format("%-30s", eventoFilaReservasLista.getPessoa().getPai().getNome()) + " " +
                    String.format("%-30s", eventoFilaReservasLista.getPessoa().getMae().getNome()) + " " +
                    String.format("%-30s", eventoFilaReservasLista.getEvento().getNomeEvento()) + " " +
                    String.format("(%s) %s-%s", telefone.substring(0,2), telefone.substring(2,7), telefone.substring(7)));
        }

    }

    public void fichaInscricaoBatismo() {

        Locale localeBR = new Locale("pt", "BR");
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", localeBR);
        LocalDate dataBatismo;
        LocalDate dataNascimento;
        String dataBatismoFormatada;
        String dataNascimentoFormatada;
        String valorTaxa;

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            opcao = 0;

            System.out.println("\n----------------------------------------------------------");
            System.out.println("Selecione o Batizando do qual você deseja emitir a ficha: ");
            System.out.println("----------------------------------------------------------");

            for (int i = 0; i < eventosInscricaoBatismo.size(); i++) {
                System.out.println(String.format("%2d", eventosInscricaoBatismo.get(i).getId()) + " - " +
                String.format(eventosInscricaoBatismo.get(i).getBatizando().getNome()));
            }

            System.out.println("----------------------------------------------------------");
            System.out.print("Digite a sua opção ou 0 (zero para sair): ");
            opcao = sc.nextInt();

            if (opcao != 0) {

                for (int i = 0; i < eventosInscricaoBatismo.size(); i++) {

                    if (eventosInscricaoBatismo.get(i).getId() == opcao) {

                        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
                        valorTaxa = currencyFormat.format(eventosInscricaoBatismo.get(i).getEvento().getValorInscricao());

                        // Ajustando a data do batismo
                        dataBatismo = eventosInscricaoBatismo.get(i).getEvento().getDataFinal();
                        dataBatismoFormatada = dataBatismo.format(formatoData);
                        dataNascimento = eventosInscricaoBatismo.get(i).getBatizando().getDataNascimento();
                        dataNascimentoFormatada = dataNascimento.format(formatoData);

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Paróquia");
                        System.out.println(" SANT\'ANNA E");
                        System.out.println(" SÃO JOAQUIM");
                        System.out.println(" Pedro Gondim João Pessoa / PB");
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Data: " + dataBatismoFormatada + " Horário: 17:00hs com Pe. Marcio");
                        System.out.println(" Local do Batismo: " + eventosInscricaoBatismo.get(i).getEvento().getLocal());
                        System.out.println(" Nome do Batizando: " + eventosInscricaoBatismo.get(i).getBatizando().getNome());
                        System.out.println(" Data de Nascimentop: " + dataNascimentoFormatada);
                        System.out.println(" Certidão de Nascimento Nº: " + eventosInscricaoBatismo.get(i).getBatizando().getNumeroCertNasc());
                        System.out.println(" Cidade Nascimento: " + eventosInscricaoBatismo.get(i).getBatizando().getCidadeNasc() + "-" +
                                                                    eventosInscricaoBatismo.get(i).getBatizando().getUfNasc());
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Filiação:");
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Pai: " + eventosInscricaoBatismo.get(i).getBatizando().getPai().getNome());
                        System.out.println("      (" + eventosInscricaoBatismo.get(i).getBatizando().getPai().getTelefone().substring(0,2) + ") " +
                                                       eventosInscricaoBatismo.get(i).getBatizando().getPai().getTelefone().substring(2,7) + "-" +
                                                       eventosInscricaoBatismo.get(i).getBatizando().getPai().getTelefone().substring(7));
                        System.out.println("      " + eventosInscricaoBatismo.get(i).getBatizando().getPai().getEmail());
                        System.out.println(" Mãe: " + eventosInscricaoBatismo.get(i).getBatizando().getMae().getNome());
                        System.out.println("      (" + eventosInscricaoBatismo.get(i).getBatizando().getMae().getTelefone().substring(0,2) + ") " +
                                                       eventosInscricaoBatismo.get(i).getBatizando().getMae().getTelefone().substring(2,7) + "-" +
                                                       eventosInscricaoBatismo.get(i).getBatizando().getMae().getTelefone().substring(7));

                        System.out.println("      " + eventosInscricaoBatismo.get(i).getBatizando().getMae().getEmail());
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Endereço:");
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Rua: " + eventosInscricaoBatismo.get(i).getBatizando().getEndereco().getRua() + " Nº " +
                                                      eventosInscricaoBatismo.get(i).getBatizando().getEndereco().getNumero() );
                        System.out.println(" Complemento: " + eventosInscricaoBatismo.get(i).getBatizando().getEndereco().getComplemento());
                        System.out.println(" Bairro: " + eventosInscricaoBatismo.get(i).getBatizando().getEndereco().getBairro());
                        System.out.println(" Cidade/UF: " + eventosInscricaoBatismo.get(i).getBatizando().getEndereco().getCidade() + "/" +
                                                            eventosInscricaoBatismo.get(i).getBatizando().getEndereco().getUf());
                        System.out.println(" C.E.P.: " + eventosInscricaoBatismo.get(i).getBatizando().getEndereco().getCep().substring(0,5) + "-" +
                                                         eventosInscricaoBatismo.get(i).getBatizando().getEndereco().getCep().substring(5) + " Telefone: (" +
                                                         eventosInscricaoBatismo.get(i).getBatizando().getTelefone().substring(0,2) + ") " +
                                                         eventosInscricaoBatismo.get(i).getBatizando().getTelefone().substring(2,7) + "-" +
                                                         eventosInscricaoBatismo.get(i).getBatizando().getTelefone().substring(7));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Pais casados na igreja?: " + (eventosInscricaoBatismo.get(i).getBatizando().getPaisCasadosIgreja() ? "(X) Sim ( ) Não" : "( ) Sim (X) Não") + " / " +
                                           " No civil?: " + (eventosInscricaoBatismo.get(i).getBatizando().getPaisCasamentoCivil() ? "(X) Sim ( ) Não" : "( ) Sim (X) Não"));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Qual paróquia casou?: " + eventosInscricaoBatismo.get(i).getBatizando().getPai().getParoquiaCasamento().getNome());
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Padrinho: " + eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getNome());
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Rua: " + eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getEndereco().getRua() + " Nº " +
                                                      eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getEndereco().getNumero() );
                        System.out.println(" Complemento: " + eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getEndereco().getComplemento());
                        System.out.println(" Bairro: " + eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getEndereco().getBairro());
                        System.out.println(" Cidade/UF: " + eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getEndereco().getCidade() + "/" +
                                eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getEndereco().getUf());
                        System.out.println(" C.E.P.: " + eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getEndereco().getCep().substring(0,5) + "-" +
                                eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getEndereco().getCep().substring(5) + " Telefone: (" +
                                eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getTelefone().substring(0,2) + ") " +
                                eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getTelefone().substring(2,7) + "-" +
                                eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getTelefone().substring(7));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Madrinha: " + eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getNome());
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Rua: " + eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getEndereco().getRua() + " Nº " +
                                eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getEndereco().getNumero() );
                        System.out.println(" Complemento: " + eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getEndereco().getComplemento());
                        System.out.println(" Bairro: " + eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getEndereco().getBairro());
                        System.out.println(" Cidade/UF: " + eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getEndereco().getCidade() + "/" +
                                eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getEndereco().getUf());
                        System.out.println(" C.E.P.: " + eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getEndereco().getCep().substring(0,5) + "-" +
                                eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getEndereco().getCep().substring(5) + " Telefone: (" +
                                eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getTelefone().substring(0,2) + ") " +
                                eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getTelefone().substring(2,7) + "-" +
                                eventosInscricaoBatismo.get(i).getBatizando().getMadrinha().getTelefone().substring(7));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Padrinhos casados na igreja?: " + (eventosInscricaoBatismo.get(i).getBatizando().getPadrinho().getParoquiaCasamento() != null ? "(X) Sim ( ) Não" : "( ) Sim (X) Não"));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Pagamento da Taxa de Batismo - " + valorTaxa + " reais: " + (eventosInscricaoBatismo.get(i).getPagamentoRealizado() ? "(X) Sim ( ) Não" : "( ) Sim (X) Não"));
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println(" Batizando registrado no livro de Batismo pela secretaria? ( ) Sim (Não)");
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println();
                        System.out.println("--------------------------------------------");
                        System.out.println("    Assinatura do Pai/Mãe ou Responsável");
                        System.out.println();
                        System.out.println();
                        System.out.println(" João Pessoa, " + dataBatismoFormatada);
                        break;
                    }
                }
            }

        } while (opcao != 0);

    }

}
