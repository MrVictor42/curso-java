package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {
	
	private final int linhas;
	private final int colunas;
	private final int minas;
	
	private final List<Campo> campos = new ArrayList<Campo>();
	private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<Consumer<ResultadoEvento>>();
	
	public Tabuleiro(int linhas, int colunas, int minas) {
		
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}
		
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void registrarObservador(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(Boolean resultado) {
		observadores.stream().forEach(observador -> observador.accept(new ResultadoEvento(resultado)));
	}

	public void abrir(int linha, int coluna) {
		campos.parallelStream()
		.filter(campo -> campo.getLinha() == linha && campo.getColuna() == coluna)
		.findFirst()
		.ifPresent(campo -> campo.abrir());
	}
	
	private void mostrarMinas() {
		campos.stream().filter(campo -> campo.isMarcado()).filter(campo -> !campo.isMarcado()).forEach(campo -> campo.setAberto(true));
	}
	
	public void alterarMarcacao(int linha, int coluna) {
		campos.parallelStream()
			.filter(campo -> campo.getLinha() == linha && campo.getColuna() == coluna)
			.findFirst()
			.ifPresent(campo -> campo.alterarMarcacao());
	}

	private void gerarCampos() {
		
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				
				Campo campo = new Campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add(campo);
			}
		}
	}
	private void associarVizinhos() {
		
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	private void sortearMinas() {
		
		long minasArmadas = 0;
		Predicate<Campo> minado = campo -> campo.isMinado();
		
		do {
			
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while(minasArmadas < minas);
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(campo -> campo.objetivoAlcancado());
	}
	
	public void reiniciar() {
		
		campos.stream().forEach(campo -> campo.reiniciar());
		sortearMinas();
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		
		if(evento == CampoEvento.EXPLODIR) {
			
			mostrarMinas();
			notificarObservadores(false);
		} else if(objetivoAlcancado()){
			
			System.out.println("Ganhou!!");
			notificarObservadores(true);
		}
	}
}