package controller;

import model.Endereco;
import model.Paroquia;
import model.PessoaCatequizando;
import service.PessoaCatequizandoService;

import java.time.LocalDate;
import java.util.List;

public class PessoaCatequizandoController {

    private PessoaCatequizandoService pessoaCatequizandoService = new PessoaCatequizandoService();

    //Metods
    public void cadastrarPessoaCatequizando(PessoaCatequizando pessoaCatequizando) {
        pessoaCatequizandoService.cadastrarPessoaCatequizando(pessoaCatequizando);
    }

    public List<PessoaCatequizando> listarPessoasCatequizando() {
        return pessoaCatequizandoService.listarPessoasCatequizando();
    }

    public void atualizarPessoaCatequizandoAlergia(int id, String novaAlergia) {
        pessoaCatequizandoService.atualizarPessoaCatequizandoAlergia(id, novaAlergia);
    }

    public void atualizarPessoaCatequizando(int id, String novaNecessidadeEspecial) {
        pessoaCatequizandoService.atualizarPessoaCatequizandoNecessidadeEspecial(id, novaNecessidadeEspecial);
    }

    public void deletarPessoaCatequizando(int id) {
        pessoaCatequizandoService.deletarPessoaCatequizando(id);
    }

}
