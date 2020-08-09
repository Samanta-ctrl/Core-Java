package Blocks;

class B
{
	static 
	{
		System.out.println("Static block of B class");
	}
	static void m1()
	{
		System.out.println("m1() of B class");
	}
}
public class SB_2 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		B.m1();
		B.m1();
		B.m1();
		System.out.println("main ends");
	}
}

/* OUTPUT:
 
main starts
Static block of B class
m1() of B class
m1() of B class
m1() of B class
main ends

*/