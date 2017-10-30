package br.com.luciano.injecao;

public class Checkout {
	
	private Impressora impressora;
	
	public Checkout(Impressora impressora) {
		this.impressora = impressora;
	}
	
	public void finalizar() {
		impressora.imprimir("documento.csv");
	}

}
