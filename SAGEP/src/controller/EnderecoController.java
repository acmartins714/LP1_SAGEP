package controller;

import enuns.TIPOENDERECO;
import model.Endereco;
import service.EnderecoService;

import java.util.List;

public class EnderecoController {

    private EnderecoService enderecoService = new EnderecoService();

    public void cadastrarEndereco(Endereco endereco) {
        enderecoService.cadastrarEndereco(endereco);
    }

    public List<Endereco> listarEndereco() {
        return enderecoService.listarEnderecos();
    }

    public void atualizarEnderecoRua(int id, String novaRua) {
        enderecoService.atualizarEnderecoRua(id, novaRua);
    }

    public void atualizarEnderecoNumero(int id, String novoNumero) {
        enderecoService.atualizarEnderecoNumero(id, novoNumero);
    }

    public void atualizarEnderecoComplemento(int id, String novoComplemento) {
        enderecoService.atualizarEnderecoComplemento(id, novoComplemento);
    }

    public void atualizarEnderecoBairro(int id, String novoBairro) {
        enderecoService.atualizarEnderecoBairro(id, novoBairro);
    }

    public void atualizarEnderecoCidade(int id, String novaCidade) {
        enderecoService.atualizarEnderecoCidade(id, novaCidade);
    }

    public void atualizarEnderecoUf(int id, String novaUf) {
        enderecoService.atualizarEnderecoUf(id, novaUf);
    }

    public void atualizarEnderecoCep(int id, String novoCep) {
        enderecoService.atualizarEnderecoCep(id, novoCep);
    }

    public void atualizarEnderecoObservacao(int id, String novaObservacao) {
        enderecoService.atualizarEnderecoObservacao(id, novaObservacao);
    }

    public void atualizarEnderecoTipoEndereco(int id, TIPOENDERECO novoTipoEndereco) {
        enderecoService.atualizarEnderecoTipoEndereco(id, novoTipoEndereco);
    }

    public void deletarEndereco(int id) {
        enderecoService.deletarEndereco(id);
    }

}
