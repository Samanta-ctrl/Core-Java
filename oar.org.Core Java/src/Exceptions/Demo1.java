package com.oecm3.Exceptions;

import java.util.Scanner;

public class Demo1
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter two numbers :");
		int a=0,b=0,c=0;
		a=scn.nextInt();
		b=scn.nextInt();
		scn.close();
		try
		{
			System.out.println("try block starts");
			c=a/b;
			System.out.println("try block ends");
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("catch block starts");
			c=a/2;
			System.out.println("catch block ends");
		}
	
		System.out.println("c= "+c);
	}
}
