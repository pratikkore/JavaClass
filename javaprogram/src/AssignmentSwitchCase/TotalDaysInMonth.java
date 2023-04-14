//1. Write a Java program print total number of days in a month using switch case .

package AssignmentSwitchCase;

import java.util.Scanner;

public class TotalDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String month;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month name : ");
		month = sc.next();

		switch (month.toLowerCase()) {
		case "january":
			System.out.println("In January 31 days");
			break;

		case "february":
			System.out.println("In February 28 days");
			break;

		case "march":
			System.out.println("In March 31 days");
			break;

		case "april":
			System.out.println("In January 30 days");
			break;

		case "may":
			System.out.println("In May 31 days");
			break;

		case "june":
			System.out.println("In June 30 days");
			break;

		case "july":
			System.out.println("In July 31 days");
			break;

		case "august":
			System.out.println("In August 30 days");
			break;

		case "september":
			System.out.println("In September 31 days");
			break;

		case "october":
			System.out.println("In October 30 days");
			break;

		case "november":
			System.out.println("In November 31 days");
			break;

		case "december":
			System.out.println("In December 30 days");
			break;

		}
	}

}
