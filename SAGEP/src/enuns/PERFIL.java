package enuns;

public enum PERFIL {
    ADMIN("Administrador", 1),
    USUARIO("Usuário", 2);

    private final String descricao;
    private final int id;

    // Constructor
    PERFIL(String descricao, int id) {
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
