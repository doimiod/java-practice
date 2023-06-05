public class aiueo {

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
	
			String gift = getChristmasGift(dayCounter);
			String day = ordinalString(dayCounter);
			String aPartOfGift = gift;
			allGift = aPartOfGift + allGift;
			wholeSong = wholeSong + day + allGift +"\n";
		}
		return wholeSong;
	}
	

	
	public static String getChristmasGift(int dayCounter) {
		
		String culmutiveLyrics = "";
		String originalLyrics = ""; 
		
		switch (dayCounter)  
		{
		case 1:
			originalLyrics = "a Partridge in a Pear Tree"+"\n";
		
			break;
		case 2:
			originalLyrics = "Two Turtle Doves"+"\nand "+culmutiveLyrics;
		
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
			dayNumber = "first";
		else if (dayCounter == 2)
			dayNumber = "second";
		else if (dayCounter == 3)
			dayNumber = "third";
		else if (dayCounter == 4)
			dayNumber = "fourth";
		else if (dayCounter ==5)
			dayNumber = "fifth";
		else if (dayCounter ==6)
			dayNumber = "sixth";
		else if (dayCounter == 7)
			dayNumber ="seventh";
		else if (dayCounter ==8)
			dayNumber = "eightth";
		else if (dayCounter == 9)
			dayNumber = "nineth";
		else if (dayCounter ==10)
			dayNumber = "tenth";
		else if (dayCounter == 11)
			dayNumber = "eleventh";
		else if (dayCounter ==12)
			dayNumber ="twelfth";
		
		day = "On the " + dayNumber + " day of Christmas"+"\n"+"my true love sent to me"+"\n";
		return day;
	}
	

	

}


