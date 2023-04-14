package PatternProg;

public class EvenWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 121;
		int end = 229;
		int store = 0;
		while (start <= end) {
			if (start % 2 == 0) {
				System.out.println(store = start);

			}
			start++;
		}
		System.out.println(store);
	}

}
