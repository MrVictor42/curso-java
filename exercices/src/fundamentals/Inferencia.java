package fundamentals;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		/*
		 * É possível utilizar o var, nesse caso o java vai inferir o tipo da variavel 
		 * com o que foi atribuido a ela;
		 * Mas não é possível trocar o tipo de variavel. 
		 * Ex: var constante = 42 e depois tentar mudar para string ou double. Ex: 42.0  
		 */
		var b = 4.5;
		System.out.println(b);
		
		var c = "String C";
		System.out.println(c);
		
		c = "Outra String";
		System.out.println(c);
		
		double d; // variavel foi declarada
		d = 123.65; // variavel foi inicializada
		System.out.println(d); // usada!
		 
		/*
		 * Não é possivel fazer o que foi feito na linha 24 com var.
		 * Jeito Errado: var e;
		 * Jeito Certo: var e = 42;
		 */
	}
}