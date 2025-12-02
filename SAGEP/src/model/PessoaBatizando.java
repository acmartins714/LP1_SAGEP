package model;

import java.time.LocalDate;

public class PessoaBatizando extends Pessoa {

    private Pessoa padrinho;
    private Pessoa madrinha;

    // constructors
    public PessoaBatizando() {
    }

    public PessoaBatizando(int id, String nome, String cpf, LocalDate dataNascimento, String numeroCertNasc, String cidadeNasc, String ufNasc, Endereco endereco, boolean paisCasadosIgreja, Paroquia paroquiaCasamento, boolean casamentoCivil, String telefone, String email, Pessoa padrinho, Pessoa madrinha) {
        super(id, nome, cpf, dataNascimento, numeroCertNasc, cidadeNasc, ufNasc, endereco, paisCasadosIgreja, paroquiaCasamento, casamentoCivil, telefone, email);
        this.padrinho = padrinho;
        this.madrinha = madrinha;
    }

    // Getters and Setters
    public Pessoa getPadrinho() {
        return padrinho;
    }

    public void setPadrinho(Pessoa padrinho) {
        this.padrinho = padrinho;
    }

    public Pessoa getMadrinha() {
        return madrinha;
    }

    public void setMadrinha(Pessoa madrinha) {
        this.madrinha = madrinha;
    }

    // metods
    public void emissaoBatisterio() {

    };

}
