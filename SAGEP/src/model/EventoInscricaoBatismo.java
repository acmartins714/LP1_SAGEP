package model;

import enuns.TIPOEVENTO;

import java.time.LocalDate;

public class EventoInscricaoBatismo {
    private int id;
    private Evento evento;
    private PessoaBatizando batizando;
    private boolean pagamentoRealizado;

    // Constructors
    public EventoInscricaoBatismo() {
    }

    public EventoInscricaoBatismo(int id, Evento evento, PessoaBatizando batizando, boolean pagamentoRealizado) {
        this.id = id;
        this.evento = evento;
        this.batizando = batizando;
        this.pagamentoRealizado = pagamentoRealizado;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public PessoaBatizando getBatizando() {
        return batizando;
    }

    public void setBatizando(PessoaBatizando batizando) {
        this.batizando = batizando;
    }

    public boolean isPagamentoRealizado() {
        return pagamentoRealizado;
    }

    public void setPagamentoRealizado(boolean pagamentoRealizado) {
        this.pagamentoRealizado = pagamentoRealizado;
    }

    // Metods

    @Override
    public String toString() {
        return "EventoInscricaoBatismo{" +
                "evento=" + evento +
                ", batizando=" + batizando +
                ", pagamentoRealizado=" + pagamentoRealizado +
                '}';
    }

}
