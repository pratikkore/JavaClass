package Day6Assignment;

public class CalculatorOverloading {

	public void add(int num1, float numb2) {
		System.out.println("Addition of two  number : " + (num1 + numb2));
	}

	public void add(int num3, int num4) {
		System.out.println("Substraction of two number is : " + (num3 - num4));
	}

	public void add(int num5, double num6) {
		System.out.println("Multiplication of two number is : " + (num5 * num6));
	}

	public void add(float num7, int num8) {
		System.out.println("Division of two number is : " + (num7 / num8));
	}

	public static void main(String[] args) {
		CalculatorOverloading obj = new CalculatorOverloading();

		obj.add(2, 3.4);
		obj.add(5, 443);
		obj.add(6, 7.32);
		obj.add(21, 4.32);
	}

}
