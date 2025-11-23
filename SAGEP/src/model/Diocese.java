package model;

public class Diocese extends Entidade {

    // Attributes
    private String nomeArquidiocese;

    // constructors
    public Diocese() {
    }

    public Diocese(int id, String Cnpj, String nome, String responsavel, String titulo, Endereco endereco, String telefone, String email, String site, String nomeArquidiocese) {
        super(id, Cnpj, nome, responsavel, titulo, endereco, telefone, email, site);
        this.nomeArquidiocese = nomeArquidiocese;
    }

    // Getters and Setters
    public String getNomeArquidiocese() {
        return nomeArquidiocese;
    }

    public void setNomeArquidiocese(String nomeArquidiocese) {
        this.nomeArquidiocese = nomeArquidiocese;
    }

}
