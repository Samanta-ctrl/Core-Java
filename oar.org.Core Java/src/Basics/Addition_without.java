// Addition of two numbers without using '+' operator:


package Basics;

import java.util.Scanner;
public class Addition_without 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=scn.nextInt();
		int b=scn.nextInt();
		scn.close();
		
		int c= a-(-b);
		System.out.println("Addition of "+a+" and "+b+" is: "+c);
	}
}
