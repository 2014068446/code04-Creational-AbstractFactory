package demo.model.engine;

public class PradoEngine extends Engine {

	@Override
	public String displayEngineType() {
		System.out.println("An engine for Prado.");
		return "An engine for Prado.";
	}

	@Override
	public String literAndHorsePower() {
		System.out.println("5L 150HP");
		return "5L 150HP";
	}

}
