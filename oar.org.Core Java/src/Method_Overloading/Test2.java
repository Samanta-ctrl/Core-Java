package Method_Overloading;

class B
{
	public void m1(float f)
	{
		System.out.println("float datatype");
	}
	public void m1(double d)
	{
		System.out.println("double datatype");
	}
}
public class Test2 
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.m1(10.5f);
		b.m1(10.0);
		b.m1('a'); // here a=97.0 ,because of datatype casting. the prority wise 
					//double value convert into float type (as 
	}
}

/*
	byte --> short -->
						int --> long -->float --> double
			  char -->
here we can not do reverse operaton.
-----------------------------------------------------------------------------------------------------------------*/