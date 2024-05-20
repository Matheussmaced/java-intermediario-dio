package desafio2;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  // Atributos
  private Set<Contato> contatoSet;

  // Construtor para inicializar o Set de contatos
  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  // Método para adicionar um contato
  public void adicionarContato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));
  }

  // Método para exibir todos os contatos
  public void exibirContatos() {
    System.out.println(contatoSet);
  }

  // Método para pesquisar contatos por nome
  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    for (Contato c : contatoSet) {
      if (c.getNome().startsWith(nome)) {
        contatosPorNome.add(c);
      }
    }
    return contatosPorNome;
  }

  // Método para atualizar o número de um contato
  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;

    for (Contato c : contatoSet) {
      if (c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("Matheus", 1234567);
    agendaContatos.adicionarContato("Matheus", 123453);
    agendaContatos.adicionarContato("Matheus", 1234523);
    agendaContatos.adicionarContato("João", 12345611);

    agendaContatos.exibirContatos();
  }
}
