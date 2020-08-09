//INCREAMENT/DECREMENT Operator

package Basics;

public class Incr_Decr
{
	public static void main(String[] args) 
	{
		int a=0;
		a++; //0(1)
		a++; //1(2)
		++a; //3(3)
		++a; //4(4)
		int b=a++ + ++a; // 4(5) + 6(6)=10
		System.out.println(a); //6
		System.out.println(b); //10
		
		--a; //5(5)
		a--; //5(4)
		int c=a-- + --a; //4(3) + 2(2)=6
		System.out.println(c); //6
	}
}
