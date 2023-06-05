import java.util.Scanner;

public class OddOREven {

	public static void main(String[] args) {
		
		System.out.print("Enter your number");
		Scanner input = new Scanner(System.in);
		
		
		while (input.hasNextInt())
		{
			
			int userNumber = input.nextInt();
			if (userNumber%2==0)
			{
			System.out.println("The number " + userNumber + " is even.");
			}
			else
			{
				System.out.println("The number " + userNumber + " is odd.");
			}
		
		}
		 if (input.hasNextLine())
		{
			System.out.println("Please enter the number("
					+ "s)");
		}
		 else
			 System.out.println("error has occured");
		 
	}

}
