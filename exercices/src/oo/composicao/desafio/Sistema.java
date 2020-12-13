package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.addItem("Caneta", 9.67, 100);
		compra1.addItem(new Produto("Notebook", 1897.88), 2);
		
		compra2.addItem("Caderno", 10, 10);
		compra2.addItem(new Produto("Impressora", 998.90), 1);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}