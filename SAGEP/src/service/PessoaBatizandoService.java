package service;

import model.Pessoa;
import model.PessoaBatizando;
import model.PessoaCatequizando;

import java.util.ArrayList;
import java.util.List;

public class PessoaBatizandoService {

    private List<PessoaBatizando> pessoasBatizando = new ArrayList<>();

    public void cadastrarPessoaBatizando(PessoaBatizando pessoaBatizando) {
        pessoasBatizando.add(pessoaBatizando);
    }

    public List<PessoaBatizando> listarPessoasBatizando() {
        return pessoasBatizando;
    }

    //Metods
    public void atualizarPessoaBatizandoPadrinho(int id, Pessoa novoPadrinho) {
        for (PessoaBatizando pessoaBatizando : pessoasBatizando) {
            if (pessoaBatizando.getId() == id) {
                pessoaBatizando.setPadrinho(novoPadrinho);
                System.out.println("Padrinho atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Batizando não foi encontrado.");
    }

    public void deletarPessoaBatizando(int id) {
        for (int i = 0; i < pessoasBatizando.size(); i++) {
            if (pessoasBatizando.get(i).getId() == id) {
                pessoasBatizando.remove(i);
                System.out.println("Batizando excluído com sucesso!");
                return;
            }
            System.out.println("ERRO: Catequizando não encontrada!");
        }
    }

}
