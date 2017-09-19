package demo.model.vehicle;

import demo.model.engine.Engine;

public class LandCruiser extends ToyotaVehicle {

	/*
	 * This is a HAS-A object relationship. The presence of another object inside a
	 * class means that class will own he object that is inside.
	 * 
	 * The statement will become "That any subclass of ToyotaVehicle, it has an
	 * equivalent engine.
	 */
	
	private Engine engine;

	@Override
	public String viewModel() {
		System.out.println("2017 Toyota Land Cruiser 4x4");
		System.out.println("A vehicle that can cruise on land.");
		return "2017 Toyota Land Cruiser 4x4 <br/>" + "A vehicle that can cruise on land.";
	}

	@Override
	public String viewPrice() {
		System.out.println("Php 3,000,000,000.00");
		return "Php 3,000,000,000.00";
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

}
