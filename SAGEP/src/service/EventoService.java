package service;

import enuns.TIPOEVENTO;
import model.Endereco;
import model.Paroquia;
import model.Evento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

}
