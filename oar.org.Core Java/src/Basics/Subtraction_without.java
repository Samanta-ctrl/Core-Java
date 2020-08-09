//Subtraction of two numbers without using '-' operator: (using 2's complement)

package Basics;

import java.util.Scanner;

public class Subtraction_without 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=scn.nextInt();
		int b=scn.nextInt();
		scn.close();
		
		int c = a + (~b+1);   // as (~b+1) = -b
		System.out.println("Subtraction of "+a+" and "+b+" is: "+c);
	}
}





