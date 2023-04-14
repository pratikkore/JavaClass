//9. Write a Java program to convert days into years, weeks and days.

package AssignmentFirst;

import java.util.Scanner;

public class YearConversion {

	public static void main(String[] args) {

		int month, year, week, day;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of days:");
		month = s.nextInt();
		year = month / 365;
		month = month % 365;
		System.out.println("No. of years:" + year);
		week = month / 7;
		month = month % 7;
		System.out.println("No. of weeks:" + week);
		day = month;
		System.out.println("No. of days:" + day);
	}
}
