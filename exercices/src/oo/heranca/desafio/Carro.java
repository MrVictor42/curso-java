package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	private int delta = 5;
	int velocidadeAtual = 0;
	public String tipo = "";
	
	protected Carro(int velocidadeMaxima) { //visivel apenas com herança
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {			
			velocidadeAtual += getDelta();
		}
	}
	
	public void frear() {
		
		if(velocidadeAtual >= 5) {			
			velocidadeAtual -=5;
		} else {			
			velocidadeAtual = 0;
		}
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	@Override
	public String toString() {
		return "A Velocidade do Carro " + tipo +" Atual é => " + velocidadeAtual + "Km/h";
	}
}