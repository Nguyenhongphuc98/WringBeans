package beansdemo;

// Nghe si tung hung
//checked
public class Juggler implements Performer {
	
	// demo 1.
	private int beanBags = 3;
	
	// demo scope
	//protected int beanBags = 3;
	// end demo scope

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	public String perform() {
		//using for demo scope
		beanBags++;
		//end demo scope
		return "JUGGLING " + beanBags + " BEANBAGS";
	}

	public int getBeanBags() {
		return beanBags;
	}

	public void setBeanBags(int beanBags) {
		this.beanBags = beanBags;
	}
	
	
}