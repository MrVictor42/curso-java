package fundamentals;

public class ConvertPrimitiveType {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = 42.0F;
		float c = (float) 1.0; // conversão explicita -> cashting
		
		System.out.println(b);
		System.out.println(c);
		
		int d = 4;
		byte e = (byte) d;
		System.out.println(e);
	}
}