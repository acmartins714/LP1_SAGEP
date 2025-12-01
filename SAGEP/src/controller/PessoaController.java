package controller;

import model.Endereco;
import model.Paroquia;
import model.Pessoa;
import service.PessoaService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaController {

    private PessoaService pessoaService = new PessoaService();

    //Metods
    public void cadastrarPessoa(Pessoa pessoa) {
        pessoaService.cadastrarPessoa(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return pessoaService.listarPessoas();
    }

    public void atualizarPessoaNome(int id, String novoNome) {
        pessoaService.atualizarPessoaNome(id, novoNome);
    }

    public void atualizarPessoaCpf(int id, String novoCpf) {
        pessoaService.atualizarPessoaCpf(id, novoCpf);
    }

    public void atualizarPessoaDataNascimento(int id, LocalDate novaDataNascimento) {
        pessoaService.atualizarPessoaDataNascimento(id, novaDataNascimento);
    }

    public void atualizarPessoaNumeroCertNasc(int id, String novoNumeroCertNasc) {
        pessoaService.atualizarPessoaNumeroCertNasc(id, novoNumeroCertNasc);
    }

    public void atualizarPessoaCidadeNasc(int id, String novaCidadeNasc) {
        pessoaService.atualizarPessoaCidadeNasc(id, novaCidadeNasc);
    }

    public void atualizarPessoaUfNasc(int id, String novaUfNasc) {
        pessoaService.atualizarPessoaUfNasc(id, novaUfNasc);
    }

    public void atualizarPessoaEndereco(int id, Endereco novoEndereco) {
        pessoaService.atualizarPessoaEndereco(id, novoEndereco);
    }

    public void atualizarPessoaPaisCasadosIgreja(int id, boolean novoPaisCasadosIgreja) {
        pessoaService.atualizarPessoaPaisCasadosIgreja(id, novoPaisCasadosIgreja);
    }

    public void atualizarPessoaParoquiaCasamento(int id, Paroquia novaParoquiaCasamento) {
        pessoaService.atualizarPessoaParoquiaCasamento(id, novaParoquiaCasamento);
    }

    public void atualizarPessoaCasamentoCivil(int id, boolean novoCasamentoCivil) {
        pessoaService.atualizarPessoaCasamentoCivil(id, novoCasamentoCivil);
    }

    public void atualizarPessoaTelefone(int id, String novoTelefone) {
        pessoaService.atualizarPessoaTelefone(id, novoTelefone);
    }

    public void atualizarPessoaEmail(int id, String novoEmail) {
        pessoaService.atualizarPessoaEmail(id, novoEmail);
    }

    public void deletarPessoa(int id) {
        pessoaService.deletarPessoa(id);
    }

    public void pessoaRelacao() {
        pessoaService.pessoasRelacao();;
    }

}
