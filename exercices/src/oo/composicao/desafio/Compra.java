package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<Item>();
	
	void addItem(Produto produto, int qtde) {
		this.itens.add(new Item(produto, qtde));
	}
	
	void addItem(String nome, double preco, int qtde) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.qtde * item.produto.preco;
		}
		
		return total;
	}
}
