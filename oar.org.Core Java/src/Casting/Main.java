//Up Casting Example......

package Casting;

class Parent
{
    int x=20;
    void display()
    {
        System.out.println("display method of parent class");
    }
   
    void OnlyParentDisplay()
    {
        System.out.println("OnlyParentDisplay method of Parent");
    }
}
 
class Child extends Parent
{
    int y=40;
    void display()
    {
        System.out.println("display method of Child class");
    }
    void OnlyChildDisplay()
    {
        System.out.println("OnlyParentDisplay method of Child");
    }
}
 
public class Main
{
    public static void main(String[] args) 
    {
        Parent p = new Child();
        p.display(); // "display method of Child class" will print as child class object is created here 
        			//but assigning it to parent type ref variable
        
        p.OnlyParentDisplay(); // as child class extends Parent class so "OnlyParentDisplay method of Parent"
        
        //p.OnlyChildDisplay();
        
        System.out.println(p.x); //20
    }
}