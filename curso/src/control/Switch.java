package control;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String conceito = "";
		
		System.out.print("Informe a nota:");
		int nota = input.nextInt();
		
		switch(nota) {
			case 10 : case 9:
				conceito = "A";
				break;
			case 8: case 7:
				conceito = "B";
				break;
			case 6: case 5:
				conceito = "C";
				break;
			case 4: case 3:
				conceito = "D";
				break;
			default:
				conceito = "Não informado";
		}
		
		input.close();
		
		System.out.println("O conceito é: " + conceito);
	}
}