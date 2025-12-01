package controller;

import model.Pastoral;
import model.Pessoa;
import service.PastoralService;

import java.util.List;

public class PastoralController {

    private PastoralService pastoralService = new PastoralService();

    public void cadastrarpastoral(Pastoral pastoral) {
        pastoralService.cadastrarPastoral(pastoral);
    }

    public List<Pastoral> listarPastorais() {
        return pastoralService.listarPastorais();
    }

    public void atualizarPastoralNome(int id, String novoNome) {
        pastoralService.atualizarPastoralNome(id, novoNome);
    }

    public void atualizarPastotalResponsavel(int id, Pessoa novoResponsavel) {
        pastoralService.atualizarPastoralResponsavel(id, novoResponsavel);
    }

    public void atualizarPastoralEmail(int id, String novoEmail) {
        pastoralService.atualizarPastoralEmail(id, novoEmail);
    }

    public void atualizarPastoralTelefone(int id, String novoTelefone) {
        pastoralService.atualizarPastoralTelefone(id, novoTelefone);
    }

    public void pastoraisRelacao() {
        pastoralService.pastoraisRelacao();
    }

}
