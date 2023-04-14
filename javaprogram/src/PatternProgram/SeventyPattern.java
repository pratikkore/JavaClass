//17)
//F E D C B A 
//F E D C B 
//F E D C 
//F E D 
//F E 
//F 

package PatternProgram;

public class SeventyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i = 'A'; i <= 'F'; i++) {
			for (char j = 'F'; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
