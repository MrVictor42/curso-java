package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double notas[] = { 9.9, 8.7, 7.2, 9.4};
		
		for(int aux = 0; aux < notas.length; aux ++) {
			System.out.print(notas[aux] + " ");
		}
		
		System.out.println();
		
		for(double nota: notas) {
			System.out.print(nota + " ");
		}
	}
}