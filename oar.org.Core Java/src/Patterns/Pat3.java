/*
 
* * * * * 
* 
* * * * * 
* 
* * * * * 

--------------------------------------------------------------------------------------------------------------- */
package Patterns;
import java.util.Scanner;

public class Pat3
{
	public static void main(String[] args) 
	{	
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number.. : ");
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
				if(i%2==0)
					break;
			}
			System.out.println();	
		}
		scn.close();
	}
}
