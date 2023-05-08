package Test6;

public class Problem8 {

	public static void main(String[] args) {

		Abs2 abs = new Abs2();
	}
}

abstract class Abs1 {
	int num;

	public abstract void move();
}

class Abs2 extends Abs1 {
	public void show() {
		System.out.println("in show method");
	}

}

//output

//Compile time error 
//beacuse abstract method not implemented in class Abs2
