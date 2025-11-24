package enuns;

public enum TIPOENCONTRO {

    EJC("Encontro de Jovens com Cristo", 1),
    ECC("Encontro de Casais", 2),
    PADRINHOS("Preparação para Apadrinhamentos", 3);

    private final String  descricao;
    private final int id;

    // Constructor
    TIPOENCONTRO(String descricao, int id) {
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
