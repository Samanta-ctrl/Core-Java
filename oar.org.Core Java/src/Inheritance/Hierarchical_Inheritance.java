package Inheritance;
class Animal2
{
	void eat()
	{
		System.out.println("Animal is eating...");
	}
}

class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Dog is barking..");
	}
}

class Cat2 extends Animal2
{
	void mew()
	{
		System.out.println("Cat is mewing...");
	}
}

public class Hierarchical_Inheritance 
{
	public static void main(String[] args) 
	{
		Dog2 d=new Dog2();
		d.bark();
		d.eat();
		//d.mew(); --> Error
		
		Cat2 c=new Cat2();
		c.mew();
		c.eat();
		//c.bark(); --> Error
		
	}
}

/*
 In this case, there will be only one superclass and many subclasses.   */
