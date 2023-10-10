public class Elk extends Animal{
    /**
     * A constructor that takes in a name.
     *@param name Name of the animal.
     */
    public Elk(String name){
       super(name);
    }

    /**
     * a method that prints out the sound an Elk makes.
     */
    public void sound(){
       System.out.println(this.name + " goes AaahEEEEEEAAAAA!!!");
    }

    /**
     * a method that prints out what an Elk does for fun.
     */
    public void play(){
       System.out.println(this.name + " runs around in the forest.");
    }

    /**
     * a method that prints out what an Elk eats.
     * @override eat() method from Animal class.
     */
    public void eat(){
       System.out.println(this.name + " eats some grass.");
    }
}