package Constructor;
import java.util.Scanner;

class Copy2
{
	int i;
	Copy2(int i)
	{
		this.i=i;
	}
}
class ObjectCreator
{
	static Copy2 create() //create() method of return type Copy2 with static modifier
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		Copy2 cp=new Copy2(n);
		return cp;		
	}
}
public class Copy_constructor2
{
	public static void main(String[] args) 
	{
		Copy2 obj1=ObjectCreator.create();
		Copy2 obj2=ObjectCreator.create();
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		
	}
}
