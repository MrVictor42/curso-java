package fundamentals.operadores;

public class Ternary {

	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? "Aprovado": "Em Recuperação...";
		
		System.out.println("O aluno está: " + resultadoFinal);
	}
}