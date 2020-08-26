
package com.oece2.Interfaces;

interface Animal1
{
	void eat();
	void makenoise();
}
class Cat implements Animal1
{
	public void eat()
	{
		System.out.println("cat eats");
	}
	public void makenoise()
	{
		System.out.println("Mew mew");
	}
}
class Lion implements Animal1
{
	public void eat()
	{
		System.out.println("Lion eats");
	}
	public void makenoise()
	{
		System.out.println("roar");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Animal1 a=new Cat();
		a.eat();
		a.makenoise();
		
	}

}
