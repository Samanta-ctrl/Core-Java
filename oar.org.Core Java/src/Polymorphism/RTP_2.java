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
		m1.male(); //male() will decide at the runtime, that which Class method it will call
		
		Man m2=new Employee();
		m2.male(); //male() will decide at the runtime, that which Class method it will call
		
		Man m=new Man();
		m.male(); //male() will decide at the runtime, that which Class method it will call
	}
}
