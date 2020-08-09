package Basics;

import java.util.Scanner;

public class Digit_Count 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=scn.nextInt();
		System.out.println("Enter digit: ");
		int d=scn.nextInt();
		scn.close();
		
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem==d)
				count++;
			n=n/10;
		}
		System.err.println("Count of digit is: "+count);
	}
}
