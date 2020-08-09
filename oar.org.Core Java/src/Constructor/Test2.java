package Constructor;
class B
{
	B(int a)
	{
		System.out.println("parameterized int type constructor of class B");
	}
	B(String s)
	{
		System.out.println("parameterized String type constructor of class B");
	}
}
public class Test2 
{
	public static void main(String[] args) 
	{
		new B(10);
		System.out.println("Hello");
		
		new B(20);
		System.out.println("Hello Boss");
		
		new B(30);
		System.out.println("Hello Boss bolo Boss!");
		
		//new B(); --> Compile time error, beacuse we have to pass the parameter
		
		new B("Soumen");
		System.out.println("Hey Soumen!");
	}
}
