package generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<String>();
		caixaA.guardar("Segredo");
		
		System.out.println(caixaA.abrir());
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<Double>();
		caixaB.guardar(42.42);
		
		System.out.println(caixaB.abrir());
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}