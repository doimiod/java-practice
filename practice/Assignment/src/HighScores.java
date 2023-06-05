import java.util.Scanner;
public class HighScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many scores they want to maintain?");
		int size = input.nextInt();
		int[] highScores = initialiseHighScores(size);
		System.out.println("Enter numbers: ");
		int i = 0;
		int currentNumber = 0;
		do
		{
			i++;
			currentNumber = input.nextInt();
			highScores = insertScore(currentNumber, highScores);
		}
		while(input.hasNextInt());
		System.out.println("The high scores are " + printHighScores(highScores));
	}
	
	public static int[] initialiseHighScores(int size)
	{
		int[] highScores = new int[size];
		for(int i = 0; i < size; i++)
		{
			highScores[i] = 0;
		}
		return highScores;
	}
	
	public static String printHighScores(int[] highScores)
	{
		String highScoresString = "";
		for(int i = 0; i < highScores.length; i++)
		{
			highScoresString += highScores[i] + ",";
		}
		return highScoresString;
	}
	
	public static boolean higherThan (int newScore, int[] highScores)
	{
		boolean higherThan = false;
		for(int i = 0; i < highScores.length; i++)
		{
			if(newScore > highScores[i])
				higherThan = true;
		}
		return higherThan;
	}
	
	public static int[] insertScore(int newScore, int[] highScores)
	{	if(higherThan(newScore, highScores))
			highScores[highScores.length - 1] = newScore;
		return listHighScoresFromMaxToMin(highScores);
	}
	
	public static int[] listHighScoresFromMaxToMin(int[] highScores)
	{
		int copy = 0;
		for(int i = 0; i < highScores.length; i++)
		{
			for(int j = i + 1; j < highScores.length; j++)
			{
				if(highScores[i] < highScores[j])
				{
					copy = highScores[j];
					highScores[j] = highScores[i];
					highScores[i] = copy;
				}
			}
		}
		return highScores;
	}
	
}
