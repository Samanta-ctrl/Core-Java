//Method overloading and null error in Java:

package Method_Overloading;

class C
{
	public void m1(Object o)
	{
		System.out.println("Object type datatype");
	}
	public void m1(String s)
	{
		System.out.println("String type datatype");
	}
}
public class Test3 
{
	public static void main(String[] args) 
	{
		C c=new C();
		c.m1( new Object() ); // Object type
		c.m1("Soumen"); //String type
		c.m1(null); //String type
	}
}

/*
	In a same class, if there is both parent class and child class together then always parent class gives the 
	preference to the child class (as String is child class of object class and Object class is the supermost 
	parent class of all classes.
*/