package oo.encapsulamento.casaA;

public class Paulo {
	
	void testeAcessos() {
		Ana esposa = new Ana();
		
//		private String segredo = "";
//		String facoDentroDeCasa = ""; // visibilidade default ou pacote
//		protected String formaDeFalar = "";
//		public String todosSabem = "";
		
		//System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}