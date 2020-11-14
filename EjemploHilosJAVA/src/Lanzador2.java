
public class Lanzador2 {
	public static void main(String[] args) throws InterruptedException {
		Contador c = new Contador(0);
		
		Hilo h1 = new Hilo("Hilo1", 200, c);
		Hilo h2 = new Hilo("Hilo2", 30, c);
		HiloRunnable hr3=new HiloRunnable("Hilo3", 60, c);
		Thread h3 = new Thread(hr3);
		Thread h4 = new Thread(new HiloRunnable("Hilo4", 40, c));
		
		
		System.out.println("Inicio del Lanzador");
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
    	h1.join();
		h2.join();
		h3.join();
		h4.join();
		System.out.println("Lanzador , el contador es " + c.getCount());
		System.out.println("Fin del Lanzador");
	}
}
