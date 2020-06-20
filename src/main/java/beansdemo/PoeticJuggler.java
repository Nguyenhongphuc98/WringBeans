package beansdemo;

// tho tung hung
//checked
public class PoeticJuggler extends Juggler {

	private Poem poem;
	
	public PoeticJuggler() {
	}

	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	public String perform() {
		System.out.println(super.perform());
		System.out.println("While reciting...");
		return poem.recite();
	}

	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
	}
	
	
}
