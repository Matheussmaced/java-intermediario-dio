package desafio1;

public class Tarefa {

  // atributo
  private String descricao;

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  @Override // para a descrição vim escrito certa
  public String toString() {
    return descricao;
  }

}
