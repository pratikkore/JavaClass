package marchWrritenTest;

//5.	Print below series upto 5 times [1M] 2 10 30 68 130

public class Problem5 {

	public static void main(String[] args) {
		int r = 5;

		for (int i = 0; i < r; i++) {
			int[] series = { 2, 10, 30, 68, 130 };
			for (int number : series) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}
}
