public class Raven extends Animal{
   
   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Raven(String name){
      super(name);
   }
   
   
   /**
    *a method that prints out the sound a raven makes.
    */
   public void sound(){
      System.out.println(this.name + " goes KAAAAW.......KAAAAW....");
   }
   
   
   /**
    * a method that prints out what a Raven does for fun.
    */
   public void play(){
      System.out.println(this.name + " flys up high and does a flip.");
   }
   
   
   /**
    * A  method that prints out the raven eating food.
    *@override eat() method from Animal class.
    */
   public void eat(){
      System.out.println(this.name + " eats some berries.");
   }  
 }