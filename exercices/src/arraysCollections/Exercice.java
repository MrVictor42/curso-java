package arraysCollections;

import java.util.Arrays;

public class Exercice {
	
	public static void main(String[] args) {
		
		double notasAlunoA[] = new double [4];
		double total = 0;
		
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.8;
				
		System.out.println(Arrays.toString(notasAlunoA));
		
		for(int i = 0; i < notasAlunoA.length; i ++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double notasAlunoB[] = { 6.9, 8.9, notaArmazenada, 10};
		total = 0;
		
		for(int aux = 0; aux < notasAlunoB.length; aux ++) {
			total += notasAlunoB[aux];
		}
		
		System.out.println(total / notasAlunoB.length);
	}
}