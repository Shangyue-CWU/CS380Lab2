/**
*Abstract class Animal. Any class that extends this class
*will have to override all of the abstract methods. 
*@author Dmytro Dovhalets.
*/

public class Alligator extends Animal{
   
   
   /**
    * A field which stores the animals name.
    */

      
   
   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Alligator(String name){
      super(name);
   }
   
   
   /**
    *Abstract method that should represent a specific sound
    * an Alligator makes. 
    */
   @Override 
   public void sound(){
            System.out.println(this.name +" goes HHHHEEEHHHHH, or GRRRRRRR");
}
   
   
   /**
    * Abstract method that should represent a specific  activity
    * that an Alligator does for fun.
    */
  @Override
   public void play(){
            System.out.println(this.name +" likes to go sunbathing");
}
   
   
   /**
    * A  method that prints out that the Alligator is eating food.
    */
   @Override
   public void eat(){
      System.out.println(this.name + " eats anything with meat");
   }  
    public static void main(String args[]){
        Alligator ali = new Alligator("Bob") {};
        ali.sound();
        ali.play();
        ali.eat();
    }
}


