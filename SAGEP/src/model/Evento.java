package model;

import enuns.TIPOEVENTO;

import java.time.LocalDate;

public class Evento {
    private int id;
    private TIPOEVENTO tipoEvento;
    private String nomeEvento;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private String local;
    private int numeroMaximoInscricoes;
    private double valorInscricao;

    // Contructors
    public Evento() {
    }

    public Evento(int id, TIPOEVENTO tipoEvento, String nomeEvento, LocalDate dataInicial, LocalDate dataFinal, String local, int numeroMaximoInscricoes, double valorInscricao) {
        this.id = id;
        this.tipoEvento = tipoEvento;
        this.nomeEvento = nomeEvento;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.local = local;
        this.numeroMaximoInscricoes = numeroMaximoInscricoes;
        this.valorInscricao = valorInscricao;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TIPOEVENTO getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TIPOEVENTO tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getNumeroMaximoInscricoes() {
        return numeroMaximoInscricoes;
    }

    public void setNumeroMaximoInscricoes(int numeroMaximoInscricoes) {
        this.numeroMaximoInscricoes = numeroMaximoInscricoes;
    }

    public double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", tipoEvento=" + tipoEvento +
                ", nomeEvento='" + nomeEvento + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", local='" + local + '\'' +
                ", numeroMaximoInscricoes=" + numeroMaximoInscricoes +
                ", valorInscricao=" + valorInscricao +
                '}';
    }
}
