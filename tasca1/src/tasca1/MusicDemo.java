package tasca1;

public class MusicDemo {
	public static void main(String[] args) {
		System.out.println("Demonstrating class loading and instrument playing...\n");

		System.out.println("Current instrument count: " + Instrument.getInstrumentCount());
		System.out.println();

		WindInstrument flute = new WindInstrument("Flute", 299.99);
		flute.play();
		System.out.println("Current instrument count: " + Instrument.getInstrumentCount());
		System.out.println();

		StringInstrument violin = new StringInstrument("Violin", 999.99);
		violin.play();
		System.out.println("Current instrument count: " + Instrument.getInstrumentCount());
		System.out.println();

		PercussionInstrument drums = new PercussionInstrument("Drums", 599.99);
		drums.play();
		System.out.println("Current instrument count: " + Instrument.getInstrumentCount());
	}
}
