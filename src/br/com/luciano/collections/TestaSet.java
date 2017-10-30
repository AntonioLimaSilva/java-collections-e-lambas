package br.com.luciano.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestaSet {

	public static void main(String[] args) {
		
		Livro programacaoJavaDeitel = new Livro("Como programar java", 1200, "8� Edi��o");
		Sumario sumario1 = new Sumario("Capitulo 1", "Conhecendo os Principoios da Linguagem");
		Sumario sumario2 = new Sumario("Capitulo 2", "Orienta��o a Objetos");
		Sumario sumario3= new Sumario("Capitulo 3", "Polimofismo e encapsulamento");
		List<Sumario> sumarios = Arrays.asList(sumario1, sumario2, sumario3);
		
		Autor autor1 = new Autor("Luciano", 50);
		Autor autor2 = new Autor("Luiz", 51);
		
		//Preciso de uma maneira d�, | � um metodo
		programacaoJavaDeitel.adicionarSumarios(sumarios);
		
		programacaoJavaDeitel.adicionarAutor(autor1);
		programacaoJavaDeitel.adicionarAutor(autor2);
		programacaoJavaDeitel.adicionarAutor(autor2);
		
		System.out.println("=============================Cap�tulos=============================");
		
		///programacaoJavaDeitel.getSumarios().forEach(sumario -> System.out.println(sumario.getCapitulo()));
		programacaoJavaDeitel.getSumarios()
			.stream()
			.map(sumario -> sumario.getCapitulo())
			.forEach(capitulo -> System.out.println(capitulo));
		
		System.out.println("=============================Autores================================");
		
		programacaoJavaDeitel.getAutores().forEach(autor -> System.out.println(autor.getNome()));
		
		System.out.println("===========================autor1 � igual a Luciano==================");
		
		Autor luciano = new Autor("Luciano", 50);
		
		System.out.println(programacaoJavaDeitel.estaAdiconado(luciano));
		System.out.println(autor1.equals(luciano));
		
		//Set<Autor> autores = programacaoJavaDeitel.getAutores();
		//Iterator<Autor> iterador = autores.iterator();
		Iterator<Autor> iterador = programacaoJavaDeitel.getAutores().iterator();
		while(iterador.hasNext()) {
			Autor proximo = iterador.next();
			System.out.println("Iterator: " + proximo);
		}
		
	}

}
