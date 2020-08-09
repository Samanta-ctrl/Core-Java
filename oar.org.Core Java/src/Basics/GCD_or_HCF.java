package Basics;

import java.util.Scanner;
public class GCD_or_HCF
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scn.nextInt();
		System.out.println("Enter another number: ");
		int b = scn.nextInt();
		scn.close();
		
		while(a!=b)
		{
			if(a>b)
				a=a-b; //a-=b;
			else
				b=b-a; //b-=a;
		}
		System.out.println("GCD is: "+a);
	}
}

/*
	let a=25, b=50 then check 25!=50 --> check 25>50, false, then in else part b=b-a --> b=50-25=25 then prints 25
*/
