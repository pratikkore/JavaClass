package Day5;

public class VolumeCalculator {
	double radius;
	double height;
	int length;
	int breadth;

	public double calculateVolume(double radius, double height) {
		this.radius = radius;
		this.height = height;
		double cylinder = 3.14 * radius * radius * height;
		return cylinder;
	}

	public int calculateVolume(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;

		int cuboid = length * breadth * height;
		return cuboid;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolumeCalculator obj = new VolumeCalculator();

		System.out.println("Volume of Cylinder " + obj.calculateVolume(12.87, 23.54));
		System.out.println("Volume of Cuboid " + obj.calculateVolume(3, 12, 32));

	}

}
