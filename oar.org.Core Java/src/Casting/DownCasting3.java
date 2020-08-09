package Casting;

class D
{
	
}

class E extends D
{
	void m1()
	{
		System.out.println("m1 in class E");
	}
}

class F extends D
{
	void m1()
	{
		System.out.println("m1 in class F");
	}
}
public class DownCasting3 
{
	public static void main(String[] args) 
	{
		D d=new F();
		//since F cannot casted to E type it will throw exception at runtime
		E e=(E)d; //Exception in thread "main" java.lang.ClassCastException 
	}
}

