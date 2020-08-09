/*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

 */

package Patterns;

import java.util.Scanner;
public class Pat17 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n = scn.nextInt();
		scn.close();
		
		for(int row=1;row<=n;row++)
		{
			for(int cst=1;cst<=row;cst++)
			{
				if((row+cst)%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
