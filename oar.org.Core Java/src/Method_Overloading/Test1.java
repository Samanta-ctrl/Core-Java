/*
 Method overloading:-
	1) Two methods with the same name and with different parameters/arguments is called Method overloading.
	2) Overloading methods can have any kind of return type based on what type of operation you are doing.
	3) It can have any kind of access modifiers.(like- public,protected,default etc..)
	4) println() is the example of method overloading.
	5) It is also known as Compile-time-Polymorphism or Static Polymorphism or Early-binding.
	6) Benefits: --> user can remember one method name for one functionality or behaviour.
	 			 --> Compile-time-Polymorphism can be achieved.
--------------------------------------------------------------------------------------------------------------*/

package Method_Overloading;
class A
{
	public void m1(int x)
	{
		System.out.println("int datatype");
	}
	public void m1(float f)
	{
		System.out.println("float datatype");
	}
}
public class Test1 
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1(10);
		a.m1(10.2f);
	}
}
