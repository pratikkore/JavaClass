package OopsAssignment;

public class Assignment8 {

//	8. print 2 objects in sysout and see its hashcode is different
//	Eg Student@15db9742 and Student@2329742

	public void student1() {
		System.out.println("this is student one");
	}

	public void student2() {
		System.out.println("this is student two");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment8 s1 = new Assignment8();
		System.out.println(s1);

		Assignment8 s2 = new Assignment8();
		System.out.println(s2);

	}

}
