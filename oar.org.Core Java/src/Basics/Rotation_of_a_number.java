package Basics;

import java.util.Scanner;

public class Rotation_of_a_number 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=scn.nextInt();
		System.out.println("Enter rotation limit: ");
		int rot=scn.nextInt();
		scn.close();
		
		int nod=0;
		int temp=n;
		int ans=0;
		
		while(temp!=0)
		{
			temp=temp/10;
			nod++;
		}
		rot=rot%nod;
		
		if(rot<0)
		{
			rot=rot+nod;
		}
		for(int i=0;i<=rot;i++)
		{
			int rem=n%10;
			int quo=n/10;
			int start=(int)Math.pow(10, nod-1);
			ans=rem*start+quo;
			
			n=ans;
		}
		System.out.println(ans);
	}
}
