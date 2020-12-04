package fundamentals.operadores;

public class ChallengerAritmetic {

	public static void main(String[] args) {
		double primeiraExpressao = 0;
		double segundaExpressao = 0;
		double terceiraExpressao = 0;
		double resultado = 0;
		
		primeiraExpressao = (6 * Math.pow((3 + 2), 2) / 3 * 2);
		segundaExpressao = ((1 - 5) * (2 - 7) / 2);
		segundaExpressao = (Math.pow(segundaExpressao, 2) / 2);
		terceiraExpressao = Math.pow((primeiraExpressao - segundaExpressao), 3);
		resultado = terceiraExpressao / Math.pow(10, 3);
		
		System.out.println(resultado);
	}
}