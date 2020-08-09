//Question 1 – return type, method name and argument list same.

package Method_Overloading;

class F
{
	public int myMethod(int num1, int num2)
	   { 
	       System.out.println("First myMethod of class Demo");
	       return num1+num2;
	   }
	   public int myMethod(int var1, int var2)
	   {
	       System.out.println("Second myMethod of class Demo");
	       return var1-var2;
	   }
}
public class Test6 
{
	public static void main(String[] args) 
	{
		   F f=new F();
	       f.myMethod(10,10);
	       f.myMethod(20,12);
	}
}
/*
Answer:
		It will throw a compilation error:
 		More than one method with same name and argument list cannot be defined in a same class.         */