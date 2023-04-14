//2 .WAP to print odd numbers from 521 to 229 using while loop. 

package AssigmentOnLooping;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 521;
		while (i >= 229) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i--;
		}

	}
}
