package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Honda;

public class Corrida {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(400);
		ferrari.tipo = "Ferrari";
		Carro honda = new Honda();
		honda.tipo = "Honda";
		
		ferrari.acelerar();
		ferrari.frear();
		honda.acelerar();
		
		System.out.println(ferrari);
		System.out.println(honda);
	}
}