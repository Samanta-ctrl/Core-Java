package com.oece2.Interfaces;

interface Flyable
{
	void land(); //by default variable and methods are public and abstract in nature
	void takeOf();
	void fly();
}
class Aeroplane implements Flyable
{
	public void land() //while overriding this methods should be public in interface
	{
		System.out.println("land() in aeroplane");
	}
	
	public void takeOf()
	{
		System.out.println("takeOf() in aeroplane");
	}
	
	public void fly()
	{
		System.out.println("fly() in aeroplane");
	}
	
}
class Drone implements Flyable
{
	public void land()
	{
		System.out.println("land() in drone");
	}
	public void takeOf()
	{
		System.out.println("takeOf() in drone");
	}
	public void fly()
	{
		System.out.println("fly() in drone");
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		Flyable f=new Aeroplane();
		f.fly();
		f.land();
		f.takeOf();

	}

}
