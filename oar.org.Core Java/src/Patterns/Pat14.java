/*

  * * * * * * * * * 
    * - - - - - * 
      * - - - * 
        * - * 
          * 
 */

package Patterns;

import java.util.Scanner;
public class Pat14 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n = scn.nextInt();
		scn.close();
		
		int nst=n;
		int nsp=0;
//		int row=1;
//		
//		while(row<=n) 
//		{
//			//Spaces
//			int csp=1;
//			while(csp<=nsp) {
//				System.out.print("  ");
//				csp++;
//			}
//			
//			//Stars
//			int cst=1;
//			while(cst<=nst) {
//				if(cst==1 || cst==nst || row==1)
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//				cst++;
//			}
//			
//			//Preparation
//			nsp++;
//			nst-=2;
//			row++;
//			System.out.println();
//		}
		
	//using for loop:
		
		for(int row=1;row<=n;row++)
		{
			for(int csp=0;csp<=nsp;csp++)
			{
				System.out.print("  ");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				if(row==1 || cst==nst || cst==1)
					System.out.print("* ");
			else
				System.out.print("- ");
			}
			
			nsp++;
			nst-=2;
			System.out.println();
		}
		
	}
}
