package Test2;

public class Problem14 {

//	14)WAP to print fibbo series upto 20 terms.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 0, n = 1;
		for (int i = 1; i <= 20; i++) {
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
