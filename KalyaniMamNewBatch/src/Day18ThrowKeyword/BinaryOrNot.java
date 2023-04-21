package Day18ThrowKeyword;

public class BinaryOrNot {

	public boolean display(int num) throws BinaryCheck {

		if (num == 0 || num == 1 || num < 0) {
			throw new BinaryCheck();

		}

		while (num != 0) {

			if (num % 10 > 1) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}

	public static void main(String[] args) {

		int num = 1234;
		BinaryOrNot obj = new BinaryOrNot();
		obj.display(num);
	}

}
