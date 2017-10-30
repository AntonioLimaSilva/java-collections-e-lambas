package br.com.luciano.injecao;

public class ImpressoraEpson implements Impressora {
	
	@Override
	public void imprimir(String documento) {
		System.out.println(">>>>> imprimindo na impressora Hpson " + documento);
	}

}
