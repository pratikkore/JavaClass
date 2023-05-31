package marchWrritenTest;

public class Problem10 implements InterfaceDemo {

	public static void main(String[] args) {
		Problem10 impl = new Problem10();
//		impl.day = "Sunday";
		System.out.println(impl.day);
	}
}

interface InterfaceDemo {
	String day = "Monday";
}

//output= Unresolved compilation problem: 
//	The final field InterfaceDemo.day cannot be assigned