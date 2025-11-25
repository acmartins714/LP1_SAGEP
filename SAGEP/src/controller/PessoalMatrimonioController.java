package controller;

import model.Pessoa;
import model.PessoaMatrimonio;
import service.PessoaMatrimonioService;

import java.util.List;

public class PessoalMatrimonioController {

    private PessoaMatrimonioService pessoaMatrimonioService = new PessoaMatrimonioService();

    //Metods
    public void cadastrarPessoaMatrimonio(PessoaMatrimonio pessoaMatrimonio) {
        pessoaMatrimonioService.cadastrarPessoaMatrimonio(pessoaMatrimonio);
    }

    public List<PessoaMatrimonio> listarPessoasMatrimonio() {
        return pessoaMatrimonioService.listarPessoasMatrimonio();
    }

    public void atualizarPessoaMatrimonioPadrinho(int id, List<Pessoa> novoPadrinho) {
        pessoaMatrimonioService.atualizarPessoaMatrimonioPadrinho(id, novoPadrinho);
    }

    public void atualizarPessoaMatrimonioMadrinha(int id, List<Pessoa> novaMadrinha) {
        pessoaMatrimonioService.atualizarPessoaMatrimonioMadrinha(id, novaMadrinha);
    }

    public void atualizarPessoaMatrimonioCasamentoEfeitoCivil(int id, boolean novoCasamentoEfeitoCivil) {
        pessoaMatrimonioService.atualizarPessoaMatrimonioCasamentoEfeitoCivil(id, novoCasamentoEfeitoCivil);
    }

    public void deletarPessoaMatrimonio(int id) {
        pessoaMatrimonioService.deletarPessoaMatrimonio(id);
    }

}
