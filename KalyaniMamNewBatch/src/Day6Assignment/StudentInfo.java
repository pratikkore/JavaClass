package Day6Assignment;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		obj.setId(123);
		obj.setName("Pratik");
		obj.setPercentage(76);
		obj.setAddress("Pune");

		if (obj.getPercentage() >= 35) {
			int perc = (int) obj.getPercentage();
		}

		System.out.print("\n Student Id : " + obj.getId() + "\n Student Name" + obj.getName() + "\n Student Address : "
				+ obj.getAddress() + "\n Student Percentage : " + obj.getPercentage());
	}
}
