class Total
{
    int a, b, total;
    static int c;

    Total(int a, int b, int c, int total) 
    {
        this.a = a; 
        this.b = b; 
        this.c = c;
        this.total = total;
    }

    Total(int a, int b, int c) 
    {
        this(a, b, c, a + b + c);
    }

    Total(int a, int b) 
    {
        this(a, b, c, a + b + c);
    }

    public void print() 
    {
        System.out.println("c = " + c + ", total = " + total);
        c = total;
    }

    public static void main(String[] args) 
    {
        Total t1 = new Total(4, 7, 2, 4 + 7 + 2); // a=4, b=7, c=2, total=13
        
        Total t2 = new Total(t1.a, t1.b, t1.c); // a=4, b=7, c=13
        t1.print(); //c=2 total=13
        
        Total t3 = new Total(t1.c, t2.c); // a=13, b=13
        t2.print(); // c=13 total=13  
        
        t3.print(); // c=13 total=13+13+13=39
        
        t1.print(); // c=39 total=13
    }
}