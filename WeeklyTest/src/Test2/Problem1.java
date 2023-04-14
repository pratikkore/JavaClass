package Test2;

//1)Write a program to print all numbers between 1 and 100 except
//the numbers which are divisible by 5or 10

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {
			if (i % 5 != 0 && i % 10 != 0) {
				System.out.println(i);
			}
		}
	}

}
