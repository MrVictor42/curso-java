package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}

//	@Override
//	public void acelerar() {
//		velocidadeAtual += 15;
//	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}