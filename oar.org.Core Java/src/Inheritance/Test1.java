package Inheritance;
class A
{
	int i=10;
}
class B extends A
{
	int i=20;
	void m1()
	{
		System.out.println(i); //local variable --> 20
		System.out.println(super.i); //refering super class member --> 10
	}
}
public class Test1 
{
	public static void main(String[] args) 
	{
		int i=30;
		B b=new B();
		b.m1();
		System.out.println(i);// --> 30
	}
}
