//ADDITION of 2 no's

package Basics;

import java.util.Scanner;

public class Addition
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is:= "+(a+b));
		
		scn.close();
		System.err.println("\n Scanner class is closed");	
	}
}
