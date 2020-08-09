package Binding;

class Bike1
{
	String color="Black";
	
	String getColor()
	{
		return color;
	}
}

class KTM1 extends Bike1
{
	String color="Orange";
	
	String getColor()
	{
		return color;
	}
}

class YAMAHA1 extends Bike1
{
	String color="Blue";
	
	String getColor()
	{
		return color;
	}
}

public class Late_Binding 
{
	static void m1(Bike1 b)
	{
		String c=b.getColor(); //Late binding (individual bike type ref is always called)
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		m1(new KTM1() ); //Orange
		
		m1(new YAMAHA1() ); // Blue
	}
}
