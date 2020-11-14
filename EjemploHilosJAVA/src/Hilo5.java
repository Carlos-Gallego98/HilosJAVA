
public class Hilo5 extends Thread {
	Contador c;

	public Hilo5(Contador c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hilo 5, numero: " + i);
			c.addCount();
		}
		System.out.println("Fin del Hilo 5");
	}
}
