package Method_Overloading;
public class Question1
{ 
	public static void main(String[] args) 
	{
		testMethod(5); 
	}
	     
	    public static void testMethod(long number)
	    {
	        System.out.println("long datatype");
	    }
	 
	    public static void testMethod(int number)
	    {
	        System.out.println("int datatype");
	    }
	 
	    public static void testMethod(Integer number)
	    {
	        System.out.println("Integer wrapper class");
	    }
	     
	    public static void testMethod(double number)
	    {
	        System.out.println("double datatype");
	    }
	 
	        public static void testMethod(Number number)
	    {
	        System.out.println("Number class");
	    }
}

// int --> long --> double --> Integer Wrapper class --> Number Class

/*	i.e.; if we remove int parameter ,then output will be long  and i.e.; if we remove int and long parameter ,
		  then output will be double and so on..... */ 

