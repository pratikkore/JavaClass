package Day7Assignment;

import Day4Assignment.ThisKeyword;

class order {
	int orderId;
	String custmourName;
	String cityname;

	public order(int oid, String custname, String cityname) {
		this.orderId = oid;
		this.custmourName = custname;
		this.cityname = cityname;
	}

	@Override
	public String toString1() {
		return "Order [orderId = " orderId + ", customerName=" + custmourName + ", cityname= "+ cityname +"}";

}

	class myDate {
		int DD;
		int MM;
		int YYYY;
	}

	public myDate(int dd, int mm, int yyyy) {
		this.DD = dd;
		this.MM = mm;
		this.YYYY = yyyy;
	}

	@Override
	public String  toString() {
		return "MyDate[DD=" + DD + ", MM=" + MM +
	}

public class Shipment {
	
	int shipmentId;
	order o;
	myDate md;
	
	public Shipment(int shipmentId,order o,myDate md ) {
		this.shipmentId=shipmentId;
		this.o=o;
		this.md=md;
	}
	
	@Override
	public String toString() {
		return "Shipment { shipmentId=" + shipmentId + ",o=" +o +",md="+md+"}";
	}

	public static void main(String[] args) {

		
	}

}
