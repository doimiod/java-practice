/* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code? 
       Mark out of 5:3
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
       Mark out of 5:3 
   3. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)? 
       Mark out of 10:8 
   4. Did I indent the code appropriately? 
       Mark out of 10:10 
   5. Did I use an appropriate loop (or loops) to produce the different verses? 
       Mark out of 20:17 
   6. Did I use a switch to build up the verses? 
       Mark out of 25:23  
   7. Did I avoid duplication of code and of the lines which make up the verses (each line should be referred to in the code only once (or twice))? 
       Mark out of 10:9  
   8. Does the program produce the correct output? 
       Mark out of 10:10  
   9. How well did I complete this self-assessment? 
       Mark out of 5:5 
   Total Mark out of 100 (Add all the previous marks):88 
*/
public class SongsOfChristmas {
	
	public static final int FIRST_DAY = 1;
	public static final int LAST_DAY = 12;
	public static void main(String[] args) {
		
		for (int verseDay = FIRST_DAY; verseDay < LAST_DAY+1; verseDay++)
		{
			String dayNumber = "";
			String and ="";
			switch (verseDay)  
			{
			case 1:
				dayNumber = "first";
				break;
			case 2:
				dayNumber = "second";
				break;
			case 3:
				dayNumber = "third";
				break;
			case 4:
				dayNumber = "fourth";
				break;
			case 5:
				dayNumber = "fifth";
				break;
			case 6:
				dayNumber = "sixth";
				break;
			case 7:
				dayNumber = "seventh";
				break;
			case 8:
				dayNumber = "eighth";
			break;
			case 9:
				dayNumber = "ninth";
				break;
			case 10:
				dayNumber = "tenth";
				break;
			case 11:
				dayNumber = "eleventh";
				break;
			case 12:
				dayNumber = "twelfth";
				break;
			}
			System.out.println("");
			System.out.println("On the "+dayNumber+" day of Christmas");
			System.out.println("my true love sent to me");
			switch(verseDay)
			{
			case 12:
				System.out.println("12 Drummers Drumming");
	    	}
			
			switch(verseDay)
			{
			case 11:
			case 12:
				System.out.println("11 Pipers Piping");
			}
			switch (verseDay)
			{
			case 10:
			case 11:
			case 12:
				System.out.println("10 Lords a Leaping");
			}
			switch (verseDay)
			{
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println("9 Ladies Dancing");
			}
			
			switch(verseDay)
			{
			case 8:
		    case 9:
		    case 10:
		    case 11:
		    case 12:
		    	System.out.println("8 Maids a Milking"); 	
		    }
			
			switch (verseDay)
			{
			case 7:
		    case 8:
		    case 9:
		    case 10:
		    case 11:
		    case 12:
		    	System.out.println("7 Swans a Swimming");
			}
			
			switch (verseDay)
			{
			case 6:
		    case 7:
		    case 8:
		    case 9:
		    case 10:
		    case 11:
		    case 12:	
		    	System.out.println("6 Geese a Laying");
			}
			
			switch (verseDay)
			{
			case 5:
		    case 6:
		    case 7:
		    case 8:
		    case 9:
		    case 10:
		    case 11:
		    case 12:
		    	System.out.println("5 Golden Rings");
		    }
			
			switch (verseDay)
		    {
		    case 4:
		    case 5:
		    case 6:
		    case 7:
		    case 8:
		    case 9:
		    case 10:
		    case 11:
		    case 12:	
		    	System.out.println("4 Calling Birds");
		    }
		    
		    switch (verseDay)
		    {
		    case 3:
		    case 4:
		    case 5:
		    case 6:
		    case 7:
		    case 8:
		    case 9:
		    case 10:
		    case 11:
		    case 12:
		    	System.out.println("3 French Hens,");
		    }
		    
		    switch (verseDay)
		    {
		    case 2:
		    case 3:
		    case 4:
		    case 5:
		    case 6:
		    case 7:
		    case 8:
		    case 9:
		    case 10:
		    case 11:
		    case 12:
		    	System.out.println("2 Turtle Doves");
		    	and ="and ";
		    }
		    System.out.println(and+"a Partridge in a Pear Tree");
		    
		}
		
	}
	
}