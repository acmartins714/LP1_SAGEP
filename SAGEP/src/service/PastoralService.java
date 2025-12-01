package service;

import model.Pastoral;
import model.Pessoa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PastoralService {

    private List<Pastoral> pastorais = new ArrayList<>();

    public void cadastrarPastoral(Pastoral pastoral) {
        pastorais.add(pastoral);
    }

    public List<Pastoral> listarPastorais() {
        return pastorais;
    }

    public void atualizarPastoralNome(int id, String novoNome) {
        for (Pastoral pastoral : pastorais) {
            if (pastoral.getId() == id) {
                pastoral.setNome(novoNome);
                System.out.println("Nome da pastoral atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pastoral não foi encontrada.");
    }

    public void atualizarPastoralResponsavel(int id, Pessoa novoResponsavel) {
        for (Pastoral pastoral : pastorais) {
            if (pastoral.getId() == id) {
                pastoral.setResponsavel(novoResponsavel);
                System.out.println("Responsável pela pastoral atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pastoral não foi encontrada.");
    }

    public void atualizarPastoralEmail(int id, String novoEmail) {
        for (Pastoral pastoral : pastorais) {
            if (pastoral.getId() == id) {
                pastoral.setEmail(novoEmail);
                System.out.println("e-mail atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pastoral não foi encontrada.");
    }

    public void atualizarPastoralTelefone(int id, String novoTelefone) {
        for (Pastoral pastoral : pastorais) {
            if (pastoral.getId() == id) {
                pastoral.setTelefone(novoTelefone);
                System.out.println("Telefone da pastoral atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pastoral não foi encontrada.");
    }

    public void pastoraisRelacao() {

        Iterator<Pastoral> pastoralIter = pastorais.iterator();

        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println(" Relação das Pastorais");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        while (pastoralIter.hasNext()) {

            Pastoral pastoralLista = pastoralIter.next();

            System.out.println("Identificador: " + String.format("%2d", pastoralLista.getId()));
            System.out.println("Nome: " + pastoralLista.getNome());
            System.out.println("e-mail: " + pastoralLista.getEmail());
            System.out.println("Telefone: " + pastoralLista.getTelefone());
            System.out.println("Responsável: " + pastoralLista.getResponsavel().getNome());
            System.out.println(" - Nome: " + pastoralLista.getResponsavel().getNome());

            if (pastoralLista.getResponsavel().getPai() != null) {
                System.out.println(" - Pai: " + pastoralLista.getResponsavel().getPai().getNome());
            } else {
                System.out.println(" - Pai: ");
            }

            if (pastoralLista.getResponsavel().getMae() != null) {
                System.out.println(" - Mãe: " + pastoralLista.getResponsavel().getMae().getNome());
            } else {
                System.out.println(" - Mãe: ");
            }

            System.out.println(" - telefone: " + pastoralLista.getResponsavel().getTelefone());
            System.out.println(" - e-mail: " + pastoralLista.getResponsavel().getEmail());
            System.out.println("--------------------------------------------------------------------------------------------------------------");

        }
    }

}
