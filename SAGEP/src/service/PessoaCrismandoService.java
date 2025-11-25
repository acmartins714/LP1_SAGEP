package service;

import model.Pessoa;
import model.PessoaCatequizando;
import model.PessoaCrismando;

import java.util.ArrayList;
import java.util.List;

public class PessoaCrismandoService {

    private List<PessoaCrismando> pessoasCrismando = new ArrayList<>();

    public void cadastrarPessoaCrismando(PessoaCrismando pessoaCrismando) {
        pessoasCrismando.add(pessoaCrismando);
    }

    public List<PessoaCrismando> listarPessoasCrismando() {
        return pessoasCrismando;
    }

    //Metods
    public void atualizarPessoaCrismandoPadrinho(int id, Pessoa novoPadrinho) {
        for (PessoaCrismando pessoaCrismando : pessoasCrismando) {
            if (pessoaCrismando.getId() == id) {
                pessoaCrismando.setPadrinho(novoPadrinho);
                System.out.println("Padrinho atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Crismando não foi encontrado.");
    }

    public void atualizarPessoaCrismandoMadrinha(int id, Pessoa novaMadrinha) {
        for (PessoaCrismando pessoaCrismando : pessoasCrismando) {
            if (pessoaCrismando.getId() == id) {
                pessoaCrismando.setMadrinha(novaMadrinha);
                System.out.println("Madrinha atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Crismado não foi encontrada.");
    }

    public void atualizarPessoaCrismandoObservacoes(int id, String novaObservacao) {
        for (PessoaCrismando pessoaCrismando : pessoasCrismando) {
            if (pessoaCrismando.getId() == id) {
                pessoaCrismando.setObservacoes(novaObservacao);
                System.out.println("Observações atualizadas com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Crismado não foi encontrada.");
    }

    public void deletarPessoaCrismando(int id) {
        for (int i = 0; i < pessoasCrismando.size(); i++) {
            if (pessoasCrismando.get(i).getId() == id) {
                pessoasCrismando.remove(i);
                System.out.println("Crismando excluído com sucesso!");
                return;
            }
            System.out.println("ERRO: Crismando não encontrada!");
        }
    }

}
