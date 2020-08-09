package Method_Overloading;

class Method 
{
	public static void calculate(String Playername) 
	{
		System.out.println("Method.Playername called "+ Playername);
	}
}

public class Calculate extends Method 
{
	public static void main(String[] args) 
	{
		int newScore = calculateScore("Tim", 500);
		System.out.println("New Score is " + newScore);
		calculate(75);
		calculate();
		calculate("Soumen");
	}
		public static void calculate() 
		{
			System.out.println("No player name, No player score");
		}
		
//		public static void calculate(String Playername) 
//		{
//			System.out.println("Method.Playername called "+ Playername);
//		}
		
		public static int calculate(int Score) 
		{
			System.out.println("Unnamed player scored " + Score + " points");
			return Score * 1000;
		}
		
		static int calculateScore(String PlayerName, int Score) 
		{
			System.out.println("Player " + PlayerName + " scored " + Score + " points");
			return Score * 1000;
		}
}
