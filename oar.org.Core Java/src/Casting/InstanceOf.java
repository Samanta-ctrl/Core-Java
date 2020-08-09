package Casting;

class A1
{
	
}

class B1 extends A1
{
	
}

class C1 extends B1
{
	
}

public class InstanceOf 
{
	public static void main(String[] args) 
	{
		A1 a=new C1();
		System.out.println(a instanceof B1); //true
		System.out.println(a instanceof C1); //true
		
		B1 b=new C1();
		System.out.println(b instanceof B1); //true
		System.out.println(b instanceof C1); //true
		System.out.println(b instanceof Object); // always it will be true
	}
}

/*
  Instanceof Operator is used to verify that, it is an instance of that class or not ,before downcasting.
  It returns true if given reference variable is a type of given class.
  
  Syntax: ref.var instanceof Class
 */