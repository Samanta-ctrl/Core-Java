package Polymorphism;

class Man
{
	public void male()
	{
		System.out.println("Man can be male");
	}
}

class Father extends Man
{
	public void male()
	{
		System.out.println("Father is male");
	}
}

class Employee extends Man
{
	public void male()
	{
		System.out.println("Employee can be male");
	}
}

public class RTP_2 
{
	public static void main(String[] args) 
	{
		Man m1=new Father();
		m1.male();
		
		Man m2=new Employee();
		m2.male();
		
		Man m=new Man();
		m.male();
	}
}
