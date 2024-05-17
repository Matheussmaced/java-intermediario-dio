package desafio4;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
  // atributos

  private String nome;
  private int idade;
  private double altura;

  // metodos para visualizar fora da classe

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public double getAltura() {
    return altura;
  }

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  @Override
  public int compareTo(Pessoa p) {
    return Integer.compare(idade, p.getIdade());
  }

  @Override
  public String toString() {
    return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
  }

}

class ComparatorPorAltura implements Comparator<Pessoa> {

  public int compare(Pessoa p1, Pessoa p2) {
    return Double.compare(p1.getAltura(), p2.getAltura());
  }

}
