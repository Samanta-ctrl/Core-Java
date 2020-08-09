package Final_Modifier;

class B
{
	int i=10;
}
public class Demo2 
{
	public static void main(String[] args) 
	{
		final B b=new B(); //here the ref. variable b is final, not i is final. i.e, we make the object final.
		System.out.println(b.i); //10
		
		b.i=20;
		System.out.println(b.i); //20
		
		//after this if we create another object of B class then it will gives C.T.E, 
		//Beacuse object is final already. 
		
		b1=new B(); // C.T.E 
	}
}
