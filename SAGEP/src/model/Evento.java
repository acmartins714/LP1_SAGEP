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

    // Contructors
    public Evento() {
    }

    public Evento(int id, TIPOEVENTO tipoEvento, String nomeEvento, LocalDate dataInicial, LocalDate dataFinal, String local) {
        this.id = id;
        this.tipoEvento = tipoEvento;
        this.nomeEvento = nomeEvento;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.local = local;
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

    // Metods
    @Override
    public String toString() {
        return "Eventos{" +
                "id=" + id +
                ", nomeEvento='" + nomeEvento + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", local='" + local + '\'' +
                '}';
    }

}
