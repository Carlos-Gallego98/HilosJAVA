
public class HiloRunnable implements Runnable {
	Contador c;
	String nombre;
	int iteraciones;

	public HiloRunnable(String nombre, int iteraciones, Contador c) {
		this.c = c;
		this.nombre = nombre;
		this.iteraciones = iteraciones;
	}

	public void run() {
		System.out.println("Inicio de " +nombre);
		for (int i = 0; i < iteraciones; i++) {
			System.out.println(nombre+ "Iteracion numero: " + i);
			c.addCount();
		}
		System.out.println("Fin de "+nombre);
	}
}
