package Test2;

public class Problem5 {

//5) write a java program to check given number is trimorphic  number or not
//	4 is trimorphic number as its cube (64) contains 4  at the end .
//	5 is trimorphic number as its cube (625)contains 5 at the end.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 20;
		long cube = (num * num * num);
		System.out.println(cube);
		if (cube % 10 == num % 10 && cube != 0) {
			System.out.println("this is trimorphic number");

		} else {
			System.out.println("this is not trimorphic number");
		}
	}

}

//}
