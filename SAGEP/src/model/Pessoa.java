package model;

import java.time.LocalDate;

public class Pessoa {

    // Attributes
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String numeroCertNasc;
    private String cidadeNasc;
    private String ufNasc;
    private Pessoa pai;
    private Pessoa mae;
    private Endereco endereco;
    private boolean paisCasadosIgreja;
    private Paroquia paroquiaCasamento;
    private boolean casamentoCivil;
    private String telefone;
    private String email;

    // Constructors

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String cpf, LocalDate dataNascimento, String numeroCertNasc, String cidadeNasc, String ufNasc, Endereco endereco, boolean paisCasadosIgreja, Paroquia paroquiaCasamento, boolean casamentoCivil, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.numeroCertNasc = numeroCertNasc;
        this.cidadeNasc = cidadeNasc;
        this.ufNasc = ufNasc;
        this.endereco = endereco;
        this.paisCasadosIgreja = paisCasadosIgreja;
        this.paroquiaCasamento = paroquiaCasamento;
        this.casamentoCivil = casamentoCivil;
        this.telefone = telefone;
        this.email=email;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroCertNasc() {
        return numeroCertNasc;
    }

    public void setNumeroCertNasc(String numeroCertNasc) {
        this.numeroCertNasc = numeroCertNasc;
    }

    public String getCidadeNasc() {
        return cidadeNasc;
    }

    public void setCidadeNasc(String cidadeNasc) {
        this.cidadeNasc = cidadeNasc;
    }

    public String getUfNasc() {
        return ufNasc;
    }

    public void setUfNasc(String ufNasc) {
        this.ufNasc = ufNasc;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean isPaisCasadosIgreja() {
        return paisCasadosIgreja;
    }

    public void setPaisCasadosIgreja(boolean paisCasadosIgreja) {
        this.paisCasadosIgreja = paisCasadosIgreja;
    }

    public Paroquia getParoquiaCasamento() {
        return paroquiaCasamento;
    }

    public void setParoquiaCasamento(Paroquia paroquiaCasamento) {
        this.paroquiaCasamento = paroquiaCasamento;
    }

    public boolean isCasamentoCivil() {
        return casamentoCivil;
    }

    public void setCasamentoCivil(boolean casamentoCivil) {
        this.casamentoCivil = casamentoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", numeroCertNasc='" + numeroCertNasc + '\'' +
                ", cidadeNasc='" + cidadeNasc + '\'' +
                ", ufNasc='" + ufNasc + '\'' +
                ", pai=" + pai.toString() +
                ", mae=" + mae.toString() +
                ", endereco=" + endereco.toString() +
                ", paisCasadosIgreja=" + paisCasadosIgreja +
                ", paroquiaCasamento=" + paroquiaCasamento.toString() +
                ", casamentoCivil=" + casamentoCivil +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
