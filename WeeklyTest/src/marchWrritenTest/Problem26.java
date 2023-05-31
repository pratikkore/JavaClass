package marchWrritenTest;

//26.WAP to print 1 to 5 numbers such that same code works in for loop and do while loop. 
//Note 100% only looping code is required no other code should be present. 
//Only show 2 loops and both should result in same outcome 

public class Problem26 {

	public static void main(String[] args) {
		System.out.println("Using for loop:");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("Using do-while loop:");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 5);
	}

}
