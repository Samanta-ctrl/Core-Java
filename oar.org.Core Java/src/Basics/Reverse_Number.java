package Basics;

import java.util.Scanner;

public class Reverse_Number
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scn.nextInt();
		scn.close();
		
		int res=0;
		while(n>0)
		{
			int rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		System.err.println("Reverse is: "+res);
	}
}

// Note:- 1%10=1 it should not be 0.