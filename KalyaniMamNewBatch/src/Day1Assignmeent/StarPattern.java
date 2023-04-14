package Day1Assignmeent;

public class StarPattern {

	public void display() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("2)..............................................");
	}

	public void display2() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3)..............................................");
	}

	public void display3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("4)..............................................");
	}

	public void display4() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("5)..............................................");
	}

	public void display5() {
		for (int i = 4; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void display6() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i + 2; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarPattern obj = new StarPattern();
		obj.display();
		obj.display2();
		obj.display3();
		obj.display4();
		obj.display5();
		obj.display6();
	}

}
