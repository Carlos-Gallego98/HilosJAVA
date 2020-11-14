
public class Hilo3  extends Thread{
	Contador c;

	public Hilo3(Contador c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("Hilo 3, numero: " + i);
			c.addCount();
		}
		System.out.println("Fin del Hilo 3");
	}
}

