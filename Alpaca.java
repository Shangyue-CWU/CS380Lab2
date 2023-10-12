public class Alpaca extends Animal {
    /**
     * Class Alpaca
     * @author Isaac Ferry
     */

        /**
         * A field which stores the animals name.
         */
        protected String name;


        /**
         * A constructor that takes in a name.
         *@param name Name of the animal.
         */
        public Alpaca(String name) {
            super(name);
            this.name = name;
        }


        /**
         * Method that prints the sound an Alpaca makes
         */
        @Override
        public void sound() {
            System.out.println("Humming");
        }


        /**
         * Method that prints what an Alpaca does for fun
         */
        @Override
        public void play() {
            System.out.println("Runs");
        }


        /**
         * Method that prints out what an alpaca eats
         */
        @Override
        public void eat() {
            System.out.println(this.name + " eats hay.");
        }

        // Testing alpaca code works
        public static void main(String args[]){
            Alpaca alpaca = new Alpaca("Billy");
            alpaca.eat();
            alpaca.play();
            alpaca.sound();
        }
}
