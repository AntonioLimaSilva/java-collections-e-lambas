package br.com.luciano.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Aprendendo sobre os métodos references do capítulo 6
 * @author lucli
 *
 */
public class Capitulo6 {

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
		
		//usuarios.forEach(u -> u.tornarModerador()); // expression lambda
		//System.out.println("Antes: " + usuarios); 
		//usuarios.forEach(Usuario::tornarModerador); // method reference
		
		//Consumer<Usuario> tornarModerador = Usuario::tornarModerador;
		//usuarios.forEach(tornarModerador);
		
		//usuarios.sort(Comparator.comparing(Usuario::getNome));
		
		//Function<Usuario, String> porNome = Usuario::getNome;
		//usuarios.sort(Comparator.comparing(porNome));
		
		//usuarios.sort(Comparator.comparingInt(Usuario::getPontos));
		
		//Em caso de empate na comparação por pontos o segundo critério seria a ordenação por nome
		//Comparator<Usuario> porPontosECasoEmpatePorNome = Comparator.comparingInt(Usuario::getPontos).thenComparing(Usuario::getNome);
		//usuarios.sort(porPontosECasoEmpatePorNome);
		
		//usuarios.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome)));
		//usuarios.sort(Comparator.nullsFirst(Comparator.comparing(u -> u.getNome())));
		
		//Ordenar pontos na forma decrescente
		//usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
		
		//Usuario luciano = new Usuario("Luciano", 101);
		// Os dois tipos são equivalentes
		//Runnable bloco = luciano::tornarModerador; // methods references
		//Runnable bloco = () -> luciano.tornarModerador(); // expression lambda
		//bloco.run();
		
		//Consumer<Usuario> consumer = Usuario::tornarModerador;
		//consumer.accept(luciano);
		//System.out.println("Depois: " + luciano);
		
		//usuarios.forEach(System.out::println);
		
		//Supplier<Usuario> criadorDeUsuarios = Usuario::new;
		//Usuario novo = criadorDeUsuarios.get();
		
		Function<String, Usuario> criadorDeUsuarios = Usuario::new;
		Usuario rodrigo = criadorDeUsuarios.apply("Rodrigo Turini");
		Usuario paulo = criadorDeUsuarios.apply("Paulo Silveira");
		System.out.println(rodrigo);
		System.out.println(paulo);
	}

}
