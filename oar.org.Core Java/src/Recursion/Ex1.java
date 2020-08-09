
package Recursion;
public class Ex1 
{
	static void m1(int i)
	{
		System.out.println(i);
		if(i==3)
			return;
		m1(i+1);
		return;
	}
	public static void main(String[] args) 
	{
		m1(1); //recursive method
	}
}

/*
	main -> m1() --> calling m1(int i=1) --> s.o.p(1) --> 1!=3 ,condition false
	 --> m1(1+1)=m1(2) --> calling m1(int i=2) --> s.o.p(2) --> 2!=3, condition false,
	 --> m1(-2+1)=m(3) --> calling m1(int i=3) --> s.o.p(3) --> 3==3, condition true. --> return.
	 
	  so, the output will be:   1 2 3
	
*/