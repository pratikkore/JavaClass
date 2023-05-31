package marchWrritenTest;

import java.util.concurrent.Semaphore;

class Student implements Runnable {
	private static Semaphore puneSemaphore = new Semaphore(1);
	private static Semaphore mumbaiSemaphore = new Semaphore(1);
	private String city;
	private int id;

	public Student(String city, int id) {
		this.city = city;
		this.id = id;
	}

	public void run() {
		try {
			if (city.equals("Pune")) {
				puneSemaphore.acquire();
				System.out.println("Pune Student " + id + " performs");
				Thread.sleep(1000);
				puneSemaphore.release();
			} else if (city.equals("Mumbai")) {
				mumbaiSemaphore.acquire();
				System.out.println("Mumbai Student " + id + " performs");
				Thread.sleep(1000);
				mumbaiSemaphore.release();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Problem14 {

	public static void main(String[] args) {
		Thread[] threads = new Thread[5];
		threads[0] = new Thread(new Student("Pune", 1));
		threads[1] = new Thread(new Student("Mumbai", 1));
		threads[2] = new Thread(new Student("Pune", 2));
		threads[3] = new Thread(new Student("Mumbai", 2));
		threads[4] = new Thread(new Student("Mumbai", 3));

		for (Thread thread : threads) {
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
