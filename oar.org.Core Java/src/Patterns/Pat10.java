/*

        * * * * * 
      * * * * * 
    * * * * * 
  * * * * * 
* * * * * 

 ----------------------------------------------------------------------------------*/

package Patterns;
import java.util.Scanner;

public class Pat10 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n=scn.nextInt();
		scn.close();
		
		int nsp=n-1;
		int nst=n;
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
				System.out.print("* ");
				cst++;
			}
			nsp--;
			row++;
			System.out.println();
		}
		
	}
}
