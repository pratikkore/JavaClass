//4.	Print Series 2 -4 6 -8………n terms

package AssigmentOnLooping;

public class TableNegetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.print(" "+ i*2 +" ");
			}else {
				System.out.print( "-" + i*2 );
			}
			
		}
		
	}

}
