
public class Hilo6 extends Thread {
	Contador c;

	public Hilo6(Contador c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 2000; i++) {
			System.out.println("Hilo 6, numero: " + i);
			c.addCount();
		}
		System.out.println("Fin del Hilo 6");
	}
}
