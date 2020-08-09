package Method_Overloading;

public class Question2 
{
	public static void main(String[] args) 
	{
		m1(null);
	}
	
	public static void m1(Long number)
	{
		System.out.println("Long class");
	}
	public static void m1(Integer number)
	{
		System.out.println("Integer wrapper class");
	}
}

/* Here it gives Compile time error . Because null creates ambiguity as here Long and Integer both can be null 
	and JVM cannot decide which method to be called.  */