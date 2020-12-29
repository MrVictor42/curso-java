package classes;

public class Product {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Product() {
		
	}
	
	Product(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}