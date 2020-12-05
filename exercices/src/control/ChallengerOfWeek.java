package control;

import java.util.Scanner;

public class ChallengerOfWeek {

	public static void main(String[] args) {
		
		// Domingo -> 1 // Segunda -> 2
		// Terça -> 3 // Quarta -> 4
		// Quinta -> 5 // Sexta -> 6 Sábado -> 7
		// A partir de um scanner
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um dia da semana");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if(dia.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		} else if(dia.equalsIgnoreCase("Terca") || dia.equalsIgnoreCase("Terça")) {
			System.out.println("3");
		} else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		} else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		} else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		} else if(dia.equalsIgnoreCase("Sábado") || dia.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		}
		
		entrada.close();
	}
}