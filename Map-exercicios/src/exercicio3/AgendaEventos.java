package exercicio3;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventoMap;

  public AgendaEventos() {
    this.eventoMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);

    eventoMap.put(data, evento);
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    LocalDate proximaData = null;
    Evento proximoEvento = null;

    LocalDate dataAtual = LocalDate.now();
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) { // a partir do metodo Entry, eu tenho acesso
                                                                           // a um
      // determinado valor e a uma determinada key
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        proximaData = entry.getKey();
        proximoEvento = entry.getValue();

        System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 2), "Evento 2", "Atração 2");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 10), "Evento 3", "Atração 3");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 21), "Evento 4", "Atração 4");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 22), "Evento 5", "Atração 5");

    agendaEventos.exibirAgenda();

    agendaEventos.obterProximoEvento();

  }
}
