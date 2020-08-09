/*
 
* * * * * * * 
  * * * * * 
    * * * 
      * 
 ----------------------------------------------------------------------------------------------*/

package Patterns;
import java.util.Scanner;

public class Pat9 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n=scn.nextInt();
		
		int nsp=0;
		int nst=n;
//using for loop	
		for(int row=1;row<=n;row++) //row
		{
			
			for(int csp=0;csp<nsp;csp++) //space
			{
				System.out.print("  ");
			}
			for(int cst=1;cst<=nst;cst++) //star
			{
				System.out.print("* ");
			}
			nsp+=1;
			nst-=2;
			System.out.println();
		}
//using while loop
//		int row=1;
//		
//		while(row<=n)
//		{
//			//space
//			int csp=0;
//			while(csp<nsp)
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			//star
//			int cst=1;
//			while(cst<=nst)
//			{
//				System.out.print("* ");
//				cst++;
//			}
//			//preparation
//			row++;
//			nsp++;
//			nst-=2;
//			System.out.println();
//		}
		scn.close();
	}
}
