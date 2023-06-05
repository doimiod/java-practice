import java.util.Scanner;
public class IncrementalStatistics {

	public static void main(String[] args) {
		

		
		int totalInput = 0;
        double formerVarience = 0;
        double formerAverage = 0;
		System.out.println("This program computes the average and variance of all numbers entered.");
	
		
			    boolean finished = false;
			
			while (!finished)
			{
				System.out.println("Enter a number (or type 'exit'):");
				Scanner userInput = new Scanner (System.in);
				
				if (userInput.hasNextDouble()) 
				{
					int userNumber =  userInput.nextInt();
					totalInput++;
					double average = formerAverage + ((userNumber -formerAverage) / totalInput);
					double varience = ((formerVarience* (totalInput-1)) + (userNumber - formerAverage) * (userNumber - average)) / totalInput;
					System.out.println("So far the average is"+average+" and the variance is "+varience);
				    formerAverage = average ;
				    formerVarience = varience;
				}
				else if (userInput.hasNext()) 
				{
					if  (userInput.hasNext("quit")) 
					{
						System.out.println("see you.");
					}
					else
						System.out.println("error has occured.");
					finished = true;
				}
				
			}
			
			
		}

	}


