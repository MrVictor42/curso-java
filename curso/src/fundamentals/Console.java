package fundamentals;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia! \n");
		
		System.out.println("Bom");
		System.out.println("Dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1 ,2 , 3, 4, 5, 6);
		System.out.printf("Salário: %.1f\n", 1234.1242);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine().toUpperCase();
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine().toUpperCase();
		
		System.out.println("Nome = " + nome + " " + sobrenome);
		System.out.println("Informe a sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("%s %s tem %d anos!", nome, sobrenome, idade);
		entrada.close();
	}
}