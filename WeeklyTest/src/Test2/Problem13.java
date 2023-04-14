package Test2;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (j == 2) {
					System.out.println(j);
					break;
				}
				j++;
			}
			System.out.println(i);
		}

	}

}

//output is 
//infinit loop 1,2