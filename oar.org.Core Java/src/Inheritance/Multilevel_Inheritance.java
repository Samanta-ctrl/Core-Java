package Inheritance;
class Animal1
{
	void eat()
	{
		System.out.println("Animal is eating...");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Dog is barking...");
	}
}
class Cat1 extends Dog1
{
	void mew()
	{
		System.out.println("Cat is mewing...");
	}
}
public class Multilevel_Inheritance
{
	public static void main(String[] args) 
	{
		Cat1 c=new Cat1();
		c.bark();
		c.eat();
		c.mew();
	}
}

/*
 In this case, there will be only one immediate super class and subclass and many indirect subclasses.    */


