package demo.utility;

import demo.model.engine.*;

import demo.model.vehicle.ToyotaVehicle;

public class EngineFactory implements AbstractFactory {

public Engine getEngine(String insert) {
	
		Engine engine = null;
		
		if (insert.equalsIgnoreCase("FORTUNER")) {
			engine = new FortunerEngine();
		} else if (insert.equalsIgnoreCase("HILUX")) {
			engine = new HiluxEngine();
		} else if (insert.equalsIgnoreCase("LAND CRUISER")) {
			engine = new LandCruiserEngine();
		} else if (insert.equalsIgnoreCase("PRADO")) {
			engine = new PradoEngine();
		} else if (insert.equalsIgnoreCase("WIGO")) {
			engine = new WigoEngine();
		}
		
		return engine;
	}

		@Override
		public ToyotaVehicle getVehicle(String input) {
			return null;
		}
	
}
