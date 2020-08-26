package com.oecm3.Exceptions;

public class Concept {
	/*
	 
	 1) What is an Exception?
	 -->
	 		An unexpected event occurs during runtime, which affects normal flow of execution is known as Exception.
	 This exception must be handled properly. If it is not handled, program will be terminated abruptly.			
	 
	 
	 2) How the exceptions are handled in java? OR Explain exception handling mechanism in java?
	 -->
			Exceptions in java are handled by using try, catch and finally blocks. 
			
	 	try block : The code or set of statements which are to be monitored for exception are kept in this block.

	 	catch block : This block catches the exceptions occurred in the try block.

	 	finally block : This block is always executed whether exception is occurred in the try block or not and occurred 
	 	exception is caught in the catch block or not.
	 	
	 NOTE:-	Please note that only try block is mandatory while catch and finally blocks are optional. 
	 With a try block, we can use either a catch block or finally block as needed.
	 
	 
	 3) Can we keep other statements in between try, catch and finally blocks?
	 --> 
	 		No. We shouldn’t write any other statements in between try, catch and finally blocks. They form a one unit.
	 		
	 
	 4) Can we write only try block without catch and finally blocks?
	 -->
			No, It shows compilation error. The try block must be followed by either catch or finally block. 
		You can remove either catch block or finally block but not both.
	 
	 
	 5) There are three statements in a try block – statement1, statement2 and statement3. 
	 After that there is a catch block to catch the exceptions occurred in the try block. 
	 Assume that exception has occurred in statement2. Does statement3 get executed or not?
	 -->
			No. Once a try block throws an exception, remaining statements will not be executed.
	    control comes directly to catch block.
	 
	 
	 6) What are run time exceptions in java. Give example?
	 -->
			The exceptions which occurs at run time are called as run time exceptions. These exceptions are unknown 
		to compiler. All sub classes of java.lang.RunTimeException and java.lang.Error are run time exceptions. 
		These exceptions are unchecked type of exceptions. 
		For example, NumberFormatException, NullPointerException, ClassCastException, ArrayIndexOutOfBoundException,
		StackOverflowError etc.
	 
	 
	 7) what are checked and unchecked exceptions in java?
	 -->
	 		Checked exceptions are the exceptions which are known to compiler. These exceptions are checked at compile
	 	time only. Hence the name checked exceptions.These exceptions are also called compile time exceptions.
	 	Because, these exceptions will be known during compile time. We can create user-defined checked exceptions by 
	 	extending java.Lang.Exception class
	 	Ex.- FileNotFoundException, SQLException ,IOException, ClassNotFoundException, InvocationTargetException etc.

			Unchecked exceptions are those exceptions which are unknown to compiler. These exceptions occur only 
		at run time. These exceptions are also called as run time exceptions. All sub classes of java.lang.RunTimeException 
		and java.lang.Error are unchecked exceptions.
		We can create user-defined Unchecked exceptions by extending RuntimeException class.
	 	Ex.- ArrayIndexOutOfBoundsExceptionexception, ArithmeticException, NullPointerException, NumberFormatException,
	 	InputMismatchException, IllegalStateException etc.
	 	
	 
	 8) Exceptions are defined in which java package
	 -->
			java.lang.Exception
	 
	 
	 9) Can we keep the statements after finally block If the control is returning from the finally block itself?
	 -->
			No, it gives unreachable code error. Because, control is returning from the finally block itself. 
		Compiler will not see the statements after it. That’s why it shows unreachable code error.
	 
	 
	 10) What are the differences between exception and error.
	 -->
	 		Exceptions and errors both are subclasses of Throwable class. 
	 		
	 		# The error indicates a problem that mainly occurs due to the lack of system resources and our application
	 	should not catch these types of problems.Some of the examples of errors are system crash error and out of memory 
	 	error. Errors mostly occur at runtime that's they belong to an unchecked type. Errors are non-recoverable.
	 	If the errors will occur we can't do nothing, the programs will be terminated abnormally.
	 	Ex- OutOfMemoryError ,IOError etc..

			# Exceptions are the problems which can occur at runtime and compile time both.But, it mainly occurs in the code 
		written by the developers.  Exceptions are divided into two categories such as checked exceptions and unchecked 
		exceptions. Exceptions are recoverable. If exception occurs, at least we can recover by providing try-catch.
	 	Ex- NullPointerException , SqlException  etc..
	 
	 
	 11) When to use Checked and Unchecked Exception in java?
	 -->
	 		we can first validate the input file name before opening the file. And if we provide the invalid name of the
	 	 input,then we can throw the checked exception.
	 	 Ex.- if (!isCorrectFileName(fileName))
		      {
       				throw new IncorrectFileNameException("File name is invalid: " + fileName );
		 	  }
	 
	 		If the input file name is an empty string, it means there is an error in the code. In this case, we should 
	 	throw an unchecked exception.
	 	Ex.- if (fileName == null || fileName.isEmpty())
			 {
       			throw new NullOrEmptyException("The filename is null or empty.");
			 }
			 
			 
		12) What is the use of throw and throws keyword in java?
		-->
			 # Throw:-
			 	The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 
			We can throw either checked or unchecked exception. The throw keyword is mainly used to throw custom 
			exceptions.	
			 
			Rules to use "throw" keyword in java -
				-> throw keyword must follow Throwable type of object.
				-> It must be used only in method logic.
				-> Since it is a transfer statement , we can not place statements after throw statement. 
					It leads to compile time error named Unreachable code 
			 
			 Example-													
			  public class ThrowExample 
			  {
				 public static void main(String[] args) 
				 {
					 try {
			   			 throw new ArithmeticException();
					}
					 catch (Exception e){	 
						 System.out.println(e);
		    			 e.printStackTrace();
					 }
				 }
			  }
			 
			#Throws:-
			 		Java throws keyword is used to declare a checked exception.
			 A method can throws n no. of exception. It used only for checked exception. 
			 
			 	In a program, if there is a chance of rising an exception then compiler always warn us about it and 
			 compulsorily we should handle that checked exception, Otherwise we will get compile time error saying
			 unreported exception XXX must be caught or declared to be thrown. To prevent this compile time error
			 we can handle the exception in two ways:--

					1. By using try catch block  or 
					2. By using throws keyword
	 
	 
	 		#Throwable:-
	 				Throwable is super class of all exceptions and errors.
				All kind of exceptions and errors are kind of throwable type.
				If you want to create your own customized exceptions, then your class must extends this class.
				
			Throwable class contains two child classes-- 1). Exception      2). Error
	 
	 		Following is the declaration for java.lang.Throwable class:

				-> public class Throwable
				-> extends Object
				-> implements Serializable
	 		
	 		Example:- 
	 					class MyException extends Throwable
						{
							//Customized Exception class
						} 

						class ThrowAndThrowsExample
						{
							void method() throws MyException
							{
								MyException e = new MyException(); 
								throw e;
							}
						}


	 	13) Which class is the super class for all types of errors and exceptions in java?
		-->
			   java.lang.Throwable is the super class for all types of errors and exceptions in java.
		    If you want to create your own customized exceptions, then your class must extend this class.
	 
	 
	  
	 	14) What is the use of printStackTrace() method?
		-->
			   printStackTrace() method is used to print the detailed information about the exception occurred.
	 
	 
	 
	 	15) Difference between final, finally and finalize in Java?
	 	-->
	 		# Java final keyword:-
	 		
	 			The final keyword makes a Java variable, method or class as final (it cannot be changed once 
	 		it is initialized).
	 		
	 		--> final with variable:-
				A variable declared as final cannot be assigned another value after it has been initialized first time. 
			The initialization of final variable may happen at two places only.
	 		
	 		Ex.-
	 		class A { 
    			public static void main(String[] args) 
    			{ 
	 				// Non final variable 
        			int a = 5; 
  
        			// final variable 
        			final int b = 6; 
  
        			// modifying the non final variable : Allowed 
        			a++; 
  
        			// modifying the final variable :   Immediately gives Compile Time error. 
        			b++; 
	 			}
	 		}
	 	
	 		--> final with Class :-
	 			The class cannot be subclassed whenever we declare any class as final, it means that we can’t extend 
	 		that class or that class can’t be extended or we can’t make subclass of that class.
	 
	 		Ex.-
	 		final class A 
	 		{ 
    			public static void main(String[] args) 
    			{ 
        			int a = 10; 
    			} 
			} 
			// here we gets  Compile time error that  we can't extend A as it is final. 
			class B extends A
			{ 
    			// more code here with main method 
			} 
	 
	 		--> final with Method :- 
	 				The method cannot be overridden by a subclass. Whenever we declare any method as 
	 		final, then it means that we can’t override that method.
	 	
	 		Ex.- 
	 		class C
	 		{ 
    			final void c() 
    			{
    				//.......
    			} 
    			public static void main(String[] args) 
    			{ 
    				//--------
    			} 
			} 
  
			class D extends C 
			{ 
    			// Here we will get compile time error since can't extend c since it is final method. 
    			void d() 
    			{
    				//----------
    			} 	
			} 
	 			
	 	If a class is declared as final then by default all of the methods present in that class 
	 are automatically final but variables are not.
	 Ex.-	
	 	// Java program to illustrate final keyword 
		final class G 
		{ 
    		// by default it is final. 
    		void h()
    		{
    			//-----
    		} 
    		// by default it is not final. 									Output:- 36
    		static int j = 30; 
  
			public static void main(String[] args) 
    		{ 
        		// See modified contents of variable j. 
        		j = 36; 
        		System.out.println(j); 
    		} 
		} 
	 
	 
	 	# Java finally block:-
	 		Java finally block is part of try-catch-finally blocks for exception handling. 
	 	The finally keyword is used in association with a try/catch block and guarantees that a section of
	  	code will be executed, even if an exception is thrown/handled or not.
	  	
	  	A try block can have only one finally block. The finally block will be executed after the try and catch blocks,
	    but before control transfers back to its origin.
	 	
	 	finally block syntax:-
						try {
    						//open file
    						//read file
						}
						catch(Exception e) {
    						//handle exception while reading the file
						}
						finally {
    						//close the file
						}
		Note:-
		
	 	Please note that only try block is mandatory while catch and finally blocks are optional. With a try block, 
	 	we can use either a catch block or finally block as needed.

		It is possible to have below given both combinations in Java. Both versions are valid.
		
		--> Version 1 - try with catch, without finally block
			try {
     
			}
			catch(Exception e) {
     
			}

	    --> Version 2 - try with finally, without catch block
			try {
     
			}
			finally {
     
			}
	 
	 16). Difference between ClassNotFoundException and NoClassDefFoundError?
	 -->
	 		ClassNotFoundException occurs while dynamic class loading whereas NoClassDefFoundError occurs at 
	 	static class loading.
	 
	 		ClassNotFoundException occurs when you try to load a class at runtime using Class.forName() or 
	 	loadClass() methods and requested classes are not found in classpath. 

	 	
	 
	 */

}
