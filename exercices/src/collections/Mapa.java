package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Roberto"); // adiciona e atualiza
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Victor");
		usuarios.put(4, "Samantha");
		usuarios.put(5, "Karine");
		
		System.out.println(usuarios.size()); //Só tem um elemento, por que não pode ter repetição, que no caso é a chave ou o nome
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Samantha"));
		System.out.println(usuarios.get(5));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String nome: usuarios.values()) {
			System.out.println(nome);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print("ID: " + registro.getKey() + " => ");
			System.out.println("Nome: " + registro.getValue());
		}
	}
}