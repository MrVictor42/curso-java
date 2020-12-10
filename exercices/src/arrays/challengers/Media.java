package arrays.challengers;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		/*
		 * O usuário deve informar a quantidade de notas
		 * Criar um array com a quantidade de notas informadas
		 * Armazenar notas no array (for tradicional)
		 * Percorrer novamente o array usando foreach, somando as notas em uma variavel soma e apresentando a media
		 * deve ser feito em dois arrays
		 * Deve ser apresentado os indices do array
		 */
		
		int qtdeNotas = 0;
		Scanner input = new Scanner(System.in);
		double totalNotas = 0.0;
		double media = 0.0;
		
		System.out.print("Informe a quantidade de notas: ");
		qtdeNotas = input.nextInt();
		
		double notas[] = new double[qtdeNotas];
		
		for(int aux = 0; aux < qtdeNotas; aux ++) {
			System.out.println("Informe a " + (aux + 1)+ "° nota");
			notas[aux] = input.nextDouble();
		}
		
		for(double nota : notas) {
			totalNotas += nota;
		}
		
		media = totalNotas / notas.length;
		System.out.println("A média do aluno é: " + media + "!");
		
		input.close();
		
	}
}