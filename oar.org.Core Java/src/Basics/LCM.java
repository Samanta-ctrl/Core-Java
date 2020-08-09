
/*
suppose a=7 ,b=6 then lcm=7 .now 7%6!=0 && 7%7=0 ,condition false so, 
lcm++ =8 --> 8%7!=0 && 8%7!=0 ,condition false.. 
like this when lcm=42 both the condition will satisfy then prints lcm value as 43 and breaks it from the loop. 

 --------------------------------------------------------------------------------------------------------------*/
package Basics;

import java.util.Scanner;
public class LCM
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scn.nextInt();
		System.out.println("Enter another number: ");
		int b = scn.nextInt();
		scn.close();
		
		int lcm;
		lcm = (a>b) ? a : b; // if a>b then prints a ,else print b
		while(true)
		{
			if(lcm%a==0 && lcm%b==0)  
			{
				//System.out.printf("LCM of %d and %d is: %d ",a,b,lcm);
				System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
				break;
			}
			lcm++;
		}
	}
}
		

//--------------------------------------------------------------------------------------------------------------
/* 
	LCM of two numbers ‘a’ and ‘b’ If, a x b = LCM(a, b) * GCD (a, b)

--> LCM(a, b) = (a x b) / GCD(a, b)  

*/



//class Test 
//{ 
//    // Recursive method to return gcd of a and b 
//    static int gcd(int a, int b) 
//    { 
//    if (a == 0) 
//        return b;  
//    return gcd(b % a, a);  
//    } 
//      
//    // method to return LCM of two numbers 
//    static int lcm(int a, int b) 
//    { 
//        return (a*b)/gcd(a, b); 
//    } 
//}