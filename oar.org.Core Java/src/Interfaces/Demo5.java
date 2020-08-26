package com.oece2.Interfaces;

interface I1
{
	void m1();
}

class A 
{
	void m2()
	{
		System.out.println("m2() in class A");
	}
}

class B extends A implements I1
{
	public void m1()
	{
		System.out.println("m1() in class B");
	}
}

public class Demo5 {

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.m1(); //m1 in class B
		b1.m2(); //m2 in class A
		
		I1 i=new B();
		i.m1(); //m1 in class B
		
		
		A a1=new B();
		a1.m2(); //m2 in class A
		//a1.m1(); //error
	}

}
