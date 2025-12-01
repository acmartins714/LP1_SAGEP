package controller;

import model.Dizimista;
import service.DizimistaService;

import java.util.List;

public class DizimistaController {

    private DizimistaService dizimistaService = new DizimistaService();

    public void cadastrarDizimista(Dizimista dizimista) {
        dizimistaService.cadastrarDizimista(dizimista);
    }

    public List<Dizimista> listarDizimistas() {
        return dizimistaService.listarDizimistas();
    }

    public void atualizarDizimistaContribuicaoFixa(int id, boolean novaContribuicaoFixa) {
        dizimistaService.atualizarDizimistaContribuicaoFixa(id, novaContribuicaoFixa);
    }

    public void atualizarDizimistaValorContribuicao(int id, double novoValorContribuicao) {
        dizimistaService.atualizarDizimistaValorContribuicao(id, novoValorContribuicao);
    }

    public void dizimistaDeletarDizimista(int id) {
        dizimistaService.deletarDizimista(id);
    }

    public void dizimistasRelacao() {
        dizimistaService.dizimistasRelacao();
    }

}
