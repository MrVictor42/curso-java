package classes;

public class ProductTests {
	
	public static void main(String[] args) {
		
		Product produto = new Product();
		
		produto.nome = "Notebook";
		produto.preco = 4356.89;
		produto.desconto = 0.25;
		
		double precoFinal = produto.precoComDesconto(0.1);
		
		System.out.printf("%.2f\n", precoFinal);
		
		Product produto2 = new Product("Celular", 2000, 0.42);
		double precoFinal2 = produto2.precoComDesconto(0);
		
		System.out.printf("%.2f\n", precoFinal2);
	}
}