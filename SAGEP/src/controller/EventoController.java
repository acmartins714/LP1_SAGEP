package controller;

import enuns.TIPOEVENTO;
import model.Evento;
import service.EventoService;

import java.time.LocalDate;
import java.util.List;

public class EventoController {

    private EventoService eventoService = new EventoService();

    public void cadastrarEvento(Evento evento) {
        eventoService.cadastrarEvento(evento);
    }

    public List<Evento> listarEventos() {
        return eventoService.listarEventos();
    }

    public void atualizarEventoTipoEvento(int id, TIPOEVENTO novoTipoEvento) {
        eventoService.atualizarEventoTipoEvento(id, novoTipoEvento);
    }

    public void atualizarEventoNomeEvento(int id, String novoNomeEvento) {
        eventoService.atualizarEventoNome(id, novoNomeEvento);
    }

    public void atualizarEventoDataInicial(int id, LocalDate novaDataInical) {
        eventoService.atualizarEventoDataInicial(id, novaDataInical);
    }

    public void atualizarEventoDataFinal(int id, LocalDate novaDataFinal) {
        eventoService.atualizarEventoDataFinal(id, novaDataFinal);
    }

    public void atualizarEventoLocal(int id, String novoLocal) {
        eventoService.atualizarEventoLocal(id, novoLocal);
    }

    public void atualizarNumeroMaximoInscricoesl(int id, int novoNumeroMaximoInscricoes) {
        eventoService.atualizarEventoNumeroMaximoInscricoes(id, novoNumeroMaximoInscricoes);
    }

    public void atualizarValorInscricao(int id, int novoValorInscricao) {
        eventoService.atualizarEventoValorInscricao(id, novoValorInscricao);
    }

    public void eventosRelacao() {
        eventoService.eventosRelacao();
    }

}
