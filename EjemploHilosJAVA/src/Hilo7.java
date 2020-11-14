
public class Hilo7  extends Thread{
	Contador c;

	public Hilo7(Contador c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("Hilo 7, numero: " + i);
			c.addCount();
		}
		System.out.println("Fin del Hilo 7");
	}
}

