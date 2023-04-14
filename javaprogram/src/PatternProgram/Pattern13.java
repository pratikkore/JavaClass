//13. WAP to print following Pattern
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * *
//* * * *
//* * *
//* *
//*

package PatternProgram;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int k = 5; k >= 1; k--) {
			for (int j = 1; j <= k; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
