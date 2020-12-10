package classes;

public class User {
	
	String nome;
	String email;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof User) {
			User outro = (User) obj;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	
	// O hashcode será abordado em outra aula!
}
