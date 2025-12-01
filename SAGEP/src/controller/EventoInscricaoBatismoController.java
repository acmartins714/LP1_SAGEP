package controller;

import model.*;
import service.EventoInscricaoBatismoService;

import java.util.List;

public class EventoInscricaoBatismoController {

    private EventoInscricaoBatismoService eventoInscricaoBatismoService = new EventoInscricaoBatismoService();

    public void cadastrarEventoInscricaoBatismo(EventoInscricaoBatismo eventoInscricaoBatismo) {
        eventoInscricaoBatismoService.cadastrarEventoInscricaoBatismo(eventoInscricaoBatismo);
    }

    public List<EventoInscricaoBatismo> listarEventosInscricaoBatismo() {
        return eventoInscricaoBatismoService.listarEventosInscricaoBatismo();
    }

    public void atualizarEventoInscricaoBatismoBatizando(int id, PessoaBatizando novoBatizando) {
        eventoInscricaoBatismoService.atualizarEventoInscricaoBatismoBatizando(id, novoBatizando);
    }

    public void atualizarEventoInscricaoBatismoPadrinho(int id, Pessoa novoPadrinho) {
        eventoInscricaoBatismoService.atualizarEventoInscricaoBatismoPadrinho(id, novoPadrinho);
    }

    public void atualizarEventoInscricaoBatismoMadrinha(int id, Pessoa novaMadrinha) {
        eventoInscricaoBatismoService.atualizarEventoInscricaoBatismoMadrinha(id, novaMadrinha);
    }

    public void deletarEventoInscricaoBatismo(int id) {
        eventoInscricaoBatismoService.deletarEventoInscricaoBatismo(id);
    }

}
