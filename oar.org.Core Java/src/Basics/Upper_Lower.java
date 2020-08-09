package Basics;

import java.util.Scanner;

public class Upper_Lower 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter here: ");
		char ch=scn.next().charAt(0);
		scn.close();
		if(ch>='a' && ch<='z')
			System.out.println("Lower case letter");
		else if(ch>='A' && ch<='Z')
			System.out.println("Upper case letter");
		else
			System.err.println("Invalod letter!!");
	}

}
