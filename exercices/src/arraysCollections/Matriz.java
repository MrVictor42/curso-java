package arraysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int qtdeAlunos = input.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdeNotas= input.nextInt();
		
		double notasDaTurma[][] = new double [qtdeAlunos][qtdeNotas];
		double notaTotal = 0;
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[n].length; n++) {
				System.out.printf("Informe a nota do aluno %d do aluno %d ", n + 1, a + 1);
				notasDaTurma[a][n] = input.nextDouble();
				notaTotal += notasDaTurma[a][n];
			}
		}
		
		double media = notaTotal / (qtdeAlunos * qtdeNotas);
		System.out.println("Media da turma é: " + media);
		
		for(double notasDoAluno[]: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		input.close();
	}
}