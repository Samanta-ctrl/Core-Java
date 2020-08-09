package Constructor;

class Book
{
	String title;
	String author;
	
	Book(String t)
	{
		this.title=t;
	}
	Book(String t,String a)
	{
		new Book(t); //null
		this.author=a;
	}
	void display()
	{
		System.out.println("Title: "+title+ " and Author: "+author);
	}
}
public class Test4 
{
public static void main(String[] args) 
	{
		Book b=new Book("Harry Potter","James Cameron");
		b.display();	
	}
}
