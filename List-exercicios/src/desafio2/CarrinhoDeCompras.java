package desafio2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  // criando lista

  private List<Item> itemList;

  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }

  // agora os metodos

  public void adicionarItem(String nome, double preco, int quantidade) {
    itemList.add(new Item(nome, preco, quantidade));
  }

  public void exibirItens() {
    System.out.println(itemList);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    carrinhoDeCompras.exibirItens();

    carrinhoDeCompras.adicionarItem("Jogo", 50.5, 2);

    carrinhoDeCompras.exibirItens();

  }

}
