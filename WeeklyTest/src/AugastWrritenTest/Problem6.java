package AugastWrritenTest;

public class Problem6 {
	static void foo(Number n) {
		System.out.println(1);
	}

	static void foo(int i) {
		System.out.println(2);
	}

	static void foo(Short... s) {
		System.out.println(3);
	}

	static void foo(Integer n) {
		System.out.println(4);
	}

	public static void main(String[] args) {
		short n = 10;
		foo(new Short(n));

	}
}

//output =1