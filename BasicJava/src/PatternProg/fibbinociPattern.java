//0
//1 1
//2 3 5
//8 13 21

package PatternProg;

public class fibbinociPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 0, n = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(m + " ");
				int o = m + n;
				n = m;
				m = o;
			}

			System.out.println();
		}
	}

}
