package Inheritance;
class Animals
{
	void eat()
	{
		System.out.println("Animal is eating...");
	}
}
class Dogs extends Animals
{
	void bark()
	{
		System.out.println("Dogs bark..");
	}
}
public class Simple_Inheritance 
{
	public static void main(String[] args) 
	{
		Dogs d=new Dogs();
		d.bark();
		d.eat();
	}
}

/*
In this case, there will be only one immediate superclass and subclass.        */