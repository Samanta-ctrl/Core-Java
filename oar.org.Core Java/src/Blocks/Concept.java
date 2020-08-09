package Blocks;

public class Concept {
/*
 	Blocks are used to initialize the state .
 	Before execute main method we can write anything with the use of blocks.
 	
 								********** STATIC BLOCK********
 
 	1.> Static block will be executed at the time of class loading.
 	2.> A class can have multiple static blocks.
 	3.> Static blocks are used to initialize the static  members.
 	4.> Static blocks cannot reference non-sttaic members directly.
 	
 	
 								********* NON-STATIC BLOCK **********
	1.> Non-static blocks are executed each time when an instance is created using new keyword.
	2.> everytime an instance is created at that time non-static blocks will execute. 
	3.> Non-static block will execute first before default constructor.
	4.> Non-static blocks are used to initialize non-static members.
	5.> whenever an object is created always non-static block will executed.
 	
 	
 	(Q). When we should go for static block?
 	--> At the time of class loading if we want to perform any activity then we go for static block.
 
 	(Q). When we should go for non-static block?
 	--> It is used for common code irrespective of anything.
 	
 	 
 	 *** If there is a static block , non-static block and constructor is avilable then 
 	  STATIC BLOCK --> NON-STATIC BLOCK --> CONSTRUCTOR
  
 */
}
