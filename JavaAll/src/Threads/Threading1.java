package Threads;

public class Threading1 extends Thread {
	@Override
	public void run() {
		String s = Threading1.currentThread().getName();
		System.out.println(s + " is executing");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Threading1 t = new Threading1();
		t.setName("First thread");
		t.setPriority(1);
		t.start();

		Threading1 t2 = new Threading1();
		t2.setName("Second Thread ");
		t2.setPriority(MAX_PRIORITY);
		t2.start();
	}

}
