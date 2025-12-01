package controller;

import enuns.TIPOFILARESERVA;
import model.Evento;
import model.EventoFilaReserva;
import model.EventoInscricao;
import model.Pessoa;
import service.EventoFilaReservaService;

import java.time.LocalDate;
import java.util.List;

public class EventoFilaReservaController {

    private EventoFilaReservaService eventoFilaReservaService = new EventoFilaReservaService();

    public void cadastrarEventoFilaReserva(EventoFilaReserva eventoFilaReserva) {
        eventoFilaReservaService.cadastrarEventoFilaReserva(eventoFilaReserva);
    }

    public List<EventoFilaReserva> listarEventoFilaReserva() {
        return eventoFilaReservaService.listarEventoFilaReservas();
    }

    public void atualizarEventoFilaReservaEvento(int id, Evento novoEvento) {
        eventoFilaReservaService.atualizarEventoFilaReservaEvento(id, novoEvento);
    }

    public void atualizarEventoFilaReservaPessoa(int id, Pessoa novaPessoa) {
        eventoFilaReservaService.atualizarEventoFilaReservaPessoa(id, novaPessoa);
    }

    public void atualizarEventoFilaReservaDataReserva(int id, LocalDate novaData) {
        eventoFilaReservaService.atualizarEventoFilaReservaDataReserva(id, novaData);
    }

    public void atualizarEventoFilaReservaTIpoFilaReserva(int id, TIPOFILARESERVA novoTipoFilaReserva) {
        eventoFilaReservaService.atualizarEventoFilaReservaTipoFileReserva(id, novoTipoFilaReserva);
    }

    public void atualizarEventoFilaReservaInscricaoEfetivada(int id, boolean novoaInscricaoEfetivada) {
        eventoFilaReservaService.atualizarEventoFilaReservaInscricaoEfetivada(id, novoaInscricaoEfetivada);
    }

    public void deletarEventoInscricao(int id) {
        eventoFilaReservaService.deletarEventoFilaReserva(id);
    }

}
