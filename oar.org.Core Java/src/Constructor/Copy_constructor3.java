package Constructor;

import java.util.Scanner;

class BookInfo
{
	String title;
	String author;
	double price;
	BookInfo(String t,String a,double p)
	{
		this.author=a;
		this.price=p;
		this.title=t;
	}
	void display()
	{
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
	
}
class BookCreator
{
	static BookInfo create()
	{
		System.out.println("Object creation process starts");
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Title name, Author name, Price ");
		
		String t=scn.next();
			
		String a=scn.next();
	
		double p=scn.nextDouble();
		
		System.out.println("BookInfo Object is created successfully");
		return new BookInfo(t, a, p);
		
	}
}
public class Copy_constructor3 {

	public static void main(String[] args) 
	{
		BookInfo b1=BookCreator.create();
		BookInfo b2=BookCreator.create();
		
		b1.display();
		b2.display();
	}
}
