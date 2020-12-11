package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		/*
		 * Na pilha, o primeiro o último a entrar é o primeiro a sair
		 */
		
		livros.add("O Pequeno Príncipe"); // se add, retorna true
		livros.push("Dom Quixote"); // retorna uma exceção se não conseguir add (retrição de capacidade)
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		// O poll mostra a informação e remove da pilha
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll()); //O Hobbit
		System.out.println(livros.poll()); // Dom Quixote
		System.out.println(livros.poll()); // O pequeno principe
		System.out.println(livros.poll()); // null
//		System.out.println(livros.pop());
//		System.out.println(livros.remove());
		
		// livros.size();
		// livros.clear();
		// livros.contains();
		// livros.isEmpty();
		
		
	}
}