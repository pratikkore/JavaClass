package marchWrritenTest;

import java.io.IOException;

public class Problem2 {

	public static void main(String[] args) {

		Parent p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}

class Parent {
	void msg() throws IOException {
		System.out.println("parent");
	}
}

class TestExceptionChild3 extends Parent {
	@Override
	void msg() throws NullPointerException {

		System.out.println("child");
	}

}

// output = child