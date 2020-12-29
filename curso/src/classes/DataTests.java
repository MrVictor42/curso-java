package classes;

public class DataTests {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		
		d1.dia = 14;
		d1.mes = 4;
		d1.ano = 1912;
		
		d2.dia = 8;
		d2.mes = 12;
		d2.ano = 2020;
		
		System.out.println(d1.obterDataFormata());
		System.out.println(d2.obterDataFormata());
		
		System.out.println(d3.obterDataFormata());
	}
}