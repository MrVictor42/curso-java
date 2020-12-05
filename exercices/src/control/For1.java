package control;

public class For1 {

	public static void main(String[] args) {
		
		int contador = 0;
		int x = 2;
		
		for(contador = 0; contador < 10; contador ++) {
			System.out.println("Fala Zezé, bom dia cara " + contador);
		}
		
		for(; x < 10;) {
			System.out.println("x = " + x);
			x ++;
		}
	}
}