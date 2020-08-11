package Polymorphism;

//abstract class
abstract class Animal
{
	abstract void makeSound();
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("bhow bhow");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("mew mew");
	}
}

//main class
public class Run_Time_Polymorphism {

	public static void main(String[] args) {
		Animal a;
		
		a=new Dog();
		a.makeSound();
		
		a=new Cat();
		a.makeSound();
// here which method will execute first,that will decide at the run time.
	}

}
