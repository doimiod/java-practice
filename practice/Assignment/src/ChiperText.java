import java.util.Random;
import java.util.Scanner;

public class ChiperText {

	public static void main(String[] args) {
		
		String [] userStrings = {};
		
			System.out.println("Please input something.");
			Scanner userInput = new Scanner (System.in);

	}
	
	public static char[] createCipher() {
		char[] characterArray = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u' ,'v', 'w' , 'x' , 'y' , 'z'};
	    
		  if (characterArray!=null)
		  {
		    Random generator = new Random();
		    for (int index=0; index<characterArray.length; index++ )
		    {
		      int otherIndex = generator.nextInt(characterArray.length);
		      char temp = characterArray[index];
		      characterArray[index] = characterArray[otherIndex];
		      characterArray[otherIndex] = temp;
		    }
		  }
	
		  return characterArray ;
		
	}		
	
	
	public static String anEcrypt(char[] characterArray, String [] userStrings) {
		
		
		
		
		
		return null;	
	}
	
	public static String aDecrypt() {
		
		return null;
	}

}
