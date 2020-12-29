package classes;

public class Data {

	int dia;
	int mes;
	int ano;
	final String formato = "%d/%d/%d\n";
	
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormata() {
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf(obterDataFormata());
	}
}