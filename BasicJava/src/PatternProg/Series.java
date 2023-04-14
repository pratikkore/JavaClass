package PatternProg;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 0, n = 1;
		for (int i = 2; i <= 9; i++) {
			int o = m + n;
			System.out.println(m + " ");
			m = n;
			n = o;
		}
	}

}
