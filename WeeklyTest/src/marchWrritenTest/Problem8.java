package marchWrritenTest;

public class Problem8 {

	public static void main(String[] args) {
		Testing t = new Testing();

//		t.start();
		System.out.println("Main");
	}
}

class Testing implements Runnable {
	public void run() {
		System.out.println("Hi");
	}

}

//output = 2 error found .1) start method not defined