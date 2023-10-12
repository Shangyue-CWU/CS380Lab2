package Wolf;
/**
 * Wolf class extends the Animal class and prints out 
 * information about a Wolf 
 * @author Jalixa Castillo
 *
 */

public class Wolf extends Animal {
	
/**
 * placing the default constructor
 * @param name is used to declare the wolf name
 */
	public Wolf(String name) {
		super(name);
	}
/**
 * Prints the sound a wolf makes
 * @Overrides sound() from the Animal class 
 */
	public void sound() {
		System.out.println(this.name + " says AHH Wooooooo");
	}
/**
 * Prints out what a wolf like to do for fun
 * @Overrides play() from the Animal class 
 */
	public void play() {
		System.out.println(this.name + " is tackling their friends");
	}
/**
 * Prints out what a wolf likes to eat
 * @Overrides eat() method from the Animal class
 */
	public void eat() {
		System.out.println(this.name + " eats wild meat");
	}
}
