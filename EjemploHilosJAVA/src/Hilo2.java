
public class Hilo2 extends Thread {
	Contador c;

	public Hilo2(Contador c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hilo 2, numero: " + i);
			c.addCount();
		}
		System.out.println("Fin del Hilo 2");
	}
}
