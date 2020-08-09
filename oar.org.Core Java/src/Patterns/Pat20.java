/*

 1  2  3  4  5
 6  7  8  9  10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25

 ---------------------------------------------------------------------------------------------------------*/
package Patterns;

import java.util.Scanner;
public class Pat20 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n = scn.nextInt();
		scn.close();
		
		int k=1;
		for(int row=1;row<=n;row++)
		{
			for(int cst=1;cst<=n;cst++)
			{
				System.out.print(k+"\t");
				k++;
			}
			System.out.println();
		}
	}
}
