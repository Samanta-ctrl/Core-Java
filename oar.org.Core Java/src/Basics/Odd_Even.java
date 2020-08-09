//ODD/EVEN finding

package Basics;

import java.util.Scanner;

public class Odd_Even
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		
		if(n%2==0)
			System.err.println(n+" is Even Number");
		else
			System.err.println(n+" is Odd number");
		
		scn.close();
		
	}
}
