package Verisoft_OOP;

public class Dog extends Animal implements Land {

	private int numberOfLegs;
	
	public Dog(Boolean mammals, Boolean carnivorous, int mood) {
		super(mammals, carnivorous, mood);
		this.numberOfLegs=4;
	}
	
	@Override
	public void sayHellow() {
		System.out.println("wagging their tails");
	}

	@Override
	public void sayHellow(int mood) {
		if(mood==super.MOOD_HAPPY)
			System.out.println("bark loudly");
		if(mood==super.MOOD_SCARE)
			System.out.println("whooping");
	}

	@Override
	public int getNumberOfLegs() {
		return numberOfLegs;
	}



}
