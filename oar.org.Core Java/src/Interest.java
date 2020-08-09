class Interest
{
    double amount, rate, interest = -1.0;
    static int numberOfYears;

    public static void main(String[] args)
    {
        Interest i = new Interest();
        System.out.println("i = " + i.interest); //-1.0
        
        i.amount = 3000;
        i.rate = 4.25f;
        i.numberOfYears = 2;
        i.interest = 0;
        
        updateInterest(i);
        System.out.println("i = " + i.interest); //255.0
    }

    private static void updateInterest(Interest i)
    {
        System.out.println("i = " + i.interest); //0.0
        i.interest = i.amount * i.rate * i.numberOfYears / 100.0;
    }
}