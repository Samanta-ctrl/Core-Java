package Polymorphism;

class Com_pol
{
	public void m1()
	{
		System.out.println("m1() method executing");
	}
	public void m1(int n) //overloaded method
	{
		System.out.println("m1(int n) method executing");
	}
}
public class Compile_Time_Polymorphism1 {

	public static void main(String[] args) {
		Com_pol c=new Com_pol();
		
		c.m1();
		c.m1(10);
	}
}

/* When call to overloaded method is resolved at compile time
  according to argument type is known as Compile time polymorphism.
  
  Method Overloading is when a method with the same name but diff.
   parameter/argument is passed to that method.  */
