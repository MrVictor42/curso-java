package fundamentals;

import java.util.Scanner;

public class TypeStringEquals {

	public static void main(String[] args) {
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		/*
		 * EM COMPARAÇÃO DE STRINGS, O MELHOR É USAR O EQUALS EM VEZ DE USAR O ==
		 * A entrada do scanner com next já tira os espaços em branco antes e depois da string
		 * Já o nextline não tira os espaços, então é melhor usar o .trim() quando usar o nextline()
		 */
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		
		System.out.println("2" == s2);
		System.out.println("2".equals(s2));
		
//		s2 = entrada.nextLine();
//		System.out.println("2" == s2);
//		System.out.println("2".equals(s2));
		
		entrada.close();
	}
}