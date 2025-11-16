package model;

public class Paroquia {
    private int Id;
    private String Cnpj;
    private String nome;
    private String responsavel;
    private String titulo;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String site;
    private Diocese diocese;

    // Coonstructors
    public Paroquia() {
    }

    public Paroquia(int id, String Cnpj, String nome, String responsavel, String titulo, Endereco endereco, String telefone, String email, String site, Diocese diocese) {
        Id = id;
        this.Cnpj = Cnpj;
        this.nome = nome;
        this.responsavel = responsavel;
        this.titulo = titulo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.site = site;
        this.diocese = diocese;
    }

    // getters and setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        this.Cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Diocese getDiocese() {
        return diocese;
    }

    public void setDiocese(Diocese diocese) {
        this.diocese = diocese;
    }

}
