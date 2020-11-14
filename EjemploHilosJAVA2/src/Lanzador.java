
public class Lanzador {
	public static void main(String[] args) throws InterruptedException {
		Contador c = new Contador(0);
		
		Hilo1 h1 = new Hilo1(c);
		
		
		
		System.out.println("Inicio del Lanzador");
		h1.start();
    	h1.join();
		System.out.println("Lanzador , el contador es " + c.getCount());
		System.out.println("Fin del Lanzador");
	}
}
