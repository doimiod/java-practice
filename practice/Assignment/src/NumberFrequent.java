
import java.util.Scanner;


public class NumberFrequent {
	public static final int NUMBER_OF_DIGITS = 10;

	public static void main(String[] args) {
		
		boolean finished = false;
		while(!finished) 
		{
			boolean validInput = false;
			do 
			{
				System.out.println("Enter a number(or finish)> ");
				Scanner scanner = new Scanner (System.in);
				if (scanner.hasNextInt())
				{
					validInput = true;
					int number = scanner.nextInt();	
					int [] frequencies = new int [NUMBER_OF_DIGITS];
					countDigitFrequencies( number, frequencies );
					printDigitFrequencies( frequencies );
				}
				else if(scanner.hasNext("finish"))
				{
					finished = true;
					validInput = true;
				}	
				else
					System.out.println("Please enter intengers");
				
				}while(!validInput);
		}
        
	}
	
	
	public static void printDigitFrequencies( int[ ] frequencies )  {
		
		String numberFrequencies = "";
		for(int i=0; i<frequencies.length; i++) 
		{
			if (frequencies[i] !=0) 
			{
				numberFrequencies += i+" ("+frequencies[i]+") ";
			}
		}
		System.out.println(numberFrequencies);
	}
	
	public static void countDigitFrequencies( int number, int[ ] frequencies ) {
		
		int copyNumber = number;
		int digitCounter = 0;
		while(copyNumber >0)
		{
			digitCounter++;
			copyNumber = copyNumber/10;
		}
		
		int digit = 0;
		for (int i=0; i<digitCounter; i++)
		{
			digit = number % 10;
			frequencies[digit]++;
			number = number/10;
		}
		
		
	}

}