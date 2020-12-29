package oo.abstrato;

public abstract class Mamifero extends Animal{

	@Override
	public final String mover() {
		return "Saindo do lugar";
	}

	@Override
	public abstract String mamar();
}
