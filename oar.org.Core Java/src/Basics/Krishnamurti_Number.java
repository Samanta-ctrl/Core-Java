/*
	Krishnamurthy Number: 145 --> 1! + 4! + 5! =145.

------------------------------------------------------------------------------------------------------------ */

package Basics;

import java.util.Scanner;
public class Krishnamurti_Number 
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
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			res=res+fact;
		}
		if(res==n)
			System.out.println(n+" is Krishnamurthy Number");
		else
			System.err.println(n+" is Not Krishnamurthy Number!");
	}
}
