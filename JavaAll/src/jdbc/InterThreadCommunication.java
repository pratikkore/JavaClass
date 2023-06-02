package jdbc;

class Writing {

	synchronized void read() throws InterruptedException {
		wait();
		String s = Thread.currentThread().getName();
		System.out.println(s + " can read book");
	}

	synchronized void write() throws InterruptedException {
		String a_name = Thread.currentThread().getName();
		System.out.println(a_name + " writing book");
		Thread.sleep(5000);
		System.out.println("I have completed book all users can read book");
		notify();
	}
}

class User1 implements Runnable {
	Writing w;
	Thread d;

	User1(Writing w) {
		this.w = w;
		d = new Thread(this, "pooja");
		d.start();
	}

	@Override
	public void run() {
		try {
			w.read();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class User2 implements Runnable {
	Writing w;
	Thread d;

	User2(Writing w) {
		this.w = w;
		d = new Thread(this, "priya");
		d.start();
	}

	@Override
	public void run() {
		try {
			w.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Author implements Runnable {
	Writing w;
	Thread t;

	Author(Writing w) {
		this.w = w;
		t = new Thread(this, "chetan bhagat");
		t.start();
	}

	@Override
	public void run() {
		try {
			w.write();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {

		Writing w = new Writing();
		User2 u1 = new User2(w);
		Author a = new Author(w);
	}
}
