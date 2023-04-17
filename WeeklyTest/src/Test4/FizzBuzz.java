package Test4;

//13) Write a  program that prints the numbers

//from 1 to 50. But for multiples of three print “buzz” instead of the
//number and for the multiples of five print “fizz”. For numbers which
//are multiples of both three and five print “ buzzfizz “. After program
//looping is completed print how many times buzz was printed, fizz
//was printed and buzzfizz was printed.

public class FizzBuzz {

	public static void main(String[] args) {

		int fizzCount = 0;
		int buzzCount = 0;
		int buzzfizz = 0;

		for (int i = 1; i < 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("buzzfizz" + i);
				buzzfizz++;
			}

			else if (i % 3 == 0) {
				System.out.println("buzz" + i);
				buzzCount++;
			} else if (i % 5 == 0) {
				System.out.println("fizz");
				fizzCount++;
			}
		}
		System.out.println(fizzCount);
		System.out.println(buzzCount);
		System.out.println(buzzfizz);

	}

}
