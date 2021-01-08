package generics;

public class CaixaNumeroTeste {
	
	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
		caixaA.guardar(42.0);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
		caixaB.guardar(42);
		System.out.println(caixaB.abrir());
	}
}