package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
				
		/*
		 * 1. A partir do produto calcular o preço real (com desconto);
		 * 2. Imposto Municipal: >= 2500 (8.5%) / < 2500 (Isento);
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234, 54;
		 */
		
		Function<Produto, Double> precoFinal = produto -> {
			return produto.preco * (1 - produto.desconto);
		};
		UnaryOperator<Double> impostoMunicipal = (preco) -> {
			return preco >= 2500 ? preco * 1.805 : preco;
		};
		
		UnaryOperator<Double> frete = (preco) -> {
			return preco >= 3000 ? preco + 100 : preco + 50;
		};
		
		UnaryOperator<Double> arredondar = (preco) -> {
			return Double.parseDouble(String.format("%.2f", preco));
		};
		
		Function<Double, String> formatar = (preco) -> {
			return ("R$" + preco).replace(".", ",");
		};
		
		Produto produto = new Produto("Ipad", 3235.89, 0.13);
		
		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(produto);
		System.out.println("O preço final é: " + preco);
	}
}