package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta", 10.99, 0.35, 5);
		Produto p2 = new Produto("Notebook", 2000.99, 0.6, 0);
		Produto p3 = new Produto("Borracha", 5.99, 0.3, 3);
		Produto p4 = new Produto("Lapís", 2.99, 0.2, 3);
		Produto p5 = new Produto("PC", 2800.99, 0.7, 0);
		Produto p6 = new Produto("Impressora", 600.99, 0.5, 0);
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> freteGratis = produto -> produto.getValorFrete() == 0;
		Predicate<Produto> superPromocao = produto -> produto.getDesconto() >= 0.3;
		Predicate<Produto> precoRelevante = produto -> produto.getPreco() >= 500;
		Function<Produto, String> superProduto = produto -> "Aproveite! " + produto.getNome() + " está saindo " +
															"por apenas R$ " + produto.getPreco() + " e com frete grátis";
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(superProduto)
			.forEach(System.out::println);
	}
}