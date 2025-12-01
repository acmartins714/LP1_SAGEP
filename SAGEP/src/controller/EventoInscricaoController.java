package controller;

import model.Evento;
import model.EventoInscricao;
import service.EventoInscricaoService;

import java.util.List;

public class EventoInscricaoController {

    private EventoInscricaoService eventoInscricaoService = new EventoInscricaoService();

    public void cadastrarEventoInscricao(EventoInscricao eventoInscricao) {
        eventoInscricaoService.cadastrarEventoInscricao(eventoInscricao);
    }

    public List<EventoInscricao> listarEventosInscricao() {
        return eventoInscricaoService.listarEventosInscricao();
    }

    public void atualizarEventoInscricaoEvento(int id, Evento novoEvento) {
        eventoInscricaoService.atualizarEventoInscricao(id, novoEvento);
    }

    public void deletarEventoInscricao(int id) {
        eventoInscricaoService.deletarEventoInscricao(id);
    }

}
