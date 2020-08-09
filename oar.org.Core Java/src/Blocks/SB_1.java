package Blocks;

class A
{
	static
	{
		System.out.println("static block of class A");
	}
	static void m1()
	{
		System.out.println("static method m1() of class A");
	}
}
public class SB_1
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		A.m1();
		System.out.println("Main ends");
	}
}
