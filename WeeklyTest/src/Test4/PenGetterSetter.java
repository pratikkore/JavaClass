package Test4;

class Pen {
	private Rifill rfRifill;
	private int capLength;
	private String brand;

	public Rifill getRfRifill() {
		return rfRifill;
	}

	public void setRfRifill(Rifill rfRifill) {
		this.rfRifill = rfRifill;
	}

	public int getCapLength() {
		return capLength;
	}

	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}

class Rifill {
	private Nib nib;
	private String incColor;
	private int length;

	public Nib getNib() {
		return nib;
	}

	public void setNib(Nib nib) {
		this.nib = nib;
	}

	public String getIncColor() {
		return incColor;
	}

	public void setIncColor(String incColor) {
		this.incColor = incColor;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}

class Nib {
	private String materialType;
	private int width;

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}

public class PenGetterSetter {

	public static void main(String[] args) {

		Pen obj = new Pen();
		obj.setBrand("brand");
		obj.setCapLength(2);
		obj.setRfRifill(new Rifill());
		System.out.println(obj.getBrand());
		System.out.println(obj.getCapLength());

		Rifill objRifill = obj.getRfRifill();
		objRifill.setIncColor("Black");
		objRifill.setLength(3);
		objRifill.setNib(new Nib());
		System.out.println(objRifill.getIncColor());
		System.out.println(objRifill.getLength());

		Nib objNib = objRifill.getNib();
		objNib.setMaterialType("Material Type");
		objNib.setWidth(23);
		System.out.println(objNib.getMaterialType());
		System.out.println(objNib.getWidth());

	}

}
