package br.com.luciano.collections;

public class TestaMap {
	
	public static void main(String[] args) {
		
		Livro programacaoJavaDeitel = new Livro("Como programar java", 1200, "8� Edi��o");
//		Sumario sumario1 = new Sumario("Capitulo 1", "Conhecendo os Principoios da Linguagem");
//		Sumario sumario2 = new Sumario("Capitulo 2", "Orienta��o a Objetos");
//		Sumario sumario3= new Sumario("Capitulo 3", "Polimofismo e encapsulamento");
		//List<Sumario> sumarios = Arrays.asList(sumario1, sumario2, sumario3);
		
		programacaoJavaDeitel.getAutores().add(new Autor("Antonio Silva", 41));
		programacaoJavaDeitel.getAutores().add(new Autor("Ediane Silva", 45));
		programacaoJavaDeitel.getAutores().add(new Autor("Francisca Silva", 60));
		programacaoJavaDeitel.getAutores().add(new Autor("Francisca Silva", 40));
	
		
		programacaoJavaDeitel.adicionarAutor(new Autor("Antonio Silva", 41));
		programacaoJavaDeitel.adicionarAutor(new Autor("Francisca Silva", 40));
		
		Autor autor = programacaoJavaDeitel.encontrarIdadeDoAutor(40);
		System.out.println("idade: " + autor);
		
	}

}
