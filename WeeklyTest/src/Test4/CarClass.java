package Test4;

import java.util.Date;

class Engine {
	int engineid;
	Date lastenginecleanDate;
	SubEngine subEngine;

	public Engine(int engineid, Date lastengineDate, SubEngine subEngine) {
		this.engineid = engineid;
		this.lastenginecleanDate = lastengineDate;
		this.subEngine = subEngine;
	}
}

class SubEngine {
	String subenginetype;
}

class Gear {
	String type;
}

public class CarClass {
	int carId;
	String carColor;
	Engine engine;
	Gear gear;

	public CarClass(int carId, String carColor, Engine engine, Gear gear) {
		this.carId = carId;
		this.carColor = carColor;
		this.engine = engine;
		this.gear = gear;
	}

	public static void main(String[] args) {
		CarClass obj = new CarClass(1, "black", new Engine(1, new Date(), new SubEngine()), new Gear());
	}

}
