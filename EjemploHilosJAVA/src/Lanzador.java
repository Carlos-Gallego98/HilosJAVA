
public class Lanzador {
	public static void main(String[] args) throws InterruptedException {
		Contador c = new Contador(0);
		
		Hilo1 h1 = new Hilo1(c);
		Hilo2 h2 = new Hilo2(c);
		Hilo3 h3 = new Hilo3(c);
		Hilo4 h4 = new Hilo4(c);
		Hilo5 h5 = new Hilo5(c);
		Hilo6 h6 = new Hilo6(c);
		Hilo7 h7 = new Hilo7(c);
		Hilo8 h8 = new Hilo8(c);
		
		System.out.println("Inicio del Lanzador");
		h1.start();
		h2.start();
		h3.start();
		h4.start();
    	h5.start();
    	h6.start();
    	h7.start();
    	h8.start();
    	h1.join();
		h2.join();
		h3.join();
		h4.join();
    	h5.join();
		h6.join();
		h7.join();
		h8.join();
		System.out.println("Lanzador , el contador es " + c.getCount());
		System.out.println("Fin del Lanzador");
	}
}
