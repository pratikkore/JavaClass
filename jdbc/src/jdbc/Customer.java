package jdbc;

public class Customer {
	String cust_name, mob_no, gender, email;

	public Customer(String cust_name, String mob_no, String gender, String email) {
		super();
		this.cust_name = cust_name;
		this.mob_no = mob_no;
		this.gender = gender;
		this.email = email;
	}

	@Override
	public String toString() {
		return "cust_name=" + cust_name + ", mob_no=" + mob_no + ", gender=" + gender + ", email=" + email;
	}

}
