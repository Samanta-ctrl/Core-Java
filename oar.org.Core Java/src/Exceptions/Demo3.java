package com.oecm3.Exceptions;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
		}
	static void m1()
	{
		System.out.println("m1 starts");
		//try
		//{
			m2();
		//}catch(ArithmeticException e){
			//System.out.println("exception caught in m1()");
		//}
		System.out.println("m1 ends");
	}
	static void m2()
	{
		System.out.println("m2 starts");
		try
		{
			m3();
		}catch(ArithmeticException e) {
			System.out.println("exception caught in m2()");
		}
				System.out.println("m2 ends");
	}
	static void m3()
	{
		System.out.println("m3 starts");
		int i=10/0;
		System.out.println("m3 ends");
	}
}
