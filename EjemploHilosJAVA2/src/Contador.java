
public class Contador {
	private Integer count = null;

	public Contador(Integer count) {
		super();
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}

	public synchronized void addCount() {

		Integer c = this.count;
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
		this.count = c + 1;

	}
}
