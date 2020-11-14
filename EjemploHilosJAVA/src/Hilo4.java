
public class Hilo4 extends Thread {
	Contador c;

	public Hilo4(Contador c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("Hilo 4, numero: " + i);
			c.addCount();
		}
		System.out.println("Fin del Hilo 4");
	}
}
