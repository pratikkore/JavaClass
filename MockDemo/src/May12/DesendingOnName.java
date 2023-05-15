package May12;

import java.util.ArrayList;
import java.util.Collections;

class Hospital implements Comparable<Hospital> {
	int h_id;
	String h_name;
	Doctor doc;

	public Hospital(int h_id, String h_name, Doctor doc) {
		super();
		this.h_id = h_id;
		this.h_name = h_name;
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "Hospital [h_id=" + h_id + ", h_name=" + h_name + doc;
	}

	@Override
	public int compareTo(Hospital o) {
		return o.doc.d_name.compareTo(this.doc.d_name);
	}

}

class Doctor {
	int d_id;
	String d_name;
	String d_Profile;

	public Doctor(int d_id, String d_name, String d_Profile) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_Profile = d_Profile;
	}

	@Override
	public String toString() {
		return "Doctor [d_id=" + d_id + ", d_name=" + d_name + ", d_Profile=" + d_Profile + "]";
	}

}

public class DesendingOnName {

	public static void main(String[] args) {

		ArrayList<Hospital> al = new ArrayList<>();
		al.add(new Hospital(1, "sahyadri hospital", new Doctor(101, "dr.arvind", "heart")));
		al.add(new Hospital(2, "Dinanath mangeshkar", new Doctor(103, "dr.arora", "brain")));
		al.add(new Hospital(3, "Rubby hospital", new Doctor(104, "dr.naresh", "kidney")));
		al.add(new Hospital(4, "Birla Hospital ", new Doctor(102, "dr.mukherjee", "lungs")));

		Collections.sort(al);

		System.out.println("Deseinding order on doctors name : \n");
		for (Hospital a : al) {
			System.out.println(a.h_name + " " + a.doc.d_name + " " + a.doc.d_id);
		}

	}

}
