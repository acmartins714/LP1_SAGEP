package service;

import model.Pessoa;
import model.PessoaMatrimonio;

import java.util.ArrayList;
import java.util.List;

public class PessoaMatrimonioService {

    private List<PessoaMatrimonio> pessoasMatrimonio = new ArrayList<>();

    public void cadastrarPessoaMatrimonio(PessoaMatrimonio pessoaMatrimonio) {
        pessoasMatrimonio.add(pessoaMatrimonio);
    }

    public List<PessoaMatrimonio> listarPessoasMatrimonio() {
        return pessoasMatrimonio;
    }

    //Metods
    public void atualizarPessoaMatrimonioConjuge(int id, Pessoa novoConjuge) {
        for (PessoaMatrimonio pessoaMatrimonio : pessoasMatrimonio) {
            if (pessoaMatrimonio.getId() == id) {
                pessoaMatrimonio.setConjuuge(novoConjuge);
                System.out.println("Conjuge atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa Matrimonio não foi encontrada.");
    }

    public void atualizarPessoaMatrimonioPadrinho(int id, List<Pessoa> novoPadrinho) {
        for (PessoaMatrimonio pessoaMatrimonio : pessoasMatrimonio) {
            if (pessoaMatrimonio.getId() == id) {
                pessoaMatrimonio.setPadrinhos(novoPadrinho);
                System.out.println("Padrinhos atualizados com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa Matrimonio não foi encontrada.");
    }

    public void atualizarPessoaMatrimonioMadrinha(int id, List<Pessoa> novaMadrinha) {
        for (PessoaMatrimonio pessoaMatrimonio : pessoasMatrimonio) {
            if (pessoaMatrimonio.getId() == id) {
                pessoaMatrimonio.setMadrinhas(novaMadrinha);
                System.out.println("Madrinhas atualizados com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa Matrimonio não foi encontrada.");
    }

    public void atualizarPessoaMatrimonioCasamentoEfeitoCivil(int id, boolean novoCasamentoEfeitoCivil) {
        for (PessoaMatrimonio pessoaMatrimonio : pessoasMatrimonio) {
            if (pessoaMatrimonio.getId() == id) {
                pessoaMatrimonio.setCasamentoEfeitoCivil(novoCasamentoEfeitoCivil);
                System.out.println("Efeito cívil do casamento atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa Matrimonio não foi encontrada.");
    }

    public void deletarPessoaMatrimonio(int id) {
        for (int i = 0; i < pessoasMatrimonio.size(); i++) {
            if (pessoasMatrimonio.get(i).getId() == id) {
                pessoasMatrimonio.remove(i);
                System.out.println("Matrimonio excluído com sucesso!");
                return;
            }
            System.out.println("ERRO: Catequizando não encontrada!");
        }
    }

}
