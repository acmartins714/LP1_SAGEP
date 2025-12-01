package controller;

import model.Diocese;
import model.Endereco;
import model.Paroquia;
import service.ParoquiaService;

import java.util.List;

public class ParoquiaController {

    private ParoquiaService paroquiaService = new ParoquiaService();

    public void cadastrarParoquia(Paroquia paroquia) {
        paroquiaService.cadastrarParoquia(paroquia);
    }

    public List<Paroquia> listarParoqia() {
        return paroquiaService.listarParoquias();
    }

    public void atualizarParoquiaCnpj(int id, String novoCnpj) {
        paroquiaService.atualizarParoquiaCnpj(id, novoCnpj);
    }

    public void atualizarParoquiaNome(int id, String novoNome) {
        paroquiaService.atualizarParoquiaNome(id, novoNome);
    }

    public void atualizarParoquiaResponsavel(int id, String novoResponsavel) {
        paroquiaService.atualizarParoquiaResponsavel(id, novoResponsavel);
    }

    public void atualizarParoquiaTitulo(int id, String novoTitulo) {
        paroquiaService.atualizarParoquiaTitulo(id, novoTitulo);
    }

    public void atualizarParoquiaEndereco(int id, Endereco novoEndereco) {
        paroquiaService.atualizarParoquiaEndereco(id, novoEndereco);
    }

    public void atualizarParoquiaTelefone(int id, String novoTelefone) {
        paroquiaService.atualizarParoquiaTelefone(id, novoTelefone);
    }

    public void atualizarParoquiaEmail(int id, String novoEmail) {
        paroquiaService.atualizarParoquiaEmail(id, novoEmail);
    }

    public void atualizarParoquiaSite(int id, String novoSite) {
        paroquiaService.atualizarParoquiaSite(id, novoSite);
    }

    public void atualizarParoquiaDiocese(int id, Diocese novaDiocese) {
        paroquiaService.atualizarParoquiaDiocese(id, novaDiocese);
    }

    public void deletarParoquia(int id) {
        paroquiaService.deletarParoquia(id);
    }

    public void paroquiasRelacao() {
        paroquiaService.paroquiasRelacao();
    }

}
