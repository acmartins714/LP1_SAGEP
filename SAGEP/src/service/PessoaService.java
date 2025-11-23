package service;

import model.Paroquia;
import model.Pessoa;
import model.Endereco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return pessoas;
    }

    //Metods
    public void atualizarPessoaNome(int id, String novoNome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setNome(novoNome);
                System.out.println("Nome atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaCpf(int id, String novoCpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setCpf(novoCpf);
                System.out.println("C.P.F. atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaDataNascimento(int id, LocalDate novaDataNascimento) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setDataNascimento(novaDataNascimento);
                System.out.println("Data de nascimento atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaNumeroCertNasc(int id, String novoNumeroCertNasc) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setNumeroCertNasc(novoNumeroCertNasc);
                System.out.println("Número da certidão de nascimento atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaCidadeNasc(int id, String novaCidadeNasc) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setCidadeNasc(novaCidadeNasc);
                System.out.println("Naturalizade atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaUfNasc(int id, String novaUfNasc) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setUfNasc(novaUfNasc);
                System.out.println("UF da naturalidade atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaEndereco(int id, Endereco novoEndereco) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setEndereco(novoEndereco);
                System.out.println("UF da naturalidade atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaPaisCasadosIgreja(int id, boolean novoPaisCasadosIgreja) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setPaisCasadosIgreja(novoPaisCasadosIgreja);
                System.out.println("Situação de casamento na Igreja atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaParoquiaCasamento(int id, Paroquia novaParoquiaCasamento) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setParoquiaCasamento(novaParoquiaCasamento);
                System.out.println("Paroquia da realização do casamento atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaCasamentoCivil(int id, boolean novoCasamentoCivil) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setCasamentoCivil(novoCasamentoCivil);
                System.out.println("Situação do casamento civil atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaTelefone(int id, String novoTelefone) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setEmail(novoTelefone);
                System.out.println("Telefoneatualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void atualizarPessoaEmail(int id, String novoEmail) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                pessoa.setEmail(novoEmail);
                System.out.println("e-mail da pessoa atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Pessoa não foi encontrada.");
    }

    public void deletarPessoa(int id) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == id) {
                pessoas.remove(i);
                System.out.println("Pessoa excluída com sucesso!");
                return;
            }
            System.out.println("ERRO: Pessoa não encontrada!");
        }
    }

}
