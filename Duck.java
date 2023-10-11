public class Duck extends Animal{

    //Field to hold name of duck
    protected String name;
    
    //constructor takes name of duck
    public Duck(String name){
       super(name);
       this.name = name; 
    }
    
    public void sound(){
       System.out.println(this.name + " suddenly makes the sound QUAAAACKKKK!!");
    }
   
   
   /**
    * Abstract method that should represent a specific  activity
    * that an animal does for fun.
    */
    public void play(){
       System.out.println(this.name + " flies from sky and swims in nearby pond");
    }
   
   
   /**
    * A  method that prints out that the animal is eating food.
    */
    public void eat(){
      System.out.println(this.name + " eats bugs in a pond.");
   } 
    
}
