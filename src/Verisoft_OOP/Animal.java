package Verisoft_OOP;

public abstract class Animal {

	private Boolean mammals;
	private Boolean carnivorous;
	public final int MOOD_HAPPY=1;
	public final int MOOD_SCARE=2;
	private int mood;
	
	public Animal(Boolean mammals, Boolean carnivorous,int mood)
	{
		this.mammals=mammals;
		this.carnivorous=carnivorous;
		this.mood=mood;
	}
	public void sayHellow()
	{
		
	}
	public abstract void sayHellow(int mood);
	public Boolean isMammals()
	{
		return mammals;
	}
	public void SetMammals(boolean mammals)
	{
		this.mammals=mammals;
	}
	public Boolean isCarnivorous()
	{
		return carnivorous;
	}
	public void SetCarnivorous(boolean carnivorous)
	{
		this.carnivorous=carnivorous;
	}
}
