package demo.model.vehicle;

import demo.model.engine.Engine;

public class Hilux extends ToyotaVehicle {

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
		System.out.println("2017 Toyota Hilux 2x4");
		System.out.println("A pickup that likes to keep up.");
		return "2017 Toyota Hilux 2x4 <br/>" + "A pickup that likes to keep up.";
	}

	@Override
	public String viewPrice() {
		System.out.println("Php 950,000.00");
		return "Php 950,000.00";
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

}
