package Basics;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		scn.close();
		
		int flag=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				flag++;
				break;
			}	
		}
		if(flag==0)
			System.out.println(n+" is Prime no");
		else
			System.err.println(n+ " is not prime");
	}
}
