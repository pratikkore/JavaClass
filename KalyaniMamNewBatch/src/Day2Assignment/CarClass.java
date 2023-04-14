package Day2Assignment;

import java.util.Scanner;

public class CarClass {

	int modelNumber, price;
	String carName, carColor;

	void car1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter car name ..");
		carName = sc.next();
		System.out.println("Enter car model number...");
		modelNumber = sc.nextInt();
		System.out.println("Enter car price...");
		price = sc.nextInt();
		System.out.println("Enter car color ...");
		carColor = sc.next();
	}

	void display1() {
		System.out.print("Car Details =" + carName + " " + modelNumber + " " + price + " " + carColor);
	}

	public static void main(String[] args) {
		CarClass obj = new CarClass();
		obj.car1();
		obj.display1();

		CarClass obj2 = new CarClass();
		obj2.car1();
		obj2.display1();

		CarClass obj3 = new CarClass();
		obj3.car1();
		obj3.display1();
	}

}
