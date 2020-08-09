package Basics;

import java.util.Scanner;

public class Anybase_to_Decimal 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int n=scn.nextInt();
		System.out.println("Enter anybase: ");
		int anybase=scn.nextInt();
		scn.close();
		
		int res=0;
		int multiplier=1;
		
		while(n>0)
		{
			int rem=n%10;
			res=rem*multiplier+res;
			multiplier=multiplier*anybase;
			n=n/10;
		}
		System.err.println("After converting the result is: "+res);
	}
}
