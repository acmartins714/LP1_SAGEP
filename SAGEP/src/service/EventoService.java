package service;

import enuns.TIPOEVENTO;
import model.Evento;
import model.Paroquia;
import utils.NumeroPorExtenso;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class EventoService {

    private List<Evento> eventos = new ArrayList<>();

    public void cadastrarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    //Metods
    public void atualizarEventoNome(int id, String novoNomeEvento) {
        for (Evento evento : eventos) {
            if (evento.getId() == id) {
                evento.setNomeEvento(novoNomeEvento);
                System.out.println("Nome do evento atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Evento não foi encontrada.");
    }

    public void atualizarEventoTipoEvento(int id, TIPOEVENTO novoTipoEvento) {
        for (Evento evento : eventos) {
            if (evento.getId() == id) {
                evento.setTipoEvento(novoTipoEvento);
                System.out.println("Tipo do evento atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Evento não foi encontrada.");
    }

    public void atualizarEventoDataInicial(int id, LocalDate novaDataInicial) {
        for (Evento evento : eventos) {
            if (evento.getId() == id) {
                evento.setDataInicial(novaDataInicial);
                System.out.println("Data inicial atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Evento não foi encontrada.");
    }

    public void atualizarEventoDataFinal(int id, LocalDate novaDataFinal){
        for (Evento evento : eventos) {
            if (evento.getId() == id) {
                evento.setDataFinal(novaDataFinal);
                System.out.println("Data final atualizada com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Evento não foi encontrada.");
    }

    public void atualizarEventoLocal(int id, String novoLocal) {
        for (Evento evento : eventos) {
            if (evento.getId() == id) {
                evento.setLocal(novoLocal);
                System.out.println("Local do evento atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Evento não foi encontrada.");
    }

    public void atualizarEventoNumeroMaximoInscricoes(int id, int novoNumeroMaximoInscricoes) {
        for (Evento evento : eventos) {
            if (evento.getId() == id) {
                evento.setNumeroMaximoInscricoes(novoNumeroMaximoInscricoes);
                System.out.println("Número máximo de inscrições do evento atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Evento não foi encontrada.");
    }

    public void atualizarEventoValorInscricao(int id, double novoValorInscricao) {
        for (Evento evento : eventos) {
            if (evento.getId() == id) {
                evento.setValorInscricao(novoValorInscricao);
                System.out.println("Valor da inscrição no evento atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Evento não foi encontrada.");
    }

    public void deletarEvento(int id) {
        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i).getId() == id) {
                eventos.remove(i);
                System.out.println("Evento excluído com sucesso!");
                return;
            }
            System.out.println("ERRO: Evento não encontrada!");
        }
    }

    public void eventosRelacao() {

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        Locale localeBR = new Locale("pt", "BR");
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", localeBR);

        Iterator<Evento> eventoIter = eventos.iterator();
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println(" Mural de Eventos");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        while (eventoIter.hasNext()) {

            Evento evento = eventoIter.next();

            // Ajustando valor da taxa para exibição no mural
            String valorTaxa = currencyFormat.format(evento.getValorInscricao());
            String extenso = NumeroPorExtenso.get(new BigDecimal(valorTaxa.substring(3).replace(",", ".")), "real", "reais", "centavo", "centavos");


            // Ajustando a data para exibição
            LocalDate dataInicial = evento.getDataInicial();
            String dataInicialFormatada = dataInicial.format(formatoData);
            LocalDate dataFinal = evento.getDataFinal();;
            String dataFinalFormatada = dataFinal.format(formatoData);


            System.out.println(" Evento: " + evento.getNomeEvento());

            if (evento.getDataInicial().equals(evento.getDataInicial())) {
                System.out.println(" Data: " + dataInicialFormatada);
            } else {
                System.out.println(" Data inicio: " + dataInicialFormatada);
                System.out.println(" Data final: " + dataFinalFormatada);
            }

            System.out.println(" Local do Evento: " + evento.getLocal());
            System.out.println(" Número de vagas: " + evento.getNumeroMaximoInscricoes());
            System.out.println(" Valor da Taxa de Inscrição: " + valorTaxa + " (" + extenso + ")");

            System.out.println("--------------------------------------------------------------------------------------------------------------");

        }

    }


}
