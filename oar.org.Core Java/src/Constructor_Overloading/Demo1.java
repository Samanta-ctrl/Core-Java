package Constructor_Overloading;

class A
{
	A()
	{
		System.out.println("Default constructor of class A");
	}
	A(int i)
	{
		System.out.println("Parameterized constructor of int type");
	}
	A(String s)
	{
		System.out.println("Parameterized constructor of string type");
	}
}
public class Demo1
{
	public static void main(String[] args) 
	{
		new A("abcd");
		System.out.println("------------------------------------------------");
		new A(10);
		System.out.println("------------------------------------------------");
		new A();
		System.out.println("------------------------------------------------");
	}
}
