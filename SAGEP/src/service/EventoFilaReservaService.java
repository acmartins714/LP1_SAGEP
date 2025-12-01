package service;

import enuns.TIPOFILARESERVA;
import model.Evento;
import model.EventoFilaReserva;
import model.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoFilaReservaService {

    private List<EventoFilaReserva> eventoFilaReservas = new ArrayList<>();

    public void cadastrarEventoFilaReserva(EventoFilaReserva eventoFilaReserva) {
        eventoFilaReservas.add(eventoFilaReserva);
    }

    public List<EventoFilaReserva> listarEventoFilaReservas() {
        return eventoFilaReservas;
    }

    //Metods
    public void atualizarEventoFilaReservaEvento(int id, Evento novoEvento) {
        for (EventoFilaReserva eventoFilaReserva : eventoFilaReservas) {
            if (eventoFilaReserva.getId() == id) {
                eventoFilaReserva.setEvento(novoEvento);
                System.out.println("Evento da Fila / Reserva atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Fila / Reserva não foi encontrada.");
    }

    public void atualizarEventoFilaReservaPessoa(int id, Pessoa novaPessoa) {
        for (EventoFilaReserva eventoFilaReserva : eventoFilaReservas) {
            if (eventoFilaReserva.getId() == id) {
                eventoFilaReserva.setPessoa(novaPessoa);
                System.out.println("Pessoa atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Fila / Reserva não foi encontrada.");
    }

    public void atualizarEventoFilaReservaDataReserva(int id, LocalDate novaData) {
        for (EventoFilaReserva eventoFilaReserva : eventoFilaReservas) {
            if (eventoFilaReserva.getId() == id) {
                eventoFilaReserva.setDataReserva(novaData);
                System.out.println("Data atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Fila / Reserva não foi encontrada.");
    }

    public void atualizarEventoFilaReservaTipoFileReserva(int id, TIPOFILARESERVA novoTipoFilaReserva) {
        for (EventoFilaReserva eventoFilaReserva : eventoFilaReservas) {
            if (eventoFilaReserva.getId() == id) {
                eventoFilaReserva.setTipofilareserva(novoTipoFilaReserva);
                System.out.println("Tipo File / Reserva atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Fila / Reserva não foi encontrada.");
    }

    public void atualizarEventoFilaReservaInscricaoEfetivada(int id, boolean novaInscricaoEfetivada) {
        for (EventoFilaReserva eventoFilaReserva : eventoFilaReservas) {
            if (eventoFilaReserva.getId() == id) {
                eventoFilaReserva.setInscricaoEfetivada(novaInscricaoEfetivada);
                System.out.println("Status da Fila / Reserva atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Fila / Reserva não foi encontrada.");
    }

    public void deletarEventoFilaReserva(int id) {
        for (int i = 0; i < eventoFilaReservas.size(); i++) {
            if (eventoFilaReservas.get(i).getId() == id) {
                eventoFilaReservas.remove(i);
                System.out.println("Evento Fila / Reserva excluído com sucesso!");
                return;
            }
            System.out.println("ERRO: Evento não encontrada!");
        }
    }

}
