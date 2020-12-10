package classes;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		System.out.println("Valor de a: " + a + " valor de b: " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referencia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormata());
		System.out.println(d2.obterDataFormata());
		
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.obterDataFormata());
		System.out.println(d2.obterDataFormata());
		
		int c = 5;
		alterarPrimitivos(c);
		System.out.println(c);
	}
	
	/*
	 * Por o método abaixo se tratar de valor por referência, os valores citados abaixo troca os valores
	 */
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	/*
	 * O método abaixo é para alterar um valor primitivo, então não irá trocar o valor, pois não é uma copia
	 */
	
	static void alterarPrimitivos(int a) {
		a++;
	}
}