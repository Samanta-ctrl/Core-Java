package Basics;

import java.util.Scanner;

public class Decimal_to_anybase 
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
			int rem=n%anybase;
			res=rem*multiplier+res;
			multiplier=multiplier*10;
			n=n/anybase;
		}
		System.err.println("After converting the result is: "+res);
	}
}
