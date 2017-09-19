package demo.model.engine;

public class FortunerEngine extends Engine {

	@Override
	public String displayEngineType() {
		System.out.println("An engine for Fortuner.");
		return "An engine for Fortuner.";

	}

	@Override
	public String literAndHorsePower() {
		System.out.println("10L 250HP");
		return "10L 250HP";
	}

}
