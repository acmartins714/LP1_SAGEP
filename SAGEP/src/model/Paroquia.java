package model;

public class Paroquia extends Entidade {

    private Diocese diocese;

    // Coonstructors
    public Paroquia() {
    }

    public Paroquia(int id, String Cnpj, String nome, String responsavel, String titulo, Endereco endereco, String telefone, String email, String site, Diocese diocese) {
        super(id, Cnpj, nome, responsavel, titulo, endereco, telefone, email, site);
        this.diocese = diocese;
    }

    // getters and setters
    public Diocese getDiocese() {
        return diocese;
    }

    public void setDiocese(Diocese diocese) {
        this.diocese = diocese;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", model.Paroquia{"+
                ", Diocese=" + diocese.toString() +
                '}';
    }

}
