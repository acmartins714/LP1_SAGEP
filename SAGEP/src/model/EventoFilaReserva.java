package model;

import enuns.TIPOFILARESERVA;

import java.time.LocalDate;

public class EventoFilaReserva {

    private int id;
    private Evento evento;
    private Pessoa pessoa;
    private LocalDate dataReserva;
    private TIPOFILARESERVA tipofilareserva;
    private boolean inscricaoEfetivada;

    // Constructors
    public EventoFilaReserva() {
    }

    public EventoFilaReserva(int id, Evento evento, Pessoa pessoa, LocalDate dataReserva, TIPOFILARESERVA tipofilareserva, boolean inscricaoEfetivada) {
        this.id = id;
        this.evento = evento;
        this.pessoa = pessoa;
        this.dataReserva = dataReserva;
        this.tipofilareserva = tipofilareserva;
        this.inscricaoEfetivada = inscricaoEfetivada;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public TIPOFILARESERVA getTipofilareserva() {
        return tipofilareserva;
    }

    public void setTipofilareserva(TIPOFILARESERVA tipofilareserva) {
        this.tipofilareserva = tipofilareserva;
    }

    public boolean isInscricaoEfetivada() {
        return inscricaoEfetivada;
    }

    public void setInscricaoEfetivada(boolean inscricaoEfetivada) {
        this.inscricaoEfetivada = inscricaoEfetivada;
    }

    // Metods
    @Override
    public String toString() {
        return "EventoFilaReserva{" +
                "id=" + id +
                ", evento=" + evento +
                ", pessoa=" + pessoa +
                ", dataReserva=" + dataReserva +
                ", tipofilareserva=" + tipofilareserva +
                ", inscricaoEfetivada=" + inscricaoEfetivada +
                '}';
    }

}
