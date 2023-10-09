package CS380Lab2;

public class Goldfish extends Animal {
	// constructor that call the super constructor
	public Goldfish(String name) {
		super(name);
	}
	
	// method to print fish noises
	@Override
	public void sound() {
		System.out.println(name + ": \"Glub Glub\"");
	}
	
	// method to print the fish booping the glass
	@Override
	public void play() {
		System.out.println(name + " boops the glass.");
	}
}
