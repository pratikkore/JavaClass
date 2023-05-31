package Threading;

public class Thread1 extends Thread {
	@Override
	public void run() {
		String s = Thread.currentThread().getName();
		System.out.println(s + " is executing");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.setName("First thread");
		t.setPriority(1);
		t.start();

		Thread1 t2 = new Thread1();
		t2.setName("Second Thread ");
		t2.setPriority(MAX_PRIORITY);
		t2.start();
	}

}
