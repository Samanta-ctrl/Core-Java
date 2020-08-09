/*
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      *  
 ------------------------------------------------------------------------------------------------*/
package Patterns;

import java.util.Scanner;
public class Pat15
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n = scn.nextInt();
		scn.close();
		
		int nst=1;
		int nsp=n/2;
		
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
				System.out.println();
				if(row<=n/2)
				{
					nsp--;
					nst+=2;
				}
				else
				{
					nsp++;
					nst-=2;
				}
			}
	}
}
