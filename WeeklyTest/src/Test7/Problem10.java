package Test7;

import java.util.ArrayList;
import java.util.Scanner;

//10. An arraylist is list of Emp objects.Also there is arraylist of Dept and ArrayList of Address,Each Emp
//class has eid,ename,deptid.Dept
//class has deptid,dname,city.Addres
//class has pin,
//city.Write a
//program to
//accept zip
//from user
//and print
//all empname
//of Emp
//who are
//work in
//that accepted
//pin.and also
//create ArrayList<empInfo>
//which contains empname,
//deptname who
//are from
//given pin.

class Emp {
	int eid;
	String ename;
	int deptid;

	public Emp(int eid, String ename, int deptid) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.deptid = deptid;
	}

	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", deptid=" + deptid;
	}
}

class Dept {
	int deptid;
	String dname, city;

	public Dept(int deptid, String dname, String city) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.city = city;
	}

	@Override
	public String toString() {
		return "deptid=" + deptid + ", dname=" + dname + ", city=" + city;
	}

}

class Address {
	int pin;
	String city;

	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
}

class EmpInfo {
	String empName, deptName;

	public EmpInfo(String empName, String deptName) {
		super();
		this.empName = empName;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "EmpInfo [empName=" + empName + ", deptName=" + deptName + "]";
	}

}

public class Problem10 {
	public static void main(String[] args) {
		ArrayList<Emp> empArrayList = new ArrayList<Emp>();
		empArrayList.add(new Emp(1, "Pratik", 1));
		empArrayList.add(new Emp(2, "Jayanti", 1));
		empArrayList.add(new Emp(3, "Jk", 2));
		empArrayList.add(new Emp(4, "Xyz", 3));

//		System.out.println(empArrayList);

		ArrayList<Dept> deptArrayList = new ArrayList<Dept>();
		deptArrayList.add(new Dept(1, "IT", "Pune"));
		deptArrayList.add(new Dept(2, "Mech", "Pune"));
		deptArrayList.add(new Dept(3, "Civil", "Solapur"));

		ArrayList<Address> addressArrayList = new ArrayList<Address>();
		addressArrayList.add(new Address(111, "Pune"));
		addressArrayList.add(new Address(222, "Mumbai"));
		addressArrayList.add(new Address(333, "Solapur"));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Pin Code");
		int pinCode = scanner.nextInt();
		ArrayList<EmpInfo> empInfos = new ArrayList<EmpInfo>();
		for (Address address : addressArrayList) {
			if (address.pin == pinCode) {
				for (Dept d : deptArrayList) {
					if (d.city == address.city) {
						for (Emp e : empArrayList) {
							if (d.deptid == e.deptid) {
								System.out.println(e.ename);
								empInfos.add(new EmpInfo(e.ename, d.dname));

							}
						}
					}
				}
			}
		}

		System.out.println(empInfos);

	}
}
