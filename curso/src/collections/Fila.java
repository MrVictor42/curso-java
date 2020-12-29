package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos a fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana");
		fila.offer("Bia"); //caso não seja possivel adicionar em uma fila com restrição, o offer vai retornar false
		fila.add("Carlos");
		fila.offer("Samantha");
		fila.add("Rafaela");
		
		// Peek e Element -> obter o próximo elementos da fila (sem remover)
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek()); //retorna 
		System.out.println(fila.element()); //lança uma exceção
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
		
		System.out.println(fila.poll()); //Pega o primeiro elemento da fila já removendo
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //Lança uma exceção se chegar no final da fila
	}
}