package classes;

public class Product {
	
	String nome;
	double preco;
	double desconto;
	
	Product() {
		
	}
	
	Product(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}