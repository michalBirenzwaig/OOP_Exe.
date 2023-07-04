package Verisoft_OOP;

public class Frog extends Animal implements Land, Water{

	private int numberOfLegs;

	public Frog(Boolean mammals, Boolean carnivorous, int mood) {
		super(mammals, carnivorous, mood);
		this.numberOfLegs=4;
	}

	@Override
	public Boolean hasGills() {
		return true;
	}

	@Override
	public Boolean hasLaysEggs() {
		return true;
	}

	@Override
	public int getNumberOfLegs() {
	  return numberOfLegs;
	}

	@Override
	public void sayHellow(int mood) {
		if(mood==super.MOOD_HAPPY)
			System.out.println("quack quack quack");
		if(mood==super.MOOD_SCARE)
			System.out.println("plop into the water");
	}

}
