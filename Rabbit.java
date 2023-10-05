/**
* A rabbit object that overrides the animal.java file with new print statements
* @author Devlin Hamill
*/


public class Rabbit extends Animal{


   /**
    * creates a global variable that will store a name later on
    */
   protected String name;

   /**
    * allows for the local global variable within this file to have a value, along with overriding the name
    * within the animal.java file
    * @param name name of the rabbit
    */
   public Rabbit(String name){
      super(name);  
      this.name = name;
   }
   
      

   /**
    * prints a specific sound that an animal makes and overrides the method within Animal.java 
    */
   @Override
   public void sound(){

    System.out.println(this.name + " makes a thumping sound");

   }
   
   
   
   /**
    * Prints a specific  activity that an animal does for fun and overrides the method within Animal.java
    */
   @Override
   public void play(){

    System.out.println(this.name +" hopps and eats carrots for fun");

   }
   
   public static void main(String args[]){
      Rabbit rabbit1 = new Rabbit("Hoppy");
      rabbit1.sound();
      rabbit1.play();
      rabbit1.eat();
   }
   
   
}


