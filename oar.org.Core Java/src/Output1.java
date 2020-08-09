class OutPut1
{
    int c;

    public static void main(String[] args)
    {
        PrintAA a = new PrintAA();
        PrintBB c = new PrintBB();

        System.out.println("printA = " + a.printAA); // 0
        
        System.out.println("printB = " + c.printBB); // 5

        System.out.println("c = " + new OutPut1().c); // 0
    }
}

class PrintAA
{
    int printAA;
}

class PrintBB
{
    int printBB = 5;
}