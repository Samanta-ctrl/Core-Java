/*
 		Overloading – Sequence of data type of arguments:
 -----------------------------------------------------------------------------------------------------------*/

package Method_Overloading;

class E
{
	public void m1(int x,float f)
	{
		System.out.println("int and float datatype");
	}
	public void m1(float f,int x)
	{
		System.out.println("float and int datatype");
	}
}
public class Test5 
{
	public static void main(String[] args) 
	{
		E e=new E();
		e.m1(10, 10.5f); 
		e.m1(10.5f, 10);
		//e.m1(10, 10); compile time error
	}
}
