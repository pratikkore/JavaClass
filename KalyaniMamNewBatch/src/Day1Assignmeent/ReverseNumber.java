package Day1Assignmeent;

public class ReverseNumber {

	public void display() {
		int num = 12345;
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {

		ReverseNumber obj = new ReverseNumber();
		obj.display();
	}

}
