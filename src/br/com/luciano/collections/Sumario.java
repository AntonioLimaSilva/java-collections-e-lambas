package br.com.luciano.collections;

public class Sumario {

	private String capitulo;
	private String descricao;

	public Sumario(String capitulo, String descricao) {
		this.capitulo = capitulo;
		this.descricao = descricao;
	}

	public String getCapitulo() {
		return capitulo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return "[ Sum�rio: " + this.capitulo + ", Descri��o: " + this.descricao + " ]";
	}

}
