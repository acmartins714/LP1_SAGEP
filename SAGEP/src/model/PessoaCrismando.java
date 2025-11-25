package model;

import interfaces.EmissaoCertificado;

public class PessoaCrismando extends Pessoa  implements EmissaoCertificado {
    private Pessoa padrinho;
    private Pessoa madrinha;
    private String observacoes;

    // Constructors
    public PessoaCrismando() {
    }

    public PessoaCrismando(Pessoa padrino, Pessoa madrinha, String observacoes) {
        this.padrinho = padrinho;
        this.madrinha = madrinha;
        this.observacoes = observacoes;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    // Metods
    public void emissaoCertificado(PessoaCrismando pessoaCrismando) {

    }

    @Override
    public void emissaoCertificado() {

    }

}
