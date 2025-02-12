package tasca1;

public abstract class Instrument {
	static {
		System.out.println("Loading Instrument class...");
	}

	protected String name;
	protected double price;
	private static int instrumentCount = 0;

	public Instrument(String name, double price) {
		this.name = name;
		this.price = price;
		instrumentCount++;
	}

	public abstract void play();

	public static int getInstrumentCount() {
		return instrumentCount;
	}
}