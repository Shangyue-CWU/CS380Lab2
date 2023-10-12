/**
 * Class Eagle extends the abstract class Animal.
 * It provides concrete implementations for the abstract methods defined in Animal.
 * @author Robbie McGough
 */
public class Eagle extends Animal {

    /**
     * Constructor for Eagle class.
     * Initializes the name of the Eagle by calling the parent constructor.
     * @param name Name of the Eagle.
     */
    public Eagle(String name) {
        super(name);  // Call the constructor of the parent class to initialize the name.
    }

    /**
     * Overrides the abstract sound method from Animal.
     * Prints out the sound an Eagle makes.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " makes a screeching sound.");
    }

    /**
     * Overrides the abstract play method from Animal.
     * Prints out what an Eagle does for fun.
     */
    @Override
    public void play() {
        System.out.println(this.name + " soars through the sky for fun.");
    }

    /**
     * Overrides the abstract eat method from Animal.
     * Prints out what an Eagle eats.
     */
    @Override
    public void eat() {
        System.out.println(this.name + " ate an entire salmon.");
    }
}
