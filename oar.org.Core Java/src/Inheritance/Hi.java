package Inheritance;

public class Hi
{
	Hi( int a )
	{
		System.out.println("parameter constructor of class Hi");
	}
}

class Hello extends Hi
{
	Hello()
	{
		super(); //Error
		System.out.println("parameter constructor of class Hello");
	}
	
	void m1()
	{
		System.out.println("m1 method in Hello class");
	}
}

class Test
{
	public static void main()
	{
		Hello h1 = new Hello();
		h1.m1();
	}
}

