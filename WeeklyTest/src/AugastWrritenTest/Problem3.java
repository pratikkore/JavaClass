package AugastWrritenTest;

public class Problem3 {
	public static void main(String[] args) {
		Parent c = new child();
		c.foo();
	}
}

class child extends Parent {
	@Override
	void foo() {
		System.out.println("A");
	}
}

class Parent {
	void foo() throws NullPointerException {
		System.out.println("ABA");

	}
}

//output =A
