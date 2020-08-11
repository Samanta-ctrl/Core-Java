//Compile_Time_Polymorphism using operator overloading

package Polymorphism;

class Operator
{
	public void operator(String s1,String s2)
	{
		String s=s1+s2;
		System.out.println("String is: "+s);
	}
	public void operator(int x,int y) //method overloading
	{
		int z=x+y;
		System.out.println("int value is: "+z);
	}
}
public class CT_Pol_using_operator_overloading {

	public static void main(String[] args) {
		Operator op=new Operator();
		
		op.operator(10, 20);
		
		op.operator("Soumen", " Samanta");
//here which method will execute first ,that will resolves at the compile time
	}

}
