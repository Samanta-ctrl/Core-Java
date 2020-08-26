package com.oecm3.Exceptions;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=0;
		
		while(true)
		{
			String str=scn.next(); // if we give any string input the it will go to the catch block and print the message
			try 
			{
				n=Integer.parseInt(str); //from string to int conversion
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("invalid input: please enter a number");
			}
		}
		scn.close();
		System.out.println("number is: "+n);
	}
}
