package Day1Assignmeent;

public class OddNumber {

	public void findodd() {
		System.out.println("odd Number");

		int num = 1232398;

		while (num > 0) {
			int r = num % 10;
			if (r % 2 == 1) {
				System.out.println(r);
			}
			num = num / 10;
		}

	}

	public void findeven() {
		System.out.println("*****************************************************************");
		System.out.println("Even Number");
		int num = 1232398;

		while (num > 0) {
			int r = num % 10;
			if (r % 2 == 0) {
				System.out.println(r);
			}
			num = num / 10;
		}

	}

	public void average() {
		System.out.println("*****************************************************************");
		System.out.println("average of number ");

		int num = 12345;
		int sum = 1;
		int avg = 1;
		int count = 0;
		while (num > 0) {
			int r = num % 10;
			count++;
			sum = sum + r;
			num = num / 10;
		}
		avg = sum / count;
		System.out.println(avg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNumber obj = new OddNumber();
		obj.findodd();
		obj.findeven();
		obj.average();

	}

}
