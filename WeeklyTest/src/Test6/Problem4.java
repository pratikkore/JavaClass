package Test6;

public class Problem4 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 3;
		System.out.println(a++ + b * ++c);
		System.out.println("a = " + a + " b= " + b + " c= " + c);
		System.out.println(b * 5 / a + b++ + b);
		System.out.println("a = " + a + " b= " + b + " c= " + c);
	}

}

//output is 
//21
//a = 6 b= 4 c= 4
//12
//a = 6 b= 5 c= 4