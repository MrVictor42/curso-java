package oo.composicao;

public class Carro {
	
	final Motor motor;
	
	public Carro() {
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {			
			motor.fatorInjecao += 0.4;
		} else {
			
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {			
			motor.fatorInjecao -= 0.4;
		} else {
			
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligado() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
