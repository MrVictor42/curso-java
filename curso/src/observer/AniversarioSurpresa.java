package observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.addChegadaAniversarianteObserver(namorada); // ato de a namorada ligar para o porteiro para ele avisar quando o namorado chegar
		
		porteiro.start();
	}
}