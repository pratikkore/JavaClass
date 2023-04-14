package Test2;

public class Problem12 {

//	 WAP to print number from 1 to 50 if number is even then print as it is and number is odd then print negative number with its square

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i + "- odd number Squre is : " + (i * i));
			} else {
				System.out.println(i + "- This is even number");
			}
		}
	}

}
