package com.oece2.Interfaces;

interface I2
{
	void m1();
	
	default void m2()
	{
		System.out.println("m2 in I2");
	}
	
	static void m3()
	{
		System.out.println("m3 in I2");
	}
	/*
	  void m4()
	  {
		after jdk.8 we can use only static and default modifier but not any modifiers
	  }
		*/
}
	class C
	{
		void m1()
		{
			System.out.println("m1 in class C");
		}
	}
	
	class D extends C implements I2
	{
		public void m1()
		{
			System.out.println("m1 in class D");
		}
	}
	
public class Test1
{
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.m1(); // m1 in class D
		d1.m2(); //m2 in I2
		
		I2 i=new D();
		i.m1(); //m1 in class D
		i.m2(); //m2 in class D
		
		C c1=new D();
		c1.m1(); //m1 in class C
		//c1.m2(); // error
		
		//static method calling
		I2.m3(); // m3 in I2
	}
}
