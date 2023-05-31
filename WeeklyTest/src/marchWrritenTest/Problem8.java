package marchWrritenTest;

public class Problem8 {

	public static void main(String[] args) {
		Test t = new Test();

//		t.start();
		System.out.println("Main");
	}
}

class Test implements Runnable {
	public void run() {
		System.out.println("Hi");
	}

}

//output = 2 error found .1) start method not defined 2) the type test already defined .