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
		
		honda.acelerar();
		System.out.println(honda);
		
		honda.acelerar();
		System.out.println(honda);
		
		honda.acelerar();
		System.out.println(honda);
		
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		System.out.println(ferrari.velocidadeDoAr());
	}
}