package Day1Assignmeent;

public class palindromeNumber {

	public void display() {
		for (int i = 100; i <= 500; i++) {
//			System.out.println(i);
			int rev = 0;
			int num = i;
			while (num != 0) {
				int r = num % 10;
				rev = rev * 10 + r;
				num = num / 10;
			}
//			System.out.println(rev);
			if (i == rev) {
				System.out.println(i + " is palindrome number.....");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeNumber obj = new palindromeNumber();
		obj.display();
	}

}
