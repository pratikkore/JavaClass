package marchWrritenTest;

class SomeClass {
	public int intVar = 0;
	String strVar = "InnerClassExample";
	private int intPvt = 4;
	public static int intStatic = 61;
	private static String strPvtStatic = " java";

	private void printVar() {
		System.out.println(intVar + " " + strVar + " " + intPvt);
	}

	static class Nested {

		public void printStaticInnerVar() {

			System.out.println(" variable from outer class " + strVar); // non static access

			System.out.println(" static variable from outer class " + intStatic);// 2

			System.out.println(" I am from static inner class"); // 3

		}

	}
}

class InnerClass {

	int intInner = 9; // 4

	static int num = 0; // 5

	static final int numConstant = 10; // 6

	String strInner = " I am string in innerclass";

	public void printInnerVar() {

		System.out.println(" I am from inner class " + );

	}

}

public class Problem17 {

	public static void main(String[] args) {
		SomeClass.StaticNested sn = new SomeClass.StaticNested();

		sn.printStaticInnerVar(); // 7

		SomeClass icd = new SomeClass();

		SomeClass.InnerClass inObj = icd.new InnerClass(); // create innerclass interface
		inObj.printInnerVar(); // 8

	}

}
