/*

1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5 

------------------------------------------------------------------------------------------------------------- */
package Patterns;

import java.util.Scanner;
public class Pat19 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n = scn.nextInt();
		scn.close();
		
		for(int row=1;row<=n;row++)
		{
				int k;
				if(row%2==1)
				{
					for(k=1;k<=n;k++)
					{
						System.out.print(k+" ");
					}
				}
				else
				{
					for(k=n;k>=1;k--)
					{
						System.out.print(k+" ");
					}
				}
			System.out.println();
		}
	}
}
