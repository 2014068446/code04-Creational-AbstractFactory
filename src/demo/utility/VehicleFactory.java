package demo.utility;

import demo.model.engine.*;
import demo.model.vehicle.*;

public class VehicleFactory implements AbstractFactory {

	public ToyotaVehicle getVehicle(String input) {

		ToyotaVehicle vehicle = null;

		/*
		 * When creating the factory method the return type of the method is always your
		 * common superclass. The creation of the object is based on the value of the
		 * String content.
		 * 
		 */

		switch (input) {

		/*
		 * To complete the factory method, the object conversion is upcasting the data
		 * type on the right (when looking at the code) is always smaller than the data
		 * type on the left.
		 */

		case "LAND CRUISER":
			vehicle = new LandCruiser();
			break;
		case "PRADO":
			vehicle = new Prado();
			break;
		case "WIGO":
			vehicle = new Wigo();
			break;
		case "HILUX":
			vehicle = new Hilux();
			break;
		case "FORTUNER":
			vehicle = new Fortuner();
			break;

		}

		return vehicle;

	}

	@Override
	public Engine getEngine(String name) {
		return null;
	}

}
