//Down Casting Example....

package Casting;

class Animal
{ 
	
}  
class Cat extends Animal
{  
	static void method(Animal a) 
	{  
       Cat d=(Cat)a;//downcasting  
       System.out.println("downcasting performed");  
	}  
	public static void main (String [] args) 
	{  
		Animal a=new Cat();  
		Cat.method(a);  
	}  
}