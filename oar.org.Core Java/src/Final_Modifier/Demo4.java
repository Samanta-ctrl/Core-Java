package Final_Modifier;
class G
{
	public void m1()
	{
		System.out.println("m1 in class E");
	}
}

class H extends G
{
	public void m1()
	{
		System.out.println("m1 in class E");
	}
}

final class I 
{
	public void m1()
	{
		System.out.println("m1 in class E");
	}
}

class J extends I //C.T.E because final class cannot be extended.
{
	public final void m1()
	{
		System.out.println("m1 in class E");
	}
}
public class Demo4 
{
	public static void main(String[] args) 
	{
		
	}
}
