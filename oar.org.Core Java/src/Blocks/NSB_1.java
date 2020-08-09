package Blocks;
class E
{
	{
		System.out.println("Non-static block 1 of class E");
	}
	
	{
		System.out.println("Non-static block 2 of class E");
	}
}
public class NSB_1 {

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		new E();
		new E();
		System.out.println("main ends");
	}
}

/*------------------------------------------------------------------------------------------------------------
main starts
Non-static block 1 of class E
Non-static block 2 of class E
Non-static block 1 of class E
Non-static block 2 of class E
main ends

*/