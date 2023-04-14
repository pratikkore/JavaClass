package Day7Assignment;

class Contentment {
	int pid;
	String pname;
	String paddress;

	public Contentment(int pId, String pName, String pAddress) {
		this.pid = pId;
		this.pname = pName;
		this.paddress = pAddress;
	}

	@Override
	public String toString() {
		return pid + " " + pname + " " + paddress;
	}
}

public class Person {
	int aId;
	String aName;
	String aAddress;
	Contentment call;

	public Person(int aId, String aName, String aAddress, Contentment call) {
		this.aId = aId;
		this.aName = aName;
		this.aAddress = aAddress;
		this.call = call;
	}

	@Override
	public String toString() {
		return aId + " " + aName + " " + aAddress + " " + call;
	}

	public static void main(String[] args) {

		Person obj = new Person(1, "Pratik", "akluj", new Contentment(12, "Pune", "bavdhan"));

		System.out.println(obj);
	}
}
