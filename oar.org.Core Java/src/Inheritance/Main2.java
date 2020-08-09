package Inheritance;
class XParent
{
    final public void show()
    {
       System.out.println("XadminParent is runnning");
    }
}
  
class XChild extends XParent 
{
    public void show()  //compile-time error. A final method cannot be overridden
    {
       System.out.println("XadminChild is running");
    }
}
  
class Main2 
{
    public static void main(String[] args)
    {
        XParent b = new XChild();;
        b.show();
    }
}
