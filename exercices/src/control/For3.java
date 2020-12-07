package control;

public class For3 {

	public static void main(String[] args) {
		
		for(int aux = 0; aux < 10; aux ++) {
			for(int j = 0; j < 10; j ++) {
				System.out.printf("%d %d", aux, j);
			}
			System.out.println();
		}
	}
}