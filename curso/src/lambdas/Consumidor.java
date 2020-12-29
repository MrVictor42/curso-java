package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + " !!!");
		Produto produto1 = new Produto("Caneta", 12.34, 0.09);
		Produto produto2 = new Produto("Notebook", 2987.99, 0.25);
		Produto produto3 = new Produto("Caderno", 19.99, 0.03);
		
		imprimir.accept(produto1);
		
		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3);
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
	}
}