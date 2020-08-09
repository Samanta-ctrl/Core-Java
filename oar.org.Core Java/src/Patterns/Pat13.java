/* 
 
 		  * 
        * - * 
      * - - - * 
    * - - - - - * 
  * - - - - - - - * 
* * * * * * * * * * * 

 --------------------------------------------------------------------------------------------*/

package Patterns;

import java.util.Scanner;
public class Pat13 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n = scn.nextInt();
		scn.close();
		
		int nst=1;
		int nsp=n-1;
	//using for loop:
		
//		for(int row=1;row<=n;row++)
//		{
//			for(int csp=1;csp<=nsp;csp++)
//			{
//				System.out.print("  ");
//			}
//			for(int cst=1;cst<=nst;cst++)
//			{
//				if(cst==1 || row==n || cst==nst)
//					System.out.print("* ");
//				else
//					System.out.print("- ");
//			}
//			System.out.println();
//			nsp--;
//			nst+=2;
//		}
	//using while loop:
		
		int row=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				if(cst==1 || cst==nst || row==n)
					System.out.print("* ");
				else
					System.out.print("  ");
				cst++;
			}
			row++;
			nsp--;
			nst+=2;
			System.out.println();	
		}
	}
}
