/*
 	  * 
    * * 
  * * * 
* * * * 
  * * * 
    * * 
      * 
---------------------------------------------------------------------------------------------- */

package Patterns;

import java.util.Scanner;
public class Pat11 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n = scn.nextInt();

		int nsp = n/2;
		int nst = 1;
	
	//Using while loop:
		
//		int row = 1;
//		while (row <= n) 
//		{
//			int csp = 1;
//			while (csp <= nsp) 
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			int cst = 1;
//			while (cst <= nst)
//			{
//				System.out.print("* ");
//				cst++;
//			}
//			//preparation
//			if (row <= n/2)
//			{
//				nsp--;
//				nst++;
//			}
//			else 
//			{
//				nsp++;
//				nst--;
//			}
//			row++;
//			System.out.println();
//		}
	//using for loop:
		
		for(int row=1;row<=n;row++)
		{
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print("  ");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("* ");
			}
//			if(row<)
			System.out.println();
			if(row<=n/2)
			{
				nsp--;
				nst++;
			}
			else
			{
				nsp++;
				nst--;
			}
		}
		scn.close();
	}
}
