package br.com.luciano.injecao;

public class Principal {
	public static void main(String[] args) {
		
		Impressora impressora = new ImpressoraHP();
		
		Checkout checkout = new Checkout(impressora);
		checkout.finalizar();
		
	}
}
