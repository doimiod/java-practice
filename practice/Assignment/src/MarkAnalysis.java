import java.util.Scanner;


public class MarkAnalysis {
	
	public static final int BORDER_FOR_HONOURED = 70;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean finished = false;
		double total = 0;
		double [] studentScore = {};
		
		do 
		{
			System.out.println("Enter a student percentage or finish");
			Scanner scanner = new Scanner (System.in);
		
		    
			if (scanner.hasNextDouble())
			{
				
				double[] newScore = new double[(studentScore==null)?1:studentScore.length+1];
				if (studentScore!= null)
					System.arraycopy( studentScore, 0, newScore, 0, studentScore.length );
				newScore[newScore.length-1] = scanner.nextDouble();
				if(newScore[newScore.length-1]>100 || newScore[newScore.length-1]<0)
				{
					System.out.println("Your input is invalid. Please try again.");
				}
				else
				{
					studentScore = newScore;
					total += studentScore[studentScore.length-1];
					double highestScore = determineBestMark (studentScore);
					int theNumberOfStudentsHounoured = countFirstClassHonours(studentScore);
					System.out.println(theNumberOfStudentsHounoured+" students obtained first class honours. The highest mark was "+highestScore+"%");
				}
			}
			else if (scanner.hasNext("finish"))
			{
				System.out.println("see you");
				finished = true;
			}
			else
				System.out.println("Your input is invalid. Please try again.");
			
		}while(!finished);
		
	}

	public static double determineBestMark (double [] studentScore) {
		
		double highestScore = 0;
		
		for(int i=0; i<studentScore.length; i++)
		{
		if (studentScore[i]>highestScore)
			highestScore = studentScore[i];
		}
		
		return highestScore;
	}
	
	public static int countFirstClassHonours(double [] studentScore) {
		int theNumberOfStudentsHounoured = 0;
		
		for(int i=0; i<studentScore.length; i++)
		{
		if (studentScore[i]>=BORDER_FOR_HONOURED)
			theNumberOfStudentsHounoured++;
		}
		
		return theNumberOfStudentsHounoured;
	}
	
}