package Day10_4;

class Parent {
	Object show() {
		System.out.println("Parent method");
		return this;
	}
}

class Child extends Parent {
	@Override
	String show() {
		super.show();
		System.out.println("Child method");
		return "String java";
	}
}

public class CovarientExample {

	public static void main(String[] args) {

		Parent obj = new Child();
		System.out.println(obj.show());
	}

}
