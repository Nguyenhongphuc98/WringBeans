package beansdemo;

public class Instrumentalist implements Performer {

	public Instrumentalist() {
	}

	public String perform() {
		System.out.print("Playing " + song + ":");
		if (instrument != null) {
			instrument.play();
		}
		
		return "played";
	}

	private String song = "nothing";

	public void setSong(String song) {
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	public String screamSong() {
		return song;
	}

	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
