package Recursion;

public class Ex2
{
	static void m1(int i)
	{
		System.out.println(i);
		if(i==3)
			return;
		
		m1(i+1);
		System.out.println(i);
			return;
	}
	public static void main(String[] args) 
	{
		m1(1);
	}
}

/*
	main() --> m1(1) --> calling m1(int i) --> print 1 --> 1!=3, false --> m1(1+1)=m1(2) 
	--> print 2 --> 2!=3, false --> m1(2+1)=m1(3) --> print 3 --> 3==3,true and return. 
	--> return to m1(2) and print 2 --> return to m1(1) and print 1.
	
	 so, the output will be:  1 2 3 2 1
	
*/