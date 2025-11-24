package enuns;

public enum TIPOEVENTO {
    SACRAMENTO("Sacramento", 1),
    ENCONTRO("Encontro", 2),
    FORMACAO("Formação", 3);

    // Atributes
    private final String  descricao;
    private final int id;

    // Constructor
    TIPOEVENTO(String descricao, int id) {
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
