package model;

import interfaces.EmissaoCertificado;

public class PessoaCatequizando extends Pessoa implements EmissaoCertificado {
    private String alergia;
    private String necessidadeEspecial;

    // contructors
    public PessoaCatequizando() {
    }

    public PessoaCatequizando(String alergias, String necessidadesEspeciais) {
        this.alergia = alergia;
        this.necessidadeEspecial = necessidadeEspecial;
    }

    // getters and setters
    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getNecessidadeEspecial() {
        return necessidadeEspecial;
    }

    public void setNecessidadeEspecial(String necessidadeEspeciail) {
        this.necessidadeEspecial = necessidadeEspecial;
    }

    // Metods
    @Override
    public void emissaoCertificado() {
    }


}
