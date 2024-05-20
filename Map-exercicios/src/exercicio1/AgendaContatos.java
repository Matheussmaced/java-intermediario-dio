package exercicio1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  // private
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;

    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
    }

    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Matheus", 1234567);
    agendaContatos.adicionarContato("Matheus2", 1234565);
    agendaContatos.adicionarContato("Matheus3", 1234513);
    agendaContatos.adicionarContato("Matheus teste", 1234562);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Matheus teste");

    agendaContatos.exibirContatos();
  }

}
