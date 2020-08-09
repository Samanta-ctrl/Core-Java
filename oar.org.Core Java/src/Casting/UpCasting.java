package Casting;

class A
{
	void m1()
	{
		System.out.println("m1 in class A");
	}
}

class B extends A
{
	void m2() 
	{
		System.out.println("m2 in class B");
	}
}

class C extends B
{
	void m3() 
	{
		System.out.println("m3 in class C");
	}
	
}
public class UpCasting 
{
	public static void main(String[] args) 
	{
		A a1=new B();
		a1.m1();
		//a1.m2(); //C.T.E because object is A type
		
		A a2=new C();
		a2.m1();
		//a2.m3(); //C.T.E because object is A type
	}
}






