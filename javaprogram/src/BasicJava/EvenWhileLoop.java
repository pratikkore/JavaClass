package BasicJava;

public class EvenWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 1;
		int end = 20;
		int store = 0;
		while (start <= end) {
			if (start % 2 == 0) {
				store = store + start;
//				System.out.println(start);
			}
			start++;
		}
		System.out.println(store);
	}

}
