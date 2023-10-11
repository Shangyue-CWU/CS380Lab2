/*
 * King Kobra objects that overides methods form Animal.java
 * @author Miguel Tlatenchi
 */

 public class KingKobra extends Animal 
 {
     /*
      * Constructor that will take in kobra name
      @param name Name of the kobra
      */
      public KingKobra(String name)
      {
          super(name);
      }

      /*
       * method that will print out the sound that a king kobra makes
       */
      @Override
      public void sound()
      {
          System.out.println(this.name + " goes hissssssssss!");
      }

      /*
       * method that will print out what kobras do for fun
       */
      @Override
      public void play()
      {
          System.out.println(this.name + " slithers on the gorund.");
      }

      /*
       * method that will print out what the kobra is eating
       */
      @Override
      public void eat()
      {
          System.out.println(this.name + " eats some other snakes");
      }

      public static void main(String args[])
      {
          KingKobra cobra = new KingKobra("Danny");

          cobra.sound();
          cobra.play();
          cobra.eat();
      }
 }