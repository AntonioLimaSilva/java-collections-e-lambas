package br.com.luciano.lambda;

import java.util.Arrays;
import java.util.List;

public class Capitulo2 {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Luciano", 100);
		Usuario user2 = new Usuario("Ediane", 98);
		Usuario user3 = new Usuario("Francisca", 50);
		Usuario user4 = new Usuario("Eliane", 70);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);
/////////////////////////////////////////////////////////////////////////////	
//		Consumer<Usuario> consumidor = new Consumer<Usuario>() {           //
//		                                                                   //	
//			@Override                                                      //
//			public void accept(Usuario user) {                             // 
//				System.out.println(user.getNome());                        //
//			}                                                              //
//			                                                               //
//		};                                                                 //
//		                                                                   //
//		usuarios.forEach(consumidor);                                      //
/////////////////////////////////////////////////////////////////////////////
		
		usuarios.forEach(u -> u.tornarModerador());
		

	}

}
