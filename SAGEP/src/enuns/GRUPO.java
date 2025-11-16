package enuns;

public enum GRUPO {

    ADMIN("Administrador", 1),
    CATEQUISTA("Catequista", 2),
    FAMILIA("Família", 3),
    DIZIMO("Dizimo", 4),
    RUA("Rua", 5);

    private final String  descricao;
    private final int id;

    // Constructor
    GRUPO(String descricao, int id) {
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
