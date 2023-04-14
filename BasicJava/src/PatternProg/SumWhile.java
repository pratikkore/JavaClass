package PatternProg;

public class SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6565, sum = 0;

		while (a != 0) {
			int r = a % 10;
			sum = sum + r;
			a = a / 10;
		}
		System.out.println("addition is" + sum);
	}

}