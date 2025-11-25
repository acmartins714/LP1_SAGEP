package controller;

import model.Pessoa;
import model.PessoaCrismando;
import service.PessoaCrismandoService;

import java.util.List;

public class PessoaCrismandoController {

    private PessoaCrismandoService pessoaCrismandoService = new PessoaCrismandoService();

    //Metods
    public void cadastrarPessoaCrismando(PessoaCrismando pessoaCrismando) {
        pessoaCrismandoService.cadastrarPessoaCrismando(pessoaCrismando);
    }

    public List<PessoaCrismando> listarPessoasCrismando() {
        return pessoaCrismandoService.listarPessoasCrismando();
    }

    public void atualizarPessoaCrismandoPadrinho(int id, Pessoa novoPadrinho) {
        pessoaCrismandoService.atualizarPessoaCrismandoPadrinho(id, novoPadrinho);
    }

    public void atualizarPessoaCrismandoMadrinha(int id, Pessoa novaMadrinha) {
        pessoaCrismandoService.atualizarPessoaCrismandoMadrinha(id, novaMadrinha);
    }

    public void atualizarPessoaCrismandoObservacoes(int id, String novaObservacao) {
        pessoaCrismandoService.atualizarPessoaCrismandoObservacoes(id, novaObservacao);
    }

    public void deletarPessoaCrismando(int id) {
        pessoaCrismandoService.deletarPessoaCrismando(id);
    }

}
