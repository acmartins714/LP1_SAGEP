package service;

import model.Diocese;
import model.Endereco;

import java.util.ArrayList;
import java.util.List;

public class DioceseService {

    private List<Diocese> dioceses = new ArrayList<>();

    public void cadastrarDiocese(Diocese diocese) {
        dioceses.add(diocese);
    }

    public List<Diocese> listarDioceses() {
        return dioceses;
    }

    public void atualizarDioceseCnpj(int id, String novoCnpj) {
        for (Diocese diocese : dioceses) {
            if (diocese.getId() == id) {
                diocese.setCnpj(novoCnpj);
                System.out.println("C.N.P.J. da diocese atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Diocese não foi encontrada.");
    }

    public void atualizarDioceseNome(int id, String novoNome) {
        for (Diocese diocese : dioceses) {
            if (diocese.getId() == id) {
                diocese.setNome(novoNome);
                System.out.println("Nome da diocese atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Diocese não foi encontrada.");
    }

    public void atualizarDioceseResponsavel(int id, String novoResponsavel) {
        for (Diocese diocese : dioceses) {
            if (diocese.getId() == id) {
                diocese.setResponsavel(novoResponsavel);
                System.out.println("Responsável da diocese atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Diocese não foi encontrada.");
    }

    public void atualizarDioceseTitulo(int id, String novoTitulo) {
        for (Diocese diocese : dioceses) {
            if (diocese.getId() == id) {
                diocese.setTitulo(novoTitulo);
                System.out.println("Titulo do responsável pela diocese atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Diocese não foi encontrada.");
    }

    public void atualizarDioceseEndereco(int id, Endereco novoEndereco) {
        for (Diocese diocese : dioceses) {
            if (diocese.getId() == id) {
                diocese.setEndereco(novoEndereco);
                System.out.println("Endereco da diocese atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Diocese não foi encontrada.");
    }

    public void atualizarDioceseTelefone(int id, String novoTelefone) {
        for (Diocese diocese : dioceses) {
            if (diocese.getId() == id) {
                diocese.setTelefone(novoTelefone);
                System.out.println("Telefone da diocese atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Diocese não foi encontrada.");
    }

    public void atualizarDioceseEmail(int id, String novoEmail) {
        for (Diocese diocese : dioceses) {
            if (diocese.getId() == id) {
                diocese.setEmail(novoEmail);
                System.out.println("e-mail da diocese atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Diocese não foi encontrada.");
    }

    public void atualizarDioceseSite(int id, String novoSite) {
        for (Diocese diocese : dioceses) {
            if (diocese.getId() == id) {
                diocese.setSite(novoSite);
                System.out.println("Site da diocese atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Diocese não foi encontrada.");
    }

    public void deletarDiocese(int id) {
        for (int i = 0; i < dioceses.size(); i++) {
            if (dioceses.get(i).getId() == id) {
                dioceses.remove(i);
                System.out.println("Diocese excluída com sucesso!");
                return;
            }
            System.out.println("ERRO: Diocese não encontrada!");
        }
    }

}
