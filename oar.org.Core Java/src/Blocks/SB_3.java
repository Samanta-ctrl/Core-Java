package Blocks;

class C
{
	static
	{
		System.out.println("static block of class C");
		new D();	
	}
	static void m1()
	{
		System.out.println("static method m1 of class C");
	}
}
class D
{
	D()
	{
		System.out.println("default constructor of class D");
	}
}
public class SB_3 {

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		C.m1();
		System.out.println("main ends");
	}
}

/* OUTPUT:
 
main starts
static block of class C
default constructor of class D
static method m1 of class C
main ends



*/
