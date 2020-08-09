//Smaller/Bigger Find

package Basics;

import java.util.Scanner;

public class Small_Big
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(a>b)
			System.err.println(a+" is bigger than "+b);
		else if(a<b)
			System.err.println(b+" is bigger than "+a);
		else
			System.err.println("Both are equals");
		scn.close();
	}
}
