/* SELF ASSESSMENT 

1. ResolveBet

I have correctly defined ResolveBet which takes the bet type (String) and the Wallet object, and a void return type [Mark out of 7:7 ].
Comment:Yes i have. I believe ResolveBet works correctly.
My program presents the amount of cash in the wallet and asks the user how much he/she would like to bet [Mark out of 8:8 ].
Comment:I believe user can see the amount of cash and decide how much to bet.
My program ensures the bet amount is not greater than the cash in the wallet [Mark out of 5:5 ].
Comment:yes. my program can work according to the bet. 
My program creates three Dice objects, rolls them and creates a total variable with a summation of the roll values returned [Mark out of 15:15 ]..
Comment:Yes. i made three Dice Objects which can work as we are asked.
My program determines the winnings by comparing the bet type with the total and comparing the bet type with the dice faces for the triple bet [Mark out of 20:20 ].
Comment:yes.but its really rare to win.
My program outputs the results (win or loss) and adds the winnings to the wallet if user wins or removes the bet amount from the wallet if the user loses [Mark out of 10:10 ].
Comment:yes. I checked it works correctly.

2. Main

I ask the user for the amount of cash he/she has, create a Wallet object and put this cash into it [Mark out of 15:15 ]
Comment:Yes. user can input the wallet and it is input on a Wallet object.
My program loops continuously until the user either enters quit or the cash in the wallet is 0 [Mark out of 5:5 ]
Comment:yes. user can keep doing the game.
I ask the user to enter any of the four bet types or quit [Mark out of 5:5 ].
Comment:yes.user can choose the 4 types of the bets.
My program calls resolveBet for each bet type entered [Mark out of 5:5 ].
Comment:yes. resolveBet is called when user input the bets.
At the end of the game my program presents a summary message regarding winnings and losses [Mark out of 5:5 ]
Comment:yes. it can display it.

 Total Mark out of 100 (Add all the previous marks):100
*/
import java.util.Scanner;
public class ChuckALuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean correctInput = false;
		boolean finished = false;
		Wallet userWallet = new Wallet();
		double startWallet = 0;
		
		do {
			System.out.println("How much do you have in your Wallet?");
			Scanner scanner = new Scanner(System.in);
		    if (scanner.hasNextDouble())
			{
				startWallet = scanner.nextDouble();
				userWallet.put(startWallet);
				correctInput = true;
			}
			else
				System.out.println("Your input is invalid. Please try again.");
		    }while(!correctInput);
		
		do {
			System.out.println("Enter a bet type(triple, field, high or low) or type quit to finish");
			//String userBet = scanner.next();
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNext("quit"))//|| if cash is 0
			{
			/*System.out.println("see you");*/
				System.out.println("Game over. You had "+startWallet+" at the start and now have "+userWallet.check());
				finished = true;
			}
			else if (scanner.hasNext("triple")) 
			{
				String betType = "triple";
				resolveBet(betType,userWallet);
			}
			else if (scanner.hasNext("field")) 
			{
				String betType = "field";
				resolveBet(betType,userWallet);
			}
			else if (scanner.hasNext("high")) 
			{
				String betType = "high";
				resolveBet(betType,userWallet);
			}
			else if (scanner.hasNext("low")) 
			{
				String betType = "low";
				resolveBet(betType,userWallet);
			}
			/*else if (scanner.hasNext("triple")||(scanner.hasNext("field"))||(scanner.hasNext("high"))||(scanner.hasNext("low")))
			{
				String userBet = scanner.next();
				//System.out.println(userBet);
				resolveBet(userBet,userWallet);
			}*/
			else
				System.out.println("Your input is invalid. Please try again.");
			
			if(userWallet.check()==0) 
			{
				System.out.println("You don't have money in your wallet. You had "+startWallet+"at the start");
				finished=true;
			}
			}while(!finished);
		}
	
	public static void resolveBet(String betType, Wallet userWallet) {
		boolean correctBet = false;
		double userBetMoney= 0;
		//System.out.println(userBet);
		do {
			System.out.println("You have now "+userWallet.check()+", how much do you want to bet?");
			Scanner scanner = new Scanner(System.in);
			if(scanner.hasNextDouble()) 
			{
				userBetMoney = scanner.nextDouble();
				if(userWallet.check() >= userBetMoney) 
					correctBet=true;
				else
					System.out.println("You don't have an afford to make this bet. Re-enter the bet you want to make");
			}
			else
				System.out.println("please enter the bet you want to make");
			
		}while(!correctBet);
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		Dice dice3 = new Dice();
		int roll1 = dice1.roll(); 
		int roll2 = dice2.roll();
		int roll3 = dice3.roll();
		/*roll2 = roll1;
		roll3 = roll2;*/
		int totalDice = roll1+roll2+roll3;
		boolean triple = false;
		if(roll1==roll2 && roll2==roll3) triple =true;
		
		//System.out.println(userBet+"a");
		if(betType=="triple") 
		{
			//System.out.println(userBet);
			if(triple==true && roll1!=1 && roll1!=6) 
			{
				System.out.println("You win! ("+roll1+","+roll2+","+roll3+")");
				userBetMoney = 30*userBetMoney;
				userWallet.put(userBetMoney);
			}
			else
			{
				System.out.println("You lose ("+roll1+","+roll2+","+roll3+")");
				userWallet.get(userBetMoney);
			}
		}
		if(betType=="field") 
		{
			if(totalDice<8 || totalDice>12) 
			{
				System.out.println("You win! ("+roll1+","+roll2+","+roll3+")");
				userWallet.put(userBetMoney);
			}
			else 
			{
				System.out.println("You lose ("+roll1+","+roll2+","+roll3+". Sum is"+totalDice+" )");
				userWallet.get(userBetMoney);
			}
			
		}	
		if(betType=="high") 
		{
			if(totalDice>10 && triple==false) 
			{
				System.out.println("You win! ("+roll1+","+roll2+","+roll3+")");
				userWallet.put(userBetMoney);
			}
			else 
			{
				System.out.println("You lose ("+roll1+","+roll2+","+roll3+")");
				userWallet.get(userBetMoney);
			}
		}	
		if(betType=="low") 
		{
			if(totalDice<11 && triple==false) 
			{
				System.out.println("You win! ("+roll1+","+roll2+","+roll3+")");
				userWallet.put(userBetMoney);
			}
			else 
			{
				System.out.println("You lose ("+roll1+","+roll2+","+roll3+")");
				userWallet.get(userBetMoney);
			}
		}	
	}
}
