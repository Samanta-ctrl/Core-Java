/*
 		* 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 

-------------------------------------------------------------------------------------------------------------*/
package Patterns;
import java.util.Scanner;

public class Pat8 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter n: ");
		int n =scn.nextInt();
		
		int nst=1; //no. of stars
		int nsp=n-1; //no. of spaces
//using while loop
		//int row=1;
//		
//		while(row<=n)
//		{
//			int csp=1;
//			while(csp<=nsp)
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			
//			int cst=1;
//			while(cst<=nst)
//			{
//				System.out.print("* ");
//				cst++;
//			}
//			nsp--;
//			nst+=2;
//			row++;
//			System.out.println();
//		}
	//using for loop:
		for(int row=1;row<=n;row++)
		{
			//Spaces
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print("  ");
			}
			//Stars
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("* ");
			}
			
			//Preparation
			nsp--;
			nst+=2;
			System.out.println();
		}
		scn.close();
	}
}
