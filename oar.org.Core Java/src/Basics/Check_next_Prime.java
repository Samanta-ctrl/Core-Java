package Basics;

import java.util.Scanner;
public class Check_next_Prime 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scn.nextInt();
		scn.close();
		
		int flag;
	
		for(int i=n+1; ;i++)
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
				System.err.println("The next prime no is: "+i);
				break;
			}	
		}
	}
}
