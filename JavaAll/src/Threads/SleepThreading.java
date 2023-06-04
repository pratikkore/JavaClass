package Threads;

public class SleepThreading implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String s = Thread.currentThread().getName();
			System.out.println(s);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SleepThreading s = new SleepThreading();
		Thread t = new Thread(s, "classicle music playing ..");
		t.start();
		Thread t2 = new Thread(s, "jazz music playing ");
		t2.start();
	}
}
