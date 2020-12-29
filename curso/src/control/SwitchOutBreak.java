package control;

public class SwitchOutBreak {

	public static void main(String[] args) {
		
		String faixa = "vermelha";
		
		switch (faixa.toLowerCase()) {
			case "preta":
				System.out.println("Sei o bassai-dai...");
			case "marrom":
				System.out.println("Sei o Tekki Shodan");
			case "roxa":
				System.out.println("Sei o Heian Godan");
			case "verde":
				System.out.println("Sei o Heian Godan");
			case "laranja":
				System.out.println("Sei o Heian Sandan");
			case "vermelha":
				System.out.println("Sei o Heian Hidan");
				break;
			case "amarela":
				System.out.println("Sei o Heian Shodan");
		}
		
		int idade = 3;
			
		switch(idade) {
			case 3:
				System.out.println("Sabe Programar");
			case 2:
				System.out.println("Sabe falar");
			case 1:
				System.out.println("Sabe andar");
			case 0:
				System.out.println("Sabe respirar");
		}
	}
}