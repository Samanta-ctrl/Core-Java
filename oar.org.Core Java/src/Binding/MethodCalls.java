package Binding;

class MethodCalls
{
    public static void main(String[] args)
    {
        int n=a1(8);
        System.out.println(n); //10
    }

    static int a1(int a1)
    {
        System.out.print(" a1 = " + a1); //8 --> 4--> 2 --> 1 --> 0
        System.out.println();
        return a2(a1++); //8(9) --> 4(5) --> 2(3) --> 1(2) --> 0(1)
    }

    static int a2(int a2)
    {
        if (a2 == 0) 
        {
            return 10; // when a2=0 prints 10
        }
        System.out.print(" a2 = " + a2); //8 --> 4 --> 2 --> 1 --> 
        System.out.println();
        return a1(a2 / 2); // 4 --> 2 --> 1 --> 0
    }
}
