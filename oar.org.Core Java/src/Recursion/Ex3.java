package Recursion;

public class Ex3 
{
	static void m1(int i)
	{
		System.out.println(i);
		if(i==3)
			return;
		
		m1(i+1);
		
		m1(i+1);
		System.out.println(i);
			return;
	}
	public static void main(String[] args) 
	{
		m1(1);
	}

}
