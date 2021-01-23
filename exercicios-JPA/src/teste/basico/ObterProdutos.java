package teste.basico;

import java.util.List;

import infra.ProdutoDao;
import modelo.basico.Produto;

public class ObterProdutos {
	
	public static void main(String[] args) {
		
		ProdutoDao dao = new ProdutoDao();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
		}
		
		double precoTotal = 
				produtos.stream().map(produto -> produto.getPreco()).reduce(0.0, (total, preco) -> total + preco).doubleValue();
		System.out.println("O valor total é: " + precoTotal);
		
		dao.fechar();
	}
}