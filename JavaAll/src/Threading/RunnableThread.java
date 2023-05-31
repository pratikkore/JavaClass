package Threading;

public class RunnableThread implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String s = Thread.currentThread().getName();
			System.out.println(s + "--->" + i);
		}
	}

	public static void main(String[] args) {
		RunnableThread r = new RunnableThread();
		Thread t = new Thread(r, "First thread");
		t.start();
		Thread t2 = new Thread(r, "Second Thread");
		t2.start();
	}

}
