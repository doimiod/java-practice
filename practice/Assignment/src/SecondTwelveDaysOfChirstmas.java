/* SELF ASSESSMENT
 1. Did I use easy-to-understand meaningful properly formatted, variable names and CONSTANTS?
        Mark out of 10:8
        Comment: I believe that I used meaningful CONSTANTS but am not sure my variable names are easy-to-understand.   
 2. Did I implement the getVerse function correctly and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 19(4,3,12)
        Comment: I believe that I can implement getVerse function correctly but it is doubtful that my getVerse function can be understood.
 3. Did I implement the getChristmasGift function correctly using a switch statement and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 21(4,4,13)
        Comment: I think I could implement this function correctly in order to take a gift number and return a String containing the gift.  
 4. Did I implement the getOrdinalString function correctly using if or conditional operators and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 23(5,4,14)
        Comment: It can be true that I implemented this function correctly with using if statements.
 5. Does the program produce the output correctly?
       Mark out of 10: 10
        Comment:  Yes! output is correct if i did not see the web-site which says wrong lyrics.
 6. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment: I did this self-assessment seriously and honestly. Through this self-assessment, I could notice my mistakes.
 Total Mark out of 100 (Add all the previous marks):
*/ 

public class SecondTwelveDaysOfChirstmas {
	
	public static final int FIRST_DAY = 1;
	public static final int LAST_DAY = 12;
	
	public static void main(String[] args) {
		
		String wholeSong = getVerse();
		System.out.println(wholeSong);
		
	}
	
	public static String getVerse() {
		
		String aPartOfGift ="";
		String allGift = "";
		String wholeSong = "";
		
		for (int dayCounter = FIRST_DAY; dayCounter <= LAST_DAY; dayCounter++)
		{
			String day = ordinalString(dayCounter); 
			String gift = getChristmasGift(dayCounter);
	    	aPartOfGift = gift;
			allGift = aPartOfGift + allGift;
			wholeSong = wholeSong + day + allGift +"\n";
		}
		
		return wholeSong;
	}
	
	public static String getChristmasGift(int dayCounter) {
		
		String originalLyrics = ""; 
		
		switch (dayCounter)  
		{
		case 1:
			originalLyrics = "a Partridge in a Pear Tree"+"\n";
			break;
		case 2:
			originalLyrics = "Two Turtle Doves"+"\nand ";
			break;
		case 3:
			originalLyrics = "Three French Hens"+"\n";
			break;
		case 4:
			originalLyrics = "Four Calling Birds"+"\n";
			break;
		case 5:
			originalLyrics = "Five Golden Rings"+"\n";
			break;
		case 6:
			originalLyrics = "Six Geese a Laying"+"\n";
			break;
		case 7:
			originalLyrics = "Seven Swans a Swimming"+"\n";
			break;
		case 8:
			originalLyrics = "Eight Maids a Milking"+"\n";
		break;
		case 9:
			originalLyrics = "Nine Ladies Dancing"+"\n";
			break;
		case 10:
			originalLyrics = "Ten Lords a Leaping"+"\n";
			break;
		case 11:
			originalLyrics = "Eleven Pipers Piping"+"\n";
			break;
		default:
			originalLyrics = "Twelve Drummers Drumming"+"\n";
			break;
			
		}
		
		String gift = originalLyrics;
		return gift;
		
	}
	
	public static String ordinalString(int dayCounter){
		
		String day = "";
		String dayNumber= "";
		
		if (dayCounter == 1)
		{
			dayNumber = "first";
		}
		else if (dayCounter == 2)
		{
			dayNumber = "second";
		}
		else if (dayCounter == 3)
		{
			dayNumber = "third";
		}
		else if (dayCounter == 4) 
		{
			dayNumber = "fourth";
		}
		else if (dayCounter ==5) 
		{
			dayNumber = "fifth";
		}
		else if (dayCounter ==6) 
		{
			dayNumber = "sixth";
		}
		else if (dayCounter == 7) 
		{
			dayNumber ="seventh";
		}
		else if (dayCounter ==8) 
		{
			dayNumber = "eighth";
		}
		else if (dayCounter == 9) 
		{
			dayNumber = "nineth";
		}
		else if (dayCounter ==10) 
		{
			dayNumber = "tenth";
		}
		else if (dayCounter == 11) 
		{
			dayNumber = "eleventh";
		}
		else if (dayCounter ==12) 
		{
			dayNumber ="twelfth";
		}
		day = "On the " + dayNumber + " day of Christmas"+"\n"+"my true love sent to me"+"\n";
		return day;
	}
	
}


