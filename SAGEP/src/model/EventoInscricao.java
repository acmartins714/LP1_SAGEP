package model;

public class EventoInscricao {
    protected Integer id;
    protected Evento evento;

    // Contructors
    public EventoInscricao() {
    }

    public EventoInscricao(Integer id, Evento evento) {
        this.id = id;
        this.evento = evento;
    }

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    // Metods
    @Override
    public String toString() {
        return "InscricaoEvento{" +
                "id=" + id +
                ", evento=" + evento +
                '}';
    }

}
