package control;

public class ChallengerFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i ++) {
			System.out.println(valor);
			valor += "#";
		}
		
		System.out.println();
		
		// Versão do desafio
		// Não pode usar valor numérico para controlar o laço!
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
