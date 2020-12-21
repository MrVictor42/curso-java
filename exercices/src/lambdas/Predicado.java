package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = (produto) -> {
			if((produto.preco * (1 - produto.desconto)) >= 750) {
				return true;
			} else {
				return false;
			}
		};
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}
}