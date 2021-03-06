package br.com.luciano.lambda;

public class Capitulo3 {

	public static void main(String[] args) {

		// Runnable r = new Runnable() {
		//
		// @Override
		// public void run() {
		// for(int i = 0; i <= 1000; i++) {
		// System.out.println(i);
		// }
		// }
		// };
		//
		// new Thread(r).start();

		//////////////////////////////////////////////////////////////////

		// Runnable r = () -> {
		// for(int i = 0; i <= 1000; i++) {
		// System.out.println(i);
		// }
		// };
		// new Thread(r).start();

		new Thread(() -> {
			for (int i = 0; i <= 1000; i++) {
				System.out.println(i);
			}
		}).start();
	}

}
