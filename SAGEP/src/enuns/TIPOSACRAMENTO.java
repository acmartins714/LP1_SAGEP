package enuns;

public enum TIPOSACRAMENTO {

    BATIZADO("Batizando", 1),
    CATEQUESE("Catequese", 2),
    CRISMA("Crisma", 3);

    private final String  descricao;
    private final int id;

    // Constructor
    TIPOSACRAMENTO(String descricao, int id) {
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
