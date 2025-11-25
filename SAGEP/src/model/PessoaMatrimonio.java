package model;

import java.util.List;

public class PessoaMatrimonio extends Pessoa {

    private Pessoa conjuuge;
    private List<Pessoa> padrinhos;
    private List<Pessoa> madrinhas;
    private boolean casamentoEfeitoCivil;

    // Constructors
    public PessoaMatrimonio() {
    }

    public PessoaMatrimonio(Pessoa conjuuge, List<Pessoa> padrinhos, List<Pessoa> madrinhas, boolean casamentoEfeitoCivil) {
        this.conjuuge = conjuuge;
        this.padrinhos = padrinhos;
        this.madrinhas = madrinhas;
        this.casamentoEfeitoCivil = casamentoEfeitoCivil;
    }

    // Getters and Setters
    public Pessoa getConjuuge() {
        return conjuuge;
    }

    public void setConjuuge(Pessoa conjuuge) {
        this.conjuuge = conjuuge;
    }

    public List<Pessoa> getPadrinhos() {
        return padrinhos;
    }

    public void setPadrinhos(List<Pessoa> padrinhos) {
        this.padrinhos = padrinhos;
    }

    public List<Pessoa> getMadrinhas() {
        return madrinhas;
    }

    public void setMadrinhas(List<Pessoa> madrinhas) {
        this.madrinhas = madrinhas;
    }

    public boolean isCasamentoEfeitoCivil() {
        return casamentoEfeitoCivil;
    }

    public void setCasamentoEfeitoCivil(boolean casamentoEfeitoCivil) {
        this.casamentoEfeitoCivil = casamentoEfeitoCivil;
    }

    public void emissaoCertificado(PessoaMatrimonio pessoaMatrimonio) {

    }

}
