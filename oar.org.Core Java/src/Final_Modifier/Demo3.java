package Final_Modifier;

class C
{
	public void m1()
	{
		System.out.println("m1 in class C");
	}
}

class D extends C
{
	public void m1()
	{
		System.out.println("m1 in class D");
	}
}

class E
{
	public final void m1()
	{
		System.out.println("m1 in class E");
	}
}

class F extends E
{
	public void m1() // C.T.E because final method can not be overriden in subclass
	{
		System.out.println("m1 in class F");
	}
}

public class Demo3 
{
	public static void main(String[] args) 
	{

	}
}
