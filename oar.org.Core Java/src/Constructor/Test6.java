package Constructor;
class C
{
	int i;
	int j;
	C(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	void m1(D d)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(d.i);
		System.out.println(d.j);
	}
}

class D
{
	int i;
	int j;
	D(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}
public class Test6 
{
	public static void main(String[] args) 
	{
		C c=new C(10,20);
		D d=new D(40,50);
		c.m1(d);
	}
}
