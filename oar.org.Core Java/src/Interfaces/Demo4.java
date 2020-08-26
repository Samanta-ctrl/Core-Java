package com.oece2.Interfaces;

//Interface extends Interface example

interface Vehicle
{
	void start();
}
interface Car extends Vehicle
{
	void reverse();
}
class Audi implements Car
{
	public void start()
	{
		System.out.println("start in audi");
	}
	public void reverse()
	{
		System.out.println("reverse in audi");
	}
}
class Benz implements Car
{
	public void start()
	{
		System.out.println("Benz start");
	}
	public void reverse()
	{
		System.out.println("benz reverse");
	}
}
public class Demo4 {

	public static void main(String[] args) 
	{
		Vehicle v=new Audi(); // in vehicle class only start is available
		v.start();
		
		Car c=new Audi(); // in audi class start and reverse both is available as it is implementing vehicle class
		c.start();
		c.reverse();
		
		Car c1=new Benz();
		c1.start();
		c1.reverse();

	}

}
