package Blocks;
class Emp
{
	String name;
	int id;
	static int count;
	
	//non-static block
	{
		//logic to generate unique id
		count++;
		id=count;
	}
	
	//default constructor
	Emp()
	{
		System.out.println("default constructor of emp class");
	}
	
	//parameterized constructor
	Emp(String s)
	{
		System.out.println("parameterized constructor of class Emp");
		this.name=s;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
}

public class NSB_3 
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		e1.display();
		
		System.out.println("----------------------------------------------");
		
		Emp e2=new Emp("Soumen");
		e2.display();
		System.out.println("----------------------------------------------");
	}
}
