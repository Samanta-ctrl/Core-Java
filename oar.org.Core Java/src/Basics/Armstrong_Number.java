/*
 Armstrong Number= 153 --> 1^3 + 5^3 + 3^3 =153
 
 first take a temp variable to store, then initialize res=0 then find remainder , then store quotient
 value in temp and then find result as res=res+(rem*rem*rem)
 and this will continue until temp>0
 then if res=n --> Armstrong else Not Armstrong.
  
------------------------------------------------------------------------------------------------------------- */

package Basics;

import java.util.Scanner;
public class Armstrong_Number 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scn.nextInt();
		scn.close();
		
		int temp=n;
		int rem;
		int res=0;
		
		while(temp>0)
		{
			rem=temp%10;
			temp=temp/10;
			res=res+(rem*rem*rem);
		}
		if(res==n)
			System.out.println(n+" is Armstrong Number");
		else
			System.err.println(n+" is Not Armstrong!");
	}
}
