package beansdemo;

import java.util.Collection;

public class OneManBand implements Performer {

	public OneManBand() {
	}

	public String perform() {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
		return "played all instrument";
	}

	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

}
