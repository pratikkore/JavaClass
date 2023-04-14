package Day7Assignment;

class Animal {
	int weight = 60;
}

class Wild extends Animal {
	String name = "lion";
}

class Pet extends Wild {
	String color = "yellow";

	void showPet() {
		System.out.println(weight + " " + name + " " + color);
	}
}

public class inheritanceMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p = new Pet();
		p.showPet();
	}

}