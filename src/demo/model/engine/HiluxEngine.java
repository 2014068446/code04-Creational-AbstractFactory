package demo.model.engine;

public class HiluxEngine extends Engine {

	@Override
	public String displayEngineType() {
		System.out.println("An engine for Hilux.");
		return "An engine for Hilux.";
	}

	@Override
	public String literAndHorsePower() {
		System.out.println("6L 1500HP");
		return "6L 1500HP";
	}

}
