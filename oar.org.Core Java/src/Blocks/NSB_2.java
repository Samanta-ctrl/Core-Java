package Blocks;

class F
{
	//static block
	static
	{
		System.out.println("static block of class F");
	}
	
	//non-static block
	{
		System.out.println("non-static block of class F");
	}
	
	//constructor
	F()
	{
		System.out.println("default constructor of class F");
	}
}
public class NSB_2
{
	static
	{
		System.out.println("static block in NSB_2 class");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		new F();
		new F();
		new F();
		new F();
		System.out.println("main ends");
	}
}
/*
 If there is a static block , non-static block and constructor is avilable then 
 	  STATIC BLOCK --> NON-STATIC BLOCK --> CONSTRUCTOR
 	 
 	 
static block in main method
main starts
static block of class F
non-static block of class F
default constructor of class F
non-static block of class F
default constructor of class F
non-static block of class F
default constructor of class F
non-static block of class F
default constructor of class F
main ends
 	  
*/
