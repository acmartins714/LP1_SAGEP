package model;

import utils.NumeroPorExtenso;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.time.LocalDate;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Dizimista extends Pessoa {
    private boolean ContribuicaoFixa;
    private Double ValorContribuicao;

    // Constructors
    public Dizimista() {
    }

    public Dizimista(int id, String nome, String cpf, LocalDate dataNascimento, String numeroCertNasc, String cidadeNasc, String ufNasc, Endereco endereco, boolean paisCasadosIgreja, Paroquia paroquiaCasamento, boolean casamentoCivil, String telefone, String email) {
        super(id, nome, cpf, dataNascimento, numeroCertNasc, cidadeNasc, ufNasc, endereco, paisCasadosIgreja, paroquiaCasamento, casamentoCivil, telefone, email);
    }

    public Dizimista(int id, String nome, String cpf, LocalDate dataNascimento, String numeroCertNasc, String cidadeNasc, String ufNasc, Endereco endereco, boolean paisCasadosIgreja, Paroquia paroquiaCasamento, boolean casamentoCivil, String telefone, String email, boolean contribuicaoFixa, Double valorContribuicao) {
        super(id, nome, cpf, dataNascimento, numeroCertNasc, cidadeNasc, ufNasc, endereco, paisCasadosIgreja, paroquiaCasamento, casamentoCivil, telefone, email);
        ContribuicaoFixa = contribuicaoFixa;
        ValorContribuicao = valorContribuicao;
    }

    // Getters and Setters
    public boolean isContribuicaoFixa() {
        return ContribuicaoFixa;
    }

    public void setContribuicaoFixa(boolean contribuicaoFixa) {
        ContribuicaoFixa = contribuicaoFixa;
    }

    public Double getValorContribuicao() {
        return ValorContribuicao;
    }

    public void setValorContribuicao(Double valorContribuicao) {
        ValorContribuicao = valorContribuicao;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Dizimista{" +
                "ContribuicaoFixa=" + ContribuicaoFixa +
                ", ValorContribuicao=" + ValorContribuicao +
                '}';
    }

    public void geraRecibo(Dizimista dizimista) {

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String valorDizimo = currencyFormat.format(dizimista.getValorContribuicao()).substring(3);
        String extenso = NumeroPorExtenso.get(new BigDecimal(valorDizimo.replace(",", ".")), "real", "reais", "centavo", "centavos");

        // Ajustando a data do recibo
        LocalDate dataRecibo = LocalDate.now();
        Locale localeBR = new Locale("pt", "BR");
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", localeBR);
        String dataReciboFormatada = dataRecibo.format(formatoData);

        String linha = "Recebemos do Sr(a) " +
                       dizimista.getNome() +
                       " a importância de R$ " +
                       valorDizimo +
                       " (" + extenso + "), " +
                       "pelo que damos plena e geral quitação.";

        System.out.println("------------------------------------------------------------");
        System.out.println(" R E C I B O ");
        System.out.println("------------------------------------------------------------");
        System.out.println(" " + linha.substring(0, 58));
        System.out.println(" " + linha.substring(58, 116));
        System.out.println(" " + linha.substring(116));
        System.out.println(" ");
        System.out.println(" " + String.format("%58s","João Pessoa, " + dataReciboFormatada));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" " + String.format("%58s", "------------------------------"));
        System.out.println(String.format("%48s", "Tesoureiro"));
        System.out.println("------------------------------------------------------------");

    }

}
