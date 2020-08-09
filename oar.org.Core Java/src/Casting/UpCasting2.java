package Casting;

class AA
{
	void m1()
	{
		System.out.println("m1 in class AA");
	}
}

class BB extends AA
{
	@Override
	void m1()
	{
		System.out.println("m1 in class BB");
	}
}

class CC extends AA
{
	@Override
	void m1()
	{
		System.out.println("m1 in class CC");
	}
}

public class UpCasting2 
{
	public static void main(String[] args) 
	{
		AA a1;
		a1=new BB(); // Upcasting
		a1.m1(); //late binding --> m1 in class BB
		
		a1=new CC(); // Upcasting 
		a1.m1(); //late binding	 --> m1 in class CC
	}
}

/*
 Note:-
 		In the above example , when there is a call to overridden method happens then method implementation
 is executed according to the instance type not according to the reference variable type.
 	*/






