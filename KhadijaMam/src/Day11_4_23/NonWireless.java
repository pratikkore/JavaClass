package Day11_4_23;

interface Electrical {
	public void Tv();
}

interface Wireless {
	public void mobile();
}

public class NonWireless implements Wireless, Electrical {

	@Override
	public void mobile() {
		System.out.println("This is mobile... ");
	}

	@Override
	public void Tv() {
		System.out.println("this is tv....");
	}
}
