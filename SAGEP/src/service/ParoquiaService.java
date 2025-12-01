package service;

import model.Diocese;
import model.Endereco;
import model.Paroquia;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void paroquiasRelacao() {

        Iterator<Paroquia> lpIter = paroquias.iterator();
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println(" Relação de Paroquias");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        while (lpIter.hasNext()) {
            Paroquia paroquiaLista = lpIter.next();
            System.out.println("Identificador: " + String.format("%2d", paroquiaLista.getId()));
            System.out.println("C.N.P.J.: " + String.format("%s.%s.%s/%s-%s",  paroquiaLista.getCnpj().substring(0,2),paroquiaLista.getCnpj().substring(2,5),paroquiaLista.getCnpj().substring(5,8),paroquiaLista.getCnpj().substring(8,12),paroquiaLista.getCnpj().substring(12,14)));
            System.out.println("Nome: " + paroquiaLista.getNome());
            System.out.println("Responsável: " + paroquiaLista.getResponsavel());
            System.out.println("Título: " + paroquiaLista.getTitulo());
            System.out.println("Tipo do Endereço: " + paroquiaLista.getEndereco().getTipoEndereco().getId() + "-" + paroquiaLista.getEndereco().getTipoEndereco().getDescricao());
            System.out.println("Endereço: " + paroquiaLista.getEndereco().getRua() + ", " + paroquiaLista.getEndereco().getNumero());
            System.out.println("Complemento: " + paroquiaLista.getEndereco().getComplemento());
            System.out.println("Bairro: " + paroquiaLista.getEndereco().getBairro());
            System.out.println("Cidade: " + paroquiaLista.getEndereco().getCidade() + "-" + paroquiaLista.getEndereco().getUf());
            System.out.println("C.E.P.: " + String.format("%s-%s", paroquiaLista.getEndereco().getCep().substring(0,5), paroquiaLista.getEndereco().getCep().substring(5,8)));
            System.out.println("Observações: " + paroquiaLista.getEndereco().getObservacao());
            System.out.println("Telefone: " + paroquiaLista.getTelefone());
            System.out.println("e-mail: " + paroquiaLista.getEmail());
            System.out.println("site: " + paroquiaLista.getSite());
            System.out.println("Diocese: " + paroquiaLista.getDiocese().getNome());

        }

    }

}
