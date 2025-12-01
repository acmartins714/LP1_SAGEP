package controller;

import model.Diocese;
import model.Endereco;
import service.DioceseService;

import java.util.List;

public class DioceseController {

    private DioceseService dioceseService = new DioceseService();

    public void cadastrarDiocese(Diocese diocese) {
        dioceseService.cadastrarDiocese(diocese);
    }

    public List<Diocese> listarDiocese() {
        return dioceseService.listarDioceses();
    }

    public void atualizarDioceseCnpj(int id, String novoCnpj) {
        dioceseService.atualizarDioceseCnpj(id, novoCnpj);
    }

    public void atualizarDioceseNome(int id, String novoNome) {
        dioceseService.atualizarDioceseNome(id, novoNome);
    }

    public void atualizarDioceseResponsavel(int id, String novoResponsavel) {
        dioceseService.atualizarDioceseResponsavel(id, novoResponsavel);
    }

    public void atualizarDioceseTitulo(int id, String novoTitulo) {
        dioceseService.atualizarDioceseTitulo(id, novoTitulo);
    }

    public void atualizarDioceseEndereco(int id, Endereco novoEndereco) {
        dioceseService.atualizarDioceseEndereco(id, novoEndereco);
    }

    public void atualizarDioceseTelefone(int id, String novoTelefone) {
        dioceseService.atualizarDioceseTelefone(id, novoTelefone);
    }

    public void atualizarDioceseEmail(int id, String novoEmail) {
        dioceseService.atualizarDioceseEmail(id, novoEmail);
    }

    public void atualizarDioceseSite(int id, String novoSite) {
        dioceseService.atualizarDioceseSite(id, novoSite);
    }

    public void deletarDiocesa(int id) {
        dioceseService.deletarDiocese(id);
    }

    public void diocesesRelacao() {
        dioceseService.diocesesRelacao();
    }

}
