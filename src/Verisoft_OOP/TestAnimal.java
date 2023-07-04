package Verisoft_OOP;

public class TestAnimal {

	public static void main(String[] args)
	{
		Cat cat=new Cat(true, true, 1);
		System.out.println("The cat usually sounnds:");
		cat.sayHellow();
		System.out.println("When the cat is happy he sounnds:");
		cat.sayHellow(1);
		System.out.println("The number of legs a cat has: "+cat.getNumberOfLegs());
		System.out.println("Is a cat a mammal? "+cat.isMammals());
		
		Dog dog=new Dog(true, true, 2);
		System.out.println("The dog usually sounnds:");
		dog.sayHellow();
		System.out.println("When the dog is scare he sounnds:");
		dog.sayHellow(2);
		System.out.println("The number of legs a dog has: "+dog.getNumberOfLegs());
		System.out.println("Is a dog a Carnivorous? "+dog.isCarnivorous());
		
		Frog frog=new Frog(false, false, 1);
		System.out.println("When the frog is happy he sounnds:");
		frog.sayHellow(1);
		System.out.println("The number of legs a frog has: "+frog.getNumberOfLegs());
		System.out.println("Is a frog a Carnivorous? "+frog.isCarnivorous());
	}
}


