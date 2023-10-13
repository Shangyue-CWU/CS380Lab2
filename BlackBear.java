/**
 * class BlackBear extends Animal abstract class
 * @author Sam Christensen
 */
public class BlackBear extends Animal{
   /**
    * A constructor that sets the name of the Black Bear.
    * @param name Name of the Black Bear.
    */
   public BlackBear(String name){
      super(name);
   }
   /**
    * A method that represents the sound of a Black Bear
    */
   public void sound(){
      System.out.println(name + " growls.");
   }
   
   /**
    * A method that represents an activity done by a Black Bear
    */
   public void play(){
      System.out.println(name + " rides their unicyle.");
   }
}