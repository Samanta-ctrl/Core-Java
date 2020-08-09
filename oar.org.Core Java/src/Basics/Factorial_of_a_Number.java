package Basics;

import java.util.Scanner;

public class Factorial_of_a_Number 
{
	public static void main(String[] args) 
	{	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scn.nextInt();
		scn.close();
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.err.println("Factorial of "+n+" is : "+fact);
	}

}
