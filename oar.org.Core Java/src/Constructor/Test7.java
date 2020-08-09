package Constructor;
class E
{
	int i;
	E(int i)
	{
		this.i=i;
	}
	void m1(E e) //methods with argument of E type
	{
		System.out.println(i);
		System.out.println(e.i);
	}
}
public class Test7 
{
	public static void main(String[] args) 
	{
		E e1=new E(5);
		E e2=new E(10);
		
		e1.m1(e2); // 5 10
		e2.m1(e1); //10 5
		e2.m1(e2); //10 10
		e2.m1(new E(30)); //10 30
		new E(40).m1(e2); // 40 10
	}
}
