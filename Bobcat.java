public class Bobcat extends Animal {

    public Bobcat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(this.name + " makes a growling sound.");
    }

    @Override
    public void play() {
        System.out.println(this.name + " hunts for prey while playing.");
    }


}
