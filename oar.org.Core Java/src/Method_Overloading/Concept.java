package Method_Overloading;
public class Concept {
/*
	 
	1) Why do we need Method Overloading ??
	-->
		If we need to do same kind of the operation with different ways.
		i.e. for different inputs. In the example described below, 
		we are doing the addition operation for different inputs. 
		It is hard to find many different meaningful names for single action.
		
----------------------------------------------------------------------------------------------------------------
	2) Different ways of doing overloading methods
	-->	
		Method overloading can be done by changing:
				1> The number of parameters in two methods.
				2> The data types of the parameters of methods.
				3> The Order of the parameters of methods.   		
				
------------------------------------------------------------------------------------------------------------------							
	
	3) What happens when method signature is same and the return type is different?
	-->
		It will throw a compilation error: 
		More than one method with same name and argument list cannot be given in a class 
		even though their return type is different.
		
 	 * Method return type doesn’t matter in case of overloading. 
 
-----------------------------------------------------------------------------------------------------------------	
	4)  What happens when method signature is same and the return type is also same?
	-->
		It will throw a compilation error:
 		More than one method with same name and argument list cannot be defined in a same class\
 
----------------------------------------------------------------------------------------------------------------
	5) Conversion: 
	
		double > float > long > int > char
		
		int > short > byte	
----------------------------------------------------------------------------------------------------------------
	6) What is method signature? What are the things it consist of?
	-->
		Method signature is used by the compiler to differentiate the methods. 
		Method signature consist of three things.
			a) Method name
			b) Number of arguments
			c) Types of arguments
-----------------------------------------------------------------------------------------------------------------
	7) Can we declare one overloaded method as static and another one as non-static?
	-->
		Yes. Overloaded methods can be either static or non static.
	
------------------------------------------------------------------------------------------------------------------
	8) How do compiler differentiate overloaded methods from duplicate methods?
	-->
		Compiler uses method signature to check whether the method is overloaded or duplicated.
 		Duplicate methods will have same method signatures i.e same name,same number of arguments and 
 		same types of arguments. Overloaded methods will also have same name but differ in number of 
 		arguments or else types of arguments.
	
------------------------------------------------------------------------------------------------------------------
	9) Can overloaded methods be synchronized?
	-->
		Yes. Overloaded methods can be synchronized.

------------------------------------------------------------------------------------------------------------------
	10)  Can we overload main() method?
	-->
		Yes, we can overload main() method. A class can have any number of main() methods 
		but execution starts from public static void main(String[] args) only.

-----------------------------------------------------------------------------------------------------------------
	11) Can we declare overloaded methods as final?
	-->
		Yes, we can declare overloaded methods as final.

----------------------------------------------------------------------------------------------------------------
	12) Can overloaded method be overrided?
	-->
		Yes, we can override a method which is overloaded in super class.

-----------------------------------------------------------------------------------------------------------------
	13) Can we overload static method in Java?
	-->
		Yes, its possible to overload static method in Java.
 		You can declare as many static method with same name as you want until 
 		all of them have different method signature.
		
		Remember, return type is not part of method signature, 
		so they must have either different number of arguments, or different type of argument.

	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
