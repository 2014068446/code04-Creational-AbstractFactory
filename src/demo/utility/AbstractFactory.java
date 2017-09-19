package demo.utility;

import demo.model.engine.*;
import demo.model.vehicle.*;

public interface AbstractFactory {

	/*
	 * NOTE: All methods declared in interface are automatically
	 */
	
	ToyotaVehicle getVehicle(String input);
	Engine getEngine(String name);
	
}
