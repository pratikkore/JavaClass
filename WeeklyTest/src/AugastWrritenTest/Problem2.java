package AugastWrritenTest;

//2) find the output

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Think";
		String str2 = new String("Quotient");
		String str3 = str2.intern();
		System.out.println(str2 == str3);
		String str4 = str1 + "java";
		String str5 = "ThinkQuotient";
		System.out.println(str4 == str5);
		System.out.println(str4.equals(str5));
		System.out.println();

	}

}

//output= false 
//false
//false
