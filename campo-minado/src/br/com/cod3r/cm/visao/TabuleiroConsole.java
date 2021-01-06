package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		
		try {
			
			boolean continuar = true;
			
			while(continuar) {
				
				cicloDoJogo();
				
				System.out.println("Outra partida? (S/n) ");
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
			
		} catch (SairException e) {
			System.out.println("Tchau!!");
		} finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		
		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (x, y): ");
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
												.map(elemento -> Integer.parseInt(elemento.trim()))
												.iterator();
				
				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar): ");
				
				if(digitado.equalsIgnoreCase("1")) {
					tabuleiro.abrir(xy.next(), xy.next());
				} else if(digitado.equalsIgnoreCase("2")) {
					tabuleiro.alterarMarcacao(xy.next(), xy.next());
				}
			}
			
			System.out.println("Você ganhou");
		} catch(ExplosaoException explosao) {
			System.out.println(tabuleiro);
			System.out.println("Você perdeu!!!");
		}
	}
	
	private String capturarValorDigitado(String texto) {
		
		System.out.print(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		
		return digitado;
	}
}