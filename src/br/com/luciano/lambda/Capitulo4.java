package br.com.luciano.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author Luciano Lima
 * Explorando a interface Consumer, que é uma interface funcional, porem existe um método default
 * chamado andThen
 * Métodos: andThen, removeIf
 */
public class Capitulo4 {

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
		
		Consumer<Usuario> imprimeMensagem = u -> System.out.println("Antes de imorimir os nomes");
		
		Consumer<Usuario> imprimeNomes = u -> System.out.println(u.getNome());
		
		usuarios.forEach(imprimeMensagem.andThen(imprimeNomes));
		
		
		//=================================================================//
//		Predicate<Usuario> removeUsuariosComPortosMaiorQue100 = new Predicate<Usuario>() {
//			public boolean test(Usuario usuario) {
//				return usuario.getPontos() > 100;
//			}
//		};
		
		usuarios.removeIf(u -> u.getPontos() > 100);
		usuarios.forEach(u -> System.out.println(u.getPontos()));

	}

}
