package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private  static Memoria instancia = new Memoria();
	private final List<MemoriaObservador> observadores = new ArrayList<MemoriaObservador>();
	private String textoAtual = "";

	private Memoria() {
		
	}
	
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}
	
	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	public void processarComando(String texto) {
		
		TipoComando tipoComando = detectarTipoComando(texto); 
		
		if(texto.equals("AC")) {
			textoAtual = "";
		} else {
			textoAtual += texto;
		}
		
		observadores.forEach(observador -> observador.valorAlterado(getTextoAtual()));
	}

	private TipoComando detectarTipoComando(String texto) {
		
		
		
		return null;
	}
}