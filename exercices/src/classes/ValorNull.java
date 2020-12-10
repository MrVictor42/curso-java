package classes;

public class ValorNull {

	public static void main(String[] args) {
		
		/*
		 * O que é o nullpointerexception?
		 * É você ter uma variável nula e tentar acessar algum atributo dessa variável nula, seja um atributo
		 * ou comportamento (método)
		 * Uma variável nula não aponta para nenhum endereço de memoria, logo não é possivel acessar nenhum atributo
		 * ou método
		 * 
		 * O NULLPOINTEREXCEPTION é um erro de RunTimeException
		 */
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat("????"));
		}
		
		Data data = Math.random() > 0.5 ? new Data() : null;
		
		if(data != null) {
			data.mes = 3;
			System.out.println(data.obterDataFormata());
		}
	}
}