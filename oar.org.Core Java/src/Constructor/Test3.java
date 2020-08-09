package Constructor;
class Employee
{
	String name;
	double sal;
	static int count;
	
	Employee(String name,double sal)
	{
		this.name=name;
		this.sal=sal;
		count++;
	}
	void display()
	{
		System.out.println("Name: "+name+" , Salary: "+sal);
	}
}
public class Test3 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee("Soumen", 10000);
		Employee e2=new Employee("Soumalya", 20000);
		Employee e3=new Employee("Pankaj", 30000);
		
		e1.display();
		e2.display();
		e3.display();
		System.out.println("Count is: "+Employee.count);
	}
}
