package Test6;

public class Problem9 {

	public static void main(String[] args) {
		Shape t = new Triangle();
		t.draw();
	}
}

class Shape {
	protected void draw() {
		System.out.println("I am drawing shape");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("I am drawing triangle");

	}

}

//output

//I am drawing triangle
