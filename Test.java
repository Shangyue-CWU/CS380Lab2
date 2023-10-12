/**
 * The Test class is used to test the Bobcat class and its methods.
 */
public class Test {
    public static void main(String[] args) {
        // Create a Bobcat object with the name "Bobby".
        Bobcat bobcat = new Bobcat("Bobby");

        // Call the sound() method to make the Bobcat produce a sound.
        bobcat.sound();

        // Call the play() method to simulate the Bobcat's playful activity.
        bobcat.play();

        // Call the eat() method to indicate that the Bobcat is eating food.
        bobcat.eat();
    }
}
