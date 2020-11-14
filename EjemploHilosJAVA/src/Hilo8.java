
public class Hilo8 extends Thread {
	Contador c;

	public Hilo8(Contador c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Hilo 8, numero: " + i);
			c.addCount();
		}
		System.out.println("Fin del Hilo 8");
	}
}
