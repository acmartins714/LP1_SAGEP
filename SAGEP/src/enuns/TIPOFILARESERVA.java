package enuns;

public enum TIPOFILARESERVA {

    FILA("Fila", 1),
    RESERVA("Reserva", 2);

    // Atributes
    private final String  descricao;
    private final int id;

    // Constructor
    TIPOFILARESERVA(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }

    // Getters and Setters
    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

}
