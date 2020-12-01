package fundamentals;

public class TypeString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(2));
		
		/*
		 * String é um objeto imutável
		 */
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
		var nome = "Victor";
		var sobrenome = "Mota";
		var idade = 42;
		var salario = 14221.124;
		
		System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
	}
}
