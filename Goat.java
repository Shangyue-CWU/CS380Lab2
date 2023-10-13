/**
 * @author Noah Riber
 * Extension of Dymyto Dovhalets' Animal class, Goat
 * CS 380
 */

public class Goat extends Animal {
     /**
     * A field which stores the animals name.
     */
    protected String name;


    /**
     * A constructor that takes in a name.
     *@param name Name of the animal.
     */
    public Goat(String name){
        super(name);
    }


    /**
     * Method prints out what sound a goat makes
     */
    @Override
    public void sound() {
        System.out.println(super.name + " makes a loud BAAAAAAAA");
    }


    /**
     * Method prints what a goat does when it plays
     */
    @Override
    public void play() {
        System.out.println("*the " + super.name + " runs up a wall and does a flip*");
    }
    public static void main(String[] args) {
        Goat goat1 = new Goat("Goat");
        goat1.sound();
        goat1.play();
        goat1.eat();
    }
}



