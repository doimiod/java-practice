/* SELF ASSESSMENT 
   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code?  
       Mark out of 10:8
       Comment: Yes, I believe that I made the variables and CONSTANTS which everyone can understand easily.
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)? 
       Mark out of 5:5
       Comment: Yes. I used Capital letter and under bar to make constants. Moreover, I used Capital letter to make understandable variables. e.g. computer"C"hoice, user"C"hoice
   3. Did I generate the computer's choice in each game correctly using a Random number generator? 
       Mark out of 10:10
       Comment: Yes, I ran my programming many times and I am sure that the computer's choice are completely random.
   4. Did I input the user's choice in each game correctly? 
       Mark out of 10: 10
       Comment: Yes, as same as the above, I ran my programming a lot and confirmed that the user's choice are correctly input.
   5. Did I correctly compare the choices and update the score appropriately? 
       Mark out of 20:20
       Comment: Yes, the comparisons of the choices are always correct and score is also correct.
   6. Did I inform the user of who won each game (and why) correctly? 
       Mark out of 10:10
       Comment: Yes, my programme can inform the user of the winner, loser or draw correctly. Moreover, user can understand why the results happen.
   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop. 
       Mark out of 20:20
       Comment: Yes, the player can play the game 5 times. In addition, I used only one loop.
   8. Did I output the final scores correctly after the 5 games were played. 
       Mark out of 10:10
       Comment: Yes, it is possible to know the final scores correctly.
   9. How well did I complete this self-assessment? 
       Mark out of 5:5
       Comment: I marked each self assessment honestly and commented seriously.
   Total Mark out of 100 (Add all the previous marks): 98
*/
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	
 public static final int ROCK_IDENTIFER = 1;
 public static final int PAPER_IDENTIFER = 2;
 public static final int SCISSORS_IDENTIFER = 3;
 public static final int TIMES_FIGHT = 5;	
	
 
	public static void main(String[] args) {
		
		int timesUserWon = 0;
		int timesComputerWon = 0;
		Scanner userHand = new Scanner (System.in);
		Random generator = new Random();
	
		for (int i = 0; i < TIMES_FIGHT; i++) {
			
			System.out.println("Enter "+ROCK_IDENTIFER+"(for Rock) or "+PAPER_IDENTIFER+"(for Paper) or "+SCISSORS_IDENTIFER+"(for Scissors)");
			
			int userChoice = userHand.nextInt();
			int computerChoice = generator.nextInt(3);
			computerChoice++;
			
			    if (computerChoice == userChoice) {
			    	if (userChoice == ROCK_IDENTIFER) {
			    		System.out.println("This round was draw as I chose Rock too.");
			    		}
			    	else if (userChoice == PAPER_IDENTIFER) {
			    		System.out.println("This round was draw as I chose Paper too.");
			    		}
			    	else
			    		System.out.println("This round was draw as I chose Scissors too.");
			    	}
			    
			    if (computerChoice != userChoice && computerChoice == ROCK_IDENTIFER) {
			    	if (userChoice == PAPER_IDENTIFER) {
			    		System.out.println("You won this round as I chose Rock");
			    		timesUserWon++;
			    		}
			    	else {
			    		System.out.println("You lost this round as I chose Rock");
			    		timesComputerWon++;
			    		}
			    	}
				    
			    if (computerChoice != userChoice && computerChoice == PAPER_IDENTIFER) {
			    	if (userChoice == SCISSORS_IDENTIFER) 
			    	{
			    		System.out.println("You won this round as I chose paper.");
			    		timesUserWon++;
			    	}
			    	else 
			    	{
			    		System.out.println("You lost this round as I chose paper");
			    		timesComputerWon++;
			    	}
			    }
			    
			    if(computerChoice != userChoice && computerChoice == SCISSORS_IDENTIFER) {
			    	if(userChoice == ROCK_IDENTIFER) {
			    		System.out.println("You won this round as I chose scissors.");
			    		timesUserWon++;
			    		}
			    	else {
			    		System.out.println("You lost this round as I chose scissors.");
			    		timesComputerWon++;
			    		}
			    	}
		    }
		
		
		System.out.println("The final score was Computer: "+ timesComputerWon +" User: "+timesUserWon);
		
	}
	
}			  
