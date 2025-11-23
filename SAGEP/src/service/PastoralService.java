package service;

import model.Pastoral;
import model.Pessoa;

import java.util.ArrayList;
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

}
