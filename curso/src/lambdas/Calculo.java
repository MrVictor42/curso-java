package lambdas;

// Se colocar a notação "@FunctionalInterface", uma interface só pode ter um método, exceto se o método for default e static
@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
}