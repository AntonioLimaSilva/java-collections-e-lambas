package br.com.luciano.collections;

public class Autor {

	private String nome;
	private int idade;

	public Autor(String nome, int idade) {
		if(nome == null) {
			throw new NullPointerException("Nome esta nulo");
		}
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	@Override
	public boolean equals(Object obj) {
		Autor autor = (Autor) obj;
		return this.nome.equals(autor.nome);
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		return "[Nome: "+ this.nome + " Idade: " + this.idade + "]";
	}
}
