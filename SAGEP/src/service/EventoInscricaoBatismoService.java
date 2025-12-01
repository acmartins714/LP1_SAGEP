package service;

import controller.EventoFilaReservaController;
import enuns.TIPOFILARESERVA;
import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventoInscricaoBatismoService {

    private List<EventoInscricaoBatismo> eventosInscricaoBatismo = new ArrayList<>();

    public void cadastrarEventoInscricaoBatismo(EventoInscricaoBatismo eventoInscricaoBatismo) {

        if (eventosInscricaoBatismo.size() < eventoInscricaoBatismo.getEvento().getNumeroMaximoInscricoes()) {
            eventosInscricaoBatismo.add(eventoInscricaoBatismo);
        } else {
            System.out.print("Evento atingiu o número máximo de inscrições! Deseja entrar para a fila de espera?");
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
                EventoFilaReservaController efr = new EventoFilaReservaController();
                efr.cadastrarEventoFilaReserva(eventoFilaReserva);

                System.out.print("Você foi colocado na fila de espera caso ocorra alguma desistência entraremos em contato!");

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

    public void atualizarEventoInscricaoBatismoPadrinho(int id, Pessoa novoPadrinho) {
        for (EventoInscricaoBatismo eventosInscricaoBatismo : eventosInscricaoBatismo) {
            if (eventosInscricaoBatismo.getId() == id) {
                eventosInscricaoBatismo.setPadrinho(novoPadrinho);
                System.out.println("Padrinho atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Inscrição em evento não foi encontrada.");
    }

    public void atualizarEventoInscricaoBatismoMadrinha(int id, Pessoa novaMadrinha) {
        for (EventoInscricaoBatismo eventosInscricaoBatismo : eventosInscricaoBatismo) {
            if (eventosInscricaoBatismo.getId() == id) {
                eventosInscricaoBatismo.setMadrinha(novaMadrinha);
                System.out.println("Madrinha atualizada com sucesso!");
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

}
