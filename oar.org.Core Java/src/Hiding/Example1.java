package Hiding;

class A
{
	public static void m1()
	{
		System.out.println("m1 in A class");
	}
}

class B extends A
{
	public static void m1() //sub class static method hides the super class static method
	{
		System.out.println("m1 in class B");
	}
	public void m2()
	{
		System.out.println("m2 in class B");
		m1();
	}
}

public class Example1 
{
	public static void main(String[] args) 
	{
		A.m1();
		B.m1();
		
		B b=new B();
		b.m1();
		System.out.println("------------------");
		b.m2();
	}
}
