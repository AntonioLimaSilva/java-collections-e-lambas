package br.com.luciano.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Capitulo 8 aborda mais operações com stream
 * @author lucli
 *
 */
public class Capitulo8 {
	
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
		
//		usuarios.stream()
//			.filter(u -> u.getPontos() > 60)
//			.sorted(Comparator.comparing(Usuario::getNome))
//			.forEach(System.out::println);
		
//		List<Usuario> filtrados = usuarios.stream()
//			.filter(u -> u.getPontos() > 60)
//			.sorted(Comparator.comparing(Usuario::getNome))
//			.collect(Collectors.toList());
//		
//		filtrados.forEach(System.out::println);
		
//		Usuario maisDeu60 = usuarios.stream()
//			.filter(u -> u.getPontos() > 60)
//			.collect(Collectors.toList())
//			.get(0);
//		
//		System.out.println(maisDeu60);
		
//		Optional<Usuario> usuarioOptional = usuarios.stream()
//			.filter(u -> u.getPontos() > 60)
//			.findAny();
//		
//		if(usuarioOptional.isPresent()) {
//			System.out.println(usuarioOptional.get());
//		}
		
//		Optional<Usuario> usuarioOptional = usuarios.stream()
//			.filter(u -> u.getPontos() > 60)
//			.peek(System.out::println)
//			.findAny();
//		
//		if(usuarioOptional.isPresent()) {
//			usuarioOptional.get();
//		}
		
//		usuarios.stream()
//			.filter(u -> u.getPontos() > 70)
//			.peek(System.out::println);
		
//		usuarios.stream()
//			.sorted(Comparator.comparing(Usuario::getNome))
//			.peek(System.out::println)
//			.findAny();
		
		//Operações de redução pag: 68		
//		double mediaPontos = usuarios.stream()
//			.mapToInt(Usuario::getPontos)
//			.average()
//			.getAsDouble();
//		
//		System.out.println(mediaPontos);
		
//		Optional<Usuario> maxOptional = usuarios.stream()
//			.max(Comparator.comparing(Usuario::getPontos));
//		
//		if(maxOptional.isPresent()) {
//			Usuario usuarioMaiorPonto = maxOptional.get();
//			System.out.println(usuarioMaiorPonto);
//		}
		
//		int totalPontos = usuarios.stream()
//			.mapToInt(Usuario::getPontos)
//			.sum();
//		
//		System.out.println(totalPontos); // pag: 69
		
		// Existe essa forma aqui, porem existe uma melhor
//		OptionalDouble media = usuarios.stream()
//			.mapToInt(Usuario::getPontos)
//			.average();
//		
//		double pontuacaoMedia = media.orElse(0.0);
//		System.out.println(pontuacaoMedia);
//		
//		if(media.isPresent()) {
//			media.getAsDouble();
//			System.out.println("Com média!!!" + media.getAsDouble());
//		} else {
//			media.orElse(0.0);
//			System.out.println("Média zero!!!" + media.orElse(0.0));
//		}
		
//		double pontuacaoMedia = usuarios.stream()
//			.mapToInt(Usuario::getPontos)
//			.average()
//			.orElse(0.0);
//		
//		System.out.println(pontuacaoMedia);
		
//		usuarios.stream()
//			.mapToInt(Usuario::getPontos)
//			.average()
//			.orElseThrow(IllegalStateException::new);
		
		Optional<Usuario> usuarioOptional = usuarios.stream()
			.max(Comparator.comparingInt(Usuario::getPontos));
		
		if(usuarioOptional.isPresent()) {
			System.out.println(usuarioOptional.get());
		}
		
	}

}
