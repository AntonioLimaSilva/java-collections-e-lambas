package br.com.luciano.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Capitulo 7 fala sobre Stream e da nova API de Collections
 * @author lucli
 *
 */
public class Capitulo7 {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Luciano", 101);
		Usuario user2 = new Usuario("Ediane", 98);
		Usuario user3 = new Usuario("Francisca", 50);
		Usuario user4 = new Usuario("Eliane", 70);
		Usuario user5 = new Usuario("William", 95);
		Usuario user6 = new Usuario("Lais", 62);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);
		usuarios.add(user5);
		usuarios.add(user6);
		
//		usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
//		usuarios.subList(0, 3).forEach(Usuario::tornarModerador);
//		usuarios.forEach(System.out::println);
		
//		for(Usuario user : usuarios) {
//			if(user.getPontos() > 70) {
//				user.tornarModerador();
//				System.out.println(user);
//			}
//		}
		
//		Stream<Usuario> stream = usuarios.stream()
//			.filter(u -> u.getPontos() > 70);
//		
//		stream.forEach(System.out::println);
		
//		usuarios.stream()
//			.filter(u -> u.getPontos() > 70)
//			.forEach(System.out::println);
		
//		usuarios.stream()
//			.filter(u -> u.getPontos() > 70)
//			.forEach(Usuario::tornarModerador);
		
//		List<Usuario> maisQue70 = new ArrayList<>();
//		usuarios.stream()
//			.filter(u -> u.getPontos() > 70)
//			//.forEach(u -> maisQue70.add(u)); // expressão lambda
//			.forEach(maisQue70::add); //method references
//		maisQue70.forEach(System.out::println);
		
//		Supplier<ArrayList<Usuario>> supplier = ArrayList::new;
//		BiConsumer<ArrayList<Usuario>, Usuario> accumulator = ArrayList::add;
//		BiConsumer<ArrayList<Usuario>, ArrayList<Usuario>> combiner = ArrayList::addAll;
//		
//		List<Usuario> maisQue70 = usuarios.stream()
//			.filter(u -> u.getPontos() > 70)
//			.collect(supplier, accumulator, combiner);
//		
//		maisQue70.forEach(System.out::println);
		
//		List<Usuario> maisQue70 = usuarios.stream()
//				.filter(u -> u.getPontos() > 70)
//				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//			
//			maisQue70.forEach(System.out::println);
		
		// Usando uma nova implementação chamada Collectors
//		List<Usuario> maisQue70 = usuarios.stream()
//				.filter(u -> u.getPontos() > 70)
//				.collect(Collectors.toList());
//			
//			maisQue70.forEach(System.out::println);
		
//		Set<Usuario> setDeUsuarios = usuarios.stream()
//			.collect(Collectors.toCollection(HashSet::new));
//		
//		setDeUsuarios.forEach(System.out::println);
		
//		List<Integer> pontos = new ArrayList<>();
//		usuarios.forEach(u -> pontos.add(u.getPontos()));
//		pontos.forEach(System.out::println);
		
//		List<Integer> pontos = usuarios.stream()
//			//.map(Usuario::getPontos) // utilizando method reference
//			.map(u -> u.getPontos()) // utilizando expression lambda
//			.collect(Collectors.toList());
//		
//		pontos.forEach(System.out::println);
		
//		double mediaDePontos = usuarios.stream()
//			.mapToInt(Usuario::getPontos)
//			.average()
//			.getAsDouble();
//		
//		System.out.println(mediaDePontos); // Página 61
		
//		double pontos = usuarios.stream()
//			.mapToInt(Usuario::getPontos)
//			.average()
//			.orElse(0.0);
//		
//		System.out.println(pontos);
		
//		List<Usuario> filtroDeUsuarios = usuarios.stream()
//			.filter(u -> u.getPontos() > 70)
//			.sorted(Comparator.comparing(Usuario::getNome))
//			.collect(Collectors.toList());
//		
//		filtroDeUsuarios.forEach(System.out::println);
		
//		usuarios.stream()
//			.mapToInt(Usuario::getPontos)
//			.average()
//			.orElseThrow(IllegalArgumentException::new);
		
//		Optional<Usuario> usuarioDeMaiorPonto = usuarios.stream()
//			.max(Comparator.comparing(Usuario::getPontos));
//		
//		if(usuarioDeMaiorPonto.isPresent()) {
//			System.out.println(usuarioDeMaiorPonto.get());
//		}
		
		Optional<String> nomeOptional = usuarios.stream()
			.max(Comparator.comparing(Usuario::getPontos))
			.map(u -> u.getNome());
		
		if(nomeOptional.isPresent()) {
			System.out.println(nomeOptional.get());
		}
	}

}
