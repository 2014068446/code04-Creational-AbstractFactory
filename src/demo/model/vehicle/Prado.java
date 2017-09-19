package demo.model.vehicle;

import demo.model.engine.Engine;

public class Prado extends ToyotaVehicle {

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
		System.out.println("2017 Toyota Prado 2x4");
		System.out.println("All power bruns Nitrous Oxide - mala Fast and the Furious.");
		return "2017 Toyota Prado 2x4 <br/>" + "All power bruns Nitrous Oxide - mala Fast and the Furious.";
	}

	@Override
	public String viewPrice() {
		System.out.println("Php 2,300,000,000.00");
		return "Php 2,300,000,000.00";
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

}
