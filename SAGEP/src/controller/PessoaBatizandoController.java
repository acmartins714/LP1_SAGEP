package controller;

import model.Pessoa;
import model.PessoaBatizando;
import service.PessoaBatizandoService;

import java.util.List;

public class PessoaBatizandoController {

    private PessoaBatizandoService pessoaBatizandoService = new PessoaBatizandoService();

    //Metods
    public void cadastrarPessoaBatizando(PessoaBatizando pessoaBatizando) {
        pessoaBatizandoService.cadastrarPessoaBatizando(pessoaBatizando);
    }

    public List<PessoaBatizando> listarPessoasBatizando() {
        return pessoaBatizandoService.listarPessoasBatizando();
    }

    public void atualizarPessoaBatizandoPadrinho(int id, Pessoa novoPadrinho) {
        pessoaBatizandoService.atualizarPessoaBatizandoPadrinho(id, novoPadrinho);
    }

        public void deletarPessoaBatizando(int id) {
        pessoaBatizandoService.deletarPessoaBatizando(id);
    }

}
