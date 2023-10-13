/**
 * Name: Katelyn Wildermuth
 * CS 380
 * File: Opossum.java
 * This file creates a new animal type, Opossum, that extends the 
 * abstract Animal class.
 */

 public class Opossum extends Animal {

    /**An opossum constructor that takes in a name.
     * @param name The name of the opossum.
    */
    public Opossum(String name){
        super(name);
    }

    /**
     * A method that prints out the sound the opossum makes.
     */
    public void sound(){
        System.out.println(this.name + " makes a hissing noise.");
    }

    /**
     * A method that prints out how the opossum plays.
     */
    public void play(){
        System.out.println(this.name + " climbs a tree looking for fruit.");

    }
}