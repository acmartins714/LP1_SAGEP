package enuns;

public enum TIPOENDERECO {

    RESIDENCIAL("Residencial", 1),
    COMERCIAL("Comercial", 2);

    private final String  descricao;
    private final int id;

    // Constructor
    TIPOENDERECO(String descricao, int id) {
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
