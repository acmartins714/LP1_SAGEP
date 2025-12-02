package service;

import enuns.TIPOFILARESERVA;
import model.EventoFilaReserva;
import model.EventoInscricaoBatismo;
import model.PessoaBatizando;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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


}
