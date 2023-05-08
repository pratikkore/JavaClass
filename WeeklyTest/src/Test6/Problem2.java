package Test6;

public class Problem2 {

	public static void main(String[] args) {
		Base derived = new Derived();
		derived.setNum(10);
		derived.display();
	}
}

class Base {

	int num;

	public void display() {
		System.out.println(num);
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class Derived extends Base {
	int dNum;

	public void display() {
		System.out.println(dNum);
	}

}

//output is 
//0
