package Method_Overloading;

public class Question3 {

	public static void main(String[] args)
	{
		m1(null);
	}
		public static void m1(Number number)
		{
			System.out.println("Number class");
		}
		public static void m1(Integer number)
		{
			System.out.println("Integer class");
		}
	}

/*  
	As Number is Parent class and Integer is Child class, so it will not create ambiguity.
 	The higher priority is given to the lowest priority class. i.e.; Parent to child. So , ans is Integer.
 	
 */