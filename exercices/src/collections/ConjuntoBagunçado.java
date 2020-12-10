package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Char
		
		System.out.println("Tamanho é: " + conjunto.size()); // tamanho do conjunto
		
		conjunto.add("teste");
		System.out.println("Tamanho é: " + conjunto.size());
		conjunto.add("Teste");
		System.out.println("Tamanho é: " + conjunto.size()); // O tamanho será o mesmo, por que já tem o "Teste" no conjunto
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("x"));
		System.out.println("Tamanho é: " + conjunto.size());
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto);
		System.out.println(nums);
		
		conjunto.addAll(nums); // União entre dois conjuntos -> Pegou o que tinha em nums e colocou em conjunto
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); // Interseção entre nums e conjunto
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}