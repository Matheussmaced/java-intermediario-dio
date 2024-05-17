package desafio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  // atributo

  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenadoPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);

    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

    ordenacaoPessoa.adicionarPessoa("Nome 1", 15, 1.75);
    ordenacaoPessoa.adicionarPessoa("Nome 2", 20, 1.8);
    ordenacaoPessoa.adicionarPessoa("Nome 3", 16, 1.5);

    System.out.println(ordenacaoPessoa.ordenadoPorIdade());

    System.out.println(ordenacaoPessoa.ordenarPorAltura());
  }
}
