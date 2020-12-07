package control;

import java.util.Scanner;

public class ChallengerWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.println("Quer sair? Digite sair, se não coloque qualquer coisa");
			valor = entrada.next();
		}
		
		System.out.println("Fim do Programa");
		
		entrada.close();
	}
}