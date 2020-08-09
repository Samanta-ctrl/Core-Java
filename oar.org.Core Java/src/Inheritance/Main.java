package Inheritance;
class Parent
{
    public void show()
    {
       System.out.println("Parent is running");
    }
}
  
class Child extends Parent 
{
    public void show()
    {
       System.out.println("Child is running");
    }
}
  
public class Main
{
    public static void main(String[] args)
    {
        Parent x = new Child();;
        x.show();
    }
}
