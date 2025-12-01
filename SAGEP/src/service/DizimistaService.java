package service;

import enuns.TIPOENDERECO;
import model.Dizimista;
import model.Endereco;
import model.Paroquia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DizimistaService {

    private List<Dizimista> dizimistas = new ArrayList<>();

    public void cadastrarDizimista(Dizimista dizimista) {
        dizimistas.add(dizimista);
    }

    public List<Dizimista> listarDizimistas() {
        return dizimistas;
    }

    public void atualizarDizimistaContribuicaoFixa(int id, boolean novaContribuicaoFixa) {
        for (Dizimista dizimista : dizimistas) {
            if (dizimista.getId() == id) {
                dizimista.setContribuicaoFixa(novaContribuicaoFixa);
                System.out.println("Contribuição Fixa atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Dizimista não foi encontrado.");
    }

    public void atualizarDizimistaValorContribuicao(int id, double novoValorContribuicao) {
        for (Dizimista dizimista : dizimistas) {
            if (dizimista.getId() == id) {
                dizimista.setValorContribuicao(novoValorContribuicao);
                System.out.println("Valor da Contribuição atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Dizimista não foi encontrado.");
    }

    public void deletarDizimista(int id) {
        for (int i = 0; i < dizimistas.size(); i++) {
            if (dizimistas.get(i).getId() == id) {
                dizimistas.remove(i);
                System.out.println("Dizimista excluído com sucesso!");
                return;
            }
            System.out.println("ERRO: Dizimista não encontrado!");
        }
    }

    public void dizimistasRelacao() {

        Iterator<Dizimista> dizimistaIter = dizimistas.iterator();

        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println(" Relação dos Dizimistas");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        while (dizimistaIter.hasNext()) {

            Dizimista dizimistaLista = dizimistaIter.next();

            System.out.println("Identificador: " + String.format("%2d", dizimistaLista.getId()));
            System.out.println("Nome: " + dizimistaLista.getNome());
            System.out.println("Rua: " + dizimistaLista.getEndereco().getRua() + " Nº " + dizimistaLista.getEndereco().getNumero());
            System.out.println("Complemento: " + dizimistaLista.getEndereco().getComplemento());
            System.out.println("Bairro: " + dizimistaLista.getEndereco().getBairro() + " Cidade-UF: " + dizimistaLista.getEndereco().getCidade() + "-" + dizimistaLista.getEndereco().getUf());
            System.out.println("C.E.P.: " + dizimistaLista.getEndereco().getCep());
            System.out.println("Observações: " + dizimistaLista.getEndereco().getObservacao());
            System.out.println("e-mail: " + dizimistaLista.getEmail());
            System.out.println("Telefone: " + dizimistaLista.getTelefone());
            System.out.println("Filiação: ");

            if (dizimistaLista.getPai() != null) {
                System.out.println(" - Pai: " + dizimistaLista.getPai().getNome());
                System.out.println("   - telefone: " + dizimistaLista.getPai().getTelefone());
                System.out.println("   - e-mail: " + dizimistaLista.getPai().getEmail());
            } else {
                System.out.println(" - Pai: ");
                System.out.println("   - telefone: ");
                System.out.println("   - e-mail: ");
            }

            if (dizimistaLista.getMae() != null) {
                System.out.println(" - Mãe: " + dizimistaLista.getMae().getNome());
                System.out.println("   - telefone: " + dizimistaLista.getMae().getTelefone());
                System.out.println("   - e-mail: " + dizimistaLista.getMae().getEmail());
            } else {
                System.out.println(" - Mãe: ");
                System.out.println("   - telefone: ");
                System.out.println("   - e-mail: ");
            }

            System.out.println("--------------------------------------------------------------------------------------------------------------");

        }

    }

}
