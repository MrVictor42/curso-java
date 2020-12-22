package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = (num) -> {
			return num % 2 == 0;
		};
		
		Predicate<Integer> isTresDigitos = (num) -> {
			return num >= 100 && num <= 999;
		};
		
		System.out.println(isPar.and(isTresDigitos).negate().test(420));
		System.out.println(isTresDigitos.test(420));
	}
}