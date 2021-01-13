package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<ObservadorChegadaAniversariante>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		
		Scanner input = new Scanner(System.in);
		String valor = "";
		
		if(!valor.equalsIgnoreCase("sair")) {
			
			System.out.print("Aniversariante chegou? ");
			valor = input.nextLine();
			
			if(valor.equalsIgnoreCase("sim")) {
				
				//criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				//notificar observadores
				observadores.stream().forEach(observador -> observador.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso!");
			}
		}
		
		input.close();
	}
}