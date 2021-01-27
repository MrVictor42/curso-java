package br.com.cod3r.app.financeiro;

public class CalcImpl1 implements Calc{
	
	@Override
	public double soma(double... nums) {
		
		double total = 0;
		
		for(int aux = 0; aux < nums.length; aux ++) {
			total += nums[aux];
		}
		
		return total;
	}
}