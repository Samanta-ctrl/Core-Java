/*
 
* 
* * 
* * * 
* * * *
* * *
* *
* 

------------------------------------------------------------------------------------------------ */

package Patterns;

import java.util.Scanner;
public class Pat12
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n = scn.nextInt();
		scn.close();
		
		int nst = 1;
//		
//		for(int row=1;row<=n;row++)
//		{
//			for(int cst=1;cst<=nst;cst++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//			if(row<=n/2)
//				nst++;
//			else
//				nst--;
//		}
		
		int row = 1;
		while(row<=n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst ++;
			}
			System.out.println();
			row++;
			if(row <= n/2+1)
				nst ++;
			else
				nst --;
		}
	}
}
