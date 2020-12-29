package fundamentals.operadores;

public class Logics {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // E
		System.out.println(condicao1 || condicao2); // OU
		System.out.println(condicao1 ^ condicao2); // OU Exclusivo
		System.out.println(!condicao1); // Negando a condicao1
		System.out.println(!condicao2); // Negando a condicao2
		
		System.out.println();
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println();
		System.out.println("Tabela verdade OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println();
		System.out.println("Tabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	}
}