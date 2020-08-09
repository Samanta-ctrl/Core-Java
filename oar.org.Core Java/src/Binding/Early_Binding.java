package Binding;

class Bike
{
	String color="Black";
}

class KTM extends Bike
{
	String color="Orange";
}

class Yamaha extends Bike
{
	String color="Red";
}

public class Early_Binding 
{
	static void m1(Bike b)
	{
		String c=b.color; // early binding (bike type ref is always called)
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		m1(new KTM());
		m1(new Yamaha());
	}
}

//To get the originl color , we have to do late binding.