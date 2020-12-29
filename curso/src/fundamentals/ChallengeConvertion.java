package fundamentals;

import java.util.Scanner;

public class ChallengeConvertion {
	public static void main(String[] args) {
		/*
		 * 3 entradas usando o scanner, de salario, média dos ultimos 3 salarios, 
		 * e caso o usuário digite com , em vez de ponto, não é para fechar o projeto 
		 */
		
		Scanner entradas = new Scanner(System.in);
		double mediaSalario = 0.0;
		double salarios = 0.0;
		final int numeroDeSalarios = 3;
		String valor[] = new String[numeroDeSalarios];
		
		for(int aux = 0; aux < numeroDeSalarios; aux ++) {
			System.out.print("Informe o salário\n");
			valor[aux] = entradas.next().replace(",", ".");
			
			salarios += Double.parseDouble(valor[aux]);
		}
		
		mediaSalario = (double) salarios / numeroDeSalarios;
		entradas.close();
		
		System.out.printf("A média dos salários é: %.2f\n", mediaSalario);
	}
}