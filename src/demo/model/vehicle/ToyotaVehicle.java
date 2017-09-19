package demo.model.vehicle;

import demo.model.engine.*;

public abstract class ToyotaVehicle {

	public abstract void setEngine(Engine engine);

	public abstract Engine getEngine();

	public abstract String viewModel();

	public abstract String viewPrice();

}
