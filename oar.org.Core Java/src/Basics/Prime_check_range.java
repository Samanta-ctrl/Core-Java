/*
 Find prime numbers between a given range.
 
 */

package Basics;

import java.util.Scanner;
public class Prime_check_range 
{
	public static void main(String[] args) 
	{		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Starting value: ");
		int sValue = scn.nextInt();
		System.out.println("Enter Ending value: ");
		int eValue = scn.nextInt();
		scn.close();
		
		int flag;
		for(int i=sValue;i<=eValue;i++)
		{
			if(i==1)
			{
				System.err.println(i+" is not prime");
				continue;
			}
			else
			{
				flag=0;
				for(int j=2;j<=i-1;j++)
				{
					if(i%j==0)
					{
						flag++;
						break;
					}
				}
				if(flag==1)
					System.err.println(i+" is not prime");
				else
					System.out.println(i+" is prime");
			}
		}
	}
}
