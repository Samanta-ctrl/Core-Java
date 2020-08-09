/* ------------------------------------------------------------------------------------------------------------------
 Logic:
		let n=42513 ,then 42513
						  54321  <-- index

After inverse of that number it becomes: index wise number will replace 
		i.e.; numbers will be replace by position like 3 will replace by position 1, 1 will replace by position 2..
        	output:-	  35142
        				  54321 <-- index
						  
----------------------------------------------------------------------------------------------------------------------*/
package Basics;

import java.util.Scanner;
public class Inverse_of_a_number
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=scn.nextInt();
		scn.close();
		
		int pos=1;
		int res=0;
		
		while(n>0)
		{
			int rem=n%10;
			res=res+pos*(int)Math.pow(10, rem-1);
			pos++;
			n=n/10;
		}
		System.err.println(res);
	}
}
