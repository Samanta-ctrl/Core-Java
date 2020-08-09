/*
  Copy Constructor:
  -->
  		A constructor which copies all property values of a given object to a new object.
  		
  	It is used to construct an object by coping the state of another object within the same class.
  	Java doesn't provide copy constructor by default. You have to write your own.
  	
  	First of all declare a constructor which takes the obejct of same type as an input 
  	then manually copy each field of object into new instance.
	 
 */

package Constructor;
class Copy
{
	String name;
	int id;
	
	Copy(String s,int id) //sample parameterized constructor
	{
		this.name=s;
		this.id=id;
	}
	Copy(Copy cp) //copy constructor
	{
		name=cp.name;
		id=cp.id;
	}
	void display()
	{
		System.out.println("Name: "+name);
	}
}

public class Copy_Constructor1 
{
	public static void main(String[] args) 
	{
		Copy c1=new Copy("Soumen",1);
		Copy c2=new Copy(c1); //calling copy constructor by passing the obj of sample constructor
		c1.display();
		c2.display();
	}
}
