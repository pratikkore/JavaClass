package Day19InnerClass;

class Outer {
	int x = 10;

	class InnerClass {
		public void show() {
			System.out.println(x);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {

		Outer o = new Outer();
		Outer.InnerClass in = o.new InnerClass();
		in.show();
	}

}
