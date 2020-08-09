/*
 Palindrome number example: 121, 131, 141 , .....
 
 */




package Basics;

import java.util.Scanner;
public class Palindrome_Number 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scn.nextInt();
		scn.close();

		int temp = n;
		int remainder;
		int ans=0;

		while (temp != 0)
		{
			remainder = temp % 10;
			ans = ans * 10 + remainder ;
			temp = temp / 10;

		}

		if (ans == n)
			System.out.println(n+" is palindrome Number");
		else
			System.err.println(n+" is Not a palindrome Number");
	}
}
