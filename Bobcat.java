/**
 * The Bobcat class represents a specific type of animal, extending the Animal abstract class.
 */
public class Bobcat extends Animal {
    /**
     * Constructor to create a Bobcat object with a specified name.
     *
     * @param name The name of the Bobcat.
     */
    public Bobcat(String name) {
        super(name);
    }

    /**
     * This method prints out the sound that a Bobcat makes.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " makes a growling sound.");
    }

    /**
     * This method represents the activity of a Bobcat while playing.
     */
    @Override
    public void play() {
        System.out.println(this.name + " hunts for prey while playing.");
    }
}
