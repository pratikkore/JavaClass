package Day1;

import java.util.Scanner;

public class FindNumberOccurance {

	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user number : ");
		int num = sc.nextInt();
		System.out.println("which number do you want to search");
		int search = sc.nextInt();
		int count = 0;
		boolean isFound = false;
		while (num != 0) {
			int r = num % 10;
			if (r == search) {
				count = count + 1;
				isFound = true;
			}
			num = num / 10;
		}
		if (isFound == true) {
			System.out.println("Count of " + search + " is " + count);
		} else {
			System.out.println("Enter valid number.........");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumberOccurance obj = new FindNumberOccurance();
		obj.display();
	}

}
