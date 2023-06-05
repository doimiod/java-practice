import java.util.Scanner;
import java.util.Random;
public class aaaa {

	public static void main(String[] args) {
		
		int userWon = 0;
		Random generator = new Random();
		boolean finished = false;
		int computerCard1 = generator.nextInt(13);
		computerCard1 = computerCard1 + 2;
		System.out.println("This card is "+computerCard1);
		
		while(!finished)
		{
			System.out.println("Do you think the next card will be higher, lower or equal?");
			Scanner userInput = new Scanner (System.in);
			int computerCard2 = generator.nextInt(13);
			computerCard2 = computerCard2 +2;
			if (((computerCard1 == computerCard2) && (userInput.hasNext("equal")) ) || ((computerCard1 < computerCard2) && (userInput.hasNext("higher")))
			|| ((computerCard1 > computerCard2) && (userInput.hasNext("lower"))))
			{
				userWon++;
				computerCard1 = computerCard2;
			}
			else
				finished = true;
			System.out.println("This card is "+computerCard2);
			if (userWon == 4)
			{
				finished = true;
				System.out.println("Congrats!");
			}
		}

	}

}
