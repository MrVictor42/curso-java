package control;

import java.util.Scanner;

public class ChallengerWhile2 {

	public static void main(String[] args) {
		
		/*
		 * Tirar a média dos alunos
		 * Não sabemos quantos alunos são
		 * Range das notas é de 0 a 10
		 * Variavel total é a soma de todas as notas
		 * contador ++
		 * Quando o usuário digitar -1, o programa mostra a média
		 */
		
		int contador = 0;
		String pare = "";
		double total = 0.0;
		double media = 0.0;
		double nota = 0.0;
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite a nota do aluno:");
			nota = input.nextDouble();
			
			if(nota < 0 || nota > 10) {
				System.out.println("Informe uma nota válida entre 0 e 10");
				nota = input.nextDouble();
			}
			
			total += nota;
			contador ++;
			
			System.out.println("Deseja parar? Digite -1, caso não, digite aperte qualquer tecla");
			pare = input.next();
			
		} while(!pare.equals("-1"));

		input.close();
		media = (double) total / contador;
		
		System.out.printf("A média ficou: %.2f", media);
	}
}