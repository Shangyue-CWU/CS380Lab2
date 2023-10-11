/**
* Class Jaguar. 
* @author Aaron Snyder
*/
public class Jaguar extends Animal {

    /**
    * A field which stores the animals name.
    */
   protected String name;
      
   
   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Jaguar(String name) {
      super(name);
   }
   
   
   /**
    * Method that prints the sound a jaguar makes 
    */
   public void sound() {
        System.out.println("Raawwrrr! Meeeooowww!");
   }
   
   
   /**
    * Method that prints what a jaguar does for fun
    */
   public void play() {
        System.out.println("Swimming!");
   }
   
   
   /**
    * Method that prints out a jaguar eating
    */
   public void eat() {
      System.out.println(this.name + " eats a deer.");
   }  
}
