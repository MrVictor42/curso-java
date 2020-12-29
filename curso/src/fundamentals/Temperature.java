package fundamentals;

public class Temperature {
	public static void main(String[] args) {
		// (F - 32) * 5 / 9 = Celsius
		
		final double FATOR = 5 / 9.0;
		final double AJUSTE = 32;
		double fahrenheit = 86;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + " Graus Celsius");
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + " Graus Celsius");
	}
}