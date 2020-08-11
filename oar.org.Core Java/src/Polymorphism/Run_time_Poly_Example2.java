//Run time Polymorphism

package Polymorphism;

class Parent
{
	public void print()
	{
		System.out.println("parent class");
	}
}

class Son extends Parent
{
	public void print()
	{
		System.out.println("Son class");
	}
}

class Daughter extends Parent
{
	public void print()
	{
		System.out.println("Daughter class");
	}
}
public class Run_time_Poly_Example2 {

	public static void main(String[] args) {
		Parent p;
		
		p=new Daughter();
		p.print();
		
		p=new Son();
		p.print();
	}

}
