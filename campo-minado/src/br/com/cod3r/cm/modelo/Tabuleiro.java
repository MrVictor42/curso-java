package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<Campo>();
	
	public Tabuleiro(int linhas, int colunas, int minas) {
		
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void abrir(int linha, int coluna) {
		
		try {
			campos.parallelStream()
			.filter(campo -> campo.getLinha() == linha && campo.getColuna() == coluna)
			.findFirst()
			.ifPresent(campo -> campo.abrir());
		} catch(ExplosaoException explosao) {
			campos.forEach(campo -> campo.setAberto(true));
			throw explosao;
		}
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
				campos.add(new Campo(linha, coluna));
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
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		int contador = 0;
		
		stringBuilder.append("  ");
		for(int coluna = 0; coluna < colunas; coluna ++) {
			
			stringBuilder.append(" ");
			stringBuilder.append(coluna);
			stringBuilder.append(" ");
		}
		
		stringBuilder.append("\n");
		
		for (int linha = 0; linha < linhas; linha ++) {
			
			stringBuilder.append(linha);
			stringBuilder.append(" ");
			for (int coluna = 0; coluna < colunas; coluna++) {
				
				stringBuilder.append(" ");
				stringBuilder.append(campos.get(contador));
				stringBuilder.append(" ");
				contador ++;
			}
			stringBuilder.append("\n");
		}
		
		return stringBuilder.toString();
	}
}