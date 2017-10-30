package br.com.luciano.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Livro {

	private String titulo;
	private int totalPaginas;
	private String edicao;
	private List<Sumario> sumarios = new ArrayList<>();
	private Set<Autor> autores = new HashSet<>();
	private Map<Integer, Autor> idadeDoAutor = new HashMap<>();

	public Livro(String titulo, int totalPaginas, String edicao) {
		this.titulo = titulo;
		this.totalPaginas = totalPaginas;
		this.edicao = edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public String getEdicao() {
		return edicao;
	}

	public List<Sumario> getSumarios() {
		return sumarios;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void adicionarSumarios(List<Sumario> sumarios) {
		this.sumarios.addAll(sumarios);
	}
	
	public void adicionarAutor(Autor autor) {
		this.autores.add(autor);
		this.idadeDoAutor.put(autor.getIdade(), autor);
	}
	
	public Autor encontrarIdadeDoAutor(int idade) {
		return this.idadeDoAutor.get(idade);
	}

	@Override
	public String toString() {
		return "[ T�tulo: " + this.titulo + ", Total p�ginas: " + this.totalPaginas + ", Edi��o: " + this.edicao + "]";
	}

	public boolean estaAdiconado(Autor autor) {
		return this.autores.contains(autor);
	}


}
