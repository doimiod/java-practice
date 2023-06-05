/* SELF ASSESSMENT

 1. Did I use easy-to-understand meaningful, properly formatted, variable names and CONSTANTS?
        Mark out of 10: 8
        Comment: I believe my variables and CONSTNTS are properly formatted, but I am not sure that I could make meaningful names.
 2. Did I indent the code appropriately?
        Mark out of 5: 5
        Comment:   yes. I am sure that I could indent appropriately.
 3. Did I implement the mainline correctly with a loop which continues using the user says "no" ?
       Mark out of 10: 10
        Comment:  yes. If user says no, program stops. on the contrary, if he/she says yes, program runs again.
 4. Did I obtain the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats ?
       Mark out of 10: 7
        Comment:  I believe I could get the correct input from the user and produce the correct output.
 5. Did I implement the readDoubleFromUser function correctly and in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 16
        Comment:  I believe that I could take user prompt correctly and return the double appropriately.
 6. Did I implement the calculateMonthlyRepayment function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 18
        Comment:  I think this function works correctly.
 7. Did I implement the calculateMonthsToRepayMortgage function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 15
        Comment:  I am not sure that this function works correctly. The output is as same as the output of the example but I do not know if i put different numbers, it calculates the output correctly.
 8. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment: yes. i did this self-assessment seriously and honestly.
 Total Mark out of 100 (Add all the previous marks):
*/ 


import java.util.Scanner;

public class MortgageCalculator {
	
	public static final double YEAR_DURATION = 20;
	public static final double MONTHS_IN_A_YEAR = 12;
	
	public static void main(String args[]) {
		
		System.out.println("Welcome to the mortgage calculator.");
		boolean finished = false;
		while(!finished) 
		{
			String question = "Please enter the mortgage amount:  ";
			double mortgageAmount = readDoubleFromUser(question);
			
			question = "Please enter the annual interest rate (APR):  ";
			double annualInterestRate = readDoubleFromUser(question);
			
			double monthlyRepayment = calculateMonthlyRepayment ( mortgageAmount, annualInterestRate, YEAR_DURATION);
			System.out.println("Assuming a 20 year term, the monthly repayments would be "+monthlyRepayment);
		  
			question = "How much can you afford to pay per month?  ";
			double userMonthlyPossiblePayment =  readDoubleFromUser(question);
			
			double theNumberOfWholeMonthsToRepay = calculateMonthsToRepayMortgage(mortgageAmount, userMonthlyPossiblePayment, annualInterestRate );
			double theNumberOfYearToRepay = Math.round(theNumberOfWholeMonthsToRepay/MONTHS_IN_A_YEAR);
			double theNumberOfMonthsToRepay = theNumberOfWholeMonthsToRepay % MONTHS_IN_A_YEAR;

			System.out.println("If you pay "+userMonthlyPossiblePayment+" per month your mortgage would be paid off in "+theNumberOfYearToRepay+" years and "+theNumberOfMonthsToRepay+"months.");
			
			System.out.println("Would you like to use the mortgage calculator again (yes/no)?  ");
			boolean validInput = false;
			while (!validInput)
			{
				Scanner willUserContinue = new Scanner (System.in);
				if (willUserContinue.hasNext("no"))
				{
					System.out.println("see you");
					finished = true;
					validInput = true;
					}
				else if (willUserContinue.hasNext("yes"))
					validInput = true;
				else
					System.out.println("please answer by yes or no");
				}
			}
		}
	
	public static double readDoubleFromUser (String question) {
		
		double userInformation = 0;
		boolean validInput = false;
		
		if ((question.equals("Please enter the mortgage amount:  ")|| question.equals("Please enter the annual interest rate (APR):  ")) ||(question.equals("How much can you afford to pay per month?  ")))
		{
			do
			{
				System.out.println(question);
				Scanner userInput = new Scanner(System.in);
				
				if (userInput.hasNextDouble())
				{
					userInformation = userInput.nextDouble();
					
					if(userInformation>0)
						validInput = true;
					
					else
						System.out.println("Your input is invalid. Please try again");
				}
				else
					System.out.println("please enter number");
			}while(!validInput);
		}
		
		return userInformation;
	}
	
	public static double calculateMonthlyRepayment (double mortgageAmount, double annualInterestRate, double YEAR_DURATION) {
		
		double monthlyRepayment = 0;
		monthlyRepayment = Math.round((mortgageAmount * (annualInterestRate/MONTHS_IN_A_YEAR/100) / (1 - Math.pow((1+annualInterestRate/MONTHS_IN_A_YEAR/100),(-YEAR_DURATION*MONTHS_IN_A_YEAR))))*(double)100)/(double)100;
		return monthlyRepayment;
	}
	
	public static double calculateMonthsToRepayMortgage (double mortgageAmount, double userMonthlyPossiblePayment, double annualInterestRate ) {
		
		// I am not entirely sure how to deal with this function.
		// Oh! it works finally!
        double theNumberOfWholeMonthsToRepay = 0;
        boolean paymentFinish = false;
        double remainsOfMortgageAmount = mortgageAmount;
        
        do
        {
            remainsOfMortgageAmount = (remainsOfMortgageAmount*(1+(annualInterestRate/MONTHS_IN_A_YEAR)/100)) - userMonthlyPossiblePayment;
        	theNumberOfWholeMonthsToRepay++;
        	
	    if (remainsOfMortgageAmount <=0)
	    	{
	    	paymentFinish = true;
	    	}
	    }while(!paymentFinish);
        
        return theNumberOfWholeMonthsToRepay;
     }
}