package Constructor;
class Car
{
	String color;
	Car(String col)
	{
		this.color=col;
	}
}
public class Test5 
{
	static void m1(Car c)
	{
		c.color="Red";
	}
	public static void main(String[] args) 
	{
		Car c=new Car("Black");
		System.out.println(c.color); //Black
		
		m1(c);
		System.out.println(c.color); //Red
	}
}
