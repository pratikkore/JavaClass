package AssigmentOnLooping;

public class PronicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb = 42;
//		int j = 2;
		boolean pronic = false;
		for (int i = 1, j = 2; i <= numb; i++, j++) {
			if ((i * j) == numb) {
				pronic = true;
				break;
			}
//			j++;
		}
		if (pronic == true) {
			System.out.println("this is pronic number");
		} else {
			System.out.println("This is not Pronic number");
		}

	}

}
