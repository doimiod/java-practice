import java.util.Scanner;
public class AgeStatistics {
	public static final int AGE_MIN = 13;
	public static final int AGE_MAX = 19;

	public static void main(String[] args) {
		Scanner ageScanner = new Scanner(System.in);
		double averageAge = 0;
		double numberOfAges = 0;
		double numberOfTeenagers = 0;
		boolean finished = false;
		do
		{
			System.out.println("Enter a person's age (or 'quit'):");
			if(ageScanner.hasNextInt())
			{
				int age = ageScanner.nextInt();
				numberOfAges++;
				averageAge += (age - averageAge) / numberOfAges;
				if((age >= AGE_MIN) && (age <= AGE_MAX))
				{
					numberOfTeenagers++;
				}
				double percentage = (numberOfTeenagers / numberOfAges) * 100;
				double percentageRounded = Math.round((double)percentage * (double)10) / (double)10;
				int averageAgeRounded = Math.round((int)averageAge);
				
				System.out.println("The average age entered is " + averageAgeRounded + " and "
									+ percentageRounded + "% of the ages correspond to teenagers.");
		
			}
			else if(ageScanner.hasNext("quit"))
			{
				finished = true;
			}
			else
			{
				System.out.println("Not a valid age. Please try again.");
				ageScanner.next();
			}
		}
		while(!finished);
		ageScanner.close();

	}

}