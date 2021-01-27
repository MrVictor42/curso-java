package br.com.cod3r.app.financeiro;

import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {
	
	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.println(calc.soma(2, 3, 4));
//		
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(4, 5, 6));
		
//		Calc c1 = new CalcImpl1();
//		Calc c2 = new CalcImpl2();
//		
//		System.out.println(c1.soma(1, 2, 3));
//		System.out.println(c2.soma(1, 2, 3));
	}
}