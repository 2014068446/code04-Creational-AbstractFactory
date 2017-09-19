package demo.model.vehicle;

import demo.model.engine.*;

public class Fortuner extends ToyotaVehicle {

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
		System.out.println("2017 Toyota Fortuner 4x4");
		System.out.println("All power that can climb Batasan Hills.");
		return "2017 Toyota Fortuner 4x4 <br/>" + "All power that can climb Batasan Hills.";
	}

	@Override
	public String viewPrice() {
		System.out.println("Php 1,830,000,000.00");
		return "Php 1,830,000,000.00";
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

}
