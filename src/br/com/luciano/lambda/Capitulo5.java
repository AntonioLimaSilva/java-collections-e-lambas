package br.com.luciano.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Usando o método compare da interface Comparator
 * @author lucli
 *
 */
public class Capitulo5 {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Luciano", 101);
		Usuario user2 = new Usuario("Ediane", 98);
		Usuario user3 = new Usuario("Francisca", 50);
		Usuario user4 = new Usuario("Eliane", 70);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);
		
//		Comparator<Usuario> comparador = new Comparator<Usuario>() {
//
//			@Override
//			public int compare(Usuario user1, Usuario user2) {		
//				return user1.getNome().compareTo(user2.getNome());
//			}
//			
//		};
		
//		Comparator<Usuario> comparador = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
		
//      Collections.sort(usuarios, comparador);
		
//		Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
//		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		/*--Ordenando uma lista de usuários ainda mais sucinta--*/
		
		//usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
		//Comparator<Usuario> comparator1 = Comparator.comparing(u -> u.getNome());
		
//		usuarios.sort(Comparator.comparing(u -> u.getNome()));
//		usuarios.forEach(u -> System.out.println(u.getNome()));

/*--===================================================================--*/
//		
//		List<String> cursos = Arrays.asList("Devmedia", "AlgaWorks", "Alura");
//		
//		//cursos.sort(Comparator.naturalOrder());
//		cursos.sort(Comparator.reverseOrder());
//		cursos.forEach(c -> System.out.println(c));		
		
//		Function<Usuario, Integer> extraiPontos = u -> u.getPontos();
//		Comparator<Usuario> comparator = Comparator.comparing(extraiPontos);
//		usuarios.sort(comparator);
//		usuarios.forEach(u -> System.out.println(u.getPontos()));
		
		usuarios.sort(Comparator.comparing(u -> u.getPontos()));
		usuarios.forEach(u -> System.out.println(u.getPontos()));
	}

}
