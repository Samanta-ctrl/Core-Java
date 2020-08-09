package Inheritance;

class XadminParent
{
    public static void show() 
    {
       System.out.println("XadminParent is calling");
    }
}
  
class XadminChild extends XadminParent 
{
    public static void show()
    {
       System.out.println("XadminChild is calling");
    }
}
  
class Main3
{
    public static void main(String[] args)
    {
        XadminParent b = new XadminChild();
        b.show();
    }
}