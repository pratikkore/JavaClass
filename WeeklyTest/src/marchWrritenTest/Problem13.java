package marchWrritenTest;

// 13.Assume Emp[] is already present where Emp contains (id,name,sal) in each object. 
// Write a function which reverses Emp[] such that 1st element's name goes to last element's name 
// but id and salary will remain as is. 
// Similarly for second element and so on. Eg : [{1,"E1",100}, {2,"E2",200},{3,"E3",300}]
class Emp {
	int id;
	String name;
	int salary;

	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class Problem13 {

	public static void main(String[] args) {
		Emp[] empArr = { new Emp(1, "E1", 100), new Emp(2, "E2", 200), new Emp(3, "E3", 300) };

		for (int i = 0; i < empArr.length / 2; i++) {
			String j = empArr[i].name;
			empArr[i].name = empArr[empArr.length - i - 1].name;
			empArr[empArr.length - i - 1].name = j;
//			System.out.println(Arrays.toString(empArr));
			for (Emp e : empArr) {
				System.out.println(e);
			}
		}
	}

}
