package Constructor_Overloading;

class B
{
	B()
	{
		System.out.println("Default constructor of class B");
	}
	B(int i)
	{
		this();
		System.out.println("parameterized constructor of B class");
	}
}
public class Demo2 {

	public static void main(String[] args) 
	{
		new B();
		System.out.println("--------------------------------------");
		new B(5);
	}
}

// this() keyword is used to called same class, another constructor from a constructor.
// call to this should be the first statement in a constructor.