package marchWrritenTest;

//18) find out output

enum Directions {
	NORTH, SOUTH, EAST, WEST;

	Directions() {
		System.out.println("one direction");
	}
}

public class Problem19 {

	public static void main(String[] args) {
		Directions d1 = Directions.EAST;

		System.out.println(d1);

		Directions d2 = Directions.NORTH;

		System.out.println(d1);

	}
}

//output =
//one direction
//one direction
//one direction
//one direction
//EAST
//EAST
