package AugastWrritenTest;

//12)Assume that there is already  arraylist of members of Society Member{memberid,Wing_flatNo,name}.  
//Write a program which creates Map where key is Wing_FlatNo and value is List of all  names of 
//family members 

import java.util.ArrayList;
import java.util.HashMap;

class Members {
	int member_id;
	int wing_flatNo;
	String name;

	public Members(int member_id, int wing_flatNo, String name) {
		super();
		this.member_id = member_id;
		this.wing_flatNo = wing_flatNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "member_id=" + member_id + ", wing_flatNo=" + wing_flatNo + ", name=" + name;
	}
}

public class Problem12 {

	public static void main(String[] args) {
		ArrayList<Members> al = new ArrayList<Members>();
		al.add(new Members(1, 201, "ram"));
		al.add(new Members(2, 202, "shyam"));
		al.add(new Members(3, 203, "ravi"));
		al.add(new Members(4, 202, "raj"));
		HashMap<Integer, ArrayList<String>> hm = new HashMap<Integer, ArrayList<String>>();
		for (Members m : al) {
			if (hm.containsKey(m.wing_flatNo)) {
				ArrayList<String> tmemb = hm.get(m.wing_flatNo);
				tmemb.add(m.name);
				hm.put(m.wing_flatNo, tmemb);
			} else {
				ArrayList<String> temArrayList = new ArrayList<String>();
				temArrayList.add(m.name);
				hm.put(m.wing_flatNo, temArrayList);
			}
		}
		System.out.println(hm);
	}
}
