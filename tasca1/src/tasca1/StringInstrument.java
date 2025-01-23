package tasca1;

public class StringInstrument extends Instrument {
	static {
		System.out.println("Loading StringInstrument class...");
	}

	public StringInstrument(String name, double price) {
		super(name, price);
	}

	@Override
	public void play() {
		System.out.println("A string instrument is playing");
	}
}
