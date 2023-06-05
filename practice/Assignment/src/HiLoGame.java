/* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code? 
       Mark out of 5:5
       Comment: Yes. I used CONSTANTS. I believe I could do so.
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
       Mark out of 5:5
       Comment: Yes I did. I believe i could made understandable CONSTANTS and formatted it in UPPERCASE.
   3. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10:8
       Comment: Yes I did. I believe that everyone can understand the variable names I used in this programming.
   4. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 5: 5
       Comment: Yes I did. I used appropriateVariableNames.
   5. Did I indent the code appropriately? 
       Mark out of 10:8
       Comment:  I made efforts to indent code accurately but I am not sure that.
   6. Did I use an appropriate loop to allow the user to enter their guesses until they win or lose? 
       Mark out of 20: 20
       Comment: I ran this programme many times and am sure that user can input their guessing until they win or lose.
   7. Did I check the input to ensure that invalid input was handled appropriately? 
       Mark out of 10: 8 
       Comment: I checked it. If user input incorrectly, computer says "your input is invalid. Please restart."
   8. Did I generate the cards properly using random number generation (assuming all cards are equally likely each time)? 
       Mark out of 10: 8
       Comment: Yes, I did. I used random generator and checked that it can work appropriately.
   9. Did I output the cards correctly as 2, 3, 4, ... 9, 10, Jack, Queen, King? 
       Mark out of 10:10
       Comment: Yes, I did. 
   10. Did I report whether the user won or lost the game before the program finished? 
       Mark out of 10:10
       Comment: Yes I did. User can know that whether they win or not.
   11. How well did I complete this self-assessment? 
       Mark out of 5:5
       Comment: I analised my programming seriously and did self-assessment honestly.
   Total Mark out of 100 (Add all the previous marks): 92
*/
import java.util.Scanner;
import java.util.Random;
public class HiLoGame {
	public static final int MAX_FIGHT = 4;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14 ;
	
	public static void main(String[] args) {
		
		double userWon = 0;
		Random generator = new Random();
		int computerChoice1 = generator.nextInt(13)+ 2;
		if (computerChoice1 == JACK) 
		{
			System.out.println("The card is a Jack");
		}
		else if (computerChoice1 == QUEEN)
		{
			System.out.println("The card is a Queen");
		}
		else if (computerChoice1 == KING)
		{
			System.out.println("The card is a King");
		}
		else if (computerChoice1 == ACE)
		{
			System.out.println("The card is a Ace");
		}
		else
			System.out.println("The card is a "+computerChoice1);
		
		boolean finished = false;
		
		while(!finished) 
		{
			System.out.println("Do you think the next card will be higher, lower or equal?");
			int computerChoice2 = generator.nextInt(13)+2;
			Scanner userInput = new Scanner (System.in);
			if ((userInput.hasNext("equal")) ||(userInput.hasNext("higher"))||(userInput.hasNext("lower"))) 
			{
				if (((computerChoice1 == computerChoice2) && (userInput.hasNext("equal"))) ||  ((computerChoice1 < computerChoice2) && (userInput.hasNext("higher"))) || ((computerChoice1 > computerChoice2) && (userInput.hasNext("lower"))))
				{
					userWon++;
					computerChoice1 = computerChoice2;
				}
				else 
				{
					finished = true;
					System.out.println("Sorry, you lost.");
				}
			}
			else
			{
				System.out.println("your input is invalid. Please restart.");
				finished = true;
				break;
			}
		
			
			if (computerChoice2 == JACK) 
			{
				System.out.println("The card is a Jack");
			}
			else if (computerChoice2 == QUEEN)
			{
				System.out.println("The card is a Queen");
			}
			else if (computerChoice2 == KING)
			{
				System.out.println("The card is a King");
			}
			else if (computerChoice2 == ACE)
			{
				System.out.println("The card is a Ace");
			}
			else
				System.out.println("The card is a "+computerChoice2);

			if (userWon == MAX_FIGHT)
			{
				System.out.println("Congratulations! You got them all correct.");
				finished = true;
			}
		}
		
	}
	
}


	
