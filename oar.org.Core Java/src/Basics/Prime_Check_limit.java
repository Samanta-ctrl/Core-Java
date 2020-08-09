/*
 Check prime no. of a given limit.

 ------------------------------------------------------------------------------------------------------------*/

package Basics;

import java.util.Scanner;

public class Prime_Check_limit 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter limit: ");
		int limit = scn.nextInt();
		scn.close();

		int flag;
		for (int i = 1; i <= limit; i++) 
		{
			if (i == 1) 
			{
				System.out.println(i+" is not prime");
				continue;
			} 
			else 
			{
				flag = 0;
				for (int j = 2; j <= i - 1; j++) 
				{
					if (i % j == 0)
					{
						flag++;
						break;
					}
				}
			}
			if (flag == 1)
				System.out.println(i + " is not prime");
			else
				System.err.println(i + " is prime");
		}
	}
}
