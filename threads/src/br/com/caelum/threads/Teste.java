package br.com.caelum.threads;

public class Teste {

	public static void main(String[] args) {
		Programa p1 = new Programa();
		p1.setId(1);
		new Thread().start();
		
		Programa p2 = new Programa();
		p2.setId(2);
		new Thread(p2).start();
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("programa 3 valor " + i);
				}
			}
		};
		
		new Thread(r).start();
		
		// Como só há um método abstrato na interface - run() - não é necessário declarar o nome
//		Runnable rLambda = () -> {
		Runnable rLambda = () -> {
			for(int i = 0; i< 10; i++) {
				System.out.println("programa lambda valor " + i);
			}
		};
		new Thread(rLambda).start();
		
		new Thread(() -> { 
			for(int i = 0; i< 10; i++) {
				System.out.println("programa lambda direto valor " + i);
			}
		}).start();
		
		
	}
}
