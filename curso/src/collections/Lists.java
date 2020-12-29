package collections;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		usuarios.add(u1);
		usuarios.add(new Usuario("Carlos"));
		usuarios.add(new Usuario("Lia"));
		usuarios.add(new Usuario("Bia"));
		usuarios.add(new Usuario("Manu"));
		
		System.out.println(usuarios.get(3));
		usuarios.remove(1);
		usuarios.remove(new Usuario("Manu"));
		
		System.out.println("Tem? " + usuarios.contains(new Usuario("Lia")));
		
		for(Usuario u: usuarios) {
			System.out.println(u.nome);
		}
	}
}