package fundamentals;

import java.util.Scanner;

public class ChallengerCalculator {
	public static void main(String[] args) {
		// Ler num1, num2
		// Pedir que tipo de operação (+, -, /, %)
		// Fazer a operação
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o número1: ");
		double num1 = entrada.nextDouble();
		System.out.println("Informe o número2: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação");
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		entrada.close();
	}
}