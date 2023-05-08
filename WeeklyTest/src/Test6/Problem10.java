package Test6;

interface Car {
	public void drive();
}

public class Problem10 {

	public static void main(String[] args) {
		Car car = new Swift();
		car.drive();
	}
}

class Swift implements Car {
	public void drive() {
		System.out.println("I am driving");
	}
}

//output 
//
//I am driving
