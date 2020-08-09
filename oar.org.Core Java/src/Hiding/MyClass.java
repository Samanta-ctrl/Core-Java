/*
 Key points: 
1. In method overriding, method call is resolved by JVM based on runtime object (new Object).
2. In method hiding, method call is resolved by the compiler based on reference type (Object obj).

 */


package Hiding;

class ParentClass 
{ 
	public static void classMethod()
	{ 
		System.out.println("classMethod in Parent class"); 
	} 
	public void instanceMethod()
	{ 
		System.out.println("instanceMethod in Parent class"); 
	} 
} 
 class ChildClass extends ParentClass 
{ 
	public static void classMethod() //(Method hiding)
	{ 
		System.out.println("classMethod in Child class"); 
	} 
	public void instanceMethod() //(Method overriding)
	{ 
		System.out.println("instanceMethod in Child class"); 
	} 
} 

public class MyClass 
{ 
	public static void main(String[] args) 
	{ 
		ParentClass p = new ChildClass(); 
		p.classMethod(); // Calling with reference. (Method hiding) 
		p.instanceMethod(); // Calling with object. (Method overriding)
 
		ChildClass c = new ChildClass(); 
		c.classMethod(); // Calling with reference. 
		c.instanceMethod(); // Calling with object. 

		ParentClass p1=new ParentClass(); 
		p1.classMethod(); // Calling with reference. 
		p1.instanceMethod(); // Calling with object. 
	} 
}

/* **** OUTPUT ****
 
classMethod in Parent class
instanceMethod in Child class
classMethod in Child class
instanceMethod in Child class
classMethod in Parent class
instanceMethod in Parent class

*/