package br.com.luciano.injecao;

public class ImpressoraHP implements Impressora {
	
	@Override
	public void imprimir(String documento) {
		System.out.println(">>>>> imprimindo na impressora HP " + documento);
	}

}
