package fundamentals;

public class PointNotation {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); // o replace é para substituir
		s = s.toUpperCase();
		s = s.concat("!!!"); 
		
		System.out.println(s);
		System.out.println("Victor".toUpperCase());
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);
	}
}