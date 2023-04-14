package PatternProg;

public class EToAPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i = 'a'; i <= 'e'; i++) {
			for (char j = 'e'; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

//edcba
//edcb
//edc
//ed
//e