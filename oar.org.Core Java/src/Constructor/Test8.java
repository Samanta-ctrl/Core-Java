package Constructor;
class Rectangle
{
	int length;
	int breadth;
	
	Rectangle()
	{
		System.out.println("default constructor");
	}
	
	Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	
	Rectangle(Rectangle r)
	{
		length=r.length;
		breadth=r.breadth;
	}
	
	void display()
	{
		System.out.println("length: "+length+" , Breadth: "+breadth);
	}
}
public class Test8 
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(5,10);
		Rectangle r3=new Rectangle(r2);
		Rectangle r4=new Rectangle(r1);
		
		r1.display();
		r2.display();
		r3.display();
		r4.display();
	}
}
