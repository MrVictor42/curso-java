package control;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String valor = "";
		
		do {
		
			System.out.println("Você precisa falar as palavras mágicas... ");
			System.out.println("Quer sair?");
			valor = input.nextLine();
			
		} while(!valor.equalsIgnoreCase("Por Favor"));
		input.close();
		
		System.out.println("Obrigado");
	}
}