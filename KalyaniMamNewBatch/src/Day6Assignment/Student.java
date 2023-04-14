package Day6Assignment;

public class Student {

	private int id;
	private double percentage;
	private String name;
	private String address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPercentage(double percentage) {
		if (percentage > 35) {
			this.percentage = percentage;
		} else {
			System.out.println("Student get Failed...");
		}
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
