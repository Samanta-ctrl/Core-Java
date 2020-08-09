package Casting;

public class Concept {

	/*
	 
	 Type casting is nothing but assigning a value of one primitive data type to another.
	 
	 There are two types of casting in Java as follows:
	 1. Widening Casting (automatically): –
			This involves the conversion of a smaller data type to the larger type size.

			byte -> short -> char -> int -> long -> float -> double
			
	 Example:-
	 	public class MyClass 
	 	{
  			public static void main(String[] args)
  			{
    			int myInt = 9;
    			double myDouble = myInt; // Automatic casting: int to double

    			System.out.println(myInt);      // Outputs 9
    			System.out.println(myDouble);   // Outputs 9.0
  			}
		}


	 2. Narrowing Casting (manually): –
	 	    This involves converting a larger data type to a smaller size type.

			double -> float -> long -> int -> char -> short -> byte
			
	 Example:-
	 	public class MyClass 
	 	{
  			public static void main(String[] args)
  			{
    			double myDouble = 9.78;
    			int myInt = (int) myDouble; // Manual casting: double to int

    			System.out.println(myDouble);   // Outputs 9.78
    			System.out.println(myInt);      // Outputs 9
  			}
		}
	 
	 
	 
	 Converting an object from one type to another is known as Typecasting.
	 
	 (Q.) What are Upcasting and Downcasting in Java?
	 
	  # Upcasting:-
	  		Assigning subclass instance to super class reference variable is known as Upcasting.
	  		Java does automatic upcasting.
	  		
	  Example:-
	  		class A
	  		{

			}
			class B extend A
			{

			}
			A a = new B(); //Upcasting
			
	 In the above example- a is super type reference and B is subtype instance. 
	 you can see that upcasting happens automatically and we have not done anything explicitly for it.
	 
	 ** Using super type reference, only super class properties can be referred,
	    subclass specific properties can not be referred.
	 
	 ** If there is a relationship between two classes then we can do Upcasting.
	 
	 ** Need:- Upcasting is needed for generalization purpose of a program.
	 
	 
	 #Downcasting:-
	 		Assigning super type reference variable to sub type instance variable is known as Downcasting.
	 		We have to do downcasting manually.
	 		
	 Example:-
	 		class Parent
	 		{

			}
			class Child extend Parent
			{

			}
			Child obj = new Parent();
			
	The above code will give an error compile-time error. This is not possible because all members of the 
	child class are not present in the parent class. So to achieve upcasting we have to do first
	downcasting and then do the downcasting explicitly of the object.
			
	Let’s see the example below on how we can achieve downcasting.
	
			Parent obj = new Child();
			Child c = (Child)obj; //downcasting
	 
	 
	** Downcasting is explicit i.e.; we have to write manually.
	
	** Synatx:- (subtype)supertype ref
	
	** Why Downcasting:-
				 If subclass instance is upcasted to super type ref. variable then using super type reference 
	   variable subclass specific members cannot be referred.
	   
	** When an object of one type can not be casted to another type then at the runtime an exception occurs 
	   named ClassCastException. By using genericswe can avoid this exception.
	   	
	   			
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
}