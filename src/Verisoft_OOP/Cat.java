package Verisoft_OOP;

public class Cat extends Animal implements Land {

	private int numberOfLegs;
	
	public Cat(Boolean mammals, Boolean carnivorous, int mood) {
		super(mammals, carnivorous, mood);
		this.numberOfLegs=4;
	}

	@Override
	public void sayHellow() {
		System.out.println("meow");
	}

	@Override
	public void sayHellow(int mood) {
		if(mood==super.MOOD_HAPPY)
			System.out.println("purr, purr");
		if(mood==super.MOOD_SCARE)
			System.out.println("hiss");
	}

	@Override
	public int getNumberOfLegs() {
		// TODO Auto-generated method stub
		return numberOfLegs;
	}

}
