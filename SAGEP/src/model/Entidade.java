package model;

public abstract class Entidade {

    protected int id;
    protected String Cnpj;
    protected String nome;
    protected String responsavel;
    protected String titulo;
    protected Endereco endereco;
    protected String telefone;
    protected String email;
    protected String site;

    // Coonstructors
    public Entidade() {
    }

    public Entidade(int id, String Cnpj, String nome, String responsavel, String titulo, Endereco endereco, String telefone, String email, String site) {
        this.id = id;
        this.Cnpj = Cnpj;
        this.nome = nome;
        this.responsavel = responsavel;
        this.titulo = titulo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.site = site;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
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

    @Override
    public String toString() {
        return "model.Entidade{" +
                "id=" + id +
                ", Cnpj='" + Cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", responsavel='" + responsavel + '\'' +
                ", titulo='" + titulo + '\'' +
                ", endereco=" + endereco +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", site='" + site + '\'' +
                '}';
    }

}

