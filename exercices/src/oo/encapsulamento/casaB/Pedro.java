package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		//Ana mae = new Ana();
		
//		private String segredo = "";
//		String facoDentroDeCasa = ""; // visibilidade default ou pacote. Só da pra ver no mesmo pacote de origem
//		protected String formaDeFalar = "";
//		public String todosSabem = "";
		
		//System.out.println(mae.segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar); // acessado somente via herança
		System.out.println(todosSabem); // é publico
	}
}