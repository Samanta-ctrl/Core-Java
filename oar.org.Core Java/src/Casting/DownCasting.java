package Casting;

class P
{
	void m1()
	{
		System.out.println("m1 in class P");
	}
}

class Q extends P
{
	@Override
	void m1()
	{
		System.out.println("m1 in class Q");
	}
	void m2()
	{
		System.out.println("m2 in class Q");
	}
}

class R extends P
{
	@Override
	void m1()
	{
		System.out.println("m1 in class R");
	}
	void m2()
	{
		System.out.println("m2 in class R");
	}
}

public class DownCasting 
{
	public static void main(String[] args) 
	{
		P p1=new Q();
		p1.m1();
		//a1.m2(); --> C.T.E since ref. var. is of A type, so compiler doesn't understand.
		
		//So we have to create one more ref var. for same instance and assign a1 to this
		
		//B b1=a1; --> C.T.E ,we have to do explicitly / manually
		
		Q q1=(Q)p1; //Downcasting --> a1 is casted to B type ,where a1=super type and b1=sub type ref var.
		q1.m1();
		
		//now we can call m2
		q1.m2();
		
		//We can also do --> ((Q)p1).m1(); 
	}
}
