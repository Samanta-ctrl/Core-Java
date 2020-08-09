class OutPut
{
    int D;

    public static void main(String[] args)
    {
        PrintA a = new PrintA();
        PrintB c = new PrintB();

        System.out.println("printA = " + a.printA); //0
        System.out.println("printB = " + c.printB); //5

        System.out.println("D = " + D); //C.T.E
    }
}

class PrintA
{
    int printA; //0
}

class PrintB
{
    int printB = 5;
}