package demo.model.engine;

public class WigoEngine extends Engine {

	@Override
	public String displayEngineType() {
		System.out.println("An engine for Wigo.");
		return "An engine for Wigo.";
	}

	@Override
	public String literAndHorsePower() {
		System.out.println("100L 2400HP");
		return "100L 2400HP";
	}

}
