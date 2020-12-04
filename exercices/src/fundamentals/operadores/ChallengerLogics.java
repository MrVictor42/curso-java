package fundamentals.operadores;

public class ChallengerLogics {

	public static void main(String[] args) {
		/*
		 * Trabalho na terça (Verdadeiro ou falso)
		 * Trabalho na quinta (Verdadeiro ou falso)
		 * 
		 * Se trabalho terça e quinta = COMPRAR TV 50 Polegadas + Sorvete
		 * Se apenas um dos trabalhos der certo = COMPRAR TV 32 Polegadas + Sorvete
		 * Se nenhum dos trabalhos não der certo = Família em casa
		 * 
		 * Não tomar sorvete = Mais saudavel e familia saudavel ++
		 */

		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		
		if(trabalhoTerca == true && trabalhoQuinta == true) {
			System.out.println("Compramos a TV 50 Polegadas e tomamos Sorvete huuuum!");
		} else if(trabalhoTerca == true && trabalhoQuinta == false){
			System.out.println("Compramos a TV 32 Polegadas e tomamos Sorvete huuuum!");
		} else {
			System.out.println("Não compramos nada, mas pelo menos a família tá mais saudável sem sorvete...");
		}
	}
}