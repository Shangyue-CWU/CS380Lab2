/*
 * A class by kyle Nolan
 */

/**
 *Child class of Animal that overrides the abstract methods.
 * The animal is a Falcon, and it features authentic falcon sounds and a fun fact about them.
 */
public class Falcon extends Animal {
    /**
     *A field which stores the animals name.
     */
    protected String name;


    /**
     * A constructor that takes in the Falcon's name
     * @param name Name of the Falcon
     */
    public Falcon(String name){
        super(name);
        this.name = name;
    }

    /**
     * Makes a specific Falcon sound.
     */
    @Override
    public void sound() {
        System.out.println("SKEEE KAK KAK KAK KAK KAK");
    }

    /**
     * Shows how Falcons play, or like to hunt rather.
     */
    @Override
    public void play() {
        System.out.println("The falcon flies up very high, then proceeds to dive bomb the nearest rodent at 200mph!");
    }
}
