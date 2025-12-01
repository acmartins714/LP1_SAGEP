package service;

import model.Evento;
import model.EventoInscricao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventoInscricaoService {

    private List<EventoInscricao> eventosInscricao = new ArrayList<>();

    public void cadastrarEventoInscricao(EventoInscricao eventoInscricao) {

        if (eventosInscricao.size() < eventoInscricao.getEvento().getNumeroMaximoInscricoes()) {
            eventosInscricao.add(eventoInscricao);
        } else {
            System.out.print("Evento atingiu o número máximo de inscrições! Deseja entrar para a fila de espera?");
            Scanner sc = new Scanner(System.in);
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Você vai ser colocado em file de espera!");
                // Adicionar aqui as rotinas necessárias para cadastro em fila de espera
            } else {
                System.out.println("Inscrição cancelada!");
            }

        }
    }

    public List<EventoInscricao> listarEventosInscricao() {
        return eventosInscricao;
    }

    //Metods
    public void atualizarEventoInscricao(int id, Evento novoEvento) {
        for (EventoInscricao eventosInscricao : eventosInscricao) {
            if (eventosInscricao.getId() == id) {
                eventosInscricao.setEvento(novoEvento);
                System.out.println("Evento atualizado com sucesso!");
                return;
            }
        }

        System.out.println("ERRO: Inscrição em evento não foi encontrada.");
    }

    public void deletarEventoInscricao(int id) {
        for (int i = 0; i < eventosInscricao.size(); i++) {
            if (eventosInscricao.get(i).getId() == id) {
                eventosInscricao.remove(i);
                System.out.println("Inscrição em evento excluída com sucesso!");
                return;
            }
            System.out.println("ERRO: Inscrição em evento não encontrada!");
        }
    }

}
