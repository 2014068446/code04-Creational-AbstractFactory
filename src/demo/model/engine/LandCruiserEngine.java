package demo.model.engine;

public class LandCruiserEngine extends Engine {

	@Override
	public String displayEngineType() {
		System.out.println("An engine for Land Cruiser.");
		return "An engine for Land Cruiser.";
	}

	@Override
	public String literAndHorsePower() {
		System.out.println("7L 3500HP");
		return "7L 3500HP";
	}

}
