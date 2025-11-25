package model;

import java.time.LocalDate;

public class PessoaBatizando extends Pessoa {

    private Pessoa padrinho;

    // constructors
    public PessoaBatizando() {
    }

    public PessoaBatizando(int id, String nome, String cpf, LocalDate dataNascimento, String numeroCertNasc, String cidadeNasc, String ufNasc, Endereco endereco, boolean paisCasadosIgreja, Paroquia paroquiaCasamento, boolean casamentoCivil, String telefone, String email, Pessoa padrinho) {
        super(id, nome, cpf, dataNascimento, numeroCertNasc, cidadeNasc, ufNasc, endereco, paisCasadosIgreja, paroquiaCasamento, casamentoCivil, telefone, email);
        this.padrinho = padrinho;
    }

    // Getters and Setters
    public Pessoa getPadrinho() {
        return padrinho;
    }

    public void setPadrinho(Pessoa padrinho) {
        this.padrinho = padrinho;
    }

    // metods
    public void emissaoBatisterio() {

    };

}
