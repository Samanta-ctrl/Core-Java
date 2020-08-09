package Casting;

class X
{
	
}

class Y extends X
{
	void m1()
	{
		System.out.println("m1 in class Y");
	}
}

public class DownCasting2 
{
	public static void main(String[] args) 
	{
		X x=new Y();
		//x.m1(); -->C.T.E
		
		//to overcome this problem we have to downcast
		
		Y y=(Y)x;
		y.m1();
		
		//or --> ((Y)x).m1();
	}
}
