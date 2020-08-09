/*

? ? ? ? ? 
* * * * * 
? ? ? ? ? 
* * * * * 
? ? ? ? ? 

--------------------------------------------------------------------------------------------------------------- */

package Patterns;

import java.util.Scanner;
public class Pat18
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no.: ");
		int n = scn.nextInt();
		scn.close();
		
		for(int row=1;row<=n;row++)
		{
			for(int cst=1;cst<=n;cst++)
			{
				if(row%2==0)
					System.out.print("* ");
				else
					System.out.print("? ");
			}
			System.out.println();	
		}	
	}
}
