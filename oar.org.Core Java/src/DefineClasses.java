class DefineClasses
{
    int c;

    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
        System.out.println("a = " + a.a); // 0, as default value of int =0
        
        System.out.println("b = " + b.b); // 5
        
        System.out.println("c = " + c); // C.T.E
    }
}

class A 
{ 
	int a;
}

class B 
{
	int b = 5;
}