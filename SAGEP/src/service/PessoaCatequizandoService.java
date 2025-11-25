package service;

import model.Endereco;
import model.Paroquia;
import model.PessoaCatequizando;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaCatequizandoService {

    private List<PessoaCatequizando> pessoasCatequizando = new ArrayList<>();

    public void cadastrarPessoaCatequizando(PessoaCatequizando pessoaCatequizando) {
        pessoasCatequizando.add(pessoaCatequizando);
    }

    public List<PessoaCatequizando> listarPessoasCatequizando() {
        return pessoasCatequizando;
    }

    //Metods
    public void atualizarPessoaCatequizandoAlergia(int id, String novaAlergia) {
        for (PessoaCatequizando pessoaCatequizando : pessoasCatequizando) {
            if (pessoaCatequizando.getId() == id) {
                pessoaCatequizando.setNome(novaAlergia);
                System.out.println("Alergias atualizadas com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Catequizando não foi encontrada.");
    }

    public void atualizarPessoaCatequizandoNecessidadeEspecial(int id, String novaNecessidadeEspecial) {
        for (PessoaCatequizando pessoaCatequizando : pessoasCatequizando) {
            if (pessoaCatequizando.getId() == id) {
                pessoaCatequizando.setNecessidadeEspecial(novaNecessidadeEspecial);
                System.out.println("Necessidades Especiais atualizadas com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Catequizando não foi encontrada.");
    }

    public void deletarPessoaCatequizando(int id) {
        for (int i = 0; i < pessoasCatequizando.size(); i++) {
            if (pessoasCatequizando.get(i).getId() == id) {
                pessoasCatequizando.remove(i);
                System.out.println("Catequizando excluído com sucesso!");
                return;
            }
            System.out.println("ERRO: Catequizando não encontrada!");
        }
    }

}
