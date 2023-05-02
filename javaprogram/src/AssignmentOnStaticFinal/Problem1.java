package AssignmentOnStaticFinal;

class Car {
	static String model;
	static int totalCarSold;

}

public class Problem1 {

	public static void main(String[] args) {
		Car.model = "1st model";
		Car.totalCarSold = 44;
		System.out.println(Car.model + " static " + Car.totalCarSold);
//
		Car c = new Car();
		Car c2 = new Car();
		c.model = "2nd Model";
		c.totalCarSold = 10;

		System.out.println("Car Model : " + c2.model);
		System.out.println("Car Total Sold : " + c2.totalCarSold);

	}

}
