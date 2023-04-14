package PatternProg;

public class PatternAtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i = 'a'; i <= 'e'; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
