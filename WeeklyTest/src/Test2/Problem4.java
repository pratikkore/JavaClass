package Test2;

public class Problem4 {

//	4)write a java program to check given number is spy number or not
//	e.g 123 if sum of digit is equals to product of digit the number is spy       number
//	i.e 123=1+2+3=6 and 1*2*3=6 so the number is spy  number

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
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
			System.out.println("This is not A SPY NUMBER");
		}

	}

}
