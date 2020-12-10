package classes.challengers;

public class Person {
	
	String nome;
	double peso;
	
	Person(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(ChallengerFood comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
	}
}