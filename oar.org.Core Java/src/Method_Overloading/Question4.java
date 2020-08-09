package Method_Overloading;

class A
{
	final void m1()
	{
		System.out.println("m1 in class A");
	}
}
class B extends A
{
	void m1() //final method can not be overridden -->C.T.E
	{
		System.out.println("m1 in class B");
	}
}
public class Question4 
{
	public static void main(String[] args) 
	{
		
	}
}
