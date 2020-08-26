package com.oecm3.Exceptions;

public class ThrowExample {

	public static void main(String[] args) 
	{
		try {
			   throw new ArithmeticException();
			}
		catch (Exception e)
		{	 
			System.out.println(e);
		    e.printStackTrace();
		}
	}
}
