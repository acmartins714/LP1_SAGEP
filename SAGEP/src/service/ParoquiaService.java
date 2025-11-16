package service;

import model.Diocese;
import model.Endereco;
import model.Paroquia;

import java.util.ArrayList;
import java.util.List;

public class ParoquiaService {

    private List<Paroquia> paroquias = new ArrayList<>();

    public void cadastrarParoquia(Paroquia paroquia) {
        paroquias.add(paroquia);
    }

    public List<Paroquia> listarParoquias() {
        return paroquias;
    }

    public void atualizarParoquiaCnpj(int id, String novoCnpj) {
        for (Paroquia paroquia : paroquias) {
            if (paroquia.getId() == id) {
                paroquia.setCnpj(novoCnpj);
                System.out.println("C.N.P.J. da paroquia atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Paroquia não foi encontrada.");
    }

    public void atualizarParoquiaNome(int id, String novoNome) {
        for (Paroquia paroquia : paroquias) {
            if (paroquia.getId() == id) {
                paroquia.setNome(novoNome);
                System.out.println("Nome da paroquia atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Paroquia não foi encontrada.");
    }

    public void atualizarParoquiaResponsavel(int id, String novoResponsavel) {
        for (Paroquia paroquia : paroquias) {
            if (paroquia.getId() == id) {
                paroquia.setResponsavel(novoResponsavel);
                System.out.println("Responsável pela paroquia atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Paroquia não foi encontrada.");
    }

    public void atualizarParoquiaTitulo(int id, String novoTitulo) {
        for (Paroquia paroquia : paroquias) {
            if (paroquia.getId() == id) {
                paroquia.setTitulo(novoTitulo);
                System.out.println("Responsável pela paroquia atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Paroquia não foi encontrada.");
    }

    public void atualizarParoquiaEndereco(int id, Endereco novoEndereco) {
        for (Paroquia paroquia : paroquias) {
            if (paroquia.getId() == id) {
                paroquia.setEndereco(novoEndereco);
                System.out.println("Endereco da paroquia atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Paroquia não foi encontrada.");
    }

    public void atualizarParoquiaTelefone(int id, String novoTelefone) {
        for (Paroquia paroquia : paroquias) {
            if (paroquia.getId() == id) {
                paroquia.setTelefone(novoTelefone);
                System.out.println("Telefone da paroquia atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Paroquia não foi encontrada.");
    }

    public void atualizarParoquiaEmail(int id, String novoEmail) {
        for (Paroquia paroquia : paroquias) {
            if (paroquia.getId() == id) {
                paroquia.setEmail(novoEmail);
                System.out.println("e-mail da paroquia atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Paroquia não foi encontrada.");
    }

    public void atualizarParoquiaSite(int id, String novoSite) {
        for (Paroquia paroquia : paroquias) {
            if (paroquia.getId() == id) {
                paroquia.setSite(novoSite);
                System.out.println("Site da paroquia atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Paroquia não foi encontrada.");
    }

    public void atualizarParoquiaDiocese(int id, Diocese novaDiocese) {
        for (Paroquia paroquia : paroquias) {
            if (paroquia.getId() == id) {
                paroquia.setDiocese(novaDiocese);
                System.out.println("Diocese da paroquia atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Paroquia não foi encontrada.");
    }

    public void deletarParoquia(int id) {
        for (int i = 0; i < paroquias.size(); i++) {
            if (paroquias.get(i).getId() == id) {
                paroquias.remove(i);
                System.out.println("Paroquia excluída com sucesso!");
                return;
            }
            System.out.println("ERRO: Paroquia não encontrada!");
        }
    }

}
