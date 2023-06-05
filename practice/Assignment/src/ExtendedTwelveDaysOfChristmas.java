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
 Total Mark out of 100 (Add all the previous marks):86
*/ 

public class ExtendedTwelveDaysOfChristmas {
	
	public static final int FIRST_DAY = 1;
	public static final int LAST_DAY = 12;
	
	public static void main(String[] args) {
		
		String wholeSong = getVerse();
		System.out.println(wholeSong);
		
	}
	
	public static String getVerse() {
		
		String allGift = "";
		String wholeSong = "";
		
		for (int dayCounter = FIRST_DAY; dayCounter <= LAST_DAY; dayCounter++)
		{
			String dayNumber = ordinalString(dayCounter); 
			String gift = getChristmasGift(dayCounter);
			String verseDay = ("On the "+dayNumber+" day of the Christmas"+"\nmy true love sent to me"+"\n");
			
		if (dayCounter ==2)
			{
			allGift = gift +"\nand "+ allGift;
			}
			else
			{
			allGift = gift +"\n"+ allGift;
			}
			wholeSong = wholeSong + verseDay + allGift;
		}
		
		return wholeSong;
	}
	
	public static String getChristmasGift(int dayCounter) {
		
		String gift = ""; 
		
		switch (dayCounter)  
		{
		case 1:
			gift = "a Partridge in a Pear Tree"+"\n";
			break;
		case 2:
			gift = "Two Turtle Doves";
			break;
		case 3:
			gift = "Three French Hens";
			break;
		case 4:
			gift = "Four Calling Birds";
			break;
		case 5:
			gift = "Five Golden Rings";
			break;
		case 6:
			gift = "Six Geese a Laying";
			break;
		case 7:
			gift = "Seven Swans a Swimming";
			break;
		case 8:
			gift = "Eight Maids a Milking";
		break;
		case 9:
			gift = "Nine Ladies Dancing";
			break;
		case 10:
			gift = "Ten Lords a Leaping";
			break;
		case 11:
			gift = "Eleven Pipers Piping";
			break;
		default:
			gift = "Twelve Drummers Drumming";
			break;
			
		}
		
		return gift;
		
	}
	
	public static String ordinalString(int dayCounter){
		
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
	
		return dayNumber;
	}
	
}

