package br.com.luciano.collections;

import java.util.Arrays;
import java.util.List;

public class Testa {

	public static void main(String[] args) {
		
		Livro programacaoJavaDeitel = new Livro("Como programar java", 1200, "8� Edi��o");
		Sumario sumario1 = new Sumario("Capitulo 1", "Conhecendo os Principoios da Linguagem");
		Sumario sumario2 = new Sumario("Capitulo 2", "Orienta��o a Objetos");
		Sumario sumario3= new Sumario("Capitulo 3", "Polimofismo e encapsulamento");
		List<Sumario> sumarios = Arrays.asList(sumario1, sumario2, sumario3);
		
		//sumarios.add(new Sumario("Capitulo 4", "Recursividade"));
		
		programacaoJavaDeitel.getAutores().add(new Autor("Antonio Silva", 40));
		programacaoJavaDeitel.getAutores().add(new Autor("Ediane Silva", 40));
		programacaoJavaDeitel.getAutores().add(new Autor("Francisca Silva", 40));
		programacaoJavaDeitel.getAutores().add(new Autor("Francisca Silva", 40));
		
		programacaoJavaDeitel.adicionarSumarios(sumarios);
		System.out.println(programacaoJavaDeitel);
		programacaoJavaDeitel.getSumarios()
			.stream()
			.map(Sumario::getCapitulo)
			.forEach(c -> System.out.println(c));
		
		System.out.println("===================================================");
			
		int tamanho = programacaoJavaDeitel.getAutores().size();
		
		System.out.println(tamanho);
		
		programacaoJavaDeitel.getAutores().add(new Autor("Francisca Silva", 40));

		programacaoJavaDeitel.getAutores()
		.stream()
		.forEach(autor -> System.out.println(autor.getNome() + " = " + autor.getIdade()));
	}

}
