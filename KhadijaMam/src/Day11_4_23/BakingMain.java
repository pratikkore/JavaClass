package Day11_4_23;

public class BakingMain {

	public static void main(String[] args) {

		Baking obj = new Strawbary();
		obj.bake();

		Baking obj2 = new Butterscotch();
		obj2.bake();

		obj.mixing();

		Baking.adding();

	}

}
