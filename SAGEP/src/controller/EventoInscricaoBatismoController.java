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

    public void deletarEventoInscricaoBatismo(int id) {
        eventoInscricaoBatismoService.deletarEventoInscricaoBatismo(id);
    }

    public void eventoInscricaoBatismoRelacao() {
        eventoInscricaoBatismoService.batizandoInscricaoRelacao();
    }

    public void filaReservaRelacao() {
        eventoInscricaoBatismoService.filaReservaRelacao();
    }

    public void fichaInscricaoBatismo() {
        eventoInscricaoBatismoService.fichaInscricaoBatismo();
    }

}
