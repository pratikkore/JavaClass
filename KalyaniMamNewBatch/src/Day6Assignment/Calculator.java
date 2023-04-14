package Day6Assignment;

public class Calculator {

	public void calculateArea(int l, int b) {
		System.out.println("Area Of Rectangle = " + (l * b));
	}

	public void calculateArea(int h, float b) {
		System.out.println("Area Of Tringle = " + (0.5 * b * h));
	}

	public void calculateArea(int s) {
		System.out.println("Area Of Square = " + (s * s));
	}

	public void calculateArea(int r, double PI) {
		System.out.println("Area of Circle = " + (PI * r * r));
	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.calculateArea(7);
		cal.calculateArea(5, 3.14);
		cal.calculateArea(8, 8.5f);
		cal.calculateArea(3, 4);
	}
}
