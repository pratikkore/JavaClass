package Day1Assignmeent;

public class SpyNumber {

	public void Display() {

		int num = 383;
		int add = 0;
		int multi = 1;
		while (num != 0) {
			int r = num % 10;
			add = r + add;
			multi = r * multi;
			num = num / 10;
		}
		if (add == multi) {
			System.out.println("this is spy number");
		} else {
			System.out.println("this is not spy number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpyNumber obj = new SpyNumber();
		obj.Display();
	};

};
