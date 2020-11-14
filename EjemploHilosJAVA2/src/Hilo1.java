
public class Hilo1 extends Thread {
	Contador c;

	public Hilo1(Contador c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("Hilo 1, numero: " + (char)i);
			c.addCount();
		}
		System.out.println("Fin del Hilo 1");
	}
}
