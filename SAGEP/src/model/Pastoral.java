package model;

public class Pastoral {

    // Attributes
    private int id;
    private String nome;
    private Pessoa responsavel;
    private String email;
    private String telefone;

    // Constructors
    public Pastoral() {
    }

    public Pastoral(int id, String nome, Pessoa responsavel, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.responsavel = responsavel;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
