package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		Ana sogra = new Ana();
		
//		private String segredo = "";
//		String facoDentroDeCasa = ""; // visibilidade default ou pacote. Só da pra ver no mesmo pacote de origem
//		protected String formaDeFalar = "";
//		public String todosSabem = "";
		
		//System.out.println(sogra.segredo);
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar); // acessado somente via herança
		System.out.println(sogra.todosSabem); // é publico
	}
}