package model;

public class EventoInscricaoBatismo extends EventoInscricao {
    private PessoaBatizando batizando;
    private Pessoa padrinho;
    private Pessoa madrinha;
    private boolean pagamentoRealizado;

    // Constructors
    public EventoInscricaoBatismo() {
    }

    public EventoInscricaoBatismo(Integer id, Evento evento, PessoaBatizando batizando, Pessoa padrinho, Pessoa madrinha, boolean pagamentoRealizado) {
        super(id, evento);
        this.batizando = batizando;
        this.padrinho = padrinho;
        this.madrinha = madrinha;
        this.pagamentoRealizado = pagamentoRealizado;
    }

    // Getters and Setters
    public PessoaBatizando getBatizando() {
        return batizando;
    }

    public void setBatizando(PessoaBatizando batizando) {
        this.batizando = batizando;
    }

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
                "batizando=" + batizando +
                ", padrinho=" + padrinho +
                ", madrinha=" + madrinha +
                ", pagamentoRealizado=" + pagamentoRealizado +
                ", id=" + id +
                ", evento=" + evento +
                '}';
    }

}
