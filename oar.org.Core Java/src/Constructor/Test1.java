package Constructor;

class A
{
	A() 
	{
		System.out.println("default constructor of class A");
	}
}
public class Test1 
{
	public static void main(String[] args) 
	{
		new A();
		System.out.println("Hello");
		
		new A();
		System.out.println("Hello Boss");
		
		new A();
		System.out.println("Hello Boss bolo Boss!");	
	}
}
