package model;

import enuns.TIPOENDERECO;

public class Endereco {

    private int id;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String observacao;
    private TIPOENDERECO tipoEndereco;

    // Contructors
    public Endereco() {
    }

    public Endereco(int id, String rua, String numero, String complemento, String bairro, String cidade, String uf, String cep, String observacao, TIPOENDERECO tipoEndereco) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.observacao = observacao;
        this.tipoEndereco = tipoEndereco;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public TIPOENDERECO getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TIPOENDERECO tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

}
