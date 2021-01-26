module app.calculo {
	requires app.logging;
	exports br.com.cod3r.app.calculo;
	
	exports br.com.cod3r.app.calculo.interno to app.financeiro;
}