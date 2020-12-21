package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		/*
		 *  NÃO: int -> Double
		 *  Ao utilizar o Generics com o BinaryOperator, tem que se usar um tipo de Classe, por isso o Double e não o double
		 */
		
		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};
	
		System.out.println(calculo.apply(3.0, 2.0));
		
		// Apenas para uma sentença de código
		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calculo2 = (x, y) -> {
			return x + y;
		};
	
		System.out.println(calculo2.apply(3, 2));
		
		// Apenas para uma sentença de código
		calculo2 = (x, y) -> x * y;
		System.out.println(calculo2.apply(2, 3));
	}
}