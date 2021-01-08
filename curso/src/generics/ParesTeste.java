package generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Victor");
		resultadoConcurso.adicionar(2, "João");
		resultadoConcurso.adicionar(3, "Maria");
		resultadoConcurso.adicionar(4, "Jorginho");
		resultadoConcurso.adicionar(2, "Pedro");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2)); // O valor tem que ser Pedro, por que ele vai substituir o João
	}
}