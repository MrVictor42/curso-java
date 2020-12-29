package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		
		idade = Math.abs(idade);
		
		if(idade >= 0 && idade <= 120) {			
			this.idade = idade;
		} else {
			System.out.println("Informe uma Idade válida entre 1 a 120");
		}
	}
	
	@Override
	public String toString() {
		return "Olá, eu sou o " + getNomeCompleto() + " e tenho " + getIdade() + " anos!";
	}
}