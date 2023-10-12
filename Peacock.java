/**
 * 
 * class Peacock
 * @author Aiden Wise
 * 
 */

public class Peacock extends Animal {

	   
	/**
	 * A field which stores the animals name.
	 */
	protected String name;
	      
	   
	/**
	 * A constructor that takes in a name.
	 * *@param name Name of the animal.
	 */
	public Peacock(String name){
		super(name);
		this.name = name;
	}
	   
	/** 
	 * 
	 */
	public void sound(){
		
		System.out.println(this.name + "says squakkkk! May-Aweee!");
	}
	    
	/**
	 * Abstract method that should represent a specific  activity
	 * that an animal does for fun.
	 */
	public void play(){
		
		System.out.println(this.name + "likes to show their beautiful feathers!");
	}
	     
	/**
	 * A  method that prints out that the animal is eating food.
	 */
	public void eat(){
	      System.out.println(this.name + " eats plants, fruit, and insects.");
	} 
	
	/** 
	 * 
	 * Main method
	 * prints what the animal sounds like, does, and eats
	 * 
	 */
	public static void main(String args[]) {
		
		Peacock peacock1 = new Peacock("Peacock");
		
		System.out.println(peacock1.name);
		peacock1.sound();
		peacock1.play();
		peacock1.eat();
	}
	
	
}
