package Basics;

import java.util.Scanner;

public class Alternate_Prime_Check 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter starting value: ");
		int sValue = scn.nextInt();
		System.out.println("Enter ending value: ");
		int eValue = scn.nextInt();
		scn.close();
		
		int flag;
		int a=1;
		System.out.println("Alternate prime numbers between "+sValue+"  and "+eValue+" are: ");
		for(int i=sValue;i<=eValue;i++)
		{
			if(i==1)
				continue;
			
			flag=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}	
			}
			if(flag==0)
			{
				if(a==1)
				{
					System.err.println(i+" ");
					a=0;
				}
				else
					a=1;
			}
		}
	}
}
