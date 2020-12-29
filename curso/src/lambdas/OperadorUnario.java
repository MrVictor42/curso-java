package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = (n) -> {
			return n + 2;
		};
		
		UnaryOperator<Integer> vezesDois = (n) -> {
			return n * 2;
		};
		
		UnaryOperator<Integer> aoQuadrado = (n) -> {
			return n * n;
		};
		
		// n começa valendo 0
		System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0)); // 16 -> leitura da esquerda para a direita
		System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(0)); // 16 -> leitura da direita para a esquerda
	}
}