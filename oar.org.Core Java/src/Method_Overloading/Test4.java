package Method_Overloading;

class D
{
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer type datatype");
	}
	public void m1(String s)
	{
		System.out.println("String type datatype");
	}
}
public class Test4 
{
	public static void main(String[] args) 
	{
		D d=new D();
		d.m1(new StringBuffer()); //StringBuffer type datatype
		d.m1("Soumen"); // String type datatype
		//d.m1(null); // ambiguity problem occurs here
	}
}

/*
	As both StringBuffer and String are same child class of Object class(Parent class) so for both child class
	which will access null ,thats why there is an ambiguity occurs and throws COMPILE TIME ERROR!     */