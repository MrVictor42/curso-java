package classes.challengers;

public class Jantar {

	public static void main(String[] args) {
		
		ChallengerFood c1 = new ChallengerFood("Arroz", 0.180);
		ChallengerFood c2 = new ChallengerFood("Feijao", 0.300);
		Person p = new Person("João", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}
}