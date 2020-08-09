package Basics;

import java.util.Scanner;

public class Leap_year
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a year : ");
		int n=scn.nextInt();
		scn.close();
		if((n%4==0 || n%400==0) && (n%100!=0))
		{
			System.err.println(n+" is Leap Year");
		}
		else
			System.err.println(n+" is not a Leap year");
	}
}
