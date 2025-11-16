package service;

import enuns.TIPOENDERECO;
import model.Endereco;

import java.util.ArrayList;
import java.util.List;

public class EnderecoService {

    private List<Endereco> enderecos = new ArrayList<>();

    public void cadastrarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public List<Endereco> listarEnderecos() {
        return enderecos;
    }

    public void atualizarEnderecoRua(int id, String novaRua) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                endereco.setRua(novaRua);
                System.out.println("Rua atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Endereço não foi encontrado.");
    }

    public void atualizarEnderecoNumero(int id, String novoNumero) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                endereco.setNumero(novoNumero);
                System.out.println("Número atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Endereço não foi encontrado.");
    }

    public void atualizarEnderecoComplemento(int id, String novoComplemento) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                endereco.setComplemento(novoComplemento);
                System.out.println("Complemento do endereço atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Endereço não foi encontrado.");
    }

    public void atualizarEnderecoBairro(int id, String novoBairro) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                endereco.setBairro(novoBairro);
                System.out.println("Bairro atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Endereço não foi encontrado.");
    }

    public void atualizarEnderecoCidade(int id, String novaCidade) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                endereco.setCidade(novaCidade);
                System.out.println("Cidade atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Endereço não foi encontrado.");
    }

    public void atualizarEnderecoUf(int id, String novaUf) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                endereco.setUf(novaUf);
                System.out.println("UF atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Endereço não foi encontrado.");
    }

    public void atualizarEnderecoCep(int id, String novoCep) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                endereco.setCep(novoCep);
                System.out.println("C.E.P atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Endereço não foi encontrado.");
    }

    public void atualizarEnderecoObservacao(int id, String novaObservacao) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                endereco.setObservacao(novaObservacao);
                System.out.println("Observação atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Endereço não foi encontrado.");
    }

    public void atualizarEnderecoTipoEndereco(int id, TIPOENDERECO novoTipoEndereco) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                endereco.setTipoEndereco(novoTipoEndereco);
                System.out.println("Tipo do endereço atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Endereço não foi encontrado.");
    }

    public void deletarEndereco(int id) {
        for (int i = 0; i < enderecos.size(); i++) {
            if (enderecos.get(i).getId() == id) {
                enderecos.remove(i);
                System.out.println("Endereço excluído com sucesso!");
                return;
            }
            System.out.println("ERRO: Endereço não encontrado!");
        }
    }

}
