package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		// Uma vantagem da expressão abaixo: Não precisar criar uma classe especifica para a implementação da função		
		Calculo calculo = (x, y) -> {
			return x + y;
		};
	
		System.out.println(calculo.executar(3, 2));
		
		// Apenas para uma sentença de código
		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(2, 3));
		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal());
	}
}