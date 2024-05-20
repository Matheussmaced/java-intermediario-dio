package desafio3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  // atributos

  private Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produtoSet.add(new Produto(cod, nome, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // deixará organizado por nome
    return produtosPorNome;
  }

  public Set<Produto> exibitProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    CadastroProdutos cadastroProduto = new CadastroProdutos();

    cadastroProduto.adicionarProduto(1L, "Produto x", 2.5, 2);
    cadastroProduto.adicionarProduto(2L, "Produto z", 2.6, 6);
    cadastroProduto.adicionarProduto(3L, "Produto y", 2, 1);

    // System.out.println(cadastroProduto.produtoSet);

    // System.out.println(cadastroProduto.exibirProdutosPorNome());

    System.out.println(cadastroProduto.exibitProdutosPorPreco());
  }
}
