import java.util.Scanner;

public class PeopleAges {

	public static void main(String[] args) {
		
		System.out.println("Enter a person's age(or quit)");
		Scanner userInput = new Scanner (System.in);
		double total = 0;
		double theNumberOfInput = 0;
		double theNumberOfTeenagers = 0;
		
		while(userInput.hasNextInt())
			{
			int userAge = userInput.nextInt();
			if((userAge >=13) && (userAge <20))
				{
				theNumberOfTeenagers++;
				}
		
			    theNumberOfInput ++;
			    total = total + userAge;
				double ageAverage = total/theNumberOfInput;
				double thePercentageOfTeenages = (theNumberOfTeenagers/theNumberOfInput)*(double)100;
				System.out.println("The average age enterd is "+ageAverage+" and "+thePercentageOfTeenages+"% of the ages are correspond to teenagers.");
				System.out.println("Enter a person's age(or quit)");
			}
		if (userInput.hasNext("quit"))
		{
			System.out.println("'quit' is typed, see you.");
		}
		else
			System.out.println("error has occured");
		     
	}
}