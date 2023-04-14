//9.	 Write a program to calculate product of digits of any number.

package AssigmentOnLooping;

public class ProductOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 569;
		int ans = 1;
		while (num != 0) {
			int r = num % 10;
			ans = ans * r;
			num = num / 10;
		}
		System.out.println(ans);
	}

}
