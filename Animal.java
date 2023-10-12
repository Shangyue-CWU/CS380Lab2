/**
 * This class represents a Bobcat, a specific type of animal that extends the abstract class Animal.
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
      System.out.println(this.name + " makes a growling sound." + " ARRRRRRRRRRRRRRRRRRRRRRRRRRRR");
   }

   /**
    * This method represents the activity of a Bobcat while playing.
    */
   @Override
   public void play() {
      System.out.println(this.name + " hunts for prey while playing.");
   }

   /**
    * Main method for testing the Bobcat class.
    *
    * @param args Command-line arguments (not used in this example).
    */
   public static void main(String[] args) {
      System.out.println();
      Bobcat bobcat = new Bobcat("Bobby");
      bobcat.sound();
      bobcat.play();
      bobcat.eat();
   }
}
