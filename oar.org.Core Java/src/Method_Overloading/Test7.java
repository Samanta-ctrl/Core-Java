//Question 2 – return type is different. Method name & argument list same.

package Method_Overloading;

class G
{
	public double myMethod(int num1, int num2)
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
public class Test7 
{
	public static void main(String[] args) 
	{
		G g=new G();
		g.myMethod(10,10);
	    g.myMethod(20,12);
	}
}

/*
Answer:
		It will throw a compilation error: 
		More than one method with same name and argument list cannot be given in a class 
		even though their return type is different.
		
 	***>  Method return type doesn’t matter in case of overloading.                                           */





