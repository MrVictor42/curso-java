package fundamentals.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// Forma posFixada
		a ++; // a = a + 1;
		a --; // a = a - 1;
		
		// Forma preFixada
		++ b; // b = b + 1;
		-- b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // o ++a significa que A tem precedencia sobre a comparação
		System.out.println(a);
		System.out.println(b);
	}
}