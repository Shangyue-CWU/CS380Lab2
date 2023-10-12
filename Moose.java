class Moose extends Animal{
	
	public Moose(String name) {
		super(name);
	}

	public void sound() {
		
		System.out.println("Mooooooose");
		
	}
	
	public void play() {
		
		System.out.println("I smoke weed");
	}


public static void main(String[] args) {
	
	Animal m = new Moose("Moose");
	
	m.sound();
	m.play();
	m.eat();
	
}
}